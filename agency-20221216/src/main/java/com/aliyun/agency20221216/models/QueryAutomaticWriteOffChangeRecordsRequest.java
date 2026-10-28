// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agency20221216.models;

import com.aliyun.tea.*;

public class QueryAutomaticWriteOffChangeRecordsRequest extends TeaModel {
    /**
     * <p>The customer UID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>123456</p>
     */
    @NameInMap("CustomerUid")
    public Long customerUid;

    /**
     * <p>The end date.
     * Format: yyyy-MM-dd.</p>
     * 
     * <strong>example:</strong>
     * <p>2026-05-20</p>
     */
    @NameInMap("EndDate")
    public String endDate;

    /**
     * <p>The language. If you do not specify this parameter, English is used by default. Valid values:</p>
     * <ul>
     * <li>en: English.</li>
     * <li>zh: Chinese.</li>
     * <li>ja: Japanese.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>en</p>
     */
    @NameInMap("Language")
    public String language;

    /**
     * <p>The page number. Pages start from 1.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNo")
    public Integer pageNo;

    /**
     * <p>The number of entries per page. Maximum value: 100.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The start date.
     * Format: yyyy-MM-dd.</p>
     * 
     * <strong>example:</strong>
     * <p>2026-06-20</p>
     */
    @NameInMap("StartDate")
    public String startDate;

    public static QueryAutomaticWriteOffChangeRecordsRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryAutomaticWriteOffChangeRecordsRequest self = new QueryAutomaticWriteOffChangeRecordsRequest();
        return TeaModel.build(map, self);
    }

    public QueryAutomaticWriteOffChangeRecordsRequest setCustomerUid(Long customerUid) {
        this.customerUid = customerUid;
        return this;
    }
    public Long getCustomerUid() {
        return this.customerUid;
    }

    public QueryAutomaticWriteOffChangeRecordsRequest setEndDate(String endDate) {
        this.endDate = endDate;
        return this;
    }
    public String getEndDate() {
        return this.endDate;
    }

    public QueryAutomaticWriteOffChangeRecordsRequest setLanguage(String language) {
        this.language = language;
        return this;
    }
    public String getLanguage() {
        return this.language;
    }

    public QueryAutomaticWriteOffChangeRecordsRequest setPageNo(Integer pageNo) {
        this.pageNo = pageNo;
        return this;
    }
    public Integer getPageNo() {
        return this.pageNo;
    }

    public QueryAutomaticWriteOffChangeRecordsRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public QueryAutomaticWriteOffChangeRecordsRequest setStartDate(String startDate) {
        this.startDate = startDate;
        return this;
    }
    public String getStartDate() {
        return this.startDate;
    }

}
