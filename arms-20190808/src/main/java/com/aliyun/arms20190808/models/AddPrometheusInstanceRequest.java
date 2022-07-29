// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class AddPrometheusInstanceRequest extends TeaModel {
    @NameInMap("Name")
    public String name;

    @NameInMap("RegionId")
    public String regionId;

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
