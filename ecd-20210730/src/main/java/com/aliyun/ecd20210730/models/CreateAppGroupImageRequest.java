// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20210730.models;

import com.aliyun.tea.*;

public class CreateAppGroupImageRequest extends TeaModel {
    @NameInMap("AppGroupUid")
    public String appGroupUid;

    public static CreateAppGroupImageRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateAppGroupImageRequest self = new CreateAppGroupImageRequest();
        return TeaModel.build(map, self);
    }

    public CreateAppGroupImageRequest setAppGroupUid(String appGroupUid) {
        this.appGroupUid = appGroupUid;
        return this;
    }
    public String getAppGroupUid() {
        return this.appGroupUid;
    }

}
