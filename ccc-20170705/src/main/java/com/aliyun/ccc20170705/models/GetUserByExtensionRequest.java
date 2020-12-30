// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20170705.models;

import com.aliyun.tea.*;

public class GetUserByExtensionRequest extends TeaModel {
    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("Extension")
    public String extension;

    public static GetUserByExtensionRequest build(java.util.Map<String, ?> map) throws Exception {
        GetUserByExtensionRequest self = new GetUserByExtensionRequest();
        return TeaModel.build(map, self);
    }

    public GetUserByExtensionRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public GetUserByExtensionRequest setExtension(String extension) {
        this.extension = extension;
        return this;
    }
    public String getExtension() {
        return this.extension;
    }

}
