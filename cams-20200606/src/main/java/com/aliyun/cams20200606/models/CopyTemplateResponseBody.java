// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cams20200606.models;

import com.aliyun.tea.*;

public class CopyTemplateResponseBody extends TeaModel {
    /**
     * <p>The details about the access denial.</p>
     * 
     * <strong>example:</strong>
     * <p>无</p>
     */
    @NameInMap("AccessDeniedDetail")
    public String accessDeniedDetail;

    /**
     * <p>The status code.</p>
     * 
     * <strong>example:</strong>
     * <p>示例值示例值</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The returned data.</p>
     */
    @NameInMap("Data")
    public CopyTemplateResponseBodyData data;

    /**
     * <p>The returned message.</p>
     * 
     * <strong>example:</strong>
     * <p>示例值</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>示例值示例值</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the call was successful. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: The call was successful.</li>
     * <li><strong>false</strong>: The call failed.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static CopyTemplateResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CopyTemplateResponseBody self = new CopyTemplateResponseBody();
        return TeaModel.build(map, self);
    }

    public CopyTemplateResponseBody setAccessDeniedDetail(String accessDeniedDetail) {
        this.accessDeniedDetail = accessDeniedDetail;
        return this;
    }
    public String getAccessDeniedDetail() {
        return this.accessDeniedDetail;
    }

    public CopyTemplateResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public CopyTemplateResponseBody setData(CopyTemplateResponseBodyData data) {
        this.data = data;
        return this;
    }
    public CopyTemplateResponseBodyData getData() {
        return this.data;
    }

    public CopyTemplateResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public CopyTemplateResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CopyTemplateResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class CopyTemplateResponseBodyData extends TeaModel {
        /**
         * <p>The template code.</p>
         * 
         * <strong>example:</strong>
         * <p>示例值示例值</p>
         */
        @NameInMap("SceneTemplateCode")
        public String sceneTemplateCode;

        /**
         * <p>The template name.</p>
         * 
         * <strong>example:</strong>
         * <p>示例值示例值示例值</p>
         */
        @NameInMap("SceneTemplateName")
        public String sceneTemplateName;

        /**
         * <p>The WhatsApp category.</p>
         * 
         * <strong>example:</strong>
         * <p>示例值示例值</p>
         */
        @NameInMap("WhatsappCatagory")
        public String whatsappCatagory;

        public static CopyTemplateResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            CopyTemplateResponseBodyData self = new CopyTemplateResponseBodyData();
            return TeaModel.build(map, self);
        }

        public CopyTemplateResponseBodyData setSceneTemplateCode(String sceneTemplateCode) {
            this.sceneTemplateCode = sceneTemplateCode;
            return this;
        }
        public String getSceneTemplateCode() {
            return this.sceneTemplateCode;
        }

        public CopyTemplateResponseBodyData setSceneTemplateName(String sceneTemplateName) {
            this.sceneTemplateName = sceneTemplateName;
            return this;
        }
        public String getSceneTemplateName() {
            return this.sceneTemplateName;
        }

        public CopyTemplateResponseBodyData setWhatsappCatagory(String whatsappCatagory) {
            this.whatsappCatagory = whatsappCatagory;
            return this;
        }
        public String getWhatsappCatagory() {
            return this.whatsappCatagory;
        }

    }

}
