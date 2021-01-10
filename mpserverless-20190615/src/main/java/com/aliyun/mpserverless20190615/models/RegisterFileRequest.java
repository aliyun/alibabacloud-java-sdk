// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpserverless20190615.models;

import com.aliyun.tea.*;

public class RegisterFileRequest extends TeaModel {
    @NameInMap("Id")
    public String id;

    @NameInMap("SpaceId")
    public String spaceId;

    public static RegisterFileRequest build(java.util.Map<String, ?> map) throws Exception {
        RegisterFileRequest self = new RegisterFileRequest();
        return TeaModel.build(map, self);
    }

    public RegisterFileRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public RegisterFileRequest setSpaceId(String spaceId) {
        this.spaceId = spaceId;
        return this;
    }
    public String getSpaceId() {
        return this.spaceId;
    }

}
