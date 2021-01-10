// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpserverless20190615.models;

import com.aliyun.tea.*;

public class DeleteSmsSignRequest extends TeaModel {
    @NameInMap("SpaceId")
    public String spaceId;

    @NameInMap("SignId")
    public String signId;

    public static DeleteSmsSignRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteSmsSignRequest self = new DeleteSmsSignRequest();
        return TeaModel.build(map, self);
    }

    public DeleteSmsSignRequest setSpaceId(String spaceId) {
        this.spaceId = spaceId;
        return this;
    }
    public String getSpaceId() {
        return this.spaceId;
    }

    public DeleteSmsSignRequest setSignId(String signId) {
        this.signId = signId;
        return this;
    }
    public String getSignId() {
        return this.signId;
    }

}
