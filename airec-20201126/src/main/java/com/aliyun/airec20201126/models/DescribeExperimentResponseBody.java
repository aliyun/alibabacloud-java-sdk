// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.airec20201126.models;

import com.aliyun.tea.*;

public class DescribeExperimentResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>E3D6FE3B-B7C2-43DA-9A13-5EA837ACED9B</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>The returned results.</p>
     */
    @NameInMap("result")
    public DescribeExperimentResponseBodyResult result;

    public static DescribeExperimentResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeExperimentResponseBody self = new DescribeExperimentResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeExperimentResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeExperimentResponseBody setResult(DescribeExperimentResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public DescribeExperimentResponseBodyResult getResult() {
        return this.result;
    }

    public static class DescribeExperimentResponseBodyResultAlgorithmsConfig extends TeaModel {
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
         * <p>key</p>
         * 
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

        public static DescribeExperimentResponseBodyResultAlgorithmsConfig build(java.util.Map<String, ?> map) throws Exception {
            DescribeExperimentResponseBodyResultAlgorithmsConfig self = new DescribeExperimentResponseBodyResultAlgorithmsConfig();
            return TeaModel.build(map, self);
        }

        public DescribeExperimentResponseBodyResultAlgorithmsConfig setDefaultValue(String defaultValue) {
            this.defaultValue = defaultValue;
            return this;
        }
        public String getDefaultValue() {
            return this.defaultValue;
        }

        public DescribeExperimentResponseBodyResultAlgorithmsConfig setExperimentValue(String experimentValue) {
            this.experimentValue = experimentValue;
            return this;
        }
        public String getExperimentValue() {
            return this.experimentValue;
        }

        public DescribeExperimentResponseBodyResultAlgorithmsConfig setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public DescribeExperimentResponseBodyResultAlgorithmsConfig setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class DescribeExperimentResponseBodyResultAlgorithms extends TeaModel {
        /**
         * <p>The category of the item.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("category")
        public String category;

        @NameInMap("config")
        public java.util.List<DescribeExperimentResponseBodyResultAlgorithmsConfig> config;

        /**
         * <p>None</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("defaultValue")
        public String defaultValue;

        /**
         * <p>None</p>
         */
        @NameInMap("experimentValue")
        public String experimentValue;

        /**
         * <p>None</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("hasConfig")
        public Boolean hasConfig;

        /**
         * <p>The key.</p>
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
         * <p>None</p>
         * 
         * <strong>example:</strong>
         * <p>SYSTEM</p>
         */
        @NameInMap("type")
        public String type;

        public static DescribeExperimentResponseBodyResultAlgorithms build(java.util.Map<String, ?> map) throws Exception {
            DescribeExperimentResponseBodyResultAlgorithms self = new DescribeExperimentResponseBodyResultAlgorithms();
            return TeaModel.build(map, self);
        }

        public DescribeExperimentResponseBodyResultAlgorithms setCategory(String category) {
            this.category = category;
            return this;
        }
        public String getCategory() {
            return this.category;
        }

        public DescribeExperimentResponseBodyResultAlgorithms setConfig(java.util.List<DescribeExperimentResponseBodyResultAlgorithmsConfig> config) {
            this.config = config;
            return this;
        }
        public java.util.List<DescribeExperimentResponseBodyResultAlgorithmsConfig> getConfig() {
            return this.config;
        }

        public DescribeExperimentResponseBodyResultAlgorithms setDefaultValue(String defaultValue) {
            this.defaultValue = defaultValue;
            return this;
        }
        public String getDefaultValue() {
            return this.defaultValue;
        }

        public DescribeExperimentResponseBodyResultAlgorithms setExperimentValue(String experimentValue) {
            this.experimentValue = experimentValue;
            return this;
        }
        public String getExperimentValue() {
            return this.experimentValue;
        }

        public DescribeExperimentResponseBodyResultAlgorithms setHasConfig(Boolean hasConfig) {
            this.hasConfig = hasConfig;
            return this;
        }
        public Boolean getHasConfig() {
            return this.hasConfig;
        }

        public DescribeExperimentResponseBodyResultAlgorithms setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public DescribeExperimentResponseBodyResultAlgorithms setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeExperimentResponseBodyResultAlgorithms setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class DescribeExperimentResponseBodyResult extends TeaModel {
        /**
         * <p>The parameters about the experiment.</p>
         */
        @NameInMap("algorithms")
        public java.util.List<DescribeExperimentResponseBodyResultAlgorithms> algorithms;

        /**
         * <p>None</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("base")
        public Boolean base;

        @NameInMap("buckets")
        public java.util.List<String> buckets;

        /**
         * <p>The description of the experiment.</p>
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
         * <p>The state of the experiment.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("status")
        public String status;

        public static DescribeExperimentResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            DescribeExperimentResponseBodyResult self = new DescribeExperimentResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public DescribeExperimentResponseBodyResult setAlgorithms(java.util.List<DescribeExperimentResponseBodyResultAlgorithms> algorithms) {
            this.algorithms = algorithms;
            return this;
        }
        public java.util.List<DescribeExperimentResponseBodyResultAlgorithms> getAlgorithms() {
            return this.algorithms;
        }

        public DescribeExperimentResponseBodyResult setBase(Boolean base) {
            this.base = base;
            return this;
        }
        public Boolean getBase() {
            return this.base;
        }

        public DescribeExperimentResponseBodyResult setBuckets(java.util.List<String> buckets) {
            this.buckets = buckets;
            return this;
        }
        public java.util.List<String> getBuckets() {
            return this.buckets;
        }

        public DescribeExperimentResponseBodyResult setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeExperimentResponseBodyResult setExperimentId(String experimentId) {
            this.experimentId = experimentId;
            return this;
        }
        public String getExperimentId() {
            return this.experimentId;
        }

        public DescribeExperimentResponseBodyResult setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeExperimentResponseBodyResult setOfflineTime(String offlineTime) {
            this.offlineTime = offlineTime;
            return this;
        }
        public String getOfflineTime() {
            return this.offlineTime;
        }

        public DescribeExperimentResponseBodyResult setOnlineTime(String onlineTime) {
            this.onlineTime = onlineTime;
            return this;
        }
        public String getOnlineTime() {
            return this.onlineTime;
        }

        public DescribeExperimentResponseBodyResult setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

}
