// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkcard20210520.models;

import com.aliyun.tea.*;

public class GetRealNameStatusRequest extends TeaModel {
    @NameInMap("Iccid")
    public String iccid;

    @NameInMap("ListMsisdns")
    public java.util.List<String> listMsisdns;

    public static GetRealNameStatusRequest build(java.util.Map<String, ?> map) throws Exception {
        GetRealNameStatusRequest self = new GetRealNameStatusRequest();
        return TeaModel.build(map, self);
    }

    public GetRealNameStatusRequest setIccid(String iccid) {
        this.iccid = iccid;
        return this;
    }
    public String getIccid() {
        return this.iccid;
    }

    public GetRealNameStatusRequest setListMsisdns(java.util.List<String> listMsisdns) {
        this.listMsisdns = listMsisdns;
        return this;
    }
    public java.util.List<String> getListMsisdns() {
        return this.listMsisdns;
    }

}
