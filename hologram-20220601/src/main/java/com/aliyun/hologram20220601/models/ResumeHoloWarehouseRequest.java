// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hologram20220601.models;

import com.aliyun.tea.*;

public class ResumeHoloWarehouseRequest extends TeaModel {
    /**
     * <p>The name of the virtual warehouse.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>my_warehouse</p>
     */
    @NameInMap("name")
    public String name;

    public static ResumeHoloWarehouseRequest build(java.util.Map<String, ?> map) throws Exception {
        ResumeHoloWarehouseRequest self = new ResumeHoloWarehouseRequest();
        return TeaModel.build(map, self);
    }

    public ResumeHoloWarehouseRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

}
