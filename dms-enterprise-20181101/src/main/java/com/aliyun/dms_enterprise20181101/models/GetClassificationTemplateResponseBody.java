// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class GetClassificationTemplateResponseBody extends TeaModel {
    /**
     * <p>The information about the classification template that is associated to the instance.</p>
     */
    @NameInMap("ClassificationResourceTemplateMap")
    public GetClassificationTemplateResponseBodyClassificationResourceTemplateMap classificationResourceTemplateMap;

    /**
     * <p>The error code returned if the request failed.</p>
     * 
     * <strong>example:</strong>
     * <p>UnknownError</p>
     */
    @NameInMap("ErrorCode")
    public String errorCode;

    /**
     * <p>The error message that is returned if the request failed.</p>
     * 
     * <strong>example:</strong>
     * <p>UnknownError</p>
     */
    @NameInMap("ErrorMessage")
    public String errorMessage;

    /**
     * <p>The request ID. You can use the ID to query logs and troubleshoot issues.</p>
     * 
     * <strong>example:</strong>
     * <p>427688B8-ADFB-4C4E-9D45-EF5C1FD6E23D</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: The request was successful.</li>
     * <li><strong>false</strong>: The request failed.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static GetClassificationTemplateResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetClassificationTemplateResponseBody self = new GetClassificationTemplateResponseBody();
        return TeaModel.build(map, self);
    }

    public GetClassificationTemplateResponseBody setClassificationResourceTemplateMap(GetClassificationTemplateResponseBodyClassificationResourceTemplateMap classificationResourceTemplateMap) {
        this.classificationResourceTemplateMap = classificationResourceTemplateMap;
        return this;
    }
    public GetClassificationTemplateResponseBodyClassificationResourceTemplateMap getClassificationResourceTemplateMap() {
        return this.classificationResourceTemplateMap;
    }

    public GetClassificationTemplateResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public GetClassificationTemplateResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public GetClassificationTemplateResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetClassificationTemplateResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetClassificationTemplateResponseBodyClassificationResourceTemplateMap extends TeaModel {
        /**
         * <p>The ID of the resource. The supported resource type is INSTANCE. The resource ID corresponds to the value of InstanceId. You can call the <a href="https://help.aliyun.com/document_detail/141936.html">ListInstances</a> operation to obtain the value of InstanceId.</p>
         * 
         * <strong>example:</strong>
         * <p>24****</p>
         */
        @NameInMap("ResourceId")
        public Long resourceId;

        /**
         * <p>The resource type. The value is fixed as <strong>INSTANCE</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>INSTANCE</p>
         */
        @NameInMap("ResourceType")
        public String resourceType;

        /**
         * <p>The ID of the classification and grading template.</p>
         * 
         * <strong>example:</strong>
         * <p>3***</p>
         */
        @NameInMap("TemplateId")
        public Long templateId;

        /**
         * <p>The type of the classification and grading template. Valid values:</p>
         * <ul>
         * <li><strong>INNER</strong>: a built-in template.</li>
         * <li><strong>USER_DEFINE</strong>: a custom template.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>INNER</p>
         */
        @NameInMap("TemplateType")
        public String templateType;

        public static GetClassificationTemplateResponseBodyClassificationResourceTemplateMap build(java.util.Map<String, ?> map) throws Exception {
            GetClassificationTemplateResponseBodyClassificationResourceTemplateMap self = new GetClassificationTemplateResponseBodyClassificationResourceTemplateMap();
            return TeaModel.build(map, self);
        }

        public GetClassificationTemplateResponseBodyClassificationResourceTemplateMap setResourceId(Long resourceId) {
            this.resourceId = resourceId;
            return this;
        }
        public Long getResourceId() {
            return this.resourceId;
        }

        public GetClassificationTemplateResponseBodyClassificationResourceTemplateMap setResourceType(String resourceType) {
            this.resourceType = resourceType;
            return this;
        }
        public String getResourceType() {
            return this.resourceType;
        }

        public GetClassificationTemplateResponseBodyClassificationResourceTemplateMap setTemplateId(Long templateId) {
            this.templateId = templateId;
            return this;
        }
        public Long getTemplateId() {
            return this.templateId;
        }

        public GetClassificationTemplateResponseBodyClassificationResourceTemplateMap setTemplateType(String templateType) {
            this.templateType = templateType;
            return this;
        }
        public String getTemplateType() {
            return this.templateType;
        }

    }

}
