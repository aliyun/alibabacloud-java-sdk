// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class ModifyClickhouseEngineRequest extends TeaModel {
    /**
     * <p>The disk cache size of the wide table engine. Unit: GB. Default value: 100. Valid values: 100 to 1000.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("CacheSize")
    public Integer cacheSize;

    /**
     * <p>The cluster ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>amv-bp11q28kvl688****</p>
     */
    @NameInMap("DBClusterId")
    public String DBClusterId;

    /**
     * <p>Specifies whether to enable the wide table engine feature. Valid values:</p>
     * <ul>
     * <li><p>true</p>
     * </li>
     * <li><p>false</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Enabled")
    public Boolean enabled;

    @NameInMap("OwnerId")
    public String ownerId;

    public static ModifyClickhouseEngineRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyClickhouseEngineRequest self = new ModifyClickhouseEngineRequest();
        return TeaModel.build(map, self);
    }

    public ModifyClickhouseEngineRequest setCacheSize(Integer cacheSize) {
        this.cacheSize = cacheSize;
        return this;
    }
    public Integer getCacheSize() {
        return this.cacheSize;
    }

    public ModifyClickhouseEngineRequest setDBClusterId(String DBClusterId) {
        this.DBClusterId = DBClusterId;
        return this;
    }
    public String getDBClusterId() {
        return this.DBClusterId;
    }

    public ModifyClickhouseEngineRequest setEnabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }
    public Boolean getEnabled() {
        return this.enabled;
    }

    public ModifyClickhouseEngineRequest setOwnerId(String ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public String getOwnerId() {
        return this.ownerId;
    }

}
