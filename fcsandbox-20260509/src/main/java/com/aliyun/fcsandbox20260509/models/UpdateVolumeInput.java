// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fcsandbox20260509.models;

import com.aliyun.tea.*;

public class UpdateVolumeInput extends TeaModel {
    @NameInMap("status")
    public String status;

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
