// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpserverless20190615.models;

import com.aliyun.tea.*;

public class CreateFunctionDeploymentRequest extends TeaModel {
    @NameInMap("Name")
    public String name;

    @NameInMap("SpaceId")
    public String spaceId;

    public static CreateFunctionDeploymentRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateFunctionDeploymentRequest self = new CreateFunctionDeploymentRequest();
        return TeaModel.build(map, self);
    }

    public CreateFunctionDeploymentRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateFunctionDeploymentRequest setSpaceId(String spaceId) {
        this.spaceId = spaceId;
        return this;
    }
    public String getSpaceId() {
        return this.spaceId;
    }

}
