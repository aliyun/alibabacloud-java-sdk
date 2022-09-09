// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iacservice20210806.models;

import com.aliyun.tea.*;

public class UpdateProjectRequest extends TeaModel {
    @NameInMap("clientToken")
    public String clientToken;

    @NameInMap("description")
    public String description;

    @NameInMap("name")
    public String name;

    public static UpdateProjectRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateProjectRequest self = new UpdateProjectRequest();
        return TeaModel.build(map, self);
    }

    public UpdateProjectRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public UpdateProjectRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public UpdateProjectRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

}
