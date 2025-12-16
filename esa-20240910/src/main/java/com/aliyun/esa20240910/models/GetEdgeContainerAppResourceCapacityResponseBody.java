// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class GetEdgeContainerAppResourceCapacityResponseBody extends TeaModel {
    @NameInMap("Regions")
    public java.util.List<GetEdgeContainerAppResourceCapacityResponseBodyRegions> regions;

    /**
     * <strong>example:</strong>
     * <p>50423A7F-A83D-1E24-B80E-86DD25790759</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static GetEdgeContainerAppResourceCapacityResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetEdgeContainerAppResourceCapacityResponseBody self = new GetEdgeContainerAppResourceCapacityResponseBody();
        return TeaModel.build(map, self);
    }

    public GetEdgeContainerAppResourceCapacityResponseBody setRegions(java.util.List<GetEdgeContainerAppResourceCapacityResponseBodyRegions> regions) {
        this.regions = regions;
        return this;
    }
    public java.util.List<GetEdgeContainerAppResourceCapacityResponseBodyRegions> getRegions() {
        return this.regions;
    }

    public GetEdgeContainerAppResourceCapacityResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetEdgeContainerAppResourceCapacityResponseBodyRegions extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>unicom</p>
         */
        @NameInMap("Isp")
        public String isp;

        /**
         * <strong>example:</strong>
         * <p>huadong</p>
         */
        @NameInMap("Region")
        public String region;

        /**
         * <strong>example:</strong>
         * <p>16</p>
         */
        @NameInMap("Replicas")
        public Integer replicas;

        public static GetEdgeContainerAppResourceCapacityResponseBodyRegions build(java.util.Map<String, ?> map) throws Exception {
            GetEdgeContainerAppResourceCapacityResponseBodyRegions self = new GetEdgeContainerAppResourceCapacityResponseBodyRegions();
            return TeaModel.build(map, self);
        }

        public GetEdgeContainerAppResourceCapacityResponseBodyRegions setIsp(String isp) {
            this.isp = isp;
            return this;
        }
        public String getIsp() {
            return this.isp;
        }

        public GetEdgeContainerAppResourceCapacityResponseBodyRegions setRegion(String region) {
            this.region = region;
            return this;
        }
        public String getRegion() {
            return this.region;
        }

        public GetEdgeContainerAppResourceCapacityResponseBodyRegions setReplicas(Integer replicas) {
            this.replicas = replicas;
            return this;
        }
        public Integer getReplicas() {
            return this.replicas;
        }

    }

}
