// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.airec20201126.models;

import com.aliyun.tea.*;

public class DescribeDefaultAlgorithmsResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>F60021C4-57AF-5F46-9B3E-FCEF1C7A1459</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>The returned result.</p>
     */
    @NameInMap("result")
    public java.util.List<DescribeDefaultAlgorithmsResponseBodyResult> result;

    public static DescribeDefaultAlgorithmsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDefaultAlgorithmsResponseBody self = new DescribeDefaultAlgorithmsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDefaultAlgorithmsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeDefaultAlgorithmsResponseBody setResult(java.util.List<DescribeDefaultAlgorithmsResponseBodyResult> result) {
        this.result = result;
        return this;
    }
    public java.util.List<DescribeDefaultAlgorithmsResponseBodyResult> getResult() {
        return this.result;
    }

    public static class DescribeDefaultAlgorithmsResponseBodyResultConfig extends TeaModel {
        /**
         * <p>The default value of the algorithm configuration item.</p>
         * 
         * <strong>example:</strong>
         * <p>swing;commoni2i;pcategory;scategory</p>
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
         * <p>The key of the algorithm configuration item.</p>
         * 
         * <strong>example:</strong>
         * <p>I2I-truncedquantity</p>
         */
        @NameInMap("key")
        public String key;

        /**
         * <p>The name of the algorithm configuration item. (Note: If you use the default algorithm, the console obtains the algorithm name from Medusa. If you customize an algorithm for the experiment, the algorithm name is directly returned.)</p>
         */
        @NameInMap("name")
        public String name;

        public static DescribeDefaultAlgorithmsResponseBodyResultConfig build(java.util.Map<String, ?> map) throws Exception {
            DescribeDefaultAlgorithmsResponseBodyResultConfig self = new DescribeDefaultAlgorithmsResponseBodyResultConfig();
            return TeaModel.build(map, self);
        }

        public DescribeDefaultAlgorithmsResponseBodyResultConfig setDefaultValue(String defaultValue) {
            this.defaultValue = defaultValue;
            return this;
        }
        public String getDefaultValue() {
            return this.defaultValue;
        }

        public DescribeDefaultAlgorithmsResponseBodyResultConfig setExperimentValue(String experimentValue) {
            this.experimentValue = experimentValue;
            return this;
        }
        public String getExperimentValue() {
            return this.experimentValue;
        }

        public DescribeDefaultAlgorithmsResponseBodyResultConfig setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public DescribeDefaultAlgorithmsResponseBodyResultConfig setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class DescribeDefaultAlgorithmsResponseBodyResult extends TeaModel {
        /**
         * <p>The algorithm category. Valid values: RECALL and RANK.</p>
         * 
         * <strong>example:</strong>
         * <p>RECALL</p>
         */
        @NameInMap("category")
        public String category;

        /**
         * <p>The information about the child configuration item.</p>
         */
        @NameInMap("config")
        public java.util.List<DescribeDefaultAlgorithmsResponseBodyResultConfig> config;

        /**
         * <p>The default value of the algorithm. If you set key to i2i, hot, or new, the value of this parameter is true or false. If you set key to mtorder, the value of this parameter is a list of filtering algorithms ranked by priority.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("defaultValue")
        public String defaultValue;

        /**
         * <p>The custom value of the algorithm.</p>
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
         * <p>The algorithm key. Valid values: i2i: the I2I filtering algorithm. u2x2i: the U2X2I filtering algorithm. hot: the filtering algorithm for popular items. new: the filtering algorithm for new items. embedding: the vector filtering algorithm. mtorder: the priority of the filtering algorithm. rankservice: the ranking service.</p>
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

        public static DescribeDefaultAlgorithmsResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            DescribeDefaultAlgorithmsResponseBodyResult self = new DescribeDefaultAlgorithmsResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public DescribeDefaultAlgorithmsResponseBodyResult setCategory(String category) {
            this.category = category;
            return this;
        }
        public String getCategory() {
            return this.category;
        }

        public DescribeDefaultAlgorithmsResponseBodyResult setConfig(java.util.List<DescribeDefaultAlgorithmsResponseBodyResultConfig> config) {
            this.config = config;
            return this;
        }
        public java.util.List<DescribeDefaultAlgorithmsResponseBodyResultConfig> getConfig() {
            return this.config;
        }

        public DescribeDefaultAlgorithmsResponseBodyResult setDefaultValue(String defaultValue) {
            this.defaultValue = defaultValue;
            return this;
        }
        public String getDefaultValue() {
            return this.defaultValue;
        }

        public DescribeDefaultAlgorithmsResponseBodyResult setExperimentValue(String experimentValue) {
            this.experimentValue = experimentValue;
            return this;
        }
        public String getExperimentValue() {
            return this.experimentValue;
        }

        public DescribeDefaultAlgorithmsResponseBodyResult setHasConfig(Boolean hasConfig) {
            this.hasConfig = hasConfig;
            return this;
        }
        public Boolean getHasConfig() {
            return this.hasConfig;
        }

        public DescribeDefaultAlgorithmsResponseBodyResult setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public DescribeDefaultAlgorithmsResponseBodyResult setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeDefaultAlgorithmsResponseBodyResult setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

}
