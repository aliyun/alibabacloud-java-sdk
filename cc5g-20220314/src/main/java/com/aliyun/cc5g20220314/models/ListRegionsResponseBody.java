// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cc5g20220314.models;

import com.aliyun.tea.*;

public class ListRegionsResponseBody extends TeaModel {
    // 数组，返回示例目录。
    @NameInMap("Regions")
    public java.util.List<ListRegionsResponseBodyRegions> regions;

    // Id of the request
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
        // 资源名称
        @NameInMap("LocalName")
        public String localName;

        // 创建时间
        @NameInMap("RegionEndpoint")
        public String regionEndpoint;

        // 资源一级ID
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

        public ListRegionsResponseBodyRegions setRegionEndpoint(String regionEndpoint) {
            this.regionEndpoint = regionEndpoint;
            return this;
        }
        public String getRegionEndpoint() {
            return this.regionEndpoint;
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
