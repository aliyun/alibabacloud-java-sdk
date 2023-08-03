// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.foasconsole20190601.models;

import com.aliyun.tea.*;

public class DescribeSupportedRegionsResponseBody extends TeaModel {
    @NameInMap("Regions")
    public java.util.List<DescribeSupportedRegionsResponseBodyRegions> regions;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static DescribeSupportedRegionsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeSupportedRegionsResponseBody self = new DescribeSupportedRegionsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeSupportedRegionsResponseBody setRegions(java.util.List<DescribeSupportedRegionsResponseBodyRegions> regions) {
        this.regions = regions;
        return this;
    }
    public java.util.List<DescribeSupportedRegionsResponseBodyRegions> getRegions() {
        return this.regions;
    }

    public DescribeSupportedRegionsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeSupportedRegionsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class DescribeSupportedRegionsResponseBodyRegions extends TeaModel {
        @NameInMap("Region")
        public String region;

        @NameInMap("RegionName")
        public String regionName;

        public static DescribeSupportedRegionsResponseBodyRegions build(java.util.Map<String, ?> map) throws Exception {
            DescribeSupportedRegionsResponseBodyRegions self = new DescribeSupportedRegionsResponseBodyRegions();
            return TeaModel.build(map, self);
        }

        public DescribeSupportedRegionsResponseBodyRegions setRegion(String region) {
            this.region = region;
            return this;
        }
        public String getRegion() {
            return this.region;
        }

        public DescribeSupportedRegionsResponseBodyRegions setRegionName(String regionName) {
            this.regionName = regionName;
            return this;
        }
        public String getRegionName() {
            return this.regionName;
        }

    }

}
