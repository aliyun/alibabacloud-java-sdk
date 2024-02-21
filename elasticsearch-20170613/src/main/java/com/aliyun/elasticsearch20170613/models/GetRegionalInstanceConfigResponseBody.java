// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class GetRegionalInstanceConfigResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Result")
    public GetRegionalInstanceConfigResponseBodyResult result;

    public static GetRegionalInstanceConfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetRegionalInstanceConfigResponseBody self = new GetRegionalInstanceConfigResponseBody();
        return TeaModel.build(map, self);
    }

    public GetRegionalInstanceConfigResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetRegionalInstanceConfigResponseBody setResult(GetRegionalInstanceConfigResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public GetRegionalInstanceConfigResponseBodyResult getResult() {
        return this.result;
    }

    public static class GetRegionalInstanceConfigResponseBodyResultClientNodeAmountRange extends TeaModel {
        @NameInMap("maxAmount")
        public Integer maxAmount;

        @NameInMap("minAmount")
        public Integer minAmount;

        public static GetRegionalInstanceConfigResponseBodyResultClientNodeAmountRange build(java.util.Map<String, ?> map) throws Exception {
            GetRegionalInstanceConfigResponseBodyResultClientNodeAmountRange self = new GetRegionalInstanceConfigResponseBodyResultClientNodeAmountRange();
            return TeaModel.build(map, self);
        }

        public GetRegionalInstanceConfigResponseBodyResultClientNodeAmountRange setMaxAmount(Integer maxAmount) {
            this.maxAmount = maxAmount;
            return this;
        }
        public Integer getMaxAmount() {
            return this.maxAmount;
        }

        public GetRegionalInstanceConfigResponseBodyResultClientNodeAmountRange setMinAmount(Integer minAmount) {
            this.minAmount = minAmount;
            return this;
        }
        public Integer getMinAmount() {
            return this.minAmount;
        }

    }

    public static class GetRegionalInstanceConfigResponseBodyResultClientNodeDiskList extends TeaModel {
        @NameInMap("diskType")
        public String diskType;

        @NameInMap("maxSize")
        public Integer maxSize;

        @NameInMap("minSize")
        public Integer minSize;

        @NameInMap("scaleLimit")
        public Integer scaleLimit;

        public static GetRegionalInstanceConfigResponseBodyResultClientNodeDiskList build(java.util.Map<String, ?> map) throws Exception {
            GetRegionalInstanceConfigResponseBodyResultClientNodeDiskList self = new GetRegionalInstanceConfigResponseBodyResultClientNodeDiskList();
            return TeaModel.build(map, self);
        }

        public GetRegionalInstanceConfigResponseBodyResultClientNodeDiskList setDiskType(String diskType) {
            this.diskType = diskType;
            return this;
        }
        public String getDiskType() {
            return this.diskType;
        }

        public GetRegionalInstanceConfigResponseBodyResultClientNodeDiskList setMaxSize(Integer maxSize) {
            this.maxSize = maxSize;
            return this;
        }
        public Integer getMaxSize() {
            return this.maxSize;
        }

        public GetRegionalInstanceConfigResponseBodyResultClientNodeDiskList setMinSize(Integer minSize) {
            this.minSize = minSize;
            return this;
        }
        public Integer getMinSize() {
            return this.minSize;
        }

        public GetRegionalInstanceConfigResponseBodyResultClientNodeDiskList setScaleLimit(Integer scaleLimit) {
            this.scaleLimit = scaleLimit;
            return this;
        }
        public Integer getScaleLimit() {
            return this.scaleLimit;
        }

    }

    public static class GetRegionalInstanceConfigResponseBodyResultDataNodeAmountRange extends TeaModel {
        @NameInMap("maxAmount")
        public Integer maxAmount;

        @NameInMap("minAmount")
        public Integer minAmount;

        public static GetRegionalInstanceConfigResponseBodyResultDataNodeAmountRange build(java.util.Map<String, ?> map) throws Exception {
            GetRegionalInstanceConfigResponseBodyResultDataNodeAmountRange self = new GetRegionalInstanceConfigResponseBodyResultDataNodeAmountRange();
            return TeaModel.build(map, self);
        }

        public GetRegionalInstanceConfigResponseBodyResultDataNodeAmountRange setMaxAmount(Integer maxAmount) {
            this.maxAmount = maxAmount;
            return this;
        }
        public Integer getMaxAmount() {
            return this.maxAmount;
        }

        public GetRegionalInstanceConfigResponseBodyResultDataNodeAmountRange setMinAmount(Integer minAmount) {
            this.minAmount = minAmount;
            return this;
        }
        public Integer getMinAmount() {
            return this.minAmount;
        }

    }

    public static class GetRegionalInstanceConfigResponseBodyResultDataNodeDiskListSubClassificationConfines extends TeaModel {
        @NameInMap("maxSize")
        public Integer maxSize;

        @NameInMap("minSize")
        public Integer minSize;

        @NameInMap("performanceLevel")
        public String performanceLevel;

        public static GetRegionalInstanceConfigResponseBodyResultDataNodeDiskListSubClassificationConfines build(java.util.Map<String, ?> map) throws Exception {
            GetRegionalInstanceConfigResponseBodyResultDataNodeDiskListSubClassificationConfines self = new GetRegionalInstanceConfigResponseBodyResultDataNodeDiskListSubClassificationConfines();
            return TeaModel.build(map, self);
        }

        public GetRegionalInstanceConfigResponseBodyResultDataNodeDiskListSubClassificationConfines setMaxSize(Integer maxSize) {
            this.maxSize = maxSize;
            return this;
        }
        public Integer getMaxSize() {
            return this.maxSize;
        }

        public GetRegionalInstanceConfigResponseBodyResultDataNodeDiskListSubClassificationConfines setMinSize(Integer minSize) {
            this.minSize = minSize;
            return this;
        }
        public Integer getMinSize() {
            return this.minSize;
        }

        public GetRegionalInstanceConfigResponseBodyResultDataNodeDiskListSubClassificationConfines setPerformanceLevel(String performanceLevel) {
            this.performanceLevel = performanceLevel;
            return this;
        }
        public String getPerformanceLevel() {
            return this.performanceLevel;
        }

    }

    public static class GetRegionalInstanceConfigResponseBodyResultDataNodeDiskList extends TeaModel {
        @NameInMap("diskType")
        public String diskType;

        @NameInMap("maxSize")
        public Integer maxSize;

        @NameInMap("minSize")
        public Integer minSize;

        @NameInMap("scaleLimit")
        public Integer scaleLimit;

        @NameInMap("subClassificationConfines")
        public java.util.List<GetRegionalInstanceConfigResponseBodyResultDataNodeDiskListSubClassificationConfines> subClassificationConfines;

        @NameInMap("valueLimitSet")
        public java.util.List<Integer> valueLimitSet;

        public static GetRegionalInstanceConfigResponseBodyResultDataNodeDiskList build(java.util.Map<String, ?> map) throws Exception {
            GetRegionalInstanceConfigResponseBodyResultDataNodeDiskList self = new GetRegionalInstanceConfigResponseBodyResultDataNodeDiskList();
            return TeaModel.build(map, self);
        }

        public GetRegionalInstanceConfigResponseBodyResultDataNodeDiskList setDiskType(String diskType) {
            this.diskType = diskType;
            return this;
        }
        public String getDiskType() {
            return this.diskType;
        }

        public GetRegionalInstanceConfigResponseBodyResultDataNodeDiskList setMaxSize(Integer maxSize) {
            this.maxSize = maxSize;
            return this;
        }
        public Integer getMaxSize() {
            return this.maxSize;
        }

        public GetRegionalInstanceConfigResponseBodyResultDataNodeDiskList setMinSize(Integer minSize) {
            this.minSize = minSize;
            return this;
        }
        public Integer getMinSize() {
            return this.minSize;
        }

        public GetRegionalInstanceConfigResponseBodyResultDataNodeDiskList setScaleLimit(Integer scaleLimit) {
            this.scaleLimit = scaleLimit;
            return this;
        }
        public Integer getScaleLimit() {
            return this.scaleLimit;
        }

        public GetRegionalInstanceConfigResponseBodyResultDataNodeDiskList setSubClassificationConfines(java.util.List<GetRegionalInstanceConfigResponseBodyResultDataNodeDiskListSubClassificationConfines> subClassificationConfines) {
            this.subClassificationConfines = subClassificationConfines;
            return this;
        }
        public java.util.List<GetRegionalInstanceConfigResponseBodyResultDataNodeDiskListSubClassificationConfines> getSubClassificationConfines() {
            return this.subClassificationConfines;
        }

        public GetRegionalInstanceConfigResponseBodyResultDataNodeDiskList setValueLimitSet(java.util.List<Integer> valueLimitSet) {
            this.valueLimitSet = valueLimitSet;
            return this;
        }
        public java.util.List<Integer> getValueLimitSet() {
            return this.valueLimitSet;
        }

    }

    public static class GetRegionalInstanceConfigResponseBodyResultMasterDiskListSubClassificationConfines extends TeaModel {
        @NameInMap("maxSize")
        public Integer maxSize;

        @NameInMap("minSize")
        public Integer minSize;

        @NameInMap("performanceLevel")
        public String performanceLevel;

        public static GetRegionalInstanceConfigResponseBodyResultMasterDiskListSubClassificationConfines build(java.util.Map<String, ?> map) throws Exception {
            GetRegionalInstanceConfigResponseBodyResultMasterDiskListSubClassificationConfines self = new GetRegionalInstanceConfigResponseBodyResultMasterDiskListSubClassificationConfines();
            return TeaModel.build(map, self);
        }

        public GetRegionalInstanceConfigResponseBodyResultMasterDiskListSubClassificationConfines setMaxSize(Integer maxSize) {
            this.maxSize = maxSize;
            return this;
        }
        public Integer getMaxSize() {
            return this.maxSize;
        }

        public GetRegionalInstanceConfigResponseBodyResultMasterDiskListSubClassificationConfines setMinSize(Integer minSize) {
            this.minSize = minSize;
            return this;
        }
        public Integer getMinSize() {
            return this.minSize;
        }

        public GetRegionalInstanceConfigResponseBodyResultMasterDiskListSubClassificationConfines setPerformanceLevel(String performanceLevel) {
            this.performanceLevel = performanceLevel;
            return this;
        }
        public String getPerformanceLevel() {
            return this.performanceLevel;
        }

    }

    public static class GetRegionalInstanceConfigResponseBodyResultMasterDiskList extends TeaModel {
        @NameInMap("diskType")
        public String diskType;

        @NameInMap("maxSize")
        public Integer maxSize;

        @NameInMap("minSize")
        public Integer minSize;

        @NameInMap("scaleLimit")
        public Integer scaleLimit;

        @NameInMap("subClassificationConfines")
        public java.util.List<GetRegionalInstanceConfigResponseBodyResultMasterDiskListSubClassificationConfines> subClassificationConfines;

        public static GetRegionalInstanceConfigResponseBodyResultMasterDiskList build(java.util.Map<String, ?> map) throws Exception {
            GetRegionalInstanceConfigResponseBodyResultMasterDiskList self = new GetRegionalInstanceConfigResponseBodyResultMasterDiskList();
            return TeaModel.build(map, self);
        }

        public GetRegionalInstanceConfigResponseBodyResultMasterDiskList setDiskType(String diskType) {
            this.diskType = diskType;
            return this;
        }
        public String getDiskType() {
            return this.diskType;
        }

        public GetRegionalInstanceConfigResponseBodyResultMasterDiskList setMaxSize(Integer maxSize) {
            this.maxSize = maxSize;
            return this;
        }
        public Integer getMaxSize() {
            return this.maxSize;
        }

        public GetRegionalInstanceConfigResponseBodyResultMasterDiskList setMinSize(Integer minSize) {
            this.minSize = minSize;
            return this;
        }
        public Integer getMinSize() {
            return this.minSize;
        }

        public GetRegionalInstanceConfigResponseBodyResultMasterDiskList setScaleLimit(Integer scaleLimit) {
            this.scaleLimit = scaleLimit;
            return this;
        }
        public Integer getScaleLimit() {
            return this.scaleLimit;
        }

        public GetRegionalInstanceConfigResponseBodyResultMasterDiskList setSubClassificationConfines(java.util.List<GetRegionalInstanceConfigResponseBodyResultMasterDiskListSubClassificationConfines> subClassificationConfines) {
            this.subClassificationConfines = subClassificationConfines;
            return this;
        }
        public java.util.List<GetRegionalInstanceConfigResponseBodyResultMasterDiskListSubClassificationConfines> getSubClassificationConfines() {
            return this.subClassificationConfines;
        }

    }

    public static class GetRegionalInstanceConfigResponseBodyResult extends TeaModel {
        @NameInMap("clientNodeAmountRange")
        public GetRegionalInstanceConfigResponseBodyResultClientNodeAmountRange clientNodeAmountRange;

        @NameInMap("clientNodeDiskList")
        public java.util.List<GetRegionalInstanceConfigResponseBodyResultClientNodeDiskList> clientNodeDiskList;

        @NameInMap("clientSpecs")
        public java.util.List<String> clientSpecs;

        @NameInMap("dataNodeAmountRange")
        public GetRegionalInstanceConfigResponseBodyResultDataNodeAmountRange dataNodeAmountRange;

        @NameInMap("dataNodeDiskList")
        public java.util.List<GetRegionalInstanceConfigResponseBodyResultDataNodeDiskList> dataNodeDiskList;

        @NameInMap("dataNodeSpecs")
        public java.util.List<String> dataNodeSpecs;

        @NameInMap("kibanaSpecs")
        public java.util.List<String> kibanaSpecs;

        @NameInMap("masterAmountRange")
        public java.util.List<String> masterAmountRange;

        @NameInMap("masterDiskList")
        public java.util.List<GetRegionalInstanceConfigResponseBodyResultMasterDiskList> masterDiskList;

        @NameInMap("masterSpecs")
        public java.util.List<String> masterSpecs;

        @NameInMap("specInfoMap")
        public java.util.Map<String, ResultSpecInfoMapValue> specInfoMap;

        @NameInMap("versions")
        public java.util.List<String> versions;

        public static GetRegionalInstanceConfigResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            GetRegionalInstanceConfigResponseBodyResult self = new GetRegionalInstanceConfigResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public GetRegionalInstanceConfigResponseBodyResult setClientNodeAmountRange(GetRegionalInstanceConfigResponseBodyResultClientNodeAmountRange clientNodeAmountRange) {
            this.clientNodeAmountRange = clientNodeAmountRange;
            return this;
        }
        public GetRegionalInstanceConfigResponseBodyResultClientNodeAmountRange getClientNodeAmountRange() {
            return this.clientNodeAmountRange;
        }

        public GetRegionalInstanceConfigResponseBodyResult setClientNodeDiskList(java.util.List<GetRegionalInstanceConfigResponseBodyResultClientNodeDiskList> clientNodeDiskList) {
            this.clientNodeDiskList = clientNodeDiskList;
            return this;
        }
        public java.util.List<GetRegionalInstanceConfigResponseBodyResultClientNodeDiskList> getClientNodeDiskList() {
            return this.clientNodeDiskList;
        }

        public GetRegionalInstanceConfigResponseBodyResult setClientSpecs(java.util.List<String> clientSpecs) {
            this.clientSpecs = clientSpecs;
            return this;
        }
        public java.util.List<String> getClientSpecs() {
            return this.clientSpecs;
        }

        public GetRegionalInstanceConfigResponseBodyResult setDataNodeAmountRange(GetRegionalInstanceConfigResponseBodyResultDataNodeAmountRange dataNodeAmountRange) {
            this.dataNodeAmountRange = dataNodeAmountRange;
            return this;
        }
        public GetRegionalInstanceConfigResponseBodyResultDataNodeAmountRange getDataNodeAmountRange() {
            return this.dataNodeAmountRange;
        }

        public GetRegionalInstanceConfigResponseBodyResult setDataNodeDiskList(java.util.List<GetRegionalInstanceConfigResponseBodyResultDataNodeDiskList> dataNodeDiskList) {
            this.dataNodeDiskList = dataNodeDiskList;
            return this;
        }
        public java.util.List<GetRegionalInstanceConfigResponseBodyResultDataNodeDiskList> getDataNodeDiskList() {
            return this.dataNodeDiskList;
        }

        public GetRegionalInstanceConfigResponseBodyResult setDataNodeSpecs(java.util.List<String> dataNodeSpecs) {
            this.dataNodeSpecs = dataNodeSpecs;
            return this;
        }
        public java.util.List<String> getDataNodeSpecs() {
            return this.dataNodeSpecs;
        }

        public GetRegionalInstanceConfigResponseBodyResult setKibanaSpecs(java.util.List<String> kibanaSpecs) {
            this.kibanaSpecs = kibanaSpecs;
            return this;
        }
        public java.util.List<String> getKibanaSpecs() {
            return this.kibanaSpecs;
        }

        public GetRegionalInstanceConfigResponseBodyResult setMasterAmountRange(java.util.List<String> masterAmountRange) {
            this.masterAmountRange = masterAmountRange;
            return this;
        }
        public java.util.List<String> getMasterAmountRange() {
            return this.masterAmountRange;
        }

        public GetRegionalInstanceConfigResponseBodyResult setMasterDiskList(java.util.List<GetRegionalInstanceConfigResponseBodyResultMasterDiskList> masterDiskList) {
            this.masterDiskList = masterDiskList;
            return this;
        }
        public java.util.List<GetRegionalInstanceConfigResponseBodyResultMasterDiskList> getMasterDiskList() {
            return this.masterDiskList;
        }

        public GetRegionalInstanceConfigResponseBodyResult setMasterSpecs(java.util.List<String> masterSpecs) {
            this.masterSpecs = masterSpecs;
            return this;
        }
        public java.util.List<String> getMasterSpecs() {
            return this.masterSpecs;
        }

        public GetRegionalInstanceConfigResponseBodyResult setSpecInfoMap(java.util.Map<String, ResultSpecInfoMapValue> specInfoMap) {
            this.specInfoMap = specInfoMap;
            return this;
        }
        public java.util.Map<String, ResultSpecInfoMapValue> getSpecInfoMap() {
            return this.specInfoMap;
        }

        public GetRegionalInstanceConfigResponseBodyResult setVersions(java.util.List<String> versions) {
            this.versions = versions;
            return this;
        }
        public java.util.List<String> getVersions() {
            return this.versions;
        }

    }

}
