// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.milvusknowledgebase20260604.models;

import com.aliyun.tea.*;

public class GetKnowledgeBasePreSignedUrlResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>{&quot;PolicyType&quot;:&quot;AccountLevelIdentityBasedPolicy&quot;,&quot;AuthPrincipalOwnerId&quot;:&quot;1234567890123456&quot;,&quot;AuthPrincipalType&quot;:&quot;SubUser&quot;,&quot;AuthPrincipalDisplayName&quot;:&quot;1234567890123456&quot;,&quot;NoPermissionType&quot;:&quot;ImplicitDeny&quot;,&quot;AuthAction&quot;:&quot;milvusknowledgebase:ListDatasets&quot;}</p>
     */
    @NameInMap("accessDeniedDetail")
    public String accessDeniedDetail;

    /**
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("code")
    public Integer code;

    @NameInMap("data")
    public GetKnowledgeBasePreSignedUrlResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>403</p>
     */
    @NameInMap("httpStatusCode")
    public Integer httpStatusCode;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("success")
    public Boolean success;

    public static GetKnowledgeBasePreSignedUrlResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetKnowledgeBasePreSignedUrlResponseBody self = new GetKnowledgeBasePreSignedUrlResponseBody();
        return TeaModel.build(map, self);
    }

    public GetKnowledgeBasePreSignedUrlResponseBody setAccessDeniedDetail(String accessDeniedDetail) {
        this.accessDeniedDetail = accessDeniedDetail;
        return this;
    }
    public String getAccessDeniedDetail() {
        return this.accessDeniedDetail;
    }

    public GetKnowledgeBasePreSignedUrlResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public GetKnowledgeBasePreSignedUrlResponseBody setData(GetKnowledgeBasePreSignedUrlResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetKnowledgeBasePreSignedUrlResponseBodyData getData() {
        return this.data;
    }

    public GetKnowledgeBasePreSignedUrlResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public GetKnowledgeBasePreSignedUrlResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetKnowledgeBasePreSignedUrlResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>knowledgebase-fileupload</p>
         */
        @NameInMap("bucketName")
        public String bucketName;

        /**
         * <strong>example:</strong>
         * <p>3600</p>
         */
        @NameInMap("expiresIn")
        public Integer expiresIn;

        @NameInMap("preSignedUrls")
        public java.util.List<String> preSignedUrls;

        public static GetKnowledgeBasePreSignedUrlResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetKnowledgeBasePreSignedUrlResponseBodyData self = new GetKnowledgeBasePreSignedUrlResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetKnowledgeBasePreSignedUrlResponseBodyData setBucketName(String bucketName) {
            this.bucketName = bucketName;
            return this;
        }
        public String getBucketName() {
            return this.bucketName;
        }

        public GetKnowledgeBasePreSignedUrlResponseBodyData setExpiresIn(Integer expiresIn) {
            this.expiresIn = expiresIn;
            return this;
        }
        public Integer getExpiresIn() {
            return this.expiresIn;
        }

        public GetKnowledgeBasePreSignedUrlResponseBodyData setPreSignedUrls(java.util.List<String> preSignedUrls) {
            this.preSignedUrls = preSignedUrls;
            return this;
        }
        public java.util.List<String> getPreSignedUrls() {
            return this.preSignedUrls;
        }

    }

}
