// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.airec20201126.models;

import com.aliyun.tea.*;

public class UpdateExperimentBasicInfoResponseBody extends TeaModel {
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
    public UpdateExperimentBasicInfoResponseBodyResult result;

    public static UpdateExperimentBasicInfoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateExperimentBasicInfoResponseBody self = new UpdateExperimentBasicInfoResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateExperimentBasicInfoResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UpdateExperimentBasicInfoResponseBody setResult(UpdateExperimentBasicInfoResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public UpdateExperimentBasicInfoResponseBodyResult getResult() {
        return this.result;
    }

    public static class UpdateExperimentBasicInfoResponseBodyResultAlgorithmsConfig extends TeaModel {
        /**
         * <p>The default value of the algorithm configuration item.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("defaultValue")
        public String defaultValue;

        /**
         * <p>The custom value of the algorithm configuration item.</p>
         * 
         * <strong>example:</strong>
         * <p>400</p>
         */
        @NameInMap("experimentValue")
        public String experimentValue;

        /**
         * <p>The key of the algorithm configuration item.</p>
         * 
         * <strong>example:</strong>
         * <p>I2I</p>
         */
        @NameInMap("key")
        public String key;

        /**
         * <p>The name of the algorithm configuration item.</p>
         * 
         * <strong>example:</strong>
         * <p>I2I filtering algorithm</p>
         */
        @NameInMap("name")
        public String name;

        public static UpdateExperimentBasicInfoResponseBodyResultAlgorithmsConfig build(java.util.Map<String, ?> map) throws Exception {
            UpdateExperimentBasicInfoResponseBodyResultAlgorithmsConfig self = new UpdateExperimentBasicInfoResponseBodyResultAlgorithmsConfig();
            return TeaModel.build(map, self);
        }

        public UpdateExperimentBasicInfoResponseBodyResultAlgorithmsConfig setDefaultValue(String defaultValue) {
            this.defaultValue = defaultValue;
            return this;
        }
        public String getDefaultValue() {
            return this.defaultValue;
        }

        public UpdateExperimentBasicInfoResponseBodyResultAlgorithmsConfig setExperimentValue(String experimentValue) {
            this.experimentValue = experimentValue;
            return this;
        }
        public String getExperimentValue() {
            return this.experimentValue;
        }

        public UpdateExperimentBasicInfoResponseBodyResultAlgorithmsConfig setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public UpdateExperimentBasicInfoResponseBodyResultAlgorithmsConfig setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class UpdateExperimentBasicInfoResponseBodyResultAlgorithms extends TeaModel {
        /**
         * <p>The category of the algorithm.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("category")
        public String category;

        /**
         * <p>The information about the child configuration item.</p>
         */
        @NameInMap("config")
        public java.util.List<UpdateExperimentBasicInfoResponseBodyResultAlgorithmsConfig> config;

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
         * <p>400</p>
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
         * <p>The key of the algorithm.</p>
         * 
         * <strong>example:</strong>
         * <p>I2I</p>
         */
        @NameInMap("key")
        public String key;

        /**
         * <p>The name of the experiment.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("name")
        public String name;

        /**
         * <p>The type of the algorithm.</p>
         * 
         * <strong>example:</strong>
         * <p>SYSTEM</p>
         */
        @NameInMap("type")
        public String type;

        public static UpdateExperimentBasicInfoResponseBodyResultAlgorithms build(java.util.Map<String, ?> map) throws Exception {
            UpdateExperimentBasicInfoResponseBodyResultAlgorithms self = new UpdateExperimentBasicInfoResponseBodyResultAlgorithms();
            return TeaModel.build(map, self);
        }

        public UpdateExperimentBasicInfoResponseBodyResultAlgorithms setCategory(String category) {
            this.category = category;
            return this;
        }
        public String getCategory() {
            return this.category;
        }

        public UpdateExperimentBasicInfoResponseBodyResultAlgorithms setConfig(java.util.List<UpdateExperimentBasicInfoResponseBodyResultAlgorithmsConfig> config) {
            this.config = config;
            return this;
        }
        public java.util.List<UpdateExperimentBasicInfoResponseBodyResultAlgorithmsConfig> getConfig() {
            return this.config;
        }

        public UpdateExperimentBasicInfoResponseBodyResultAlgorithms setDefaultValue(String defaultValue) {
            this.defaultValue = defaultValue;
            return this;
        }
        public String getDefaultValue() {
            return this.defaultValue;
        }

        public UpdateExperimentBasicInfoResponseBodyResultAlgorithms setExperimentValue(String experimentValue) {
            this.experimentValue = experimentValue;
            return this;
        }
        public String getExperimentValue() {
            return this.experimentValue;
        }

        public UpdateExperimentBasicInfoResponseBodyResultAlgorithms setHasConfig(Boolean hasConfig) {
            this.hasConfig = hasConfig;
            return this;
        }
        public Boolean getHasConfig() {
            return this.hasConfig;
        }

        public UpdateExperimentBasicInfoResponseBodyResultAlgorithms setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public UpdateExperimentBasicInfoResponseBodyResultAlgorithms setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public UpdateExperimentBasicInfoResponseBodyResultAlgorithms setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class UpdateExperimentBasicInfoResponseBodyResult extends TeaModel {
        /**
         * <p>The parameters of the experiment.</p>
         */
        @NameInMap("algorithms")
        public java.util.List<UpdateExperimentBasicInfoResponseBodyResultAlgorithms> algorithms;

        /**
         * <p>Indicates whether the experiment uses default configurations.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("base")
        public Boolean base;

        /**
         * <p>The traffic buckets.</p>
         */
        @NameInMap("buckets")
        public java.util.List<String> buckets;

        /**
         * <p>The description of the experiment.</p>
         * 
         * <strong>example:</strong>
         * <p>demo1</p>
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
         * <p>The name of the experiment.</p>
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
         * <p>The status of the experiment.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("status")
        public String status;

        public static UpdateExperimentBasicInfoResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            UpdateExperimentBasicInfoResponseBodyResult self = new UpdateExperimentBasicInfoResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public UpdateExperimentBasicInfoResponseBodyResult setAlgorithms(java.util.List<UpdateExperimentBasicInfoResponseBodyResultAlgorithms> algorithms) {
            this.algorithms = algorithms;
            return this;
        }
        public java.util.List<UpdateExperimentBasicInfoResponseBodyResultAlgorithms> getAlgorithms() {
            return this.algorithms;
        }

        public UpdateExperimentBasicInfoResponseBodyResult setBase(Boolean base) {
            this.base = base;
            return this;
        }
        public Boolean getBase() {
            return this.base;
        }

        public UpdateExperimentBasicInfoResponseBodyResult setBuckets(java.util.List<String> buckets) {
            this.buckets = buckets;
            return this;
        }
        public java.util.List<String> getBuckets() {
            return this.buckets;
        }

        public UpdateExperimentBasicInfoResponseBodyResult setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public UpdateExperimentBasicInfoResponseBodyResult setExperimentId(String experimentId) {
            this.experimentId = experimentId;
            return this;
        }
        public String getExperimentId() {
            return this.experimentId;
        }

        public UpdateExperimentBasicInfoResponseBodyResult setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public UpdateExperimentBasicInfoResponseBodyResult setOfflineTime(String offlineTime) {
            this.offlineTime = offlineTime;
            return this;
        }
        public String getOfflineTime() {
            return this.offlineTime;
        }

        public UpdateExperimentBasicInfoResponseBodyResult setOnlineTime(String onlineTime) {
            this.onlineTime = onlineTime;
            return this;
        }
        public String getOnlineTime() {
            return this.onlineTime;
        }

        public UpdateExperimentBasicInfoResponseBodyResult setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

}
