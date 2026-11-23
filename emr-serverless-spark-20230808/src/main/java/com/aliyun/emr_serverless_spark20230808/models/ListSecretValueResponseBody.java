// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr_serverless_spark20230808.models;

import com.aliyun.tea.*;

public class ListSecretValueResponseBody extends TeaModel {
    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>79555076-7087-59EF-A936-8C31A48AA1E2</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>The list of secrets.</p>
     */
    @NameInMap("secrets")
    public java.util.List<ListSecretValueResponseBodySecrets> secrets;

    public static ListSecretValueResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListSecretValueResponseBody self = new ListSecretValueResponseBody();
        return TeaModel.build(map, self);
    }

    public ListSecretValueResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListSecretValueResponseBody setSecrets(java.util.List<ListSecretValueResponseBodySecrets> secrets) {
        this.secrets = secrets;
        return this;
    }
    public java.util.List<ListSecretValueResponseBodySecrets> getSecrets() {
        return this.secrets;
    }

    public static class ListSecretValueResponseBodySecrets extends TeaModel {
        /**
         * <p>The comment.</p>
         * 
         * <strong>example:</strong>
         * <p>My secret。</p>
         */
        @NameInMap("comment")
        public String comment;

        /**
         * <p>The secret content.</p>
         * 
         * <strong>example:</strong>
         * <p>password</p>
         */
        @NameInMap("content")
        public String content;

        /**
         * <p>The creation time. The value is a UNIX timestamp in milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1787220243000</p>
         */
        @NameInMap("createTime")
        public Long createTime;

        /**
         * <p>The UID of the creator.</p>
         * 
         * <strong>example:</strong>
         * <p>12550000006396</p>
         */
        @NameInMap("creator")
        public String creator;

        /**
         * <p>The nickname of the creator.</p>
         * 
         * <strong>example:</strong>
         * <p>admin</p>
         */
        @NameInMap("creatorName")
        public String creatorName;

        /**
         * <p>The secret name.</p>
         * 
         * <strong>example:</strong>
         * <p>mysecret</p>
         */
        @NameInMap("name")
        public String name;

        /**
         * <p>The secret ID.</p>
         * 
         * <strong>example:</strong>
         * <p>st-xxxxxxxxxxxx</p>
         */
        @NameInMap("secretId")
        public String secretId;

        /**
         * <p>The secret type. The value is fixed to secret.</p>
         * 
         * <strong>example:</strong>
         * <p>secret</p>
         */
        @NameInMap("secretType")
        public String secretType;

        public static ListSecretValueResponseBodySecrets build(java.util.Map<String, ?> map) throws Exception {
            ListSecretValueResponseBodySecrets self = new ListSecretValueResponseBodySecrets();
            return TeaModel.build(map, self);
        }

        public ListSecretValueResponseBodySecrets setComment(String comment) {
            this.comment = comment;
            return this;
        }
        public String getComment() {
            return this.comment;
        }

        public ListSecretValueResponseBodySecrets setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

        public ListSecretValueResponseBodySecrets setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public ListSecretValueResponseBodySecrets setCreator(String creator) {
            this.creator = creator;
            return this;
        }
        public String getCreator() {
            return this.creator;
        }

        public ListSecretValueResponseBodySecrets setCreatorName(String creatorName) {
            this.creatorName = creatorName;
            return this;
        }
        public String getCreatorName() {
            return this.creatorName;
        }

        public ListSecretValueResponseBodySecrets setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListSecretValueResponseBodySecrets setSecretId(String secretId) {
            this.secretId = secretId;
            return this;
        }
        public String getSecretId() {
            return this.secretId;
        }

        public ListSecretValueResponseBodySecrets setSecretType(String secretType) {
            this.secretType = secretType;
            return this;
        }
        public String getSecretType() {
            return this.secretType;
        }

    }

}
