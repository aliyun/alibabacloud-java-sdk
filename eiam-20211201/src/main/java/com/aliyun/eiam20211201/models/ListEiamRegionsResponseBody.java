// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class ListEiamRegionsResponseBody extends TeaModel {
    @NameInMap("Regions")
    public java.util.List<ListEiamRegionsResponseBodyRegions> regions;

    @NameInMap("RequestId")
    public String requestId;

    public static ListEiamRegionsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListEiamRegionsResponseBody self = new ListEiamRegionsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListEiamRegionsResponseBody setRegions(java.util.List<ListEiamRegionsResponseBodyRegions> regions) {
        this.regions = regions;
        return this;
    }
    public java.util.List<ListEiamRegionsResponseBodyRegions> getRegions() {
        return this.regions;
    }

    public ListEiamRegionsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListEiamRegionsResponseBodyRegions extends TeaModel {
        /**
         * <p>地域名称</p>
         */
        @NameInMap("LocalName")
        public String localName;

        /**
         * <p>地域ID</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        public static ListEiamRegionsResponseBodyRegions build(java.util.Map<String, ?> map) throws Exception {
            ListEiamRegionsResponseBodyRegions self = new ListEiamRegionsResponseBodyRegions();
            return TeaModel.build(map, self);
        }

        public ListEiamRegionsResponseBodyRegions setLocalName(String localName) {
            this.localName = localName;
            return this;
        }
        public String getLocalName() {
            return this.localName;
        }

        public ListEiamRegionsResponseBodyRegions setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

    }

}
