// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fcsandbox20260509.models;

import com.aliyun.tea.*;

public class CreateTeamRequest extends TeaModel {
    @NameInMap("body")
    public CreateTeamInput body;

    public static CreateTeamRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateTeamRequest self = new CreateTeamRequest();
        return TeaModel.build(map, self);
    }

    public CreateTeamRequest setBody(CreateTeamInput body) {
        this.body = body;
        return this;
    }
    public CreateTeamInput getBody() {
        return this.body;
    }

}
