// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class DeleteMetricRuleTemplateResponseBody extends TeaModel {
    /**
     * <p>The HTTP status code.</p>
     * <blockquote>
     * <p>The value 200 indicates success.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public Integer code;

    /**
     * <p>The returned message.</p>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>7B63F8CF-D48D-4608-A402-04FB5B2B4B6A</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The template information.</p>
     */
    @NameInMap("Resource")
    public DeleteMetricRuleTemplateResponseBodyResource resource;

    /**
     * <p>Indicates whether the operation was successful. Valid values:</p>
     * <ul>
     * <li>true: The operation was successful.</li>
     * <li>false: The operation failed.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
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
        /**
         * <p>The template ID.</p>
         * 
         * <strong>example:</strong>
         * <p>123****</p>
         */
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
