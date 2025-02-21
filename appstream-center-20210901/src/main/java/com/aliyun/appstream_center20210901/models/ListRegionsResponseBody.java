// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.appstream_center20210901.models;

import com.aliyun.tea.*;

public class ListRegionsResponseBody extends TeaModel {
    /**
     * <p>The region IDs.</p>
     */
    @NameInMap("RegionModels")
    public java.util.List<ListRegionsResponseBodyRegionModels> regionModels;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>1CBAFFAB-B697-4049-A9B1-67E1FC5F****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ListRegionsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListRegionsResponseBody self = new ListRegionsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListRegionsResponseBody setRegionModels(java.util.List<ListRegionsResponseBodyRegionModels> regionModels) {
        this.regionModels = regionModels;
        return this;
    }
    public java.util.List<ListRegionsResponseBodyRegionModels> getRegionModels() {
        return this.regionModels;
    }

    public ListRegionsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListRegionsResponseBodyRegionModels extends TeaModel {
        /**
         * <p>The region ID.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        @NameInMap("regionId")
        public String regionId;

        public static ListRegionsResponseBodyRegionModels build(java.util.Map<String, ?> map) throws Exception {
            ListRegionsResponseBodyRegionModels self = new ListRegionsResponseBodyRegionModels();
            return TeaModel.build(map, self);
        }

        public ListRegionsResponseBodyRegionModels setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

    }

}
