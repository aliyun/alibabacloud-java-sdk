// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class DescribeDcdnOfflineLogDeliveryRegionsResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Areas")
    public java.util.List<DescribeDcdnOfflineLogDeliveryRegionsResponseBodyAreas> areas;

    public static DescribeDcdnOfflineLogDeliveryRegionsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDcdnOfflineLogDeliveryRegionsResponseBody self = new DescribeDcdnOfflineLogDeliveryRegionsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDcdnOfflineLogDeliveryRegionsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeDcdnOfflineLogDeliveryRegionsResponseBody setAreas(java.util.List<DescribeDcdnOfflineLogDeliveryRegionsResponseBodyAreas> areas) {
        this.areas = areas;
        return this;
    }
    public java.util.List<DescribeDcdnOfflineLogDeliveryRegionsResponseBodyAreas> getAreas() {
        return this.areas;
    }

    public static class DescribeDcdnOfflineLogDeliveryRegionsResponseBodyAreasRegionInfos extends TeaModel {
        @NameInMap("RegionName")
        public String regionName;

        @NameInMap("IsOverseas")
        public String isOverseas;

        @NameInMap("OssEndpoint")
        public String ossEndpoint;

        @NameInMap("RegionId")
        public String regionId;

        public static DescribeDcdnOfflineLogDeliveryRegionsResponseBodyAreasRegionInfos build(java.util.Map<String, ?> map) throws Exception {
            DescribeDcdnOfflineLogDeliveryRegionsResponseBodyAreasRegionInfos self = new DescribeDcdnOfflineLogDeliveryRegionsResponseBodyAreasRegionInfos();
            return TeaModel.build(map, self);
        }

        public DescribeDcdnOfflineLogDeliveryRegionsResponseBodyAreasRegionInfos setRegionName(String regionName) {
            this.regionName = regionName;
            return this;
        }
        public String getRegionName() {
            return this.regionName;
        }

        public DescribeDcdnOfflineLogDeliveryRegionsResponseBodyAreasRegionInfos setIsOverseas(String isOverseas) {
            this.isOverseas = isOverseas;
            return this;
        }
        public String getIsOverseas() {
            return this.isOverseas;
        }

        public DescribeDcdnOfflineLogDeliveryRegionsResponseBodyAreasRegionInfos setOssEndpoint(String ossEndpoint) {
            this.ossEndpoint = ossEndpoint;
            return this;
        }
        public String getOssEndpoint() {
            return this.ossEndpoint;
        }

        public DescribeDcdnOfflineLogDeliveryRegionsResponseBodyAreasRegionInfos setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

    }

    public static class DescribeDcdnOfflineLogDeliveryRegionsResponseBodyAreas extends TeaModel {
        @NameInMap("AreaName")
        public String areaName;

        @NameInMap("AreaId")
        public String areaId;

        @NameInMap("RegionInfos")
        public java.util.List<DescribeDcdnOfflineLogDeliveryRegionsResponseBodyAreasRegionInfos> regionInfos;

        public static DescribeDcdnOfflineLogDeliveryRegionsResponseBodyAreas build(java.util.Map<String, ?> map) throws Exception {
            DescribeDcdnOfflineLogDeliveryRegionsResponseBodyAreas self = new DescribeDcdnOfflineLogDeliveryRegionsResponseBodyAreas();
            return TeaModel.build(map, self);
        }

        public DescribeDcdnOfflineLogDeliveryRegionsResponseBodyAreas setAreaName(String areaName) {
            this.areaName = areaName;
            return this;
        }
        public String getAreaName() {
            return this.areaName;
        }

        public DescribeDcdnOfflineLogDeliveryRegionsResponseBodyAreas setAreaId(String areaId) {
            this.areaId = areaId;
            return this;
        }
        public String getAreaId() {
            return this.areaId;
        }

        public DescribeDcdnOfflineLogDeliveryRegionsResponseBodyAreas setRegionInfos(java.util.List<DescribeDcdnOfflineLogDeliveryRegionsResponseBodyAreasRegionInfos> regionInfos) {
            this.regionInfos = regionInfos;
            return this;
        }
        public java.util.List<DescribeDcdnOfflineLogDeliveryRegionsResponseBodyAreasRegionInfos> getRegionInfos() {
            return this.regionInfos;
        }

    }

}
