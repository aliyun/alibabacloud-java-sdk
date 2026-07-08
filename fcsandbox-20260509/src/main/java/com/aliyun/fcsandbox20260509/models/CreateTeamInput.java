// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fcsandbox20260509.models;

import com.aliyun.tea.*;

public class CreateTeamInput extends TeaModel {
    @NameInMap("description")
    public String description;

    @NameInMap("resourceGroupID")
    public String resourceGroupID;

    @NameInMap("teamName")
    public String teamName;

    public static CreateTeamInput build(java.util.Map<String, ?> map) throws Exception {
        CreateTeamInput self = new CreateTeamInput();
        return TeaModel.build(map, self);
    }

    public CreateTeamInput setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateTeamInput setResourceGroupID(String resourceGroupID) {
        this.resourceGroupID = resourceGroupID;
        return this;
    }
    public String getResourceGroupID() {
        return this.resourceGroupID;
    }

    public CreateTeamInput setTeamName(String teamName) {
        this.teamName = teamName;
        return this;
    }
    public String getTeamName() {
        return this.teamName;
    }

}
