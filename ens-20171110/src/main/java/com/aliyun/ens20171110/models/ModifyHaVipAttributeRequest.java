// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class ModifyHaVipAttributeRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>havip-52y28****</p>
     */
    @NameInMap("HaVipId")
    public String haVipId;

    /**
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("Name")
    public String name;

    public static ModifyHaVipAttributeRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyHaVipAttributeRequest self = new ModifyHaVipAttributeRequest();
        return TeaModel.build(map, self);
    }

    public ModifyHaVipAttributeRequest setHaVipId(String haVipId) {
        this.haVipId = haVipId;
        return this;
    }
    public String getHaVipId() {
        return this.haVipId;
    }

    public ModifyHaVipAttributeRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

}
