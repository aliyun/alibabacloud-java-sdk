// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20220926.models;

import com.aliyun.tea.*;

public class GetFeatureConfigResponseBody extends TeaModel {
    /**
     * <p>The status code.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public Integer code;

    /**
     * <p>The returned data.</p>
     */
    @NameInMap("Data")
    public GetFeatureConfigResponseBodyData data;

    /**
     * <p>The HTTP status code.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <p>The response message for this request.</p>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("Msg")
    public String msg;

    /**
     * <p>The ID assigned by the backend to uniquely identify the request. You can use this ID to troubleshoot issues.</p>
     * 
     * <strong>example:</strong>
     * <p>AAAAAA-BBBB-CCCCC-DDDD-EEEEEEEE****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static GetFeatureConfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetFeatureConfigResponseBody self = new GetFeatureConfigResponseBody();
        return TeaModel.build(map, self);
    }

    public GetFeatureConfigResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public GetFeatureConfigResponseBody setData(GetFeatureConfigResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetFeatureConfigResponseBodyData getData() {
        return this.data;
    }

    public GetFeatureConfigResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public GetFeatureConfigResponseBody setMsg(String msg) {
        this.msg = msg;
        return this;
    }
    public String getMsg() {
        return this.msg;
    }

    public GetFeatureConfigResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetFeatureConfigResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetFeatureConfigResponseBodyData extends TeaModel {
        /**
         * <p>The list of feature configurations.</p>
         */
        @NameInMap("FeatureConf")
        public java.util.List<java.util.Map<String, ?>> featureConf;

        /**
         * <p>The resource type.</p>
         * 
         * <strong>example:</strong>
         * <p>text</p>
         */
        @NameInMap("ResourceType")
        public String resourceType;

        /**
         * <p>The service code.</p>
         * 
         * <strong>example:</strong>
         * <p>llm_query_moderation</p>
         */
        @NameInMap("ServiceCode")
        public String serviceCode;

        /**
         * <p>The type.</p>
         * 
         * <strong>example:</strong>
         * <p>custom_llm_template</p>
         */
        @NameInMap("Type")
        public String type;

        /**
         * <p>UID。</p>
         * 
         * <strong>example:</strong>
         * <p>1643953****74290</p>
         */
        @NameInMap("Uid")
        public String uid;

        public static GetFeatureConfigResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetFeatureConfigResponseBodyData self = new GetFeatureConfigResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetFeatureConfigResponseBodyData setFeatureConf(java.util.List<java.util.Map<String, ?>> featureConf) {
            this.featureConf = featureConf;
            return this;
        }
        public java.util.List<java.util.Map<String, ?>> getFeatureConf() {
            return this.featureConf;
        }

        public GetFeatureConfigResponseBodyData setResourceType(String resourceType) {
            this.resourceType = resourceType;
            return this;
        }
        public String getResourceType() {
            return this.resourceType;
        }

        public GetFeatureConfigResponseBodyData setServiceCode(String serviceCode) {
            this.serviceCode = serviceCode;
            return this;
        }
        public String getServiceCode() {
            return this.serviceCode;
        }

        public GetFeatureConfigResponseBodyData setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public GetFeatureConfigResponseBodyData setUid(String uid) {
            this.uid = uid;
            return this;
        }
        public String getUid() {
            return this.uid;
        }

    }

}
