// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agency20221216.models;

import com.aliyun.tea.*;

public class ExportReversedDeductionHistoryRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2023-05-01</p>
     */
    @NameInMap("EndDate")
    public String endDate;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>123</p>
     */
    @NameInMap("ExportUid")
    public Long exportUid;

    /**
     * <strong>example:</strong>
     * <p>en</p>
     */
    @NameInMap("Language")
    public String language;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2023-01-01</p>
     */
    @NameInMap("StartDate")
    public String startDate;

    public static ExportReversedDeductionHistoryRequest build(java.util.Map<String, ?> map) throws Exception {
        ExportReversedDeductionHistoryRequest self = new ExportReversedDeductionHistoryRequest();
        return TeaModel.build(map, self);
    }

    public ExportReversedDeductionHistoryRequest setEndDate(String endDate) {
        this.endDate = endDate;
        return this;
    }
    public String getEndDate() {
        return this.endDate;
    }

    public ExportReversedDeductionHistoryRequest setExportUid(Long exportUid) {
        this.exportUid = exportUid;
        return this;
    }
    public Long getExportUid() {
        return this.exportUid;
    }

    public ExportReversedDeductionHistoryRequest setLanguage(String language) {
        this.language = language;
        return this;
    }
    public String getLanguage() {
        return this.language;
    }

    public ExportReversedDeductionHistoryRequest setStartDate(String startDate) {
        this.startDate = startDate;
        return this;
    }
    public String getStartDate() {
        return this.startDate;
    }

}
