// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hologram20220601.models;

import com.aliyun.tea.*;

public class CreateWarehouseRequest extends TeaModel {
    /**
     * <p>The region ID.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The configuration information.</p>
     * 
     * <strong>example:</strong>
     * <p>&quot;&quot;</p>
     */
    @NameInMap("config")
    public String config;

    /**
     * <p>The number of vCPUs.</p>
     * 
     * <strong>example:</strong>
     * <p>32</p>
     */
    @NameInMap("cpu")
    public String cpu;

    /**
     * <p>The name of the virtual warehouse.</p>
     * 
     * <strong>example:</strong>
     * <p>warehouse-test</p>
     */
    @NameInMap("warehouseName")
    public String warehouseName;

    public static CreateWarehouseRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateWarehouseRequest self = new CreateWarehouseRequest();
        return TeaModel.build(map, self);
    }

    public CreateWarehouseRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public CreateWarehouseRequest setConfig(String config) {
        this.config = config;
        return this;
    }
    public String getConfig() {
        return this.config;
    }

    public CreateWarehouseRequest setCpu(String cpu) {
        this.cpu = cpu;
        return this;
    }
    public String getCpu() {
        return this.cpu;
    }

    public CreateWarehouseRequest setWarehouseName(String warehouseName) {
        this.warehouseName = warehouseName;
        return this;
    }
    public String getWarehouseName() {
        return this.warehouseName;
    }

}
