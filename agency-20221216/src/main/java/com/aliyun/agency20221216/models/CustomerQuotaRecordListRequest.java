// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agency20221216.models;

import com.aliyun.tea.*;

public class CustomerQuotaRecordListRequest extends TeaModel {
    /**
     * <p>End Date Format: yyyy-MM-dd</p>
     */
    @NameInMap("EndDate")
    public String endDate;

    /**
     * <p>Customer UID</p>
     */
    @NameInMap("EndUserPk")
    public Long endUserPk;

    /**
     * <p>Multilingual Parameters, the default language is English.</br></p>
     * <p>en: English</br></p>
     * <p>zh: Chinese</br></p>
     * <p>ja: Japanese </br></p>
     */
    @NameInMap("Language")
    public String language;

    /**
     * <p>Operation Type Enum</br></p>
     * <p>all All types</br></p>
     * <p>quota_create Create quota</br></p>
     * <p>quota_amount_adjust Adjust the amount of quota</br></p>
     */
    @NameInMap("OperationType")
    public String operationType;

    /**
     * <p>Pagination, current page number, starting from 1.</p>
     */
    @NameInMap("PageNo")
    public Integer pageNo;

    /**
     * <p>Pagination, record number on each page. Maximum 100.</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>Start Date Format: yyyy-MM-dd</p>
     */
    @NameInMap("StartDate")
    public String startDate;

    public static CustomerQuotaRecordListRequest build(java.util.Map<String, ?> map) throws Exception {
        CustomerQuotaRecordListRequest self = new CustomerQuotaRecordListRequest();
        return TeaModel.build(map, self);
    }

    public CustomerQuotaRecordListRequest setEndDate(String endDate) {
        this.endDate = endDate;
        return this;
    }
    public String getEndDate() {
        return this.endDate;
    }

    public CustomerQuotaRecordListRequest setEndUserPk(Long endUserPk) {
        this.endUserPk = endUserPk;
        return this;
    }
    public Long getEndUserPk() {
        return this.endUserPk;
    }

    public CustomerQuotaRecordListRequest setLanguage(String language) {
        this.language = language;
        return this;
    }
    public String getLanguage() {
        return this.language;
    }

    public CustomerQuotaRecordListRequest setOperationType(String operationType) {
        this.operationType = operationType;
        return this;
    }
    public String getOperationType() {
        return this.operationType;
    }

    public CustomerQuotaRecordListRequest setPageNo(Integer pageNo) {
        this.pageNo = pageNo;
        return this;
    }
    public Integer getPageNo() {
        return this.pageNo;
    }

    public CustomerQuotaRecordListRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public CustomerQuotaRecordListRequest setStartDate(String startDate) {
        this.startDate = startDate;
        return this;
    }
    public String getStartDate() {
        return this.startDate;
    }

}
