// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20210602.models;

import com.aliyun.tea.*;

public class ChangeAppshowRequest extends TeaModel {
    @NameInMap("IsShow")
    public Integer isShow;

    public static ChangeAppshowRequest build(java.util.Map<String, ?> map) throws Exception {
        ChangeAppshowRequest self = new ChangeAppshowRequest();
        return TeaModel.build(map, self);
    }

    public ChangeAppshowRequest setIsShow(Integer isShow) {
        this.isShow = isShow;
        return this;
    }
    public Integer getIsShow() {
        return this.isShow;
    }

}
