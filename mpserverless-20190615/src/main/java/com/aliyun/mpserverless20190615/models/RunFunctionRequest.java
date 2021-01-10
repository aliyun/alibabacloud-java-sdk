// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpserverless20190615.models;

import com.aliyun.tea.*;

public class RunFunctionRequest extends TeaModel {
    @NameInMap("SpaceId")
    public String spaceId;

    @NameInMap("Body")
    public String body;

    public static RunFunctionRequest build(java.util.Map<String, ?> map) throws Exception {
        RunFunctionRequest self = new RunFunctionRequest();
        return TeaModel.build(map, self);
    }

    public RunFunctionRequest setSpaceId(String spaceId) {
        this.spaceId = spaceId;
        return this;
    }
    public String getSpaceId() {
        return this.spaceId;
    }

    public RunFunctionRequest setBody(String body) {
        this.body = body;
        return this;
    }
    public String getBody() {
        return this.body;
    }

}
