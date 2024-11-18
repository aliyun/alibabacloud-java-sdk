// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hologram20220601.models;

import com.aliyun.tea.*;

public class ScaleHoloWarehouseRequest extends TeaModel {
    /**
     * <p>The specifications of the virtual warehouse. The number of vCPUs must be an integer multiple of 16.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>64</p>
     */
    @NameInMap("cpu")
    public Long cpu;

    /**
     * <p>The name of the virtual warehouse.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>my_warehouse</p>
     */
    @NameInMap("name")
    public String name;

    public static ScaleHoloWarehouseRequest build(java.util.Map<String, ?> map) throws Exception {
        ScaleHoloWarehouseRequest self = new ScaleHoloWarehouseRequest();
        return TeaModel.build(map, self);
    }

    public ScaleHoloWarehouseRequest setCpu(Long cpu) {
        this.cpu = cpu;
        return this;
    }
    public Long getCpu() {
        return this.cpu;
    }

    public ScaleHoloWarehouseRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

}
