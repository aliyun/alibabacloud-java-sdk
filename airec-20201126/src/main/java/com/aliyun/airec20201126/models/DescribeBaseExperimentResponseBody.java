// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.airec20201126.models;

import com.aliyun.tea.*;

public class DescribeBaseExperimentResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>A74E3FB7-406C-5CBB-833E-E49308B5DC05</p>
     */
    @NameInMap("requestId")
    public String requestId;

    @NameInMap("result")
    public DescribeBaseExperimentResponseBodyResult result;

    public static DescribeBaseExperimentResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeBaseExperimentResponseBody self = new DescribeBaseExperimentResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeBaseExperimentResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeBaseExperimentResponseBody setResult(DescribeBaseExperimentResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public DescribeBaseExperimentResponseBodyResult getResult() {
        return this.result;
    }

    public static class DescribeBaseExperimentResponseBodyResultAlgorithmsConfig extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("defaultValue")
        public String defaultValue;

        /**
         * <strong>example:</strong>
         * <p>400</p>
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

        public static DescribeBaseExperimentResponseBodyResultAlgorithmsConfig build(java.util.Map<String, ?> map) throws Exception {
            DescribeBaseExperimentResponseBodyResultAlgorithmsConfig self = new DescribeBaseExperimentResponseBodyResultAlgorithmsConfig();
            return TeaModel.build(map, self);
        }

        public DescribeBaseExperimentResponseBodyResultAlgorithmsConfig setDefaultValue(String defaultValue) {
            this.defaultValue = defaultValue;
            return this;
        }
        public String getDefaultValue() {
            return this.defaultValue;
        }

        public DescribeBaseExperimentResponseBodyResultAlgorithmsConfig setExperimentValue(String experimentValue) {
            this.experimentValue = experimentValue;
            return this;
        }
        public String getExperimentValue() {
            return this.experimentValue;
        }

        public DescribeBaseExperimentResponseBodyResultAlgorithmsConfig setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public DescribeBaseExperimentResponseBodyResultAlgorithmsConfig setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class DescribeBaseExperimentResponseBodyResultAlgorithms extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>RECALL</p>
         */
        @NameInMap("category")
        public String category;

        @NameInMap("config")
        public java.util.List<DescribeBaseExperimentResponseBodyResultAlgorithmsConfig> config;

        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("defaultValue")
        public String defaultValue;

        /**
         * <strong>example:</strong>
         * <p>400</p>
         */
        @NameInMap("experimentValue")
        public String experimentValue;

        /**
         * <strong>example:</strong>
         * <p>false</p>
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

        public static DescribeBaseExperimentResponseBodyResultAlgorithms build(java.util.Map<String, ?> map) throws Exception {
            DescribeBaseExperimentResponseBodyResultAlgorithms self = new DescribeBaseExperimentResponseBodyResultAlgorithms();
            return TeaModel.build(map, self);
        }

        public DescribeBaseExperimentResponseBodyResultAlgorithms setCategory(String category) {
            this.category = category;
            return this;
        }
        public String getCategory() {
            return this.category;
        }

        public DescribeBaseExperimentResponseBodyResultAlgorithms setConfig(java.util.List<DescribeBaseExperimentResponseBodyResultAlgorithmsConfig> config) {
            this.config = config;
            return this;
        }
        public java.util.List<DescribeBaseExperimentResponseBodyResultAlgorithmsConfig> getConfig() {
            return this.config;
        }

        public DescribeBaseExperimentResponseBodyResultAlgorithms setDefaultValue(String defaultValue) {
            this.defaultValue = defaultValue;
            return this;
        }
        public String getDefaultValue() {
            return this.defaultValue;
        }

        public DescribeBaseExperimentResponseBodyResultAlgorithms setExperimentValue(String experimentValue) {
            this.experimentValue = experimentValue;
            return this;
        }
        public String getExperimentValue() {
            return this.experimentValue;
        }

        public DescribeBaseExperimentResponseBodyResultAlgorithms setHasConfig(Boolean hasConfig) {
            this.hasConfig = hasConfig;
            return this;
        }
        public Boolean getHasConfig() {
            return this.hasConfig;
        }

        public DescribeBaseExperimentResponseBodyResultAlgorithms setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public DescribeBaseExperimentResponseBodyResultAlgorithms setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeBaseExperimentResponseBodyResultAlgorithms setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class DescribeBaseExperimentResponseBodyResult extends TeaModel {
        @NameInMap("algorithms")
        public java.util.List<DescribeBaseExperimentResponseBodyResultAlgorithms> algorithms;

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
         * <p>xxx</p>
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
         * <p>Init</p>
         */
        @NameInMap("status")
        public String status;

        public static DescribeBaseExperimentResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            DescribeBaseExperimentResponseBodyResult self = new DescribeBaseExperimentResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public DescribeBaseExperimentResponseBodyResult setAlgorithms(java.util.List<DescribeBaseExperimentResponseBodyResultAlgorithms> algorithms) {
            this.algorithms = algorithms;
            return this;
        }
        public java.util.List<DescribeBaseExperimentResponseBodyResultAlgorithms> getAlgorithms() {
            return this.algorithms;
        }

        public DescribeBaseExperimentResponseBodyResult setBase(Boolean base) {
            this.base = base;
            return this;
        }
        public Boolean getBase() {
            return this.base;
        }

        public DescribeBaseExperimentResponseBodyResult setBuckets(java.util.List<String> buckets) {
            this.buckets = buckets;
            return this;
        }
        public java.util.List<String> getBuckets() {
            return this.buckets;
        }

        public DescribeBaseExperimentResponseBodyResult setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeBaseExperimentResponseBodyResult setExperimentId(String experimentId) {
            this.experimentId = experimentId;
            return this;
        }
        public String getExperimentId() {
            return this.experimentId;
        }

        public DescribeBaseExperimentResponseBodyResult setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeBaseExperimentResponseBodyResult setOfflineTime(String offlineTime) {
            this.offlineTime = offlineTime;
            return this;
        }
        public String getOfflineTime() {
            return this.offlineTime;
        }

        public DescribeBaseExperimentResponseBodyResult setOnlineTime(String onlineTime) {
            this.onlineTime = onlineTime;
            return this;
        }
        public String getOnlineTime() {
            return this.onlineTime;
        }

        public DescribeBaseExperimentResponseBodyResult setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

}
