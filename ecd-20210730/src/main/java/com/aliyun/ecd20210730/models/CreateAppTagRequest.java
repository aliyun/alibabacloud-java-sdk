// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20210730.models;

import com.aliyun.tea.*;

public class CreateAppTagRequest extends TeaModel {
    @NameInMap("AppUid")
    public String appUid;

    @NameInMap("Name")
    public String name;

    public static CreateAppTagRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateAppTagRequest self = new CreateAppTagRequest();
        return TeaModel.build(map, self);
    }

    public CreateAppTagRequest setAppUid(String appUid) {
        this.appUid = appUid;
        return this;
    }
    public String getAppUid() {
        return this.appUid;
    }

    public CreateAppTagRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

}
