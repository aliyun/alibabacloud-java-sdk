// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fcsandbox20260509.models;

import com.aliyun.tea.*;

public class DeleteTemplateCacheRequest extends TeaModel {
    /**
     * <p>The team ID.</p>
     * 
     * <strong>example:</strong>
     * <p>team-a1b2c3d4e5f6</p>
     */
    @NameInMap("teamID")
    public String teamID;

    public static DeleteTemplateCacheRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteTemplateCacheRequest self = new DeleteTemplateCacheRequest();
        return TeaModel.build(map, self);
    }

    public DeleteTemplateCacheRequest setTeamID(String teamID) {
        this.teamID = teamID;
        return this;
    }
    public String getTeamID() {
        return this.teamID;
    }

}
