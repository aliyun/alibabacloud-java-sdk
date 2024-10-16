// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iqs20240712.models;

import com.aliyun.tea.*;

public class CommonQueryBySceneRequest extends TeaModel {
    @NameInMap("body")
    public CommonAgentQuery body;

    public static CommonQueryBySceneRequest build(java.util.Map<String, ?> map) throws Exception {
        CommonQueryBySceneRequest self = new CommonQueryBySceneRequest();
        return TeaModel.build(map, self);
    }

    public CommonQueryBySceneRequest setBody(CommonAgentQuery body) {
        this.body = body;
        return this;
    }
    public CommonAgentQuery getBody() {
        return this.body;
    }

}
