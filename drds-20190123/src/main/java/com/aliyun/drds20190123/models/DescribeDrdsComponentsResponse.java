// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.drds20190123.models;

import com.aliyun.tea.*;

public class DescribeDrdsComponentsResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Success")
    @Validation(required = true)
    public Boolean success;

    @NameInMap("DrdsComponents")
    @Validation(required = true)
    public DescribeDrdsComponentsResponseDrdsComponents drdsComponents;

    public static DescribeDrdsComponentsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDrdsComponentsResponse self = new DescribeDrdsComponentsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDrdsComponentsResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeDrdsComponentsResponse setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public DescribeDrdsComponentsResponse setDrdsComponents(DescribeDrdsComponentsResponseDrdsComponents drdsComponents) {
        this.drdsComponents = drdsComponents;
        return this;
    }
    public DescribeDrdsComponentsResponseDrdsComponents getDrdsComponents() {
        return this.drdsComponents;
    }

    public static class DescribeDrdsComponentsResponseDrdsComponentsDrdsComponentDrdsAzoneInfosDrdsAzoneInfo extends TeaModel {
        @NameInMap("ZoneId")
        @Validation(required = true)
        public String zoneId;

        @NameInMap("ZoneName")
        @Validation(required = true)
        public String zoneName;

        @NameInMap("SupportVpc")
        @Validation(required = true)
        public Boolean supportVpc;

        @NameInMap("SupportClassic")
        @Validation(required = true)
        public Boolean supportClassic;

        public static DescribeDrdsComponentsResponseDrdsComponentsDrdsComponentDrdsAzoneInfosDrdsAzoneInfo build(java.util.Map<String, ?> map) throws Exception {
            DescribeDrdsComponentsResponseDrdsComponentsDrdsComponentDrdsAzoneInfosDrdsAzoneInfo self = new DescribeDrdsComponentsResponseDrdsComponentsDrdsComponentDrdsAzoneInfosDrdsAzoneInfo();
            return TeaModel.build(map, self);
        }

        public DescribeDrdsComponentsResponseDrdsComponentsDrdsComponentDrdsAzoneInfosDrdsAzoneInfo setZoneId(String zoneId) {
            this.zoneId = zoneId;
            return this;
        }
        public String getZoneId() {
            return this.zoneId;
        }

        public DescribeDrdsComponentsResponseDrdsComponentsDrdsComponentDrdsAzoneInfosDrdsAzoneInfo setZoneName(String zoneName) {
            this.zoneName = zoneName;
            return this;
        }
        public String getZoneName() {
            return this.zoneName;
        }

        public DescribeDrdsComponentsResponseDrdsComponentsDrdsComponentDrdsAzoneInfosDrdsAzoneInfo setSupportVpc(Boolean supportVpc) {
            this.supportVpc = supportVpc;
            return this;
        }
        public Boolean getSupportVpc() {
            return this.supportVpc;
        }

        public DescribeDrdsComponentsResponseDrdsComponentsDrdsComponentDrdsAzoneInfosDrdsAzoneInfo setSupportClassic(Boolean supportClassic) {
            this.supportClassic = supportClassic;
            return this;
        }
        public Boolean getSupportClassic() {
            return this.supportClassic;
        }

    }

    public static class DescribeDrdsComponentsResponseDrdsComponentsDrdsComponentDrdsAzoneInfos extends TeaModel {
        @NameInMap("DrdsAzoneInfo")
        @Validation(required = true)
        public java.util.List<DescribeDrdsComponentsResponseDrdsComponentsDrdsComponentDrdsAzoneInfosDrdsAzoneInfo> drdsAzoneInfo;

        public static DescribeDrdsComponentsResponseDrdsComponentsDrdsComponentDrdsAzoneInfos build(java.util.Map<String, ?> map) throws Exception {
            DescribeDrdsComponentsResponseDrdsComponentsDrdsComponentDrdsAzoneInfos self = new DescribeDrdsComponentsResponseDrdsComponentsDrdsComponentDrdsAzoneInfos();
            return TeaModel.build(map, self);
        }

        public DescribeDrdsComponentsResponseDrdsComponentsDrdsComponentDrdsAzoneInfos setDrdsAzoneInfo(java.util.List<DescribeDrdsComponentsResponseDrdsComponentsDrdsComponentDrdsAzoneInfosDrdsAzoneInfo> drdsAzoneInfo) {
            this.drdsAzoneInfo = drdsAzoneInfo;
            return this;
        }
        public java.util.List<DescribeDrdsComponentsResponseDrdsComponentsDrdsComponentDrdsAzoneInfosDrdsAzoneInfo> getDrdsAzoneInfo() {
            return this.drdsAzoneInfo;
        }

    }

    public static class DescribeDrdsComponentsResponseDrdsComponentsDrdsComponentDrdsSeriesListDrdsSeriesSpecs extends TeaModel {
        // Spec
        @NameInMap("Spec")
        @Validation(required = true)
        public java.util.List<String> spec;

        public static DescribeDrdsComponentsResponseDrdsComponentsDrdsComponentDrdsSeriesListDrdsSeriesSpecs build(java.util.Map<String, ?> map) throws Exception {
            DescribeDrdsComponentsResponseDrdsComponentsDrdsComponentDrdsSeriesListDrdsSeriesSpecs self = new DescribeDrdsComponentsResponseDrdsComponentsDrdsComponentDrdsSeriesListDrdsSeriesSpecs();
            return TeaModel.build(map, self);
        }

        public DescribeDrdsComponentsResponseDrdsComponentsDrdsComponentDrdsSeriesListDrdsSeriesSpecs setSpec(java.util.List<String> spec) {
            this.spec = spec;
            return this;
        }
        public java.util.List<String> getSpec() {
            return this.spec;
        }

    }

    public static class DescribeDrdsComponentsResponseDrdsComponentsDrdsComponentDrdsSeriesListDrdsSeries extends TeaModel {
        @NameInMap("SeriesName")
        @Validation(required = true)
        public String seriesName;

        @NameInMap("Series")
        @Validation(required = true)
        public String series;

        @NameInMap("Specs")
        @Validation(required = true)
        public DescribeDrdsComponentsResponseDrdsComponentsDrdsComponentDrdsSeriesListDrdsSeriesSpecs specs;

        public static DescribeDrdsComponentsResponseDrdsComponentsDrdsComponentDrdsSeriesListDrdsSeries build(java.util.Map<String, ?> map) throws Exception {
            DescribeDrdsComponentsResponseDrdsComponentsDrdsComponentDrdsSeriesListDrdsSeries self = new DescribeDrdsComponentsResponseDrdsComponentsDrdsComponentDrdsSeriesListDrdsSeries();
            return TeaModel.build(map, self);
        }

        public DescribeDrdsComponentsResponseDrdsComponentsDrdsComponentDrdsSeriesListDrdsSeries setSeriesName(String seriesName) {
            this.seriesName = seriesName;
            return this;
        }
        public String getSeriesName() {
            return this.seriesName;
        }

        public DescribeDrdsComponentsResponseDrdsComponentsDrdsComponentDrdsSeriesListDrdsSeries setSeries(String series) {
            this.series = series;
            return this;
        }
        public String getSeries() {
            return this.series;
        }

        public DescribeDrdsComponentsResponseDrdsComponentsDrdsComponentDrdsSeriesListDrdsSeries setSpecs(DescribeDrdsComponentsResponseDrdsComponentsDrdsComponentDrdsSeriesListDrdsSeriesSpecs specs) {
            this.specs = specs;
            return this;
        }
        public DescribeDrdsComponentsResponseDrdsComponentsDrdsComponentDrdsSeriesListDrdsSeriesSpecs getSpecs() {
            return this.specs;
        }

    }

    public static class DescribeDrdsComponentsResponseDrdsComponentsDrdsComponentDrdsSeriesList extends TeaModel {
        @NameInMap("DrdsSeries")
        @Validation(required = true)
        public java.util.List<DescribeDrdsComponentsResponseDrdsComponentsDrdsComponentDrdsSeriesListDrdsSeries> drdsSeries;

        public static DescribeDrdsComponentsResponseDrdsComponentsDrdsComponentDrdsSeriesList build(java.util.Map<String, ?> map) throws Exception {
            DescribeDrdsComponentsResponseDrdsComponentsDrdsComponentDrdsSeriesList self = new DescribeDrdsComponentsResponseDrdsComponentsDrdsComponentDrdsSeriesList();
            return TeaModel.build(map, self);
        }

        public DescribeDrdsComponentsResponseDrdsComponentsDrdsComponentDrdsSeriesList setDrdsSeries(java.util.List<DescribeDrdsComponentsResponseDrdsComponentsDrdsComponentDrdsSeriesListDrdsSeries> drdsSeries) {
            this.drdsSeries = drdsSeries;
            return this;
        }
        public java.util.List<DescribeDrdsComponentsResponseDrdsComponentsDrdsComponentDrdsSeriesListDrdsSeries> getDrdsSeries() {
            return this.drdsSeries;
        }

    }

    public static class DescribeDrdsComponentsResponseDrdsComponentsDrdsComponentMysqlVersions extends TeaModel {
        // MysqlVersion
        @NameInMap("MysqlVersion")
        @Validation(required = true)
        public java.util.List<String> mysqlVersion;

        public static DescribeDrdsComponentsResponseDrdsComponentsDrdsComponentMysqlVersions build(java.util.Map<String, ?> map) throws Exception {
            DescribeDrdsComponentsResponseDrdsComponentsDrdsComponentMysqlVersions self = new DescribeDrdsComponentsResponseDrdsComponentsDrdsComponentMysqlVersions();
            return TeaModel.build(map, self);
        }

        public DescribeDrdsComponentsResponseDrdsComponentsDrdsComponentMysqlVersions setMysqlVersion(java.util.List<String> mysqlVersion) {
            this.mysqlVersion = mysqlVersion;
            return this;
        }
        public java.util.List<String> getMysqlVersion() {
            return this.mysqlVersion;
        }

    }

    public static class DescribeDrdsComponentsResponseDrdsComponentsDrdsComponent extends TeaModel {
        @NameInMap("RegionId")
        @Validation(required = true)
        public String regionId;

        @NameInMap("RegionName")
        @Validation(required = true)
        public String regionName;

        @NameInMap("DrdsAzoneInfos")
        @Validation(required = true)
        public DescribeDrdsComponentsResponseDrdsComponentsDrdsComponentDrdsAzoneInfos drdsAzoneInfos;

        @NameInMap("DrdsSeriesList")
        @Validation(required = true)
        public DescribeDrdsComponentsResponseDrdsComponentsDrdsComponentDrdsSeriesList drdsSeriesList;

        @NameInMap("MysqlVersions")
        @Validation(required = true)
        public DescribeDrdsComponentsResponseDrdsComponentsDrdsComponentMysqlVersions mysqlVersions;

        public static DescribeDrdsComponentsResponseDrdsComponentsDrdsComponent build(java.util.Map<String, ?> map) throws Exception {
            DescribeDrdsComponentsResponseDrdsComponentsDrdsComponent self = new DescribeDrdsComponentsResponseDrdsComponentsDrdsComponent();
            return TeaModel.build(map, self);
        }

        public DescribeDrdsComponentsResponseDrdsComponentsDrdsComponent setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public DescribeDrdsComponentsResponseDrdsComponentsDrdsComponent setRegionName(String regionName) {
            this.regionName = regionName;
            return this;
        }
        public String getRegionName() {
            return this.regionName;
        }

        public DescribeDrdsComponentsResponseDrdsComponentsDrdsComponent setDrdsAzoneInfos(DescribeDrdsComponentsResponseDrdsComponentsDrdsComponentDrdsAzoneInfos drdsAzoneInfos) {
            this.drdsAzoneInfos = drdsAzoneInfos;
            return this;
        }
        public DescribeDrdsComponentsResponseDrdsComponentsDrdsComponentDrdsAzoneInfos getDrdsAzoneInfos() {
            return this.drdsAzoneInfos;
        }

        public DescribeDrdsComponentsResponseDrdsComponentsDrdsComponent setDrdsSeriesList(DescribeDrdsComponentsResponseDrdsComponentsDrdsComponentDrdsSeriesList drdsSeriesList) {
            this.drdsSeriesList = drdsSeriesList;
            return this;
        }
        public DescribeDrdsComponentsResponseDrdsComponentsDrdsComponentDrdsSeriesList getDrdsSeriesList() {
            return this.drdsSeriesList;
        }

        public DescribeDrdsComponentsResponseDrdsComponentsDrdsComponent setMysqlVersions(DescribeDrdsComponentsResponseDrdsComponentsDrdsComponentMysqlVersions mysqlVersions) {
            this.mysqlVersions = mysqlVersions;
            return this;
        }
        public DescribeDrdsComponentsResponseDrdsComponentsDrdsComponentMysqlVersions getMysqlVersions() {
            return this.mysqlVersions;
        }

    }

    public static class DescribeDrdsComponentsResponseDrdsComponents extends TeaModel {
        @NameInMap("DrdsComponent")
        @Validation(required = true)
        public java.util.List<DescribeDrdsComponentsResponseDrdsComponentsDrdsComponent> drdsComponent;

        public static DescribeDrdsComponentsResponseDrdsComponents build(java.util.Map<String, ?> map) throws Exception {
            DescribeDrdsComponentsResponseDrdsComponents self = new DescribeDrdsComponentsResponseDrdsComponents();
            return TeaModel.build(map, self);
        }

        public DescribeDrdsComponentsResponseDrdsComponents setDrdsComponent(java.util.List<DescribeDrdsComponentsResponseDrdsComponentsDrdsComponent> drdsComponent) {
            this.drdsComponent = drdsComponent;
            return this;
        }
        public java.util.List<DescribeDrdsComponentsResponseDrdsComponentsDrdsComponent> getDrdsComponent() {
            return this.drdsComponent;
        }

    }

}
