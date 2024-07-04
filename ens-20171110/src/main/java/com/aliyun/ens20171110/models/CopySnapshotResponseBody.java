// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class CopySnapshotResponseBody extends TeaModel {
    /**
     * <p>The list of created snapshots.</p>
     */
    @NameInMap("AllocationId")
    public java.util.List<CopySnapshotResponseBodyAllocationId> allocationId;

    /**
     * <p>Success status code.</p>
     * <ul>
     * <li><strong>PartSuccess</strong>: partially succeeded.</li>
     * <li><strong>AllSuccess</strong>: all succeeded.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>AllSuccess</p>
     */
    @NameInMap("BizStatusCode")
    public String bizStatusCode;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>EA3758E0-8899-17D3-9526-5F62CF33A586</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The list of nodes that are not created.</p>
     */
    @NameInMap("UnAllocationId")
    public java.util.List<CopySnapshotResponseBodyUnAllocationId> unAllocationId;

    public static CopySnapshotResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CopySnapshotResponseBody self = new CopySnapshotResponseBody();
        return TeaModel.build(map, self);
    }

    public CopySnapshotResponseBody setAllocationId(java.util.List<CopySnapshotResponseBodyAllocationId> allocationId) {
        this.allocationId = allocationId;
        return this;
    }
    public java.util.List<CopySnapshotResponseBodyAllocationId> getAllocationId() {
        return this.allocationId;
    }

    public CopySnapshotResponseBody setBizStatusCode(String bizStatusCode) {
        this.bizStatusCode = bizStatusCode;
        return this;
    }
    public String getBizStatusCode() {
        return this.bizStatusCode;
    }

    public CopySnapshotResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CopySnapshotResponseBody setUnAllocationId(java.util.List<CopySnapshotResponseBodyUnAllocationId> unAllocationId) {
        this.unAllocationId = unAllocationId;
        return this;
    }
    public java.util.List<CopySnapshotResponseBodyUnAllocationId> getUnAllocationId() {
        return this.unAllocationId;
    }

    public static class CopySnapshotResponseBodyAllocationId extends TeaModel {
        /**
         * <p>The ID of the node.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-chengdu-telecom-4</p>
         */
        @NameInMap("EnsRegionId")
        public String ensRegionId;

        /**
         * <p>An array of instance IDs.</p>
         */
        @NameInMap("InstanceId")
        public java.util.List<String> instanceId;

        public static CopySnapshotResponseBodyAllocationId build(java.util.Map<String, ?> map) throws Exception {
            CopySnapshotResponseBodyAllocationId self = new CopySnapshotResponseBodyAllocationId();
            return TeaModel.build(map, self);
        }

        public CopySnapshotResponseBodyAllocationId setEnsRegionId(String ensRegionId) {
            this.ensRegionId = ensRegionId;
            return this;
        }
        public String getEnsRegionId() {
            return this.ensRegionId;
        }

        public CopySnapshotResponseBodyAllocationId setInstanceId(java.util.List<String> instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public java.util.List<String> getInstanceId() {
            return this.instanceId;
        }

    }

    public static class CopySnapshotResponseBodyUnAllocationId extends TeaModel {
        /**
         * <p>The ID of the node.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-chengdu-26</p>
         */
        @NameInMap("EnsRegionId")
        public String ensRegionId;

        public static CopySnapshotResponseBodyUnAllocationId build(java.util.Map<String, ?> map) throws Exception {
            CopySnapshotResponseBodyUnAllocationId self = new CopySnapshotResponseBodyUnAllocationId();
            return TeaModel.build(map, self);
        }

        public CopySnapshotResponseBodyUnAllocationId setEnsRegionId(String ensRegionId) {
            this.ensRegionId = ensRegionId;
            return this;
        }
        public String getEnsRegionId() {
            return this.ensRegionId;
        }

    }

}
