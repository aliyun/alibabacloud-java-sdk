// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dysms20170620.models;

import com.aliyun.tea.*;

public class UploadCardResWithDyncParamResponseBody extends TeaModel {
    @NameInMap("AccessDeniedDetail")
    public String accessDeniedDetail;

    /**
     * <strong>example:</strong>
     * <p>示例值示例值</p>
     */
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public UploadCardResWithDyncParamResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>示例值示例值</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>示例值</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static UploadCardResWithDyncParamResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UploadCardResWithDyncParamResponseBody self = new UploadCardResWithDyncParamResponseBody();
        return TeaModel.build(map, self);
    }

    public UploadCardResWithDyncParamResponseBody setAccessDeniedDetail(String accessDeniedDetail) {
        this.accessDeniedDetail = accessDeniedDetail;
        return this;
    }
    public String getAccessDeniedDetail() {
        return this.accessDeniedDetail;
    }

    public UploadCardResWithDyncParamResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public UploadCardResWithDyncParamResponseBody setData(UploadCardResWithDyncParamResponseBodyData data) {
        this.data = data;
        return this;
    }
    public UploadCardResWithDyncParamResponseBodyData getData() {
        return this.data;
    }

    public UploadCardResWithDyncParamResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public UploadCardResWithDyncParamResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UploadCardResWithDyncParamResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class UploadCardResWithDyncParamResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>25</p>
         */
        @NameInMap("ResourceId")
        public Long resourceId;

        public static UploadCardResWithDyncParamResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            UploadCardResWithDyncParamResponseBodyData self = new UploadCardResWithDyncParamResponseBodyData();
            return TeaModel.build(map, self);
        }

        public UploadCardResWithDyncParamResponseBodyData setResourceId(Long resourceId) {
            this.resourceId = resourceId;
            return this;
        }
        public Long getResourceId() {
            return this.resourceId;
        }

    }

}
