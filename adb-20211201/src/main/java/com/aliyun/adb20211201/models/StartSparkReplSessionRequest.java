// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class StartSparkReplSessionRequest extends TeaModel {
    /**
     * <p>The configuration parameters that are used to start the Spark session, which are in the JSON format. For more information, see <a href="https://help.aliyun.com/document_detail/471203.html">Spark application configuration parameters</a>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>{ &quot;spark.shuffle.timeout&quot;: &quot;:0s&quot; }</p>
     */
    @NameInMap("Config")
    public String config;

    /**
     * <p>The cluster ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>amv-bp1mfe9qm****</p>
     */
    @NameInMap("DBClusterId")
    public String DBClusterId;

    /**
     * <p>The name of the job resource group.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("ResourceGroupName")
    public String resourceGroupName;

    public static StartSparkReplSessionRequest build(java.util.Map<String, ?> map) throws Exception {
        StartSparkReplSessionRequest self = new StartSparkReplSessionRequest();
        return TeaModel.build(map, self);
    }

    public StartSparkReplSessionRequest setConfig(String config) {
        this.config = config;
        return this;
    }
    public String getConfig() {
        return this.config;
    }

    public StartSparkReplSessionRequest setDBClusterId(String DBClusterId) {
        this.DBClusterId = DBClusterId;
        return this;
    }
    public String getDBClusterId() {
        return this.DBClusterId;
    }

    public StartSparkReplSessionRequest setResourceGroupName(String resourceGroupName) {
        this.resourceGroupName = resourceGroupName;
        return this;
    }
    public String getResourceGroupName() {
        return this.resourceGroupName;
    }

}
