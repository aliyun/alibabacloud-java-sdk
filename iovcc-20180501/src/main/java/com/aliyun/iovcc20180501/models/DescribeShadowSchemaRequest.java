// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iovcc20180501.models;

import com.aliyun.tea.*;

public class DescribeShadowSchemaRequest extends TeaModel {
    @NameInMap("DeviceModel")
    public String deviceModel;

    @NameInMap("IsSimple")
    public Boolean isSimple;

    @NameInMap("ProjectId")
    public String projectId;

    public static DescribeShadowSchemaRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeShadowSchemaRequest self = new DescribeShadowSchemaRequest();
        return TeaModel.build(map, self);
    }

    public DescribeShadowSchemaRequest setDeviceModel(String deviceModel) {
        this.deviceModel = deviceModel;
        return this;
    }
    public String getDeviceModel() {
        return this.deviceModel;
    }

    public DescribeShadowSchemaRequest setIsSimple(Boolean isSimple) {
        this.isSimple = isSimple;
        return this;
    }
    public Boolean getIsSimple() {
        return this.isSimple;
    }

    public DescribeShadowSchemaRequest setProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }
    public String getProjectId() {
        return this.projectId;
    }

}
