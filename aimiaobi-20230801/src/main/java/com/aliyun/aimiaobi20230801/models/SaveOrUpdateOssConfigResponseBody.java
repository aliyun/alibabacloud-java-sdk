// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aimiaobi20230801.models;

import com.aliyun.tea.*;

public class SaveOrUpdateOssConfigResponseBody extends TeaModel {
    /**
     * <p>The status code.</p>
     * 
     * <strong>example:</strong>
     * <p>DataNotExists</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The business data.</p>
     */
    @NameInMap("Data")
    public SaveOrUpdateOssConfigResponseBodyData data;

    /**
     * <p>The HTTP status code.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <p>The error message.</p>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>F2F366D6-E9FE-1006-BB70-2C650896AAB5</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful. \<code>true\\</code> indicates success. \<code>false\\</code> indicates failure.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static SaveOrUpdateOssConfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SaveOrUpdateOssConfigResponseBody self = new SaveOrUpdateOssConfigResponseBody();
        return TeaModel.build(map, self);
    }

    public SaveOrUpdateOssConfigResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public SaveOrUpdateOssConfigResponseBody setData(SaveOrUpdateOssConfigResponseBodyData data) {
        this.data = data;
        return this;
    }
    public SaveOrUpdateOssConfigResponseBodyData getData() {
        return this.data;
    }

    public SaveOrUpdateOssConfigResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public SaveOrUpdateOssConfigResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public SaveOrUpdateOssConfigResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public SaveOrUpdateOssConfigResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class SaveOrUpdateOssConfigResponseBodyData extends TeaModel {
        /**
         * <p>The name of the OSS bucket.</p>
         * 
         * <strong>example:</strong>
         * <p>xxx</p>
         */
        @NameInMap("BucketName")
        public String bucketName;

        /**
         * <p>Indicates whether the OSS configuration is active. \<code>1\\</code>: The configuration is active. \<code>0\\</code>: The configuration is inactive.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Enable")
        public String enable;

        /**
         * <p>The endpoint of OSS.</p>
         * 
         * <strong>example:</strong>
         * <p>oss-cn-shanghai.aliyuncs.com</p>
         */
        @NameInMap("Endpoint")
        public String endpoint;

        public static SaveOrUpdateOssConfigResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            SaveOrUpdateOssConfigResponseBodyData self = new SaveOrUpdateOssConfigResponseBodyData();
            return TeaModel.build(map, self);
        }

        public SaveOrUpdateOssConfigResponseBodyData setBucketName(String bucketName) {
            this.bucketName = bucketName;
            return this;
        }
        public String getBucketName() {
            return this.bucketName;
        }

        public SaveOrUpdateOssConfigResponseBodyData setEnable(String enable) {
            this.enable = enable;
            return this;
        }
        public String getEnable() {
            return this.enable;
        }

        public SaveOrUpdateOssConfigResponseBodyData setEndpoint(String endpoint) {
            this.endpoint = endpoint;
            return this;
        }
        public String getEndpoint() {
            return this.endpoint;
        }

    }

}
