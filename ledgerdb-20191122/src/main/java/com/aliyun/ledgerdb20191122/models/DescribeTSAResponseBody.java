// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ledgerdb20191122.models;

import com.aliyun.tea.*;

public class DescribeTSAResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TSADetail")
    public DescribeTSAResponseBodyTSADetail TSADetail;

    public static DescribeTSAResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeTSAResponseBody self = new DescribeTSAResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeTSAResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeTSAResponseBody setTSADetail(DescribeTSAResponseBodyTSADetail TSADetail) {
        this.TSADetail = TSADetail;
        return this;
    }
    public DescribeTSAResponseBodyTSADetail getTSADetail() {
        return this.TSADetail;
    }

    public static class DescribeTSAResponseBodyTSADetail extends TeaModel {
        @NameInMap("TS")
        public Long TS;

        @NameInMap("SN")
        public String SN;

        @NameInMap("RootHash")
        public String rootHash;

        @NameInMap("BlockNumber")
        public Long blockNumber;

        @NameInMap("CTSR")
        public String CTSR;

        public static DescribeTSAResponseBodyTSADetail build(java.util.Map<String, ?> map) throws Exception {
            DescribeTSAResponseBodyTSADetail self = new DescribeTSAResponseBodyTSADetail();
            return TeaModel.build(map, self);
        }

        public DescribeTSAResponseBodyTSADetail setTS(Long TS) {
            this.TS = TS;
            return this;
        }
        public Long getTS() {
            return this.TS;
        }

        public DescribeTSAResponseBodyTSADetail setSN(String SN) {
            this.SN = SN;
            return this;
        }
        public String getSN() {
            return this.SN;
        }

        public DescribeTSAResponseBodyTSADetail setRootHash(String rootHash) {
            this.rootHash = rootHash;
            return this;
        }
        public String getRootHash() {
            return this.rootHash;
        }

        public DescribeTSAResponseBodyTSADetail setBlockNumber(Long blockNumber) {
            this.blockNumber = blockNumber;
            return this;
        }
        public Long getBlockNumber() {
            return this.blockNumber;
        }

        public DescribeTSAResponseBodyTSADetail setCTSR(String CTSR) {
            this.CTSR = CTSR;
            return this;
        }
        public String getCTSR() {
            return this.CTSR;
        }

    }

}
