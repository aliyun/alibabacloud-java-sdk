// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fcsandbox20260509.models;

import com.aliyun.tea.*;

public class ListVolumesRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>5</p>
     */
    @NameInMap("maxResults")
    public Integer maxResults;

    /**
     * <strong>example:</strong>
     * <p>qxGrXje86XMrYQ51aJMy</p>
     */
    @NameInMap("nextToken")
    public String nextToken;

    /**
     * <strong>example:</strong>
     * <p>rg-acfmwxqyrgwabcd</p>
     */
    @NameInMap("resourceGroupID")
    public String resourceGroupID;

    /**
     * <strong>example:</strong>
     * <p>CREATING</p>
     */
    @NameInMap("status")
    public String status;

    /**
     * <strong>example:</strong>
     * <p>70d1c834-0383-58d8-97ac-5336eb91abcd</p>
     */
    @NameInMap("teamID")
    public String teamID;

    /**
     * <strong>example:</strong>
     * <p>210000000</p>
     */
    @NameInMap("userID")
    public String userID;

    /**
     * <strong>example:</strong>
     * <p>workspace</p>
     */
    @NameInMap("volumeName")
    public String volumeName;

    public static ListVolumesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListVolumesRequest self = new ListVolumesRequest();
        return TeaModel.build(map, self);
    }

    public ListVolumesRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListVolumesRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListVolumesRequest setResourceGroupID(String resourceGroupID) {
        this.resourceGroupID = resourceGroupID;
        return this;
    }
    public String getResourceGroupID() {
        return this.resourceGroupID;
    }

    public ListVolumesRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public ListVolumesRequest setTeamID(String teamID) {
        this.teamID = teamID;
        return this;
    }
    public String getTeamID() {
        return this.teamID;
    }

    public ListVolumesRequest setUserID(String userID) {
        this.userID = userID;
        return this;
    }
    public String getUserID() {
        return this.userID;
    }

    public ListVolumesRequest setVolumeName(String volumeName) {
        this.volumeName = volumeName;
        return this;
    }
    public String getVolumeName() {
        return this.volumeName;
    }

}
