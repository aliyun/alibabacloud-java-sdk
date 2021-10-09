// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mindlive20210301.models;

import com.aliyun.tea.*;

public class RequestUserConfigRequest extends TeaModel {
    @NameInMap("Key")
    public String key;

    public static RequestUserConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        RequestUserConfigRequest self = new RequestUserConfigRequest();
        return TeaModel.build(map, self);
    }

    public RequestUserConfigRequest setKey(String key) {
        this.key = key;
        return this;
    }
    public String getKey() {
        return this.key;
    }

}
