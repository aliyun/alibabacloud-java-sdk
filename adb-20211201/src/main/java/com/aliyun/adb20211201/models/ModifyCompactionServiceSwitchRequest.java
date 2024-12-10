// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class ModifyCompactionServiceSwitchRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>amv-bp14t95lun0w****</p>
     */
    @NameInMap("DBClusterId")
    public String DBClusterId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("EnableCompactionService")
    public Boolean enableCompactionService;

    public static ModifyCompactionServiceSwitchRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyCompactionServiceSwitchRequest self = new ModifyCompactionServiceSwitchRequest();
        return TeaModel.build(map, self);
    }

    public ModifyCompactionServiceSwitchRequest setDBClusterId(String DBClusterId) {
        this.DBClusterId = DBClusterId;
        return this;
    }
    public String getDBClusterId() {
        return this.DBClusterId;
    }

    public ModifyCompactionServiceSwitchRequest setEnableCompactionService(Boolean enableCompactionService) {
        this.enableCompactionService = enableCompactionService;
        return this;
    }
    public Boolean getEnableCompactionService() {
        return this.enableCompactionService;
    }

}
