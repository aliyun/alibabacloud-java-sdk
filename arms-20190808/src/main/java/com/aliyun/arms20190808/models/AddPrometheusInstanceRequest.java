// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class AddPrometheusInstanceRequest extends TeaModel {
    // The name of the Prometheus instance for Remote Write.
    @NameInMap("Name")
    public String name;

    // The ID of the region.
    @NameInMap("RegionId")
    public String regionId;

    // The type of the Prometheus instance. Only the Prometheus for Remote Write type is supported. Set the value to RW.
    @NameInMap("Type")
    public String type;

    public static AddPrometheusInstanceRequest build(java.util.Map<String, ?> map) throws Exception {
        AddPrometheusInstanceRequest self = new AddPrometheusInstanceRequest();
        return TeaModel.build(map, self);
    }

    public AddPrometheusInstanceRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public AddPrometheusInstanceRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public AddPrometheusInstanceRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
