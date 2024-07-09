// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class DescribeKmsKeysResponseBody extends TeaModel {
    /**
     * <p>The authorization status.</p>
     * 
     * <strong>example:</strong>
     * <p>authorized</p>
     */
    @NameInMap("AuthorizeStatus")
    public String authorizeStatus;

    /**
     * <p>Details about the customer master keys (CMKs).</p>
     */
    @NameInMap("Keys")
    public java.util.List<DescribeKmsKeysResponseBodyKeys> keys;

    /**
     * <p>Indicates whether KMS is activated.</p>
     * 
     * <strong>example:</strong>
     * <p>enabled</p>
     */
    @NameInMap("KmsServiceStatus")
    public String kmsServiceStatus;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>1CBAFFAB-B697-4049-A9B1-67E1FC5F****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeKmsKeysResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeKmsKeysResponseBody self = new DescribeKmsKeysResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeKmsKeysResponseBody setAuthorizeStatus(String authorizeStatus) {
        this.authorizeStatus = authorizeStatus;
        return this;
    }
    public String getAuthorizeStatus() {
        return this.authorizeStatus;
    }

    public DescribeKmsKeysResponseBody setKeys(java.util.List<DescribeKmsKeysResponseBodyKeys> keys) {
        this.keys = keys;
        return this;
    }
    public java.util.List<DescribeKmsKeysResponseBodyKeys> getKeys() {
        return this.keys;
    }

    public DescribeKmsKeysResponseBody setKmsServiceStatus(String kmsServiceStatus) {
        this.kmsServiceStatus = kmsServiceStatus;
        return this;
    }
    public String getKmsServiceStatus() {
        return this.kmsServiceStatus;
    }

    public DescribeKmsKeysResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeKmsKeysResponseBodyKeys extends TeaModel {
        /**
         * <p>The alias of the key.</p>
         * 
         * <strong>example:</strong>
         * <p>TestAlias</p>
         */
        @NameInMap("Alias")
        public String alias;

        /**
         * <p>The Alibaba Cloud Resource Name (ARN) of the key in KMS.</p>
         * 
         * <strong>example:</strong>
         * <p>acs:kms:cn-hangzhou:154035569884****:key/05754286-3ba2-4fa6-8d41-4323aca6****</p>
         */
        @NameInMap("Arn")
        public String arn;

        /**
         * <p>The ID of the key.</p>
         * 
         * <strong>example:</strong>
         * <p>05754286-3ba2-4fa6-8d41-4323aca6****</p>
         */
        @NameInMap("KeyId")
        public String keyId;

        /**
         * <p>The type of the key.</p>
         * 
         * <strong>example:</strong>
         * <p>ServiceKey</p>
         */
        @NameInMap("Type")
        public String type;

        public static DescribeKmsKeysResponseBodyKeys build(java.util.Map<String, ?> map) throws Exception {
            DescribeKmsKeysResponseBodyKeys self = new DescribeKmsKeysResponseBodyKeys();
            return TeaModel.build(map, self);
        }

        public DescribeKmsKeysResponseBodyKeys setAlias(String alias) {
            this.alias = alias;
            return this;
        }
        public String getAlias() {
            return this.alias;
        }

        public DescribeKmsKeysResponseBodyKeys setArn(String arn) {
            this.arn = arn;
            return this;
        }
        public String getArn() {
            return this.arn;
        }

        public DescribeKmsKeysResponseBodyKeys setKeyId(String keyId) {
            this.keyId = keyId;
            return this;
        }
        public String getKeyId() {
            return this.keyId;
        }

        public DescribeKmsKeysResponseBodyKeys setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

}
