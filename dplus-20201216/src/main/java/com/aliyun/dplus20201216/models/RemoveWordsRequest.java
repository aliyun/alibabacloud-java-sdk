// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dplus20201216.models;

import com.aliyun.tea.*;

public class RemoveWordsRequest extends TeaModel {
    @NameInMap("PicUrl")
    public String picUrl;

    public static RemoveWordsRequest build(java.util.Map<String, ?> map) throws Exception {
        RemoveWordsRequest self = new RemoveWordsRequest();
        return TeaModel.build(map, self);
    }

    public RemoveWordsRequest setPicUrl(String picUrl) {
        this.picUrl = picUrl;
        return this;
    }
    public String getPicUrl() {
        return this.picUrl;
    }

}
