// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imp20210630.models;

import com.aliyun.tea.*;

public class AppsSecurity extends TeaModel {
    @NameInMap("PlayUrlTtl")
    public Integer playUrlTtl;

    public static AppsSecurity build(java.util.Map<String, ?> map) throws Exception {
        AppsSecurity self = new AppsSecurity();
        return TeaModel.build(map, self);
    }

    public AppsSecurity setPlayUrlTtl(Integer playUrlTtl) {
        this.playUrlTtl = playUrlTtl;
        return this;
    }
    public Integer getPlayUrlTtl() {
        return this.playUrlTtl;
    }

}
