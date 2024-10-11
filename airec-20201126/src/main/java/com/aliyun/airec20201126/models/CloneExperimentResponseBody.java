// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.airec20201126.models;

import com.aliyun.tea.*;

public class CloneExperimentResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>E3D6FE3B-B7C2-43DA-9A13-5EA837ACED9B</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>The information about the experiment.</p>
     */
    @NameInMap("result")
    public CloneExperimentResponseBodyResult result;

    public static CloneExperimentResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CloneExperimentResponseBody self = new CloneExperimentResponseBody();
        return TeaModel.build(map, self);
    }

    public CloneExperimentResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CloneExperimentResponseBody setResult(CloneExperimentResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public CloneExperimentResponseBodyResult getResult() {
        return this.result;
    }

    public static class CloneExperimentResponseBodyResultAlgorithmsConfig extends TeaModel {
        /**
         * <p>The default value of the algorithm.</p>
         * 
         * <strong>example:</strong>
         * <p>400</p>
         */
        @NameInMap("defaultValue")
        public String defaultValue;

        /**
         * <p>The custom value of the algorithm.</p>
         * 
         * <strong>example:</strong>
         * <p>swing;commoni2i;pcategory;scategory</p>
         */
        @NameInMap("experimentValue")
        public String experimentValue;

        /**
         * <p>The algorithm key.</p>
         * 
         * <strong>example:</strong>
         * <p>I2I-truncedquantity</p>
         */
        @NameInMap("key")
        public String key;

        /**
         * <p>The algorithm name. (Note: If you use the default algorithm, the console obtains the algorithm name from Medusa. If you customize an algorithm for the experiment, the algorithm name is directly returned.)</p>
         */
        @NameInMap("name")
        public String name;

        public static CloneExperimentResponseBodyResultAlgorithmsConfig build(java.util.Map<String, ?> map) throws Exception {
            CloneExperimentResponseBodyResultAlgorithmsConfig self = new CloneExperimentResponseBodyResultAlgorithmsConfig();
            return TeaModel.build(map, self);
        }

        public CloneExperimentResponseBodyResultAlgorithmsConfig setDefaultValue(String defaultValue) {
            this.defaultValue = defaultValue;
            return this;
        }
        public String getDefaultValue() {
            return this.defaultValue;
        }

        public CloneExperimentResponseBodyResultAlgorithmsConfig setExperimentValue(String experimentValue) {
            this.experimentValue = experimentValue;
            return this;
        }
        public String getExperimentValue() {
            return this.experimentValue;
        }

        public CloneExperimentResponseBodyResultAlgorithmsConfig setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public CloneExperimentResponseBodyResultAlgorithmsConfig setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class CloneExperimentResponseBodyResultAlgorithms extends TeaModel {
        /**
         * <p>The algorithm category. Valid values: RECALL and RANK.</p>
         * 
         * <strong>example:</strong>
         * <p>RECALL</p>
         */
        @NameInMap("category")
        public String category;

        /**
         * <p>The child configuration items.</p>
         */
        @NameInMap("config")
        public java.util.List<CloneExperimentResponseBodyResultAlgorithmsConfig> config;

        /**
         * <p>The default value of the algorithm configuration item.</p>
         * 
         * <strong>example:</strong>
         * <p>i2i;u2x2i;new;hot;embedding;embedding</p>
         */
        @NameInMap("defaultValue")
        public String defaultValue;

        /**
         * <p>The custom value of the algorithm configuration item.</p>
         * 
         * <strong>example:</strong>
         * <p>300</p>
         */
        @NameInMap("experimentValue")
        public String experimentValue;

        /**
         * <p>Indicates whether child configuration items exist. Valid values: true and false.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("hasConfig")
        public Boolean hasConfig;

        /**
         * <p>The algorithm key. Valid values: I2I: the I2I filtering algorithm. u2X2I: the U2X2I filtering algorithm. hot: the filtering algorithm for popular items. new: the filtering algorithm for new items. embedding: the vector filtering algorithm. mtorder: the priority of the filtering algorithm. rankservice: the ranking service.</p>
         * 
         * <strong>example:</strong>
         * <p>I2I</p>
         */
        @NameInMap("key")
        public String key;

        /**
         * <p>The algorithm name. (Note: If you use the default algorithm, the console obtains the algorithm name from Medusa. If you customize an algorithm for the experiment, the algorithm name is directly returned.)</p>
         * 
         * <strong>example:</strong>
         * <p>name</p>
         */
        @NameInMap("name")
        public String name;

        /**
         * <p>The algorithm type. Valid values: SYSTEM and CUSTOM.</p>
         * 
         * <strong>example:</strong>
         * <p>SYSTEM</p>
         */
        @NameInMap("type")
        public String type;

        public static CloneExperimentResponseBodyResultAlgorithms build(java.util.Map<String, ?> map) throws Exception {
            CloneExperimentResponseBodyResultAlgorithms self = new CloneExperimentResponseBodyResultAlgorithms();
            return TeaModel.build(map, self);
        }

        public CloneExperimentResponseBodyResultAlgorithms setCategory(String category) {
            this.category = category;
            return this;
        }
        public String getCategory() {
            return this.category;
        }

        public CloneExperimentResponseBodyResultAlgorithms setConfig(java.util.List<CloneExperimentResponseBodyResultAlgorithmsConfig> config) {
            this.config = config;
            return this;
        }
        public java.util.List<CloneExperimentResponseBodyResultAlgorithmsConfig> getConfig() {
            return this.config;
        }

        public CloneExperimentResponseBodyResultAlgorithms setDefaultValue(String defaultValue) {
            this.defaultValue = defaultValue;
            return this;
        }
        public String getDefaultValue() {
            return this.defaultValue;
        }

        public CloneExperimentResponseBodyResultAlgorithms setExperimentValue(String experimentValue) {
            this.experimentValue = experimentValue;
            return this;
        }
        public String getExperimentValue() {
            return this.experimentValue;
        }

        public CloneExperimentResponseBodyResultAlgorithms setHasConfig(Boolean hasConfig) {
            this.hasConfig = hasConfig;
            return this;
        }
        public Boolean getHasConfig() {
            return this.hasConfig;
        }

        public CloneExperimentResponseBodyResultAlgorithms setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public CloneExperimentResponseBodyResultAlgorithms setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public CloneExperimentResponseBodyResultAlgorithms setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class CloneExperimentResponseBodyResult extends TeaModel {
        /**
         * <p>The algorithm configurations.</p>
         */
        @NameInMap("algorithms")
        public java.util.List<CloneExperimentResponseBodyResultAlgorithms> algorithms;

        /**
         * <p>N/A</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("base")
        public Boolean base;

        /**
         * <p>The buckets.</p>
         */
        @NameInMap("buckets")
        public java.util.List<String> buckets;

        /**
         * <p>The remarks.</p>
         * 
         * <strong>example:</strong>
         * <p>xxx</p>
         */
        @NameInMap("description")
        public String description;

        /**
         * <p>The experiment ID.</p>
         * 
         * <strong>example:</strong>
         * <p>12345</p>
         */
        @NameInMap("experimentId")
        public String experimentId;

        /**
         * <p>The experiment name.</p>
         * 
         * <strong>example:</strong>
         * <p>xxx</p>
         */
        @NameInMap("name")
        public String name;

        /**
         * <p>The time when the experiment was unpublished.</p>
         * 
         * <strong>example:</strong>
         * <p>2020-11-11T09:47:43.000Z</p>
         */
        @NameInMap("offlineTime")
        public String offlineTime;

        /**
         * <p>The time when the experiment was published.</p>
         * 
         * <strong>example:</strong>
         * <p>2020-11-11T09:47:43.000Z</p>
         */
        @NameInMap("onlineTime")
        public String onlineTime;

        /**
         * <p>The experiment state.</p>
         * 
         * <strong>example:</strong>
         * <p>Init</p>
         */
        @NameInMap("status")
        public String status;

        public static CloneExperimentResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            CloneExperimentResponseBodyResult self = new CloneExperimentResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public CloneExperimentResponseBodyResult setAlgorithms(java.util.List<CloneExperimentResponseBodyResultAlgorithms> algorithms) {
            this.algorithms = algorithms;
            return this;
        }
        public java.util.List<CloneExperimentResponseBodyResultAlgorithms> getAlgorithms() {
            return this.algorithms;
        }

        public CloneExperimentResponseBodyResult setBase(Boolean base) {
            this.base = base;
            return this;
        }
        public Boolean getBase() {
            return this.base;
        }

        public CloneExperimentResponseBodyResult setBuckets(java.util.List<String> buckets) {
            this.buckets = buckets;
            return this;
        }
        public java.util.List<String> getBuckets() {
            return this.buckets;
        }

        public CloneExperimentResponseBodyResult setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public CloneExperimentResponseBodyResult setExperimentId(String experimentId) {
            this.experimentId = experimentId;
            return this;
        }
        public String getExperimentId() {
            return this.experimentId;
        }

        public CloneExperimentResponseBodyResult setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public CloneExperimentResponseBodyResult setOfflineTime(String offlineTime) {
            this.offlineTime = offlineTime;
            return this;
        }
        public String getOfflineTime() {
            return this.offlineTime;
        }

        public CloneExperimentResponseBodyResult setOnlineTime(String onlineTime) {
            this.onlineTime = onlineTime;
            return this;
        }
        public String getOnlineTime() {
            return this.onlineTime;
        }

        public CloneExperimentResponseBodyResult setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

}
