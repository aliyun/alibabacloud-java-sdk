// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class ModifyEssdCacheConfigRequest extends TeaModel {
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
     * <p>Specifies whether to enable the disk cache feature.</p>
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
    @NameInMap("EnableEssdCache")
    public Boolean enableEssdCache;

    /**
     * <p>The disk cache size. Unit: GB.</p>
     * 
     * <strong>example:</strong>
     * <p>500</p>
     */
    @NameInMap("EssdCacheSize")
    public Integer essdCacheSize;

    public static ModifyEssdCacheConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyEssdCacheConfigRequest self = new ModifyEssdCacheConfigRequest();
        return TeaModel.build(map, self);
    }

    public ModifyEssdCacheConfigRequest setDBClusterId(String DBClusterId) {
        this.DBClusterId = DBClusterId;
        return this;
    }
    public String getDBClusterId() {
        return this.DBClusterId;
    }

    public ModifyEssdCacheConfigRequest setEnableEssdCache(Boolean enableEssdCache) {
        this.enableEssdCache = enableEssdCache;
        return this;
    }
    public Boolean getEnableEssdCache() {
        return this.enableEssdCache;
    }

    public ModifyEssdCacheConfigRequest setEssdCacheSize(Integer essdCacheSize) {
        this.essdCacheSize = essdCacheSize;
        return this;
    }
    public Integer getEssdCacheSize() {
        return this.essdCacheSize;
    }

}
