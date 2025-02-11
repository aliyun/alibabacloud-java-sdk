// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class ModifyLakeCacheSizeRequest extends TeaModel {
    /**
     * <p>The lake cache size that you want to set. Unit: GB.</p>
     * 
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("Capacity")
    public Long capacity;

    /**
     * <p>The cluster ID.</p>
     * <blockquote>
     * <p> You can call the <a href="https://help.aliyun.com/document_detail/129857.html">DescribeDBClusters</a> operation to query the IDs of all AnalyticDB for MySQL clusters within a region.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>amv-bp10yt0gva71ei7d</p>
     */
    @NameInMap("DBClusterId")
    public String DBClusterId;

    /**
     * <p>Specifies whether to enable the lake cache feature.</p>
     * <p>Valid values:</p>
     * <ul>
     * <li>true</li>
     * <li>false</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("EnableLakeCache")
    public Boolean enableLakeCache;

    public static ModifyLakeCacheSizeRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyLakeCacheSizeRequest self = new ModifyLakeCacheSizeRequest();
        return TeaModel.build(map, self);
    }

    public ModifyLakeCacheSizeRequest setCapacity(Long capacity) {
        this.capacity = capacity;
        return this;
    }
    public Long getCapacity() {
        return this.capacity;
    }

    public ModifyLakeCacheSizeRequest setDBClusterId(String DBClusterId) {
        this.DBClusterId = DBClusterId;
        return this;
    }
    public String getDBClusterId() {
        return this.DBClusterId;
    }

    public ModifyLakeCacheSizeRequest setEnableLakeCache(Boolean enableLakeCache) {
        this.enableLakeCache = enableLakeCache;
        return this;
    }
    public Boolean getEnableLakeCache() {
        return this.enableLakeCache;
    }

}
