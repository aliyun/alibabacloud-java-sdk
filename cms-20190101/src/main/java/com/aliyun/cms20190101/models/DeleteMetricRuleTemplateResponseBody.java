// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class DeleteMetricRuleTemplateResponseBody extends TeaModel {
    @NameInMap("Code")
    public Integer code;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("Resource")
    public DeleteMetricRuleTemplateResponseBodyResource resource;

    public static DeleteMetricRuleTemplateResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteMetricRuleTemplateResponseBody self = new DeleteMetricRuleTemplateResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteMetricRuleTemplateResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public DeleteMetricRuleTemplateResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DeleteMetricRuleTemplateResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DeleteMetricRuleTemplateResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public DeleteMetricRuleTemplateResponseBody setResource(DeleteMetricRuleTemplateResponseBodyResource resource) {
        this.resource = resource;
        return this;
    }
    public DeleteMetricRuleTemplateResponseBodyResource getResource() {
        return this.resource;
    }

    public static class DeleteMetricRuleTemplateResponseBodyResource extends TeaModel {
        @NameInMap("TemplateId")
        public String templateId;

        public static DeleteMetricRuleTemplateResponseBodyResource build(java.util.Map<String, ?> map) throws Exception {
            DeleteMetricRuleTemplateResponseBodyResource self = new DeleteMetricRuleTemplateResponseBodyResource();
            return TeaModel.build(map, self);
        }

        public DeleteMetricRuleTemplateResponseBodyResource setTemplateId(String templateId) {
            this.templateId = templateId;
            return this;
        }
        public String getTemplateId() {
            return this.templateId;
        }

    }

}
