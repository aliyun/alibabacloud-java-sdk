// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dysmsapi20170525.models;

import com.aliyun.tea.*;

public class QueryCardSmsTemplateReportRequest extends TeaModel {
    /**
     * <p>The end of the time range to query. Specify the time in the yyyy-MM-dd HH:mm:ss format.</p>
     * 
     * <strong>example:</strong>
     * <p>2020-10-11 00:00:01</p>
     */
    @NameInMap("EndDate")
    public String endDate;

    /**
     * <p>The beginning of the time range to query. Specify the time in the yyyy-MM-dd HH:mm:ss format.</p>
     * 
     * <strong>example:</strong>
     * <p>2020-10-10 00:00:01</p>
     */
    @NameInMap("StartDate")
    public String startDate;

    /**
     * <p>The array of message templates.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("TemplateCodes")
    public java.util.List<String> templateCodes;

    public static QueryCardSmsTemplateReportRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryCardSmsTemplateReportRequest self = new QueryCardSmsTemplateReportRequest();
        return TeaModel.build(map, self);
    }

    public QueryCardSmsTemplateReportRequest setEndDate(String endDate) {
        this.endDate = endDate;
        return this;
    }
    public String getEndDate() {
        return this.endDate;
    }

    public QueryCardSmsTemplateReportRequest setStartDate(String startDate) {
        this.startDate = startDate;
        return this;
    }
    public String getStartDate() {
        return this.startDate;
    }

    public QueryCardSmsTemplateReportRequest setTemplateCodes(java.util.List<String> templateCodes) {
        this.templateCodes = templateCodes;
        return this;
    }
    public java.util.List<String> getTemplateCodes() {
        return this.templateCodes;
    }

}
