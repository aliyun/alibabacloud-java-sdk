// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iovcc20180501.models;

import com.aliyun.tea.*;

public class ListShadowSchemaDeviceModelsRequest extends TeaModel {
    @NameInMap("ProjectId")
    public String projectId;

    public static ListShadowSchemaDeviceModelsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListShadowSchemaDeviceModelsRequest self = new ListShadowSchemaDeviceModelsRequest();
        return TeaModel.build(map, self);
    }

    public ListShadowSchemaDeviceModelsRequest setProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }
    public String getProjectId() {
        return this.projectId;
    }

}
