// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class CreateStorageGatewayResponseBody extends TeaModel {
    /**
     * <p>The list of created nodes.</p>
     */
    @NameInMap("AllocationId")
    public java.util.List<CreateStorageGatewayResponseBodyAllocationId> allocationId;

    /**
     * <p>The success status code.</p>
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
    public java.util.List<CreateStorageGatewayResponseBodyUnAllocationId> unAllocationId;

    public static CreateStorageGatewayResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateStorageGatewayResponseBody self = new CreateStorageGatewayResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateStorageGatewayResponseBody setAllocationId(java.util.List<CreateStorageGatewayResponseBodyAllocationId> allocationId) {
        this.allocationId = allocationId;
        return this;
    }
    public java.util.List<CreateStorageGatewayResponseBodyAllocationId> getAllocationId() {
        return this.allocationId;
    }

    public CreateStorageGatewayResponseBody setBizStatusCode(String bizStatusCode) {
        this.bizStatusCode = bizStatusCode;
        return this;
    }
    public String getBizStatusCode() {
        return this.bizStatusCode;
    }

    public CreateStorageGatewayResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateStorageGatewayResponseBody setUnAllocationId(java.util.List<CreateStorageGatewayResponseBodyUnAllocationId> unAllocationId) {
        this.unAllocationId = unAllocationId;
        return this;
    }
    public java.util.List<CreateStorageGatewayResponseBodyUnAllocationId> getUnAllocationId() {
        return this.unAllocationId;
    }

    public static class CreateStorageGatewayResponseBodyAllocationId extends TeaModel {
        /**
         * <p>The ID of the node.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-chengdu-telecom-4</p>
         */
        @NameInMap("EnsRegionId")
        public String ensRegionId;

        /**
         * <p>The ID of the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>e426409223</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        public static CreateStorageGatewayResponseBodyAllocationId build(java.util.Map<String, ?> map) throws Exception {
            CreateStorageGatewayResponseBodyAllocationId self = new CreateStorageGatewayResponseBodyAllocationId();
            return TeaModel.build(map, self);
        }

        public CreateStorageGatewayResponseBodyAllocationId setEnsRegionId(String ensRegionId) {
            this.ensRegionId = ensRegionId;
            return this;
        }
        public String getEnsRegionId() {
            return this.ensRegionId;
        }

        public CreateStorageGatewayResponseBodyAllocationId setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

    }

    public static class CreateStorageGatewayResponseBodyUnAllocationId extends TeaModel {
        /**
         * <p>The ID of the node.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-chengdu-26</p>
         */
        @NameInMap("EnsRegionId")
        public String ensRegionId;

        /**
         * <p>The ID of the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>e426409258</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        public static CreateStorageGatewayResponseBodyUnAllocationId build(java.util.Map<String, ?> map) throws Exception {
            CreateStorageGatewayResponseBodyUnAllocationId self = new CreateStorageGatewayResponseBodyUnAllocationId();
            return TeaModel.build(map, self);
        }

        public CreateStorageGatewayResponseBodyUnAllocationId setEnsRegionId(String ensRegionId) {
            this.ensRegionId = ensRegionId;
            return this;
        }
        public String getEnsRegionId() {
            return this.ensRegionId;
        }

        public CreateStorageGatewayResponseBodyUnAllocationId setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

    }

}
