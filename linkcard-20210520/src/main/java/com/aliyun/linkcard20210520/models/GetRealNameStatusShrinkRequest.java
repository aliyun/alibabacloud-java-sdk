// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkcard20210520.models;

import com.aliyun.tea.*;

public class GetRealNameStatusShrinkRequest extends TeaModel {
    @NameInMap("Iccid")
    public String iccid;

    @NameInMap("ListMsisdns")
    public String listMsisdnsShrink;

    public static GetRealNameStatusShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        GetRealNameStatusShrinkRequest self = new GetRealNameStatusShrinkRequest();
        return TeaModel.build(map, self);
    }

    public GetRealNameStatusShrinkRequest setIccid(String iccid) {
        this.iccid = iccid;
        return this;
    }
    public String getIccid() {
        return this.iccid;
    }

    public GetRealNameStatusShrinkRequest setListMsisdnsShrink(String listMsisdnsShrink) {
        this.listMsisdnsShrink = listMsisdnsShrink;
        return this;
    }
    public String getListMsisdnsShrink() {
        return this.listMsisdnsShrink;
    }

}
