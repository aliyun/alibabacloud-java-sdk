// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eds_aic20230930.models;

import com.aliyun.tea.*;

public class ImportKeyPairResponseBody extends TeaModel {
    @NameInMap("Data")
    public ImportKeyPairResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>69BCBBE4-FCF2-59B8-AD9D-531EB422****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ImportKeyPairResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ImportKeyPairResponseBody self = new ImportKeyPairResponseBody();
        return TeaModel.build(map, self);
    }

    public ImportKeyPairResponseBody setData(ImportKeyPairResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ImportKeyPairResponseBodyData getData() {
        return this.data;
    }

    public ImportKeyPairResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ImportKeyPairResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>2023-03-05T10:29:22Z</p>
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
         * <p>TestKeyPairName</p>
         */
        @NameInMap("KeyPairName")
        public String keyPairName;

        public static ImportKeyPairResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ImportKeyPairResponseBodyData self = new ImportKeyPairResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ImportKeyPairResponseBodyData setGmtCreated(String gmtCreated) {
            this.gmtCreated = gmtCreated;
            return this;
        }
        public String getGmtCreated() {
            return this.gmtCreated;
        }

        public ImportKeyPairResponseBodyData setKeyPairId(String keyPairId) {
            this.keyPairId = keyPairId;
            return this;
        }
        public String getKeyPairId() {
            return this.keyPairId;
        }

        public ImportKeyPairResponseBodyData setKeyPairName(String keyPairName) {
            this.keyPairName = keyPairName;
            return this;
        }
        public String getKeyPairName() {
            return this.keyPairName;
        }

    }

}
