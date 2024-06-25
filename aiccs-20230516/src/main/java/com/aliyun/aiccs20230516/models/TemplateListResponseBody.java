// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiccs20230516.models;

import com.aliyun.tea.*;

public class TemplateListResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public Long code;

    /**
     * <strong>example:</strong>
     * <p>示例值示例值</p>
     */
    @NameInMap("Message")
    public String message;

    @NameInMap("Model")
    public java.util.List<TemplateListResponseBodyModel> model;

    /**
     * <strong>example:</strong>
     * <p>8EFC6D10-307B-1ECA-A8C6-7CBDF776AAD2</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("Success")
    public Boolean success;

    /**
     * <strong>example:</strong>
     * <p>1683440860035</p>
     */
    @NameInMap("Timestamp")
    public Long timestamp;

    public static TemplateListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        TemplateListResponseBody self = new TemplateListResponseBody();
        return TeaModel.build(map, self);
    }

    public TemplateListResponseBody setCode(Long code) {
        this.code = code;
        return this;
    }
    public Long getCode() {
        return this.code;
    }

    public TemplateListResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public TemplateListResponseBody setModel(java.util.List<TemplateListResponseBodyModel> model) {
        this.model = model;
        return this;
    }
    public java.util.List<TemplateListResponseBodyModel> getModel() {
        return this.model;
    }

    public TemplateListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public TemplateListResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public TemplateListResponseBody setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
        return this;
    }
    public Long getTimestamp() {
        return this.timestamp;
    }

    public static class TemplateListResponseBodyModel extends TeaModel {
        /**
         * <p>意向标签</p>
         */
        @NameInMap("IntentTags")
        public java.util.List<java.util.Map<String, ?>> intentTags;

        /**
         * <p>个性标签</p>
         */
        @NameInMap("PersonalityTags")
        public java.util.List<String> personalityTags;

        /**
         * <p>话术所需参数</p>
         * 
         * <strong>example:</strong>
         * <p>示例值示例值</p>
         */
        @NameInMap("Properties")
        public String properties;

        /**
         * <p>AI话术ID</p>
         * 
         * <strong>example:</strong>
         * <p>59</p>
         */
        @NameInMap("TemplateId")
        public Long templateId;

        /**
         * <p>话术模板名称</p>
         * 
         * <strong>example:</strong>
         * <p>示例值示例值</p>
         */
        @NameInMap("TemplateName")
        public String templateName;

        /**
         * <p>模板类型</p>
         * 
         * <strong>example:</strong>
         * <p>55</p>
         */
        @NameInMap("TemplateType")
        public Long templateType;

        public static TemplateListResponseBodyModel build(java.util.Map<String, ?> map) throws Exception {
            TemplateListResponseBodyModel self = new TemplateListResponseBodyModel();
            return TeaModel.build(map, self);
        }

        public TemplateListResponseBodyModel setIntentTags(java.util.List<java.util.Map<String, ?>> intentTags) {
            this.intentTags = intentTags;
            return this;
        }
        public java.util.List<java.util.Map<String, ?>> getIntentTags() {
            return this.intentTags;
        }

        public TemplateListResponseBodyModel setPersonalityTags(java.util.List<String> personalityTags) {
            this.personalityTags = personalityTags;
            return this;
        }
        public java.util.List<String> getPersonalityTags() {
            return this.personalityTags;
        }

        public TemplateListResponseBodyModel setProperties(String properties) {
            this.properties = properties;
            return this;
        }
        public String getProperties() {
            return this.properties;
        }

        public TemplateListResponseBodyModel setTemplateId(Long templateId) {
            this.templateId = templateId;
            return this;
        }
        public Long getTemplateId() {
            return this.templateId;
        }

        public TemplateListResponseBodyModel setTemplateName(String templateName) {
            this.templateName = templateName;
            return this;
        }
        public String getTemplateName() {
            return this.templateName;
        }

        public TemplateListResponseBodyModel setTemplateType(Long templateType) {
            this.templateType = templateType;
            return this;
        }
        public Long getTemplateType() {
            return this.templateType;
        }

    }

}
