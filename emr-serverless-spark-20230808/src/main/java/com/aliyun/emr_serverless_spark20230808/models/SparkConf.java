// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr_serverless_spark20230808.models;

import com.aliyun.tea.*;

public class SparkConf extends TeaModel {
    /**
     * <p>The key of the SparkConf object.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>spark.app.name</p>
     */
    @NameInMap("key")
    public String key;

    /**
     * <p>The value of the SparkConf object.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>test_application</p>
     */
    @NameInMap("value")
    public String value;

    public static SparkConf build(java.util.Map<String, ?> map) throws Exception {
        SparkConf self = new SparkConf();
        return TeaModel.build(map, self);
    }

    public SparkConf setKey(String key) {
        this.key = key;
        return this;
    }
    public String getKey() {
        return this.key;
    }

    public SparkConf setValue(String value) {
        this.value = value;
        return this;
    }
    public String getValue() {
        return this.value;
    }

}
