// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aimiaobi20230801.models;

import com.aliyun.tea.*;

public class GenerateUploadConfigResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>NoData</p>
     */
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public GenerateUploadConfigResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>1813ceee-7fe5-41b4-87e5-982a4d18cca5</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static GenerateUploadConfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GenerateUploadConfigResponseBody self = new GenerateUploadConfigResponseBody();
        return TeaModel.build(map, self);
    }

    public GenerateUploadConfigResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GenerateUploadConfigResponseBody setData(GenerateUploadConfigResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GenerateUploadConfigResponseBodyData getData() {
        return this.data;
    }

    public GenerateUploadConfigResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public GenerateUploadConfigResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GenerateUploadConfigResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GenerateUploadConfigResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GenerateUploadConfigResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>oss://default/oss-bucket-name/aimiaobi/2021/07/01/1625126400000/1.docx</p>
         */
        @NameInMap("FileKey")
        public String fileKey;

        @NameInMap("FormDatas")
        public java.util.Map<String, ?> formDatas;

        /**
         * <strong>example:</strong>
         * <p><a href="https://bucket-name.oss-cn-hangzhou.aliyuncs.com">https://bucket-name.oss-cn-hangzhou.aliyuncs.com</a></p>
         */
        @NameInMap("PostUrl")
        public String postUrl;

        public static GenerateUploadConfigResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GenerateUploadConfigResponseBodyData self = new GenerateUploadConfigResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GenerateUploadConfigResponseBodyData setFileKey(String fileKey) {
            this.fileKey = fileKey;
            return this;
        }
        public String getFileKey() {
            return this.fileKey;
        }

        public GenerateUploadConfigResponseBodyData setFormDatas(java.util.Map<String, ?> formDatas) {
            this.formDatas = formDatas;
            return this;
        }
        public java.util.Map<String, ?> getFormDatas() {
            return this.formDatas;
        }

        public GenerateUploadConfigResponseBodyData setPostUrl(String postUrl) {
            this.postUrl = postUrl;
            return this;
        }
        public String getPostUrl() {
            return this.postUrl;
        }

    }

}
