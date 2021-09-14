// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cddc20200320.models;

import com.aliyun.tea.*;

public class DescribeMyBaseHostOverViewResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Regions")
    public DescribeMyBaseHostOverViewResponseBodyRegions regions;

    public static DescribeMyBaseHostOverViewResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeMyBaseHostOverViewResponseBody self = new DescribeMyBaseHostOverViewResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeMyBaseHostOverViewResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeMyBaseHostOverViewResponseBody setRegions(DescribeMyBaseHostOverViewResponseBodyRegions regions) {
        this.regions = regions;
        return this;
    }
    public DescribeMyBaseHostOverViewResponseBodyRegions getRegions() {
        return this.regions;
    }

    public static class DescribeMyBaseHostOverViewResponseBodyRegionsRegionModelTypeModelsTypeModel extends TeaModel {
        @NameInMap("HostEngineCount")
        public String hostEngineCount;

        @NameInMap("HostDateType")
        public String hostDateType;

        @NameInMap("Count")
        public Integer count;

        public static DescribeMyBaseHostOverViewResponseBodyRegionsRegionModelTypeModelsTypeModel build(java.util.Map<String, ?> map) throws Exception {
            DescribeMyBaseHostOverViewResponseBodyRegionsRegionModelTypeModelsTypeModel self = new DescribeMyBaseHostOverViewResponseBodyRegionsRegionModelTypeModelsTypeModel();
            return TeaModel.build(map, self);
        }

        public DescribeMyBaseHostOverViewResponseBodyRegionsRegionModelTypeModelsTypeModel setHostEngineCount(String hostEngineCount) {
            this.hostEngineCount = hostEngineCount;
            return this;
        }
        public String getHostEngineCount() {
            return this.hostEngineCount;
        }

        public DescribeMyBaseHostOverViewResponseBodyRegionsRegionModelTypeModelsTypeModel setHostDateType(String hostDateType) {
            this.hostDateType = hostDateType;
            return this;
        }
        public String getHostDateType() {
            return this.hostDateType;
        }

        public DescribeMyBaseHostOverViewResponseBodyRegionsRegionModelTypeModelsTypeModel setCount(Integer count) {
            this.count = count;
            return this;
        }
        public Integer getCount() {
            return this.count;
        }

    }

    public static class DescribeMyBaseHostOverViewResponseBodyRegionsRegionModelTypeModels extends TeaModel {
        @NameInMap("TypeModel")
        public java.util.List<DescribeMyBaseHostOverViewResponseBodyRegionsRegionModelTypeModelsTypeModel> typeModel;

        public static DescribeMyBaseHostOverViewResponseBodyRegionsRegionModelTypeModels build(java.util.Map<String, ?> map) throws Exception {
            DescribeMyBaseHostOverViewResponseBodyRegionsRegionModelTypeModels self = new DescribeMyBaseHostOverViewResponseBodyRegionsRegionModelTypeModels();
            return TeaModel.build(map, self);
        }

        public DescribeMyBaseHostOverViewResponseBodyRegionsRegionModelTypeModels setTypeModel(java.util.List<DescribeMyBaseHostOverViewResponseBodyRegionsRegionModelTypeModelsTypeModel> typeModel) {
            this.typeModel = typeModel;
            return this;
        }
        public java.util.List<DescribeMyBaseHostOverViewResponseBodyRegionsRegionModelTypeModelsTypeModel> getTypeModel() {
            return this.typeModel;
        }

    }

    public static class DescribeMyBaseHostOverViewResponseBodyRegionsRegionModel extends TeaModel {
        @NameInMap("EngineCount")
        public String engineCount;

        @NameInMap("TotalCount")
        public Integer totalCount;

        @NameInMap("HostGroupCount")
        public Integer hostGroupCount;

        @NameInMap("Region")
        public String region;

        @NameInMap("TypeModels")
        public DescribeMyBaseHostOverViewResponseBodyRegionsRegionModelTypeModels typeModels;

        public static DescribeMyBaseHostOverViewResponseBodyRegionsRegionModel build(java.util.Map<String, ?> map) throws Exception {
            DescribeMyBaseHostOverViewResponseBodyRegionsRegionModel self = new DescribeMyBaseHostOverViewResponseBodyRegionsRegionModel();
            return TeaModel.build(map, self);
        }

        public DescribeMyBaseHostOverViewResponseBodyRegionsRegionModel setEngineCount(String engineCount) {
            this.engineCount = engineCount;
            return this;
        }
        public String getEngineCount() {
            return this.engineCount;
        }

        public DescribeMyBaseHostOverViewResponseBodyRegionsRegionModel setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

        public DescribeMyBaseHostOverViewResponseBodyRegionsRegionModel setHostGroupCount(Integer hostGroupCount) {
            this.hostGroupCount = hostGroupCount;
            return this;
        }
        public Integer getHostGroupCount() {
            return this.hostGroupCount;
        }

        public DescribeMyBaseHostOverViewResponseBodyRegionsRegionModel setRegion(String region) {
            this.region = region;
            return this;
        }
        public String getRegion() {
            return this.region;
        }

        public DescribeMyBaseHostOverViewResponseBodyRegionsRegionModel setTypeModels(DescribeMyBaseHostOverViewResponseBodyRegionsRegionModelTypeModels typeModels) {
            this.typeModels = typeModels;
            return this;
        }
        public DescribeMyBaseHostOverViewResponseBodyRegionsRegionModelTypeModels getTypeModels() {
            return this.typeModels;
        }

    }

    public static class DescribeMyBaseHostOverViewResponseBodyRegions extends TeaModel {
        @NameInMap("RegionModel")
        public java.util.List<DescribeMyBaseHostOverViewResponseBodyRegionsRegionModel> regionModel;

        public static DescribeMyBaseHostOverViewResponseBodyRegions build(java.util.Map<String, ?> map) throws Exception {
            DescribeMyBaseHostOverViewResponseBodyRegions self = new DescribeMyBaseHostOverViewResponseBodyRegions();
            return TeaModel.build(map, self);
        }

        public DescribeMyBaseHostOverViewResponseBodyRegions setRegionModel(java.util.List<DescribeMyBaseHostOverViewResponseBodyRegionsRegionModel> regionModel) {
            this.regionModel = regionModel;
            return this;
        }
        public java.util.List<DescribeMyBaseHostOverViewResponseBodyRegionsRegionModel> getRegionModel() {
            return this.regionModel;
        }

    }

}
