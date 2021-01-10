// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpserverless20190615.models;

import com.aliyun.tea.*;

public class AttachSmsSignRequest extends TeaModel {
    @NameInMap("SpaceId")
    public String spaceId;

    @NameInMap("SignName")
    public String signName;

    public static AttachSmsSignRequest build(java.util.Map<String, ?> map) throws Exception {
        AttachSmsSignRequest self = new AttachSmsSignRequest();
        return TeaModel.build(map, self);
    }

    public AttachSmsSignRequest setSpaceId(String spaceId) {
        this.spaceId = spaceId;
        return this;
    }
    public String getSpaceId() {
        return this.spaceId;
    }

    public AttachSmsSignRequest setSignName(String signName) {
        this.signName = signName;
        return this;
    }
    public String getSignName() {
        return this.signName;
    }

}
