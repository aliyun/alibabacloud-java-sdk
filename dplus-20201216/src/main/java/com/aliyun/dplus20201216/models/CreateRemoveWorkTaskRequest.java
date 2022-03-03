// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dplus20201216.models;

import com.aliyun.tea.*;

public class CreateRemoveWorkTaskRequest extends TeaModel {
    @NameInMap("ItemIdentity")
    public String itemIdentity;

    @NameInMap("PicUrl")
    public String picUrl;

    public static CreateRemoveWorkTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateRemoveWorkTaskRequest self = new CreateRemoveWorkTaskRequest();
        return TeaModel.build(map, self);
    }

    public CreateRemoveWorkTaskRequest setItemIdentity(String itemIdentity) {
        this.itemIdentity = itemIdentity;
        return this;
    }
    public String getItemIdentity() {
        return this.itemIdentity;
    }

    public CreateRemoveWorkTaskRequest setPicUrl(String picUrl) {
        this.picUrl = picUrl;
        return this;
    }
    public String getPicUrl() {
        return this.picUrl;
    }

}
