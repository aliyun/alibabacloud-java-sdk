// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.drds20190123.models;

import com.aliyun.tea.*;

public class ModifyDrdsInstanceDescriptionRequest extends TeaModel {
    @NameInMap("DrdsInstanceId")
    public String drdsInstanceId;

    @NameInMap("Description")
    public String description;

    public static ModifyDrdsInstanceDescriptionRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyDrdsInstanceDescriptionRequest self = new ModifyDrdsInstanceDescriptionRequest();
        return TeaModel.build(map, self);
    }

    public ModifyDrdsInstanceDescriptionRequest setDrdsInstanceId(String drdsInstanceId) {
        this.drdsInstanceId = drdsInstanceId;
        return this;
    }
    public String getDrdsInstanceId() {
        return this.drdsInstanceId;
    }

    public ModifyDrdsInstanceDescriptionRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

}
