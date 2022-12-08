// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkvisual20180120.models;

import com.aliyun.tea.*;

public class UpdatePictureSearchAppRequest extends TeaModel {
    @NameInMap("AppInstanceId")
    public String appInstanceId;

    @NameInMap("Description")
    public String description;

    @NameInMap("Name")
    public String name;

    public static UpdatePictureSearchAppRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdatePictureSearchAppRequest self = new UpdatePictureSearchAppRequest();
        return TeaModel.build(map, self);
    }

    public UpdatePictureSearchAppRequest setAppInstanceId(String appInstanceId) {
        this.appInstanceId = appInstanceId;
        return this;
    }
    public String getAppInstanceId() {
        return this.appInstanceId;
    }

    public UpdatePictureSearchAppRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public UpdatePictureSearchAppRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

}
