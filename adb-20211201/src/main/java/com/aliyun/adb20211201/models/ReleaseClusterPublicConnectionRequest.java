// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class ReleaseClusterPublicConnectionRequest extends TeaModel {
    /**
     * <p>&lt;props=&quot;china&quot;&gt;The cluster ID of the Enterprise Edition, Basic Edition, or Data Lakehouse Edition.
     * &lt;props=&quot;intl&quot;&gt;The cluster ID of the Data Lakehouse Edition.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>amv-bp11q28kvl688****</p>
     */
    @NameInMap("DBClusterId")
    public String DBClusterId;

    /**
     * <p>The database engine. Valid values:</p>
     * <ul>
     * <li><strong>AnalyticDB</strong> (default): the AnalyticDB for MySQL engine.</li>
     * <li><strong>Clickhouse</strong>: the wide-table engine.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Clickhouse</p>
     */
    @NameInMap("Engine")
    public String engine;

    /**
     * <p>The name of the resource group.</p>
     * 
     * <strong>example:</strong>
     * <p>test_group</p>
     */
    @NameInMap("ResourceGroupName")
    public String resourceGroupName;

    public static ReleaseClusterPublicConnectionRequest build(java.util.Map<String, ?> map) throws Exception {
        ReleaseClusterPublicConnectionRequest self = new ReleaseClusterPublicConnectionRequest();
        return TeaModel.build(map, self);
    }

    public ReleaseClusterPublicConnectionRequest setDBClusterId(String DBClusterId) {
        this.DBClusterId = DBClusterId;
        return this;
    }
    public String getDBClusterId() {
        return this.DBClusterId;
    }

    public ReleaseClusterPublicConnectionRequest setEngine(String engine) {
        this.engine = engine;
        return this;
    }
    public String getEngine() {
        return this.engine;
    }

    public ReleaseClusterPublicConnectionRequest setResourceGroupName(String resourceGroupName) {
        this.resourceGroupName = resourceGroupName;
        return this;
    }
    public String getResourceGroupName() {
        return this.resourceGroupName;
    }

}
