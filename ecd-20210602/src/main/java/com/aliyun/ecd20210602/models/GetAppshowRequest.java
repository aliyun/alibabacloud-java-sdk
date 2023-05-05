// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20210602.models;

import com.aliyun.tea.*;

public class GetAppshowRequest extends TeaModel {
    @NameInMap("IsShow")
    public Integer isShow;

    public static GetAppshowRequest build(java.util.Map<String, ?> map) throws Exception {
        GetAppshowRequest self = new GetAppshowRequest();
        return TeaModel.build(map, self);
    }

    public GetAppshowRequest setIsShow(Integer isShow) {
        this.isShow = isShow;
        return this;
    }
    public Integer getIsShow() {
        return this.isShow;
    }

}
