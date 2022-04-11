// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aligeniessp_1_0.models;

import com.aliyun.tea.*;

public class ResultValueValue extends TeaModel {
    // 组织id
    @NameInMap("OrganizationId")
    public String organizationId;

    // 组织id对应的归一id
    @NameInMap("DeviceUnionId")
    public String deviceUnionId;

    public static ResultValueValue build(java.util.Map<String, ?> map) throws Exception {
        ResultValueValue self = new ResultValueValue();
        return TeaModel.build(map, self);
    }

    public ResultValueValue setOrganizationId(String organizationId) {
        this.organizationId = organizationId;
        return this;
    }
    public String getOrganizationId() {
        return this.organizationId;
    }

    public ResultValueValue setDeviceUnionId(String deviceUnionId) {
        this.deviceUnionId = deviceUnionId;
        return this;
    }
    public String getDeviceUnionId() {
        return this.deviceUnionId;
    }

}
