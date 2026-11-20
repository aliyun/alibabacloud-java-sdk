// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aicontent20240611.models;

import com.aliyun.tea.*;

public class ModelRouterQueryNacosTagsResponseBody extends TeaModel {
    /**
     * <p>The data object.</p>
     * 
     * <strong>example:</strong>
     * <p>[]</p>
     */
    @NameInMap("data")
    public java.util.List<ModelRouterQueryNacosTagsResponseBodyData> data;

    /**
     * <p>The fault message encoding.</p>
     * 
     * <strong>example:</strong>
     * <p>UNKNOWN_ERROR</p>
     */
    @NameInMap("errCode")
    public String errCode;

    /**
     * <p>The error message.</p>
     * 
     * <strong>example:</strong>
     * <p>Unknown error</p>
     */
    @NameInMap("errMessage")
    public String errMessage;

    /**
     * <p>The HTTP status code.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("httpStatusCode")
    public Integer httpStatusCode;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>xxxx-xxxx-xxxx-xxxxxxxx</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>Indicates whether the request is successful.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("success")
    public Boolean success;

    public static ModelRouterQueryNacosTagsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModelRouterQueryNacosTagsResponseBody self = new ModelRouterQueryNacosTagsResponseBody();
        return TeaModel.build(map, self);
    }

    public ModelRouterQueryNacosTagsResponseBody setData(java.util.List<ModelRouterQueryNacosTagsResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<ModelRouterQueryNacosTagsResponseBodyData> getData() {
        return this.data;
    }

    public ModelRouterQueryNacosTagsResponseBody setErrCode(String errCode) {
        this.errCode = errCode;
        return this;
    }
    public String getErrCode() {
        return this.errCode;
    }

    public ModelRouterQueryNacosTagsResponseBody setErrMessage(String errMessage) {
        this.errMessage = errMessage;
        return this;
    }
    public String getErrMessage() {
        return this.errMessage;
    }

    public ModelRouterQueryNacosTagsResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public ModelRouterQueryNacosTagsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ModelRouterQueryNacosTagsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ModelRouterQueryNacosTagsResponseBodyData extends TeaModel {
        /**
         * <p>The display name of the model type. This parameter is returned when configType is set to model-types.</p>
         * 
         * <strong>example:</strong>
         * <p>Text generation</p>
         */
        @NameInMap("label")
        public String label;

        /**
         * <p>The tag value.</p>
         * 
         * <strong>example:</strong>
         * <p>TXT_GEN</p>
         */
        @NameInMap("tag")
        public String tag;

        /**
         * <p>The tag name.</p>
         * 
         * <strong>example:</strong>
         * <p>Text generation</p>
         */
        @NameInMap("tagName")
        public String tagName;

        /**
         * <p>The model type value. This parameter is returned when configType is set to model-types.</p>
         * 
         * <strong>example:</strong>
         * <p>NLP</p>
         */
        @NameInMap("value")
        public String value;

        public static ModelRouterQueryNacosTagsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ModelRouterQueryNacosTagsResponseBodyData self = new ModelRouterQueryNacosTagsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ModelRouterQueryNacosTagsResponseBodyData setLabel(String label) {
            this.label = label;
            return this;
        }
        public String getLabel() {
            return this.label;
        }

        public ModelRouterQueryNacosTagsResponseBodyData setTag(String tag) {
            this.tag = tag;
            return this;
        }
        public String getTag() {
            return this.tag;
        }

        public ModelRouterQueryNacosTagsResponseBodyData setTagName(String tagName) {
            this.tagName = tagName;
            return this;
        }
        public String getTagName() {
            return this.tagName;
        }

        public ModelRouterQueryNacosTagsResponseBodyData setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
