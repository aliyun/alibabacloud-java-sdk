// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dplus20201216.models;

import com.aliyun.tea.*;

public class AePropRecRequest extends TeaModel {
    @NameInMap("PicUrl")
    public String picUrl;

    public static AePropRecRequest build(java.util.Map<String, ?> map) throws Exception {
        AePropRecRequest self = new AePropRecRequest();
        return TeaModel.build(map, self);
    }

    public AePropRecRequest setPicUrl(String picUrl) {
        this.picUrl = picUrl;
        return this;
    }
    public String getPicUrl() {
        return this.picUrl;
    }

}
