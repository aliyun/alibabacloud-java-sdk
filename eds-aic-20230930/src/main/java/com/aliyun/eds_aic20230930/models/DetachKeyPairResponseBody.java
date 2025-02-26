// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eds_aic20230930.models;

import com.aliyun.tea.*;

public class DetachKeyPairResponseBody extends TeaModel {
    /**
     * <p>The object that is returned.</p>
     */
    @NameInMap("Data")
    public DetachKeyPairResponseBodyData data;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>69BCBBE4-FCF2-59B8-AD9D-531EB422****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DetachKeyPairResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DetachKeyPairResponseBody self = new DetachKeyPairResponseBody();
        return TeaModel.build(map, self);
    }

    public DetachKeyPairResponseBody setData(DetachKeyPairResponseBodyData data) {
        this.data = data;
        return this;
    }
    public DetachKeyPairResponseBodyData getData() {
        return this.data;
    }

    public DetachKeyPairResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DetachKeyPairResponseBodyData extends TeaModel {
        /**
         * <p>The IDs of the cloud phone instances from which the ADB key pair is successfully detached.</p>
         */
        @NameInMap("DetachedInstanceIds")
        public java.util.List<String> detachedInstanceIds;

        /**
         * <p>The number of the cloud phone instances from which the ADB key pair failed to be detached.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("FailCount")
        public Integer failCount;

        /**
         * <p>The ID of the ADB key pair.</p>
         * 
         * <strong>example:</strong>
         * <p>kp-6v2q33ae4tw3a****</p>
         */
        @NameInMap("KeyPairId")
        public String keyPairId;

        /**
         * <p>The total number of the cloud phone instances.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("TotalCount")
        public Integer totalCount;

        public static DetachKeyPairResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DetachKeyPairResponseBodyData self = new DetachKeyPairResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DetachKeyPairResponseBodyData setDetachedInstanceIds(java.util.List<String> detachedInstanceIds) {
            this.detachedInstanceIds = detachedInstanceIds;
            return this;
        }
        public java.util.List<String> getDetachedInstanceIds() {
            return this.detachedInstanceIds;
        }

        public DetachKeyPairResponseBodyData setFailCount(Integer failCount) {
            this.failCount = failCount;
            return this;
        }
        public Integer getFailCount() {
            return this.failCount;
        }

        public DetachKeyPairResponseBodyData setKeyPairId(String keyPairId) {
            this.keyPairId = keyPairId;
            return this;
        }
        public String getKeyPairId() {
            return this.keyPairId;
        }

        public DetachKeyPairResponseBodyData setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

    }

}
