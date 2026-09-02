// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fcsandbox20260509.models;

import com.aliyun.tea.*;

public class GetVolumeRequest extends TeaModel {
    /**
     * <p>The unique identifier of the team.</p>
     * 
     * <strong>example:</strong>
     * <p>70d1c834-0383-58d8-97ac-5336eb91abcd</p>
     */
    @NameInMap("teamID")
    public String teamID;

    public static GetVolumeRequest build(java.util.Map<String, ?> map) throws Exception {
        GetVolumeRequest self = new GetVolumeRequest();
        return TeaModel.build(map, self);
    }

    public GetVolumeRequest setTeamID(String teamID) {
        this.teamID = teamID;
        return this;
    }
    public String getTeamID() {
        return this.teamID;
    }

}
