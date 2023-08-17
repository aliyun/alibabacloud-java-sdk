// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aligeniessp_1_0.models;

import com.aliyun.tea.*;

public class QueryUserDeviceListByTmeUserIdRequest extends TeaModel {
    @NameInMap("Sp")
    public String sp;

    @NameInMap("TmeUserId")
    public String tmeUserId;

    public static QueryUserDeviceListByTmeUserIdRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryUserDeviceListByTmeUserIdRequest self = new QueryUserDeviceListByTmeUserIdRequest();
        return TeaModel.build(map, self);
    }

    public QueryUserDeviceListByTmeUserIdRequest setSp(String sp) {
        this.sp = sp;
        return this;
    }
    public String getSp() {
        return this.sp;
    }

    public QueryUserDeviceListByTmeUserIdRequest setTmeUserId(String tmeUserId) {
        this.tmeUserId = tmeUserId;
        return this;
    }
    public String getTmeUserId() {
        return this.tmeUserId;
    }

}
