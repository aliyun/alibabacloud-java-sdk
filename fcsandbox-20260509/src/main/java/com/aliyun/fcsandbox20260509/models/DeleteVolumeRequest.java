// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fcsandbox20260509.models;

import com.aliyun.tea.*;

public class DeleteVolumeRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>70d1c834-0383-58d8-97ac-5336eb91abcd</p>
     */
    @NameInMap("teamID")
    public String teamID;

    public static DeleteVolumeRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteVolumeRequest self = new DeleteVolumeRequest();
        return TeaModel.build(map, self);
    }

    public DeleteVolumeRequest setTeamID(String teamID) {
        this.teamID = teamID;
        return this;
    }
    public String getTeamID() {
        return this.teamID;
    }

}
