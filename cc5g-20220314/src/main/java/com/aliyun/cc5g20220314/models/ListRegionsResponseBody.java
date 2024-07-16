// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cc5g20220314.models;

import com.aliyun.tea.*;

public class ListRegionsResponseBody extends TeaModel {
    @NameInMap("Regions")
    public java.util.List<ListRegionsResponseBodyRegions> regions;

    /**
     * <strong>example:</strong>
     * <p>2DCFA69E-A161-512D-99A7-108022580719</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ListRegionsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListRegionsResponseBody self = new ListRegionsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListRegionsResponseBody setRegions(java.util.List<ListRegionsResponseBodyRegions> regions) {
        this.regions = regions;
        return this;
    }
    public java.util.List<ListRegionsResponseBodyRegions> getRegions() {
        return this.regions;
    }

    public ListRegionsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListRegionsResponseBodyRegions extends TeaModel {
        /**
         * <p>代表资源名称的资源属性字段</p>
         */
        @NameInMap("LocalName")
        public String localName;

        /**
         * <p>代表资源一级ID的资源属性字段</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        public static ListRegionsResponseBodyRegions build(java.util.Map<String, ?> map) throws Exception {
            ListRegionsResponseBodyRegions self = new ListRegionsResponseBodyRegions();
            return TeaModel.build(map, self);
        }

        public ListRegionsResponseBodyRegions setLocalName(String localName) {
            this.localName = localName;
            return this;
        }
        public String getLocalName() {
            return this.localName;
        }

        public ListRegionsResponseBodyRegions setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

    }

}
