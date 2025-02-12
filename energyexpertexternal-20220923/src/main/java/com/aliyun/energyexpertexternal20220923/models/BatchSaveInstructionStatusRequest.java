// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.energyexpertexternal20220923.models;

import com.aliyun.tea.*;

public class BatchSaveInstructionStatusRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <hr>
     */
    @NameInMap("factoryId")
    public String factoryId;

    /**
     * <strong>example:</strong>
     * <p>ib</p>
     */
    @NameInMap("pKey")
    public String pKey;

    @NameInMap("statusList")
    public String statusList;

    public static BatchSaveInstructionStatusRequest build(java.util.Map<String, ?> map) throws Exception {
        BatchSaveInstructionStatusRequest self = new BatchSaveInstructionStatusRequest();
        return TeaModel.build(map, self);
    }

    public BatchSaveInstructionStatusRequest setFactoryId(String factoryId) {
        this.factoryId = factoryId;
        return this;
    }
    public String getFactoryId() {
        return this.factoryId;
    }

    public BatchSaveInstructionStatusRequest setPKey(String pKey) {
        this.pKey = pKey;
        return this;
    }
    public String getPKey() {
        return this.pKey;
    }

    public BatchSaveInstructionStatusRequest setStatusList(String statusList) {
        this.statusList = statusList;
        return this;
    }
    public String getStatusList() {
        return this.statusList;
    }

}
