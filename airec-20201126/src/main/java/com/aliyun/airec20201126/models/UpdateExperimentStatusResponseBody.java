// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.airec20201126.models;

import com.aliyun.tea.*;

public class UpdateExperimentStatusResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>E3D6FE3B-B7C2-43DA-9A13-5EA837ACED9B</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>The returned result.</p>
     */
    @NameInMap("result")
    public UpdateExperimentStatusResponseBodyResult result;

    public static UpdateExperimentStatusResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateExperimentStatusResponseBody self = new UpdateExperimentStatusResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateExperimentStatusResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UpdateExperimentStatusResponseBody setResult(UpdateExperimentStatusResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public UpdateExperimentStatusResponseBodyResult getResult() {
        return this.result;
    }

    public static class UpdateExperimentStatusResponseBodyResultAlgorithmsConfig extends TeaModel {
        /**
         * <p>The default value of the algorithm. If you set key to i2i, hot, or new, the value of this parameter is true or false. If you set key to mtorder, the value of this parameter is a list of filtering algorithms ranked by priority.</p>
         * 
         * <strong>example:</strong>
         * <p>xxx</p>
         */
        @NameInMap("defaultValue")
        public String defaultValue;

        /**
         * <p>The custom value of the algorithm.</p>
         * 
         * <strong>example:</strong>
         * <p>xxx</p>
         */
        @NameInMap("experimentValue")
        public String experimentValue;

        /**
         * <p>The algorithm key. Valid values: i2i: the I2I filtering algorithm. u2x2i: the U2X2I filtering algorithm. hot: the filtering algorithm for popular items. new: the filtering algorithm for new items. embedding: the vector filtering algorithm. mtorder: the priority of the filtering algorithm. rankservice: the ranking service.</p>
         * 
         * <strong>example:</strong>
         * <p>hot</p>
         */
        @NameInMap("key")
        public String key;

        /**
         * <p>The algorithm name. (Note: If you use the default algorithm, the console obtains the algorithm name from Medusa. If you customize an algorithm for the experiment, the algorithm name is directly returned.)</p>
         * 
         * <strong>example:</strong>
         * <p>xxx</p>
         */
        @NameInMap("name")
        public String name;

        public static UpdateExperimentStatusResponseBodyResultAlgorithmsConfig build(java.util.Map<String, ?> map) throws Exception {
            UpdateExperimentStatusResponseBodyResultAlgorithmsConfig self = new UpdateExperimentStatusResponseBodyResultAlgorithmsConfig();
            return TeaModel.build(map, self);
        }

        public UpdateExperimentStatusResponseBodyResultAlgorithmsConfig setDefaultValue(String defaultValue) {
            this.defaultValue = defaultValue;
            return this;
        }
        public String getDefaultValue() {
            return this.defaultValue;
        }

        public UpdateExperimentStatusResponseBodyResultAlgorithmsConfig setExperimentValue(String experimentValue) {
            this.experimentValue = experimentValue;
            return this;
        }
        public String getExperimentValue() {
            return this.experimentValue;
        }

        public UpdateExperimentStatusResponseBodyResultAlgorithmsConfig setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public UpdateExperimentStatusResponseBodyResultAlgorithmsConfig setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class UpdateExperimentStatusResponseBodyResultAlgorithms extends TeaModel {
        /**
         * <p>The algorithm category. Valid values: RECALL and RANK.</p>
         * 
         * <strong>example:</strong>
         * <p>RECALL</p>
         */
        @NameInMap("category")
        public String category;

        /**
         * <p>The experiment configurations.</p>
         */
        @NameInMap("config")
        public java.util.List<UpdateExperimentStatusResponseBodyResultAlgorithmsConfig> config;

        /**
         * <p>The default value of the algorithm configuration item.</p>
         * 
         * <strong>example:</strong>
         * <p>swing</p>
         */
        @NameInMap("defaultValue")
        public String defaultValue;

        /**
         * <p>The custom value of the algorithm configuration item.</p>
         * 
         * <strong>example:</strong>
         * <p>xxx</p>
         */
        @NameInMap("experimentValue")
        public String experimentValue;

        /**
         * <p>Indicates whether child configuration items exist. Valid values: true and false.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("hasConfig")
        public Boolean hasConfig;

        /**
         * <p>The algorithm key. Valid values: i2i: the I2I filtering algorithm. u2x2i: the U2X2I filtering algorithm. hot: the filtering algorithm for popular items. new: the filtering algorithm for new items. embedding: the vector filtering algorithm. mtorder: the priority of the filtering algorithm. rankservice: the ranking service.</p>
         * 
         * <strong>example:</strong>
         * <p>hot</p>
         */
        @NameInMap("key")
        public String key;

        /**
         * <p>The algorithm name. (Note: If you use the default algorithm, the console obtains the algorithm name from Medusa. If you customize an algorithm for the experiment, the algorithm name is directly returned.)</p>
         * 
         * <strong>example:</strong>
         * <p>xxx</p>
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

        public static UpdateExperimentStatusResponseBodyResultAlgorithms build(java.util.Map<String, ?> map) throws Exception {
            UpdateExperimentStatusResponseBodyResultAlgorithms self = new UpdateExperimentStatusResponseBodyResultAlgorithms();
            return TeaModel.build(map, self);
        }

        public UpdateExperimentStatusResponseBodyResultAlgorithms setCategory(String category) {
            this.category = category;
            return this;
        }
        public String getCategory() {
            return this.category;
        }

        public UpdateExperimentStatusResponseBodyResultAlgorithms setConfig(java.util.List<UpdateExperimentStatusResponseBodyResultAlgorithmsConfig> config) {
            this.config = config;
            return this;
        }
        public java.util.List<UpdateExperimentStatusResponseBodyResultAlgorithmsConfig> getConfig() {
            return this.config;
        }

        public UpdateExperimentStatusResponseBodyResultAlgorithms setDefaultValue(String defaultValue) {
            this.defaultValue = defaultValue;
            return this;
        }
        public String getDefaultValue() {
            return this.defaultValue;
        }

        public UpdateExperimentStatusResponseBodyResultAlgorithms setExperimentValue(String experimentValue) {
            this.experimentValue = experimentValue;
            return this;
        }
        public String getExperimentValue() {
            return this.experimentValue;
        }

        public UpdateExperimentStatusResponseBodyResultAlgorithms setHasConfig(Boolean hasConfig) {
            this.hasConfig = hasConfig;
            return this;
        }
        public Boolean getHasConfig() {
            return this.hasConfig;
        }

        public UpdateExperimentStatusResponseBodyResultAlgorithms setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public UpdateExperimentStatusResponseBodyResultAlgorithms setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public UpdateExperimentStatusResponseBodyResultAlgorithms setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class UpdateExperimentStatusResponseBodyResult extends TeaModel {
        /**
         * <p>The algorithm configurations.</p>
         */
        @NameInMap("algorithms")
        public java.util.List<UpdateExperimentStatusResponseBodyResultAlgorithms> algorithms;

        /**
         * <p>Indicates whether the default configurations are used for the experiment.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("base")
        public Boolean base;

        /**
         * <p>The buckets. This parameter takes effect only when the experiment is published.</p>
         */
        @NameInMap("buckets")
        public java.util.List<String> buckets;

        /**
         * <p>The remarks of the experiment.</p>
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
         * <p>123</p>
         */
        @NameInMap("experimentId")
        public String experimentId;

        /**
         * <p>The experiment name.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
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
         * <p>The experiment state. Valid values: init, online, finish, and offline.</p>
         * 
         * <strong>example:</strong>
         * <p>init</p>
         */
        @NameInMap("status")
        public String status;

        public static UpdateExperimentStatusResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            UpdateExperimentStatusResponseBodyResult self = new UpdateExperimentStatusResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public UpdateExperimentStatusResponseBodyResult setAlgorithms(java.util.List<UpdateExperimentStatusResponseBodyResultAlgorithms> algorithms) {
            this.algorithms = algorithms;
            return this;
        }
        public java.util.List<UpdateExperimentStatusResponseBodyResultAlgorithms> getAlgorithms() {
            return this.algorithms;
        }

        public UpdateExperimentStatusResponseBodyResult setBase(Boolean base) {
            this.base = base;
            return this;
        }
        public Boolean getBase() {
            return this.base;
        }

        public UpdateExperimentStatusResponseBodyResult setBuckets(java.util.List<String> buckets) {
            this.buckets = buckets;
            return this;
        }
        public java.util.List<String> getBuckets() {
            return this.buckets;
        }

        public UpdateExperimentStatusResponseBodyResult setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public UpdateExperimentStatusResponseBodyResult setExperimentId(String experimentId) {
            this.experimentId = experimentId;
            return this;
        }
        public String getExperimentId() {
            return this.experimentId;
        }

        public UpdateExperimentStatusResponseBodyResult setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public UpdateExperimentStatusResponseBodyResult setOfflineTime(String offlineTime) {
            this.offlineTime = offlineTime;
            return this;
        }
        public String getOfflineTime() {
            return this.offlineTime;
        }

        public UpdateExperimentStatusResponseBodyResult setOnlineTime(String onlineTime) {
            this.onlineTime = onlineTime;
            return this;
        }
        public String getOnlineTime() {
            return this.onlineTime;
        }

        public UpdateExperimentStatusResponseBodyResult setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

}
