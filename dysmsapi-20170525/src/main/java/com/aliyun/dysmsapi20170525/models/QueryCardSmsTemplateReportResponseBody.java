// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dysmsapi20170525.models;

import com.aliyun.tea.*;

public class QueryCardSmsTemplateReportResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public QueryCardSmsTemplateReportResponseBodyData data;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static QueryCardSmsTemplateReportResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryCardSmsTemplateReportResponseBody self = new QueryCardSmsTemplateReportResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryCardSmsTemplateReportResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryCardSmsTemplateReportResponseBody setData(QueryCardSmsTemplateReportResponseBodyData data) {
        this.data = data;
        return this;
    }
    public QueryCardSmsTemplateReportResponseBodyData getData() {
        return this.data;
    }

    public QueryCardSmsTemplateReportResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryCardSmsTemplateReportResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class QueryCardSmsTemplateReportResponseBodyData extends TeaModel {
        @NameInMap("model")
        public java.util.List<java.util.Map<String, ?>> model;

        public static QueryCardSmsTemplateReportResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QueryCardSmsTemplateReportResponseBodyData self = new QueryCardSmsTemplateReportResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QueryCardSmsTemplateReportResponseBodyData setModel(java.util.List<java.util.Map<String, ?>> model) {
            this.model = model;
            return this;
        }
        public java.util.List<java.util.Map<String, ?>> getModel() {
            return this.model;
        }

    }

}
