// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20210730.models;

import com.aliyun.tea.*;

public class ModifyAppImageRequest extends TeaModel {
    @NameInMap("Name")
    public String name;

    @NameInMap("Uid")
    public String uid;

    public static ModifyAppImageRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyAppImageRequest self = new ModifyAppImageRequest();
        return TeaModel.build(map, self);
    }

    public ModifyAppImageRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public ModifyAppImageRequest setUid(String uid) {
        this.uid = uid;
        return this;
    }
    public String getUid() {
        return this.uid;
    }

}
