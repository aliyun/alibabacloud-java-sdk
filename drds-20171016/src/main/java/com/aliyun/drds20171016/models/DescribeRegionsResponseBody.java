// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.drds20171016.models;

import com.aliyun.tea.*;

public class DescribeRegionsResponseBody extends TeaModel {
    @NameInMap("DrdsRegions")
    public DescribeRegionsResponseBodyDrdsRegions drdsRegions;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static DescribeRegionsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeRegionsResponseBody self = new DescribeRegionsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeRegionsResponseBody setDrdsRegions(DescribeRegionsResponseBodyDrdsRegions drdsRegions) {
        this.drdsRegions = drdsRegions;
        return this;
    }
    public DescribeRegionsResponseBodyDrdsRegions getDrdsRegions() {
        return this.drdsRegions;
    }

    public DescribeRegionsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeRegionsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class DescribeRegionsResponseBodyDrdsRegionsDrdsRegionInstanceSeriesListInstanceSeriesSpecListSpec extends TeaModel {
        @NameInMap("SpecId")
        public String specId;

        @NameInMap("SpecName")
        public String specName;

        public static DescribeRegionsResponseBodyDrdsRegionsDrdsRegionInstanceSeriesListInstanceSeriesSpecListSpec build(java.util.Map<String, ?> map) throws Exception {
            DescribeRegionsResponseBodyDrdsRegionsDrdsRegionInstanceSeriesListInstanceSeriesSpecListSpec self = new DescribeRegionsResponseBodyDrdsRegionsDrdsRegionInstanceSeriesListInstanceSeriesSpecListSpec();
            return TeaModel.build(map, self);
        }

        public DescribeRegionsResponseBodyDrdsRegionsDrdsRegionInstanceSeriesListInstanceSeriesSpecListSpec setSpecId(String specId) {
            this.specId = specId;
            return this;
        }
        public String getSpecId() {
            return this.specId;
        }

        public DescribeRegionsResponseBodyDrdsRegionsDrdsRegionInstanceSeriesListInstanceSeriesSpecListSpec setSpecName(String specName) {
            this.specName = specName;
            return this;
        }
        public String getSpecName() {
            return this.specName;
        }

    }

    public static class DescribeRegionsResponseBodyDrdsRegionsDrdsRegionInstanceSeriesListInstanceSeriesSpecList extends TeaModel {
        @NameInMap("Spec")
        public java.util.List<DescribeRegionsResponseBodyDrdsRegionsDrdsRegionInstanceSeriesListInstanceSeriesSpecListSpec> spec;

        public static DescribeRegionsResponseBodyDrdsRegionsDrdsRegionInstanceSeriesListInstanceSeriesSpecList build(java.util.Map<String, ?> map) throws Exception {
            DescribeRegionsResponseBodyDrdsRegionsDrdsRegionInstanceSeriesListInstanceSeriesSpecList self = new DescribeRegionsResponseBodyDrdsRegionsDrdsRegionInstanceSeriesListInstanceSeriesSpecList();
            return TeaModel.build(map, self);
        }

        public DescribeRegionsResponseBodyDrdsRegionsDrdsRegionInstanceSeriesListInstanceSeriesSpecList setSpec(java.util.List<DescribeRegionsResponseBodyDrdsRegionsDrdsRegionInstanceSeriesListInstanceSeriesSpecListSpec> spec) {
            this.spec = spec;
            return this;
        }
        public java.util.List<DescribeRegionsResponseBodyDrdsRegionsDrdsRegionInstanceSeriesListInstanceSeriesSpecListSpec> getSpec() {
            return this.spec;
        }

    }

    public static class DescribeRegionsResponseBodyDrdsRegionsDrdsRegionInstanceSeriesListInstanceSeries extends TeaModel {
        @NameInMap("SeriesId")
        public String seriesId;

        @NameInMap("SeriesName")
        public String seriesName;

        @NameInMap("SpecList")
        public DescribeRegionsResponseBodyDrdsRegionsDrdsRegionInstanceSeriesListInstanceSeriesSpecList specList;

        public static DescribeRegionsResponseBodyDrdsRegionsDrdsRegionInstanceSeriesListInstanceSeries build(java.util.Map<String, ?> map) throws Exception {
            DescribeRegionsResponseBodyDrdsRegionsDrdsRegionInstanceSeriesListInstanceSeries self = new DescribeRegionsResponseBodyDrdsRegionsDrdsRegionInstanceSeriesListInstanceSeries();
            return TeaModel.build(map, self);
        }

        public DescribeRegionsResponseBodyDrdsRegionsDrdsRegionInstanceSeriesListInstanceSeries setSeriesId(String seriesId) {
            this.seriesId = seriesId;
            return this;
        }
        public String getSeriesId() {
            return this.seriesId;
        }

        public DescribeRegionsResponseBodyDrdsRegionsDrdsRegionInstanceSeriesListInstanceSeries setSeriesName(String seriesName) {
            this.seriesName = seriesName;
            return this;
        }
        public String getSeriesName() {
            return this.seriesName;
        }

        public DescribeRegionsResponseBodyDrdsRegionsDrdsRegionInstanceSeriesListInstanceSeries setSpecList(DescribeRegionsResponseBodyDrdsRegionsDrdsRegionInstanceSeriesListInstanceSeriesSpecList specList) {
            this.specList = specList;
            return this;
        }
        public DescribeRegionsResponseBodyDrdsRegionsDrdsRegionInstanceSeriesListInstanceSeriesSpecList getSpecList() {
            return this.specList;
        }

    }

    public static class DescribeRegionsResponseBodyDrdsRegionsDrdsRegionInstanceSeriesList extends TeaModel {
        @NameInMap("InstanceSeries")
        public java.util.List<DescribeRegionsResponseBodyDrdsRegionsDrdsRegionInstanceSeriesListInstanceSeries> instanceSeries;

        public static DescribeRegionsResponseBodyDrdsRegionsDrdsRegionInstanceSeriesList build(java.util.Map<String, ?> map) throws Exception {
            DescribeRegionsResponseBodyDrdsRegionsDrdsRegionInstanceSeriesList self = new DescribeRegionsResponseBodyDrdsRegionsDrdsRegionInstanceSeriesList();
            return TeaModel.build(map, self);
        }

        public DescribeRegionsResponseBodyDrdsRegionsDrdsRegionInstanceSeriesList setInstanceSeries(java.util.List<DescribeRegionsResponseBodyDrdsRegionsDrdsRegionInstanceSeriesListInstanceSeries> instanceSeries) {
            this.instanceSeries = instanceSeries;
            return this;
        }
        public java.util.List<DescribeRegionsResponseBodyDrdsRegionsDrdsRegionInstanceSeriesListInstanceSeries> getInstanceSeries() {
            return this.instanceSeries;
        }

    }

    public static class DescribeRegionsResponseBodyDrdsRegionsDrdsRegion extends TeaModel {
        @NameInMap("InstanceSeriesList")
        public DescribeRegionsResponseBodyDrdsRegionsDrdsRegionInstanceSeriesList instanceSeriesList;

        @NameInMap("RegionId")
        public String regionId;

        @NameInMap("RegionName")
        public String regionName;

        @NameInMap("ZoneId")
        public String zoneId;

        @NameInMap("ZoneName")
        public String zoneName;

        public static DescribeRegionsResponseBodyDrdsRegionsDrdsRegion build(java.util.Map<String, ?> map) throws Exception {
            DescribeRegionsResponseBodyDrdsRegionsDrdsRegion self = new DescribeRegionsResponseBodyDrdsRegionsDrdsRegion();
            return TeaModel.build(map, self);
        }

        public DescribeRegionsResponseBodyDrdsRegionsDrdsRegion setInstanceSeriesList(DescribeRegionsResponseBodyDrdsRegionsDrdsRegionInstanceSeriesList instanceSeriesList) {
            this.instanceSeriesList = instanceSeriesList;
            return this;
        }
        public DescribeRegionsResponseBodyDrdsRegionsDrdsRegionInstanceSeriesList getInstanceSeriesList() {
            return this.instanceSeriesList;
        }

        public DescribeRegionsResponseBodyDrdsRegionsDrdsRegion setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public DescribeRegionsResponseBodyDrdsRegionsDrdsRegion setRegionName(String regionName) {
            this.regionName = regionName;
            return this;
        }
        public String getRegionName() {
            return this.regionName;
        }

        public DescribeRegionsResponseBodyDrdsRegionsDrdsRegion setZoneId(String zoneId) {
            this.zoneId = zoneId;
            return this;
        }
        public String getZoneId() {
            return this.zoneId;
        }

        public DescribeRegionsResponseBodyDrdsRegionsDrdsRegion setZoneName(String zoneName) {
            this.zoneName = zoneName;
            return this;
        }
        public String getZoneName() {
            return this.zoneName;
        }

    }

    public static class DescribeRegionsResponseBodyDrdsRegions extends TeaModel {
        @NameInMap("DrdsRegion")
        public java.util.List<DescribeRegionsResponseBodyDrdsRegionsDrdsRegion> drdsRegion;

        public static DescribeRegionsResponseBodyDrdsRegions build(java.util.Map<String, ?> map) throws Exception {
            DescribeRegionsResponseBodyDrdsRegions self = new DescribeRegionsResponseBodyDrdsRegions();
            return TeaModel.build(map, self);
        }

        public DescribeRegionsResponseBodyDrdsRegions setDrdsRegion(java.util.List<DescribeRegionsResponseBodyDrdsRegionsDrdsRegion> drdsRegion) {
            this.drdsRegion = drdsRegion;
            return this;
        }
        public java.util.List<DescribeRegionsResponseBodyDrdsRegionsDrdsRegion> getDrdsRegion() {
            return this.drdsRegion;
        }

    }

}
