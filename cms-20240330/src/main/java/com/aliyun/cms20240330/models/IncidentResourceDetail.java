// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class IncidentResourceDetail extends TeaModel {
    @NameInMap("extraId")
    public String extraId;

    @NameInMap("resourceId")
    public java.util.Map<String, ?> resourceId;

    @NameInMap("type")
    public String type;

    public static IncidentResourceDetail build(java.util.Map<String, ?> map) throws Exception {
        IncidentResourceDetail self = new IncidentResourceDetail();
        return TeaModel.build(map, self);
    }

    public IncidentResourceDetail setExtraId(String extraId) {
        this.extraId = extraId;
        return this;
    }
    public String getExtraId() {
        return this.extraId;
    }

    public IncidentResourceDetail setResourceId(java.util.Map<String, ?> resourceId) {
        this.resourceId = resourceId;
        return this;
    }
    public java.util.Map<String, ?> getResourceId() {
        return this.resourceId;
    }

    public IncidentResourceDetail setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
