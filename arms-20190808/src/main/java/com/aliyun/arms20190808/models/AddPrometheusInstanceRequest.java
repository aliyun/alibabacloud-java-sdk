// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class AddPrometheusInstanceRequest extends TeaModel {
    /**
     * <p>The name of the Prometheus instance for Remote Write.</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The ID of the region in which the instance resides.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The type of the Prometheus instance. Only Prometheus instances for Remote Write is supported. Set the value to RW.</p>
     */
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
