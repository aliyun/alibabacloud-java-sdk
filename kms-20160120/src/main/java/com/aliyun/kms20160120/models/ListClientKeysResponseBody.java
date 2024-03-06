// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.kms20160120.models;

import com.aliyun.tea.*;

public class ListClientKeysResponseBody extends TeaModel {
    /**
     * <p>A list of client keys.</p>
     */
    @NameInMap("ClientKeys")
    public java.util.List<ListClientKeysResponseBodyClientKeys> clientKeys;

    /**
     * <p>The ID of the request, which is used to locate and troubleshoot issues.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ListClientKeysResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListClientKeysResponseBody self = new ListClientKeysResponseBody();
        return TeaModel.build(map, self);
    }

    public ListClientKeysResponseBody setClientKeys(java.util.List<ListClientKeysResponseBodyClientKeys> clientKeys) {
        this.clientKeys = clientKeys;
        return this;
    }
    public java.util.List<ListClientKeysResponseBodyClientKeys> getClientKeys() {
        return this.clientKeys;
    }

    public ListClientKeysResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListClientKeysResponseBodyClientKeys extends TeaModel {
        /**
         * <p>The name of the AAP.</p>
         */
        @NameInMap("AapName")
        public String aapName;

        /**
         * <p>The ID of the client key.</p>
         */
        @NameInMap("ClientKeyId")
        public String clientKeyId;

        /**
         * <p>The time when the client key was created.</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <p>The private key algorithm of the client key.</p>
         */
        @NameInMap("KeyAlgorithm")
        public String keyAlgorithm;

        /**
         * <p>The provider of the client key.</p>
         * <br>
         * <p>Currently, only KMS is supported. The value is fixed as KMS_PROVIDED.</p>
         */
        @NameInMap("KeyOrigin")
        public String keyOrigin;

        /**
         * <p>The end of the validity period of the client key.</p>
         */
        @NameInMap("NotAfter")
        public String notAfter;

        /**
         * <p>The beginning of the validity period of the client key.</p>
         */
        @NameInMap("NotBefore")
        public String notBefore;

        /**
         * <p>The public key of the client key.</p>
         */
        @NameInMap("PublicKeyData")
        public String publicKeyData;

        public static ListClientKeysResponseBodyClientKeys build(java.util.Map<String, ?> map) throws Exception {
            ListClientKeysResponseBodyClientKeys self = new ListClientKeysResponseBodyClientKeys();
            return TeaModel.build(map, self);
        }

        public ListClientKeysResponseBodyClientKeys setAapName(String aapName) {
            this.aapName = aapName;
            return this;
        }
        public String getAapName() {
            return this.aapName;
        }

        public ListClientKeysResponseBodyClientKeys setClientKeyId(String clientKeyId) {
            this.clientKeyId = clientKeyId;
            return this;
        }
        public String getClientKeyId() {
            return this.clientKeyId;
        }

        public ListClientKeysResponseBodyClientKeys setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public ListClientKeysResponseBodyClientKeys setKeyAlgorithm(String keyAlgorithm) {
            this.keyAlgorithm = keyAlgorithm;
            return this;
        }
        public String getKeyAlgorithm() {
            return this.keyAlgorithm;
        }

        public ListClientKeysResponseBodyClientKeys setKeyOrigin(String keyOrigin) {
            this.keyOrigin = keyOrigin;
            return this;
        }
        public String getKeyOrigin() {
            return this.keyOrigin;
        }

        public ListClientKeysResponseBodyClientKeys setNotAfter(String notAfter) {
            this.notAfter = notAfter;
            return this;
        }
        public String getNotAfter() {
            return this.notAfter;
        }

        public ListClientKeysResponseBodyClientKeys setNotBefore(String notBefore) {
            this.notBefore = notBefore;
            return this;
        }
        public String getNotBefore() {
            return this.notBefore;
        }

        public ListClientKeysResponseBodyClientKeys setPublicKeyData(String publicKeyData) {
            this.publicKeyData = publicKeyData;
            return this;
        }
        public String getPublicKeyData() {
            return this.publicKeyData;
        }

    }

}
