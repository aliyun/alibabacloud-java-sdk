// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class ListESAIPInfoRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>192.0.0.24,2408:8740:41FF:2:23::7FE,0.0.0.0,abcd</p>
     */
    @NameInMap("VipInfo")
    public String vipInfo;

    public static ListESAIPInfoRequest build(java.util.Map<String, ?> map) throws Exception {
        ListESAIPInfoRequest self = new ListESAIPInfoRequest();
        return TeaModel.build(map, self);
    }

    public ListESAIPInfoRequest setVipInfo(String vipInfo) {
        this.vipInfo = vipInfo;
        return this;
    }
    public String getVipInfo() {
        return this.vipInfo;
    }

}
