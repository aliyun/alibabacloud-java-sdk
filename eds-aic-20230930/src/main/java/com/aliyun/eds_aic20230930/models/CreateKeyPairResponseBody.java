// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eds_aic20230930.models;

import com.aliyun.tea.*;

public class CreateKeyPairResponseBody extends TeaModel {
    @NameInMap("Data")
    public CreateKeyPairResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>69BCBBE4-FCF2-59B8-AD9D-531EB422****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static CreateKeyPairResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateKeyPairResponseBody self = new CreateKeyPairResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateKeyPairResponseBody setData(CreateKeyPairResponseBodyData data) {
        this.data = data;
        return this;
    }
    public CreateKeyPairResponseBodyData getData() {
        return this.data;
    }

    public CreateKeyPairResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class CreateKeyPairResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>2024-06-30 08:45:09.0</p>
         */
        @NameInMap("GmtCreated")
        public String gmtCreated;

        /**
         * <strong>example:</strong>
         * <p>kp-6v2q33ae4tw3*****</p>
         */
        @NameInMap("KeyPairId")
        public String keyPairId;

        /**
         * <strong>example:</strong>
         * <p>testKeyPairName</p>
         */
        @NameInMap("KeyPairName")
        public String keyPairName;

        /**
         * <strong>example:</strong>
         * <p>MIIEpAIBAAKCAQEAtReyMzLIcBH78EV2zj****</p>
         */
        @NameInMap("PrivateKeyBody")
        public String privateKeyBody;

        public static CreateKeyPairResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            CreateKeyPairResponseBodyData self = new CreateKeyPairResponseBodyData();
            return TeaModel.build(map, self);
        }

        public CreateKeyPairResponseBodyData setGmtCreated(String gmtCreated) {
            this.gmtCreated = gmtCreated;
            return this;
        }
        public String getGmtCreated() {
            return this.gmtCreated;
        }

        public CreateKeyPairResponseBodyData setKeyPairId(String keyPairId) {
            this.keyPairId = keyPairId;
            return this;
        }
        public String getKeyPairId() {
            return this.keyPairId;
        }

        public CreateKeyPairResponseBodyData setKeyPairName(String keyPairName) {
            this.keyPairName = keyPairName;
            return this;
        }
        public String getKeyPairName() {
            return this.keyPairName;
        }

        public CreateKeyPairResponseBodyData setPrivateKeyBody(String privateKeyBody) {
            this.privateKeyBody = privateKeyBody;
            return this;
        }
        public String getPrivateKeyBody() {
            return this.privateKeyBody;
        }

    }

}
