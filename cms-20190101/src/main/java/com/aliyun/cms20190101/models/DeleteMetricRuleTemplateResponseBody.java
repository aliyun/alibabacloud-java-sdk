// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class DeleteMetricRuleTemplateResponseBody extends TeaModel {
    /**
     * <p>The returned message.</p>
     */
    @NameInMap("Code")
    public Integer code;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>Indicates whether the call was successful. The value true indicates a success. The value false indicates a failure.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The ID of the template.</p>
     */
    @NameInMap("Resource")
    public DeleteMetricRuleTemplateResponseBodyResource resource;

    /**
     * <p>The information about the alert template.</p>
     */
    @NameInMap("Success")
    public Boolean success;

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

    public DeleteMetricRuleTemplateResponseBody setResource(DeleteMetricRuleTemplateResponseBodyResource resource) {
        this.resource = resource;
        return this;
    }
    public DeleteMetricRuleTemplateResponseBodyResource getResource() {
        return this.resource;
    }

    public DeleteMetricRuleTemplateResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
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
