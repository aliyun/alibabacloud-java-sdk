// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpserverless20190615.models;

import com.aliyun.tea.*;

public class ListDingtalkOpenPlatformConfigsRequest extends TeaModel {
    @NameInMap("SpaceId")
    public String spaceId;

    public static ListDingtalkOpenPlatformConfigsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListDingtalkOpenPlatformConfigsRequest self = new ListDingtalkOpenPlatformConfigsRequest();
        return TeaModel.build(map, self);
    }

    public ListDingtalkOpenPlatformConfigsRequest setSpaceId(String spaceId) {
        this.spaceId = spaceId;
        return this;
    }
    public String getSpaceId() {
        return this.spaceId;
    }

}
