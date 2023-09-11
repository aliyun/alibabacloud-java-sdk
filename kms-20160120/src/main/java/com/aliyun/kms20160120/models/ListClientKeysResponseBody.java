// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.kms20160120.models;

import com.aliyun.tea.*;

public class ListClientKeysResponseBody extends TeaModel {
    @NameInMap("ClientKeys")
    public java.util.List<ListClientKeysResponseBodyClientKeys> clientKeys;

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
        @NameInMap("AapName")
        public String aapName;

        @NameInMap("ClientKeyId")
        public String clientKeyId;

        @NameInMap("CreateTime")
        public String createTime;

        @NameInMap("KeyAlgorithm")
        public String keyAlgorithm;

        @NameInMap("KeyOrigin")
        public String keyOrigin;

        @NameInMap("NotAfter")
        public String notAfter;

        @NameInMap("NotBefore")
        public String notBefore;

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
