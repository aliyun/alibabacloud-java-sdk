// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpserverless20190615.models;

import com.aliyun.tea.*;

public class UpdateSpaceRequest extends TeaModel {
    @NameInMap("SpaceId")
    public String spaceId;

    @NameInMap("Desc")
    public String desc;

    @NameInMap("Status")
    public String status;

    public static UpdateSpaceRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateSpaceRequest self = new UpdateSpaceRequest();
        return TeaModel.build(map, self);
    }

    public UpdateSpaceRequest setSpaceId(String spaceId) {
        this.spaceId = spaceId;
        return this;
    }
    public String getSpaceId() {
        return this.spaceId;
    }

    public UpdateSpaceRequest setDesc(String desc) {
        this.desc = desc;
        return this;
    }
    public String getDesc() {
        return this.desc;
    }

    public UpdateSpaceRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

}
