// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cnip20201201.models;

import com.aliyun.tea.*;

public class DeleteEnvironmentNodeRequest extends TeaModel {
    @NameInMap("envUID")
    public String envUID;

    public static DeleteEnvironmentNodeRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteEnvironmentNodeRequest self = new DeleteEnvironmentNodeRequest();
        return TeaModel.build(map, self);
    }

    public DeleteEnvironmentNodeRequest setEnvUID(String envUID) {
        this.envUID = envUID;
        return this;
    }
    public String getEnvUID() {
        return this.envUID;
    }

}
