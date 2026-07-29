// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hologram20220601.models;

import com.aliyun.tea.*;

public class ScaleHoloWarehouseRequest extends TeaModel {
    /**
     * <p>The number of clusters.</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("clusterCount")
    public Long clusterCount;

    /**
     * <p>The number of vCPUs for the virtual warehouse. The value must be a multiple of 16.</p>
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

    public ScaleHoloWarehouseRequest setClusterCount(Long clusterCount) {
        this.clusterCount = clusterCount;
        return this;
    }
    public Long getClusterCount() {
        return this.clusterCount;
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
