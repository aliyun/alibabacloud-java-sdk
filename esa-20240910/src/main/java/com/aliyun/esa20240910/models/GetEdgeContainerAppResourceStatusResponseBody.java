// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class GetEdgeContainerAppResourceStatusResponseBody extends TeaModel {
    @NameInMap("Regions")
    public java.util.List<GetEdgeContainerAppResourceStatusResponseBodyRegions> regions;

    /**
     * <strong>example:</strong>
     * <p>15C66C7B-671A-4297-9187-2C4477247A74</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static GetEdgeContainerAppResourceStatusResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetEdgeContainerAppResourceStatusResponseBody self = new GetEdgeContainerAppResourceStatusResponseBody();
        return TeaModel.build(map, self);
    }

    public GetEdgeContainerAppResourceStatusResponseBody setRegions(java.util.List<GetEdgeContainerAppResourceStatusResponseBodyRegions> regions) {
        this.regions = regions;
        return this;
    }
    public java.util.List<GetEdgeContainerAppResourceStatusResponseBodyRegions> getRegions() {
        return this.regions;
    }

    public GetEdgeContainerAppResourceStatusResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetEdgeContainerAppResourceStatusResponseBodyRegions extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>unicom</p>
         */
        @NameInMap("Isp")
        public String isp;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Ready")
        public Integer ready;

        /**
         * <strong>example:</strong>
         * <p>huadong</p>
         */
        @NameInMap("Region")
        public String region;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Total")
        public Integer total;

        public static GetEdgeContainerAppResourceStatusResponseBodyRegions build(java.util.Map<String, ?> map) throws Exception {
            GetEdgeContainerAppResourceStatusResponseBodyRegions self = new GetEdgeContainerAppResourceStatusResponseBodyRegions();
            return TeaModel.build(map, self);
        }

        public GetEdgeContainerAppResourceStatusResponseBodyRegions setIsp(String isp) {
            this.isp = isp;
            return this;
        }
        public String getIsp() {
            return this.isp;
        }

        public GetEdgeContainerAppResourceStatusResponseBodyRegions setReady(Integer ready) {
            this.ready = ready;
            return this;
        }
        public Integer getReady() {
            return this.ready;
        }

        public GetEdgeContainerAppResourceStatusResponseBodyRegions setRegion(String region) {
            this.region = region;
            return this;
        }
        public String getRegion() {
            return this.region;
        }

        public GetEdgeContainerAppResourceStatusResponseBodyRegions setTotal(Integer total) {
            this.total = total;
            return this;
        }
        public Integer getTotal() {
            return this.total;
        }

    }

}
