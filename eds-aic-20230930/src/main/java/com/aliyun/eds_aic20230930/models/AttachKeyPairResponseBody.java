// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eds_aic20230930.models;

import com.aliyun.tea.*;

public class AttachKeyPairResponseBody extends TeaModel {
    /**
     * <p>The object that is returned.</p>
     */
    @NameInMap("Data")
    public AttachKeyPairResponseBodyData data;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>69BCBBE4-FCF2-59B8-AD9D-531EB422****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static AttachKeyPairResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AttachKeyPairResponseBody self = new AttachKeyPairResponseBody();
        return TeaModel.build(map, self);
    }

    public AttachKeyPairResponseBody setData(AttachKeyPairResponseBodyData data) {
        this.data = data;
        return this;
    }
    public AttachKeyPairResponseBodyData getData() {
        return this.data;
    }

    public AttachKeyPairResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class AttachKeyPairResponseBodyData extends TeaModel {
        /**
         * <p>The IDs of the cloud phone instances to which the ADB key pair is successfully attached.</p>
         */
        @NameInMap("AttachedInstanceIds")
        public java.util.List<String> attachedInstanceIds;

        /**
         * <p>The number of the cloud phone instances to which the ADB key pair failed to be attached.</p>
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
         * <p>100</p>
         */
        @NameInMap("TotalCount")
        public Integer totalCount;

        public static AttachKeyPairResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            AttachKeyPairResponseBodyData self = new AttachKeyPairResponseBodyData();
            return TeaModel.build(map, self);
        }

        public AttachKeyPairResponseBodyData setAttachedInstanceIds(java.util.List<String> attachedInstanceIds) {
            this.attachedInstanceIds = attachedInstanceIds;
            return this;
        }
        public java.util.List<String> getAttachedInstanceIds() {
            return this.attachedInstanceIds;
        }

        public AttachKeyPairResponseBodyData setFailCount(Integer failCount) {
            this.failCount = failCount;
            return this;
        }
        public Integer getFailCount() {
            return this.failCount;
        }

        public AttachKeyPairResponseBodyData setKeyPairId(String keyPairId) {
            this.keyPairId = keyPairId;
            return this;
        }
        public String getKeyPairId() {
            return this.keyPairId;
        }

        public AttachKeyPairResponseBodyData setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

    }

}
