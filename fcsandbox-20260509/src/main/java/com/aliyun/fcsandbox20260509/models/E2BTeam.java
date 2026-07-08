// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fcsandbox20260509.models;

import com.aliyun.tea.*;

public class E2BTeam extends TeaModel {
    @NameInMap("allowUpdateTeamName")
    public Boolean allowUpdateTeamName;

    @NameInMap("createdTime")
    public String createdTime;

    @NameInMap("description")
    public String description;

    @NameInMap("resourceGroupID")
    public String resourceGroupID;

    @NameInMap("status")
    public String status;

    @NameInMap("teamID")
    public String teamID;

    @NameInMap("teamName")
    public String teamName;

    @NameInMap("userID")
    public String userID;

    public static E2BTeam build(java.util.Map<String, ?> map) throws Exception {
        E2BTeam self = new E2BTeam();
        return TeaModel.build(map, self);
    }

    public E2BTeam setAllowUpdateTeamName(Boolean allowUpdateTeamName) {
        this.allowUpdateTeamName = allowUpdateTeamName;
        return this;
    }
    public Boolean getAllowUpdateTeamName() {
        return this.allowUpdateTeamName;
    }

    public E2BTeam setCreatedTime(String createdTime) {
        this.createdTime = createdTime;
        return this;
    }
    public String getCreatedTime() {
        return this.createdTime;
    }

    public E2BTeam setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public E2BTeam setResourceGroupID(String resourceGroupID) {
        this.resourceGroupID = resourceGroupID;
        return this;
    }
    public String getResourceGroupID() {
        return this.resourceGroupID;
    }

    public E2BTeam setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public E2BTeam setTeamID(String teamID) {
        this.teamID = teamID;
        return this;
    }
    public String getTeamID() {
        return this.teamID;
    }

    public E2BTeam setTeamName(String teamName) {
        this.teamName = teamName;
        return this;
    }
    public String getTeamName() {
        return this.teamName;
    }

    public E2BTeam setUserID(String userID) {
        this.userID = userID;
        return this;
    }
    public String getUserID() {
        return this.userID;
    }

}
