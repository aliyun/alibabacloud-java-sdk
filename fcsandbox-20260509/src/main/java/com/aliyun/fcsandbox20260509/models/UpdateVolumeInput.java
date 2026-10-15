// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fcsandbox20260509.models;

import com.aliyun.tea.*;

public class UpdateVolumeInput extends TeaModel {
    /**
     * <p>The target status of the volume.</p>
     */
    @NameInMap("status")
    public String status;

    /**
     * <p>The unique identifier of the team to which the volume belongs.</p>
     * 
     * <strong>example:</strong>
     * <p>70d1c834-0383-58d8-97ac-5336eb91abcd</p>
     */
    @NameInMap("teamID")
    public String teamID;

    public static UpdateVolumeInput build(java.util.Map<String, ?> map) throws Exception {
        UpdateVolumeInput self = new UpdateVolumeInput();
        return TeaModel.build(map, self);
    }

    public UpdateVolumeInput setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public UpdateVolumeInput setTeamID(String teamID) {
        this.teamID = teamID;
        return this;
    }
    public String getTeamID() {
        return this.teamID;
    }

}
