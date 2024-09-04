// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agency20221216.models;

import com.aliyun.tea.*;

public class ExportCustomerQuotaRecordRequest extends TeaModel {
    /**
     * <p>End Date Format:  yyyy-MM-dd</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2023-12-24</p>
     */
    @NameInMap("EndDate")
    public String endDate;

    /**
     * <p>Customer UID</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>5113766248601929</p>
     */
    @NameInMap("EndUserPk")
    public Long endUserPk;

    /**
     * <p>Multilingual Parameters, the default language is English.</br>
     * en: English</br>
     * zh: Chinese</br>
     * ja: Japanese </br></p>
     * 
     * <strong>example:</strong>
     * <p>en</p>
     */
    @NameInMap("Language")
    public String language;

    /**
     * <p>Operation Type Enum</br>
     * all All types</br>
     * quota_create Create quota</br>
     * quota_amount_adjust Adjust the amount of quota</br></p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>all</p>
     */
    @NameInMap("OperationType")
    public String operationType;

    /**
     * <p>Start Date Format:  yyyy-MM-dd</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2023-11-10</p>
     */
    @NameInMap("StartDate")
    public String startDate;

    public static ExportCustomerQuotaRecordRequest build(java.util.Map<String, ?> map) throws Exception {
        ExportCustomerQuotaRecordRequest self = new ExportCustomerQuotaRecordRequest();
        return TeaModel.build(map, self);
    }

    public ExportCustomerQuotaRecordRequest setEndDate(String endDate) {
        this.endDate = endDate;
        return this;
    }
    public String getEndDate() {
        return this.endDate;
    }

    public ExportCustomerQuotaRecordRequest setEndUserPk(Long endUserPk) {
        this.endUserPk = endUserPk;
        return this;
    }
    public Long getEndUserPk() {
        return this.endUserPk;
    }

    public ExportCustomerQuotaRecordRequest setLanguage(String language) {
        this.language = language;
        return this;
    }
    public String getLanguage() {
        return this.language;
    }

    public ExportCustomerQuotaRecordRequest setOperationType(String operationType) {
        this.operationType = operationType;
        return this;
    }
    public String getOperationType() {
        return this.operationType;
    }

    public ExportCustomerQuotaRecordRequest setStartDate(String startDate) {
        this.startDate = startDate;
        return this;
    }
    public String getStartDate() {
        return this.startDate;
    }

}
