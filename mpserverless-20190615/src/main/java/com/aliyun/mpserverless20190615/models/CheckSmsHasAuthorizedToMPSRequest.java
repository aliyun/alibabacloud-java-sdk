// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpserverless20190615.models;

import com.aliyun.tea.*;

public class CheckSmsHasAuthorizedToMPSRequest extends TeaModel {
    @NameInMap("SpaceId")
    public String spaceId;

    public static CheckSmsHasAuthorizedToMPSRequest build(java.util.Map<String, ?> map) throws Exception {
        CheckSmsHasAuthorizedToMPSRequest self = new CheckSmsHasAuthorizedToMPSRequest();
        return TeaModel.build(map, self);
    }

    public CheckSmsHasAuthorizedToMPSRequest setSpaceId(String spaceId) {
        this.spaceId = spaceId;
        return this;
    }
    public String getSpaceId() {
        return this.spaceId;
    }

}
