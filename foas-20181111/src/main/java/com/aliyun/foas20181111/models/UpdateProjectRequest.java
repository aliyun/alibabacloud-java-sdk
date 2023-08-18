// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.foas20181111.models;

import com.aliyun.tea.*;

public class UpdateProjectRequest extends TeaModel {
    @NameInMap("globalJobConfig")
    public String globalJobConfig;

    public static UpdateProjectRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateProjectRequest self = new UpdateProjectRequest();
        return TeaModel.build(map, self);
    }

    public UpdateProjectRequest setGlobalJobConfig(String globalJobConfig) {
        this.globalJobConfig = globalJobConfig;
        return this;
    }
    public String getGlobalJobConfig() {
        return this.globalJobConfig;
    }

}
