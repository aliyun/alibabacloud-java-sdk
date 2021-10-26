// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dysmsapi20170525.models;

import com.aliyun.tea.*;

public class QueryCardSmsTemplateResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public QueryCardSmsTemplateResponseBodyData data;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static QueryCardSmsTemplateResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryCardSmsTemplateResponseBody self = new QueryCardSmsTemplateResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryCardSmsTemplateResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryCardSmsTemplateResponseBody setData(QueryCardSmsTemplateResponseBodyData data) {
        this.data = data;
        return this;
    }
    public QueryCardSmsTemplateResponseBodyData getData() {
        return this.data;
    }

    public QueryCardSmsTemplateResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryCardSmsTemplateResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class QueryCardSmsTemplateResponseBodyData extends TeaModel {
        @NameInMap("Templates")
        public java.util.List<java.util.Map<String, ?>> templates;

        public static QueryCardSmsTemplateResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QueryCardSmsTemplateResponseBodyData self = new QueryCardSmsTemplateResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QueryCardSmsTemplateResponseBodyData setTemplates(java.util.List<java.util.Map<String, ?>> templates) {
            this.templates = templates;
            return this;
        }
        public java.util.List<java.util.Map<String, ?>> getTemplates() {
            return this.templates;
        }

    }

}
