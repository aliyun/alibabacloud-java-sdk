// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.airec20201126.models;

import com.aliyun.tea.*;

public class UpdateExperimentConfigResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>829F38F6-E2D6-4109-90A6-888160BD16C2</p>
     */
    @NameInMap("requestId")
    public String requestId;

    @NameInMap("result")
    public UpdateExperimentConfigResponseBodyResult result;

    public static UpdateExperimentConfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateExperimentConfigResponseBody self = new UpdateExperimentConfigResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateExperimentConfigResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UpdateExperimentConfigResponseBody setResult(UpdateExperimentConfigResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public UpdateExperimentConfigResponseBodyResult getResult() {
        return this.result;
    }

    public static class UpdateExperimentConfigResponseBodyResultAlgorithmsConfig extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("defaultValue")
        public String defaultValue;

        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("experimentValue")
        public String experimentValue;

        /**
         * <strong>example:</strong>
         * <p>I2I</p>
         */
        @NameInMap("key")
        public String key;

        /**
         * <strong>example:</strong>
         * <p>xxx</p>
         */
        @NameInMap("name")
        public String name;

        public static UpdateExperimentConfigResponseBodyResultAlgorithmsConfig build(java.util.Map<String, ?> map) throws Exception {
            UpdateExperimentConfigResponseBodyResultAlgorithmsConfig self = new UpdateExperimentConfigResponseBodyResultAlgorithmsConfig();
            return TeaModel.build(map, self);
        }

        public UpdateExperimentConfigResponseBodyResultAlgorithmsConfig setDefaultValue(String defaultValue) {
            this.defaultValue = defaultValue;
            return this;
        }
        public String getDefaultValue() {
            return this.defaultValue;
        }

        public UpdateExperimentConfigResponseBodyResultAlgorithmsConfig setExperimentValue(String experimentValue) {
            this.experimentValue = experimentValue;
            return this;
        }
        public String getExperimentValue() {
            return this.experimentValue;
        }

        public UpdateExperimentConfigResponseBodyResultAlgorithmsConfig setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public UpdateExperimentConfigResponseBodyResultAlgorithmsConfig setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class UpdateExperimentConfigResponseBodyResultAlgorithms extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>RECALL</p>
         */
        @NameInMap("category")
        public String category;

        @NameInMap("config")
        public java.util.List<UpdateExperimentConfigResponseBodyResultAlgorithmsConfig> config;

        /**
         * <strong>example:</strong>
         * <p>400</p>
         */
        @NameInMap("defaultValue")
        public String defaultValue;

        /**
         * <strong>example:</strong>
         * <p>300</p>
         */
        @NameInMap("experimentValue")
        public String experimentValue;

        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("hasConfig")
        public Boolean hasConfig;

        /**
         * <strong>example:</strong>
         * <p>I2I</p>
         */
        @NameInMap("key")
        public String key;

        /**
         * <strong>example:</strong>
         * <p>xxx</p>
         */
        @NameInMap("name")
        public String name;

        /**
         * <strong>example:</strong>
         * <p>SYSTEM</p>
         */
        @NameInMap("type")
        public String type;

        public static UpdateExperimentConfigResponseBodyResultAlgorithms build(java.util.Map<String, ?> map) throws Exception {
            UpdateExperimentConfigResponseBodyResultAlgorithms self = new UpdateExperimentConfigResponseBodyResultAlgorithms();
            return TeaModel.build(map, self);
        }

        public UpdateExperimentConfigResponseBodyResultAlgorithms setCategory(String category) {
            this.category = category;
            return this;
        }
        public String getCategory() {
            return this.category;
        }

        public UpdateExperimentConfigResponseBodyResultAlgorithms setConfig(java.util.List<UpdateExperimentConfigResponseBodyResultAlgorithmsConfig> config) {
            this.config = config;
            return this;
        }
        public java.util.List<UpdateExperimentConfigResponseBodyResultAlgorithmsConfig> getConfig() {
            return this.config;
        }

        public UpdateExperimentConfigResponseBodyResultAlgorithms setDefaultValue(String defaultValue) {
            this.defaultValue = defaultValue;
            return this;
        }
        public String getDefaultValue() {
            return this.defaultValue;
        }

        public UpdateExperimentConfigResponseBodyResultAlgorithms setExperimentValue(String experimentValue) {
            this.experimentValue = experimentValue;
            return this;
        }
        public String getExperimentValue() {
            return this.experimentValue;
        }

        public UpdateExperimentConfigResponseBodyResultAlgorithms setHasConfig(Boolean hasConfig) {
            this.hasConfig = hasConfig;
            return this;
        }
        public Boolean getHasConfig() {
            return this.hasConfig;
        }

        public UpdateExperimentConfigResponseBodyResultAlgorithms setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public UpdateExperimentConfigResponseBodyResultAlgorithms setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public UpdateExperimentConfigResponseBodyResultAlgorithms setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class UpdateExperimentConfigResponseBodyResult extends TeaModel {
        @NameInMap("algorithms")
        public java.util.List<UpdateExperimentConfigResponseBodyResultAlgorithms> algorithms;

        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("base")
        public Boolean base;

        @NameInMap("buckets")
        public java.util.List<String> buckets;

        /**
         * <strong>example:</strong>
         * <p>demo1</p>
         */
        @NameInMap("description")
        public String description;

        /**
         * <strong>example:</strong>
         * <p>xxx</p>
         */
        @NameInMap("experimentId")
        public String experimentId;

        @NameInMap("name")
        public String name;

        /**
         * <strong>example:</strong>
         * <p>2020-12-07T06:47:30.000Z</p>
         */
        @NameInMap("offlineTime")
        public String offlineTime;

        /**
         * <strong>example:</strong>
         * <p>2020-12-07T06:47:30.000Z</p>
         */
        @NameInMap("onlineTime")
        public String onlineTime;

        /**
         * <strong>example:</strong>
         * <p>Online</p>
         */
        @NameInMap("status")
        public String status;

        public static UpdateExperimentConfigResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            UpdateExperimentConfigResponseBodyResult self = new UpdateExperimentConfigResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public UpdateExperimentConfigResponseBodyResult setAlgorithms(java.util.List<UpdateExperimentConfigResponseBodyResultAlgorithms> algorithms) {
            this.algorithms = algorithms;
            return this;
        }
        public java.util.List<UpdateExperimentConfigResponseBodyResultAlgorithms> getAlgorithms() {
            return this.algorithms;
        }

        public UpdateExperimentConfigResponseBodyResult setBase(Boolean base) {
            this.base = base;
            return this;
        }
        public Boolean getBase() {
            return this.base;
        }

        public UpdateExperimentConfigResponseBodyResult setBuckets(java.util.List<String> buckets) {
            this.buckets = buckets;
            return this;
        }
        public java.util.List<String> getBuckets() {
            return this.buckets;
        }

        public UpdateExperimentConfigResponseBodyResult setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public UpdateExperimentConfigResponseBodyResult setExperimentId(String experimentId) {
            this.experimentId = experimentId;
            return this;
        }
        public String getExperimentId() {
            return this.experimentId;
        }

        public UpdateExperimentConfigResponseBodyResult setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public UpdateExperimentConfigResponseBodyResult setOfflineTime(String offlineTime) {
            this.offlineTime = offlineTime;
            return this;
        }
        public String getOfflineTime() {
            return this.offlineTime;
        }

        public UpdateExperimentConfigResponseBodyResult setOnlineTime(String onlineTime) {
            this.onlineTime = onlineTime;
            return this;
        }
        public String getOnlineTime() {
            return this.onlineTime;
        }

        public UpdateExperimentConfigResponseBodyResult setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

}
