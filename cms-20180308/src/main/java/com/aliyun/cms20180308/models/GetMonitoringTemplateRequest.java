// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20180308.models;

import com.aliyun.tea.*;

public class GetMonitoringTemplateRequest extends TeaModel {
    @NameInMap("Id")
    public String id;

    @NameInMap("Name")
    public String name;

    @NameInMap("RegionId")
    public String regionId;

    public static GetMonitoringTemplateRequest build(java.util.Map<String, ?> map) throws Exception {
        GetMonitoringTemplateRequest self = new GetMonitoringTemplateRequest();
        return TeaModel.build(map, self);
    }

    public GetMonitoringTemplateRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public GetMonitoringTemplateRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public GetMonitoringTemplateRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
