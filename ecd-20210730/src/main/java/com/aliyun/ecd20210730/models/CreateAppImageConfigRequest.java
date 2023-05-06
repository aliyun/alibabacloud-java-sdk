// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20210730.models;

import com.aliyun.tea.*;

public class CreateAppImageConfigRequest extends TeaModel {
    @NameInMap("ImgUid")
    public String imgUid;

    public static CreateAppImageConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateAppImageConfigRequest self = new CreateAppImageConfigRequest();
        return TeaModel.build(map, self);
    }

    public CreateAppImageConfigRequest setImgUid(String imgUid) {
        this.imgUid = imgUid;
        return this;
    }
    public String getImgUid() {
        return this.imgUid;
    }

}
