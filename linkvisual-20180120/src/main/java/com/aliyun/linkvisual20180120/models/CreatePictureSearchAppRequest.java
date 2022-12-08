// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkvisual20180120.models;

import com.aliyun.tea.*;

public class CreatePictureSearchAppRequest extends TeaModel {
    @NameInMap("Desc")
    public String desc;

    @NameInMap("IotInstanceId")
    public String iotInstanceId;

    @NameInMap("Name")
    public String name;

    public static CreatePictureSearchAppRequest build(java.util.Map<String, ?> map) throws Exception {
        CreatePictureSearchAppRequest self = new CreatePictureSearchAppRequest();
        return TeaModel.build(map, self);
    }

    public CreatePictureSearchAppRequest setDesc(String desc) {
        this.desc = desc;
        return this;
    }
    public String getDesc() {
        return this.desc;
    }

    public CreatePictureSearchAppRequest setIotInstanceId(String iotInstanceId) {
        this.iotInstanceId = iotInstanceId;
        return this;
    }
    public String getIotInstanceId() {
        return this.iotInstanceId;
    }

    public CreatePictureSearchAppRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

}
