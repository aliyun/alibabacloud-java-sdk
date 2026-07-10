// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fcsandbox20260509.models;

import com.aliyun.tea.*;

public class UpdateTeamRequest extends TeaModel {
    @NameInMap("body")
    public UpdateTeamInput body;

    public static UpdateTeamRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateTeamRequest self = new UpdateTeamRequest();
        return TeaModel.build(map, self);
    }

    public UpdateTeamRequest setBody(UpdateTeamInput body) {
        this.body = body;
        return this;
    }
    public UpdateTeamInput getBody() {
        return this.body;
    }

}
