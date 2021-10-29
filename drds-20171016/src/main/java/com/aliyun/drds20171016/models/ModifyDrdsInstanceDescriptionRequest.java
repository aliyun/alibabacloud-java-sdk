// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.drds20171016.models;

import com.aliyun.tea.*;

public class ModifyDrdsInstanceDescriptionRequest extends TeaModel {
    @NameInMap("Description")
    public String description;

    @NameInMap("DrdsInstanceId")
    public String drdsInstanceId;

    public static ModifyDrdsInstanceDescriptionRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyDrdsInstanceDescriptionRequest self = new ModifyDrdsInstanceDescriptionRequest();
        return TeaModel.build(map, self);
    }

    public ModifyDrdsInstanceDescriptionRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public ModifyDrdsInstanceDescriptionRequest setDrdsInstanceId(String drdsInstanceId) {
        this.drdsInstanceId = drdsInstanceId;
        return this;
    }
    public String getDrdsInstanceId() {
        return this.drdsInstanceId;
    }

}
