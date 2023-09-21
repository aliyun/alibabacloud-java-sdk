// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class GetClassificationTemplateResponseBody extends TeaModel {
    @NameInMap("ClassificationResourceTemplateMap")
    public GetClassificationTemplateResponseBodyClassificationResourceTemplateMap classificationResourceTemplateMap;

    @NameInMap("ErrorCode")
    public String errorCode;

    @NameInMap("ErrorMessage")
    public String errorMessage;

    @NameInMap("RequestId")
    public String requestId;

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
        @NameInMap("ResourceId")
        public Long resourceId;

        @NameInMap("ResourceType")
        public String resourceType;

        @NameInMap("TemplateId")
        public Long templateId;

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
