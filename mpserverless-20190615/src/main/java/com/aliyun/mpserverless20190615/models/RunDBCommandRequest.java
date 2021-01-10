// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpserverless20190615.models;

import com.aliyun.tea.*;

public class RunDBCommandRequest extends TeaModel {
    @NameInMap("SpaceId")
    public String spaceId;

    @NameInMap("Body")
    public String body;

    public static RunDBCommandRequest build(java.util.Map<String, ?> map) throws Exception {
        RunDBCommandRequest self = new RunDBCommandRequest();
        return TeaModel.build(map, self);
    }

    public RunDBCommandRequest setSpaceId(String spaceId) {
        this.spaceId = spaceId;
        return this;
    }
    public String getSpaceId() {
        return this.spaceId;
    }

    public RunDBCommandRequest setBody(String body) {
        this.body = body;
        return this;
    }
    public String getBody() {
        return this.body;
    }

}
