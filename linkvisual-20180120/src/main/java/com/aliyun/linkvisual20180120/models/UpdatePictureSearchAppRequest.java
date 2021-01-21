// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkvisual20180120.models;

import com.aliyun.tea.*;

public class UpdatePictureSearchAppRequest extends TeaModel {
    @NameInMap("AppInstanceId")
    @Validation(required = true)
    public String appInstanceId;

    @NameInMap("Name")
    @Validation(required = true)
    public String name;

    @NameInMap("Description")
    @Validation(required = true)
    public String description;

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

    public UpdatePictureSearchAppRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public UpdatePictureSearchAppRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

}
