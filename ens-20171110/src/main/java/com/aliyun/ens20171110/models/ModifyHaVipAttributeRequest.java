// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class ModifyHaVipAttributeRequest extends TeaModel {
    /**
     * <p>The ID of the HAVIP that you want to modify.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>havip-52y28****</p>
     */
    @NameInMap("HaVipId")
    public String haVipId;

    /**
     * <p>The name of the HAVIP. The name must be 1 to 128 characters in length and cannot start with http:// or https://.</p>
     * 
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
