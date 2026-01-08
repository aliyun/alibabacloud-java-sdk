// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cams20200606.models;

import com.aliyun.tea.*;

public class GeneratePresignedUrlResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>{}</p>
     */
    @NameInMap("AccessDeniedDetail")
    public String accessDeniedDetail;

    /**
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public GeneratePresignedUrlResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>90E63D28-E31D-1EB2-8939-A94866**</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static GeneratePresignedUrlResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GeneratePresignedUrlResponseBody self = new GeneratePresignedUrlResponseBody();
        return TeaModel.build(map, self);
    }

    public GeneratePresignedUrlResponseBody setAccessDeniedDetail(String accessDeniedDetail) {
        this.accessDeniedDetail = accessDeniedDetail;
        return this;
    }
    public String getAccessDeniedDetail() {
        return this.accessDeniedDetail;
    }

    public GeneratePresignedUrlResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GeneratePresignedUrlResponseBody setData(GeneratePresignedUrlResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GeneratePresignedUrlResponseBodyData getData() {
        return this.data;
    }

    public GeneratePresignedUrlResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GeneratePresignedUrlResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GeneratePresignedUrlResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GeneratePresignedUrlResponseBodyData extends TeaModel {
        @NameInMap("Url")
        public String url;

        public static GeneratePresignedUrlResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GeneratePresignedUrlResponseBodyData self = new GeneratePresignedUrlResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GeneratePresignedUrlResponseBodyData setUrl(String url) {
            this.url = url;
            return this;
        }
        public String getUrl() {
            return this.url;
        }

    }

}
