// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iacservice20210806.models;

import com.aliyun.tea.*;

public class GetEncryptionConfigResponseBody extends TeaModel {
    /**
     * <p>The object key.</p>
     */
    @NameInMap("config")
    public GetEncryptionConfigResponseBodyConfig config;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>1A662F56-CA76-55F6-869D-7F26293B8E67</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static GetEncryptionConfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetEncryptionConfigResponseBody self = new GetEncryptionConfigResponseBody();
        return TeaModel.build(map, self);
    }

    public GetEncryptionConfigResponseBody setConfig(GetEncryptionConfigResponseBodyConfig config) {
        this.config = config;
        return this;
    }
    public GetEncryptionConfigResponseBodyConfig getConfig() {
        return this.config;
    }

    public GetEncryptionConfigResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetEncryptionConfigResponseBodyConfig extends TeaModel {
        /**
         * <p>The key alias.</p>
         * 
         * <strong>example:</strong>
         * <p>alias/default</p>
         */
        @NameInMap("alias")
        public String alias;

        /**
         * <p>The creator ID.</p>
         * 
         * <strong>example:</strong>
         * <p>561786482014xxxx</p>
         */
        @NameInMap("creator")
        public String creator;

        /**
         * <p>The key ARN.</p>
         * 
         * <strong>example:</strong>
         * <p>acs:kms:ap-southeast-6:561786482014xxxx:key/5f2fe70a-d110-44cc-990f-706eb20fxxxx</p>
         */
        @NameInMap("keyArn")
        public String keyArn;

        /**
         * <p>The key ID.</p>
         * 
         * <strong>example:</strong>
         * <p>5f2fe70a-d110-44cc-990f-706eb20fxxxx</p>
         */
        @NameInMap("keyId")
        public String keyId;

        /**
         * <p>The key status. Valid values:</p>
         * <ul>
         * <li>Enabled</li>
         * <li>Disabled</li>
         * <li>PendingDeletion</li>
         * <li>PendingImport</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Enabled</p>
         */
        @NameInMap("status")
        public String status;

        public static GetEncryptionConfigResponseBodyConfig build(java.util.Map<String, ?> map) throws Exception {
            GetEncryptionConfigResponseBodyConfig self = new GetEncryptionConfigResponseBodyConfig();
            return TeaModel.build(map, self);
        }

        public GetEncryptionConfigResponseBodyConfig setAlias(String alias) {
            this.alias = alias;
            return this;
        }
        public String getAlias() {
            return this.alias;
        }

        public GetEncryptionConfigResponseBodyConfig setCreator(String creator) {
            this.creator = creator;
            return this;
        }
        public String getCreator() {
            return this.creator;
        }

        public GetEncryptionConfigResponseBodyConfig setKeyArn(String keyArn) {
            this.keyArn = keyArn;
            return this;
        }
        public String getKeyArn() {
            return this.keyArn;
        }

        public GetEncryptionConfigResponseBodyConfig setKeyId(String keyId) {
            this.keyId = keyId;
            return this;
        }
        public String getKeyId() {
            return this.keyId;
        }

        public GetEncryptionConfigResponseBodyConfig setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

}
