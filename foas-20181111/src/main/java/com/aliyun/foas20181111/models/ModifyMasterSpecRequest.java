// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.foas20181111.models;

import com.aliyun.tea.*;

public class ModifyMasterSpecRequest extends TeaModel {
    @NameInMap("masterTargetModel")
    public String masterTargetModel;

    public static ModifyMasterSpecRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyMasterSpecRequest self = new ModifyMasterSpecRequest();
        return TeaModel.build(map, self);
    }

    public ModifyMasterSpecRequest setMasterTargetModel(String masterTargetModel) {
        this.masterTargetModel = masterTargetModel;
        return this;
    }
    public String getMasterTargetModel() {
        return this.masterTargetModel;
    }

}
