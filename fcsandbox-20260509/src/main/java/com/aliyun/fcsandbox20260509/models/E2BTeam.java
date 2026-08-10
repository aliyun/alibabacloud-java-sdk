// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fcsandbox20260509.models;

import com.aliyun.tea.*;

public class E2BTeam extends TeaModel {
    /**
     * <p>Indicates whether the team name can be modified.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("allowUpdateTeamName")
    public Boolean allowUpdateTeamName;

    /**
     * <p>The time when the team was created.</p>
     * 
     * <strong>example:</strong>
     * <p>2025-05-23T11:26:25Z</p>
     */
    @NameInMap("createdTime")
    public String createdTime;

    /**
     * <p>The description.</p>
     * 
     * <strong>example:</strong>
     * <p>Open team</p>
     */
    @NameInMap("description")
    public String description;

    @NameInMap("plan")
    public String plan;

    /**
     * <p>The resource group ID.</p>
     * 
     * <strong>example:</strong>
     * <p>rg-acfmwxqyrgwabcd</p>
     */
    @NameInMap("resourceGroupID")
    public String resourceGroupID;

    /**
     * <p>The status of the team.</p>
     * 
     * <strong>example:</strong>
     * <p>active</p>
     */
    @NameInMap("status")
    public String status;

    /**
     * <p>The unique identifier of the team.</p>
     * 
     * <strong>example:</strong>
     * <p>70d1c834-0383-58d8-97ac-5336eb91abcd</p>
     */
    @NameInMap("teamID")
    public String teamID;

    /**
     * <p>The name of the team.</p>
     * 
     * <strong>example:</strong>
     * <p>dev</p>
     */
    @NameInMap("teamName")
    public String teamName;

    /**
     * <p>The UID of the creator.</p>
     * 
     * <strong>example:</strong>
     * <p>12345</p>
     */
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

    public E2BTeam setPlan(String plan) {
        this.plan = plan;
        return this;
    }
    public String getPlan() {
        return this.plan;
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
