// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.foas20181111.models;

import com.aliyun.tea.*;

public class GetClusterResourceResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Resource")
    public GetClusterResourceResponseBodyResource resource;

    public static GetClusterResourceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetClusterResourceResponseBody self = new GetClusterResourceResponseBody();
        return TeaModel.build(map, self);
    }

    public GetClusterResourceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetClusterResourceResponseBody setResource(GetClusterResourceResponseBodyResource resource) {
        this.resource = resource;
        return this;
    }
    public GetClusterResourceResponseBodyResource getResource() {
        return this.resource;
    }

    public static class GetClusterResourceResponseBodyResource extends TeaModel {
        @NameInMap("AllocatedMB")
        public Long allocatedMB;

        @NameInMap("AllocatedVirtualCores")
        public Long allocatedVirtualCores;

        @NameInMap("AvailableMB")
        public Long availableMB;

        @NameInMap("AvailableVirtualCores")
        public Long availableVirtualCores;

        @NameInMap("TotalMB")
        public Long totalMB;

        @NameInMap("TotalVirtualCores")
        public Long totalVirtualCores;

        public static GetClusterResourceResponseBodyResource build(java.util.Map<String, ?> map) throws Exception {
            GetClusterResourceResponseBodyResource self = new GetClusterResourceResponseBodyResource();
            return TeaModel.build(map, self);
        }

        public GetClusterResourceResponseBodyResource setAllocatedMB(Long allocatedMB) {
            this.allocatedMB = allocatedMB;
            return this;
        }
        public Long getAllocatedMB() {
            return this.allocatedMB;
        }

        public GetClusterResourceResponseBodyResource setAllocatedVirtualCores(Long allocatedVirtualCores) {
            this.allocatedVirtualCores = allocatedVirtualCores;
            return this;
        }
        public Long getAllocatedVirtualCores() {
            return this.allocatedVirtualCores;
        }

        public GetClusterResourceResponseBodyResource setAvailableMB(Long availableMB) {
            this.availableMB = availableMB;
            return this;
        }
        public Long getAvailableMB() {
            return this.availableMB;
        }

        public GetClusterResourceResponseBodyResource setAvailableVirtualCores(Long availableVirtualCores) {
            this.availableVirtualCores = availableVirtualCores;
            return this;
        }
        public Long getAvailableVirtualCores() {
            return this.availableVirtualCores;
        }

        public GetClusterResourceResponseBodyResource setTotalMB(Long totalMB) {
            this.totalMB = totalMB;
            return this;
        }
        public Long getTotalMB() {
            return this.totalMB;
        }

        public GetClusterResourceResponseBodyResource setTotalVirtualCores(Long totalVirtualCores) {
            this.totalVirtualCores = totalVirtualCores;
            return this;
        }
        public Long getTotalVirtualCores() {
            return this.totalVirtualCores;
        }

    }

}
