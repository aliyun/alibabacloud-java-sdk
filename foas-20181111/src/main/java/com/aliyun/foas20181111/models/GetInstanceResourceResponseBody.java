// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.foas20181111.models;

import com.aliyun.tea.*;

public class GetInstanceResourceResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Resource")
    public GetInstanceResourceResponseBodyResource resource;

    public static GetInstanceResourceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetInstanceResourceResponseBody self = new GetInstanceResourceResponseBody();
        return TeaModel.build(map, self);
    }

    public GetInstanceResourceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetInstanceResourceResponseBody setResource(GetInstanceResourceResponseBodyResource resource) {
        this.resource = resource;
        return this;
    }
    public GetInstanceResourceResponseBodyResource getResource() {
        return this.resource;
    }

    public static class GetInstanceResourceResponseBodyResource extends TeaModel {
        @NameInMap("AllocatedMB")
        public Long allocatedMB;

        @NameInMap("AllocatedVirtualCores")
        public Long allocatedVirtualCores;

        @NameInMap("TotalMB")
        public Long totalMB;

        @NameInMap("TotalVirtualCores")
        public Long totalVirtualCores;

        public static GetInstanceResourceResponseBodyResource build(java.util.Map<String, ?> map) throws Exception {
            GetInstanceResourceResponseBodyResource self = new GetInstanceResourceResponseBodyResource();
            return TeaModel.build(map, self);
        }

        public GetInstanceResourceResponseBodyResource setAllocatedMB(Long allocatedMB) {
            this.allocatedMB = allocatedMB;
            return this;
        }
        public Long getAllocatedMB() {
            return this.allocatedMB;
        }

        public GetInstanceResourceResponseBodyResource setAllocatedVirtualCores(Long allocatedVirtualCores) {
            this.allocatedVirtualCores = allocatedVirtualCores;
            return this;
        }
        public Long getAllocatedVirtualCores() {
            return this.allocatedVirtualCores;
        }

        public GetInstanceResourceResponseBodyResource setTotalMB(Long totalMB) {
            this.totalMB = totalMB;
            return this;
        }
        public Long getTotalMB() {
            return this.totalMB;
        }

        public GetInstanceResourceResponseBodyResource setTotalVirtualCores(Long totalVirtualCores) {
            this.totalVirtualCores = totalVirtualCores;
            return this;
        }
        public Long getTotalVirtualCores() {
            return this.totalVirtualCores;
        }

    }

}
