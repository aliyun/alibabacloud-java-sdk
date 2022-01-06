// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dplus20201216.models;

import com.aliyun.tea.*;

public class TbPropRecRequest extends TeaModel {
    @NameInMap("PicUrl")
    public String picUrl;

    public static TbPropRecRequest build(java.util.Map<String, ?> map) throws Exception {
        TbPropRecRequest self = new TbPropRecRequest();
        return TeaModel.build(map, self);
    }

    public TbPropRecRequest setPicUrl(String picUrl) {
        this.picUrl = picUrl;
        return this;
    }
    public String getPicUrl() {
        return this.picUrl;
    }

}
