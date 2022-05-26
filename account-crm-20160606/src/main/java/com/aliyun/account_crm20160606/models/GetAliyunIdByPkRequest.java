// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.account_crm20160606.models;

import com.aliyun.tea.*;

public class GetAliyunIdByPkRequest extends TeaModel {
    @NameInMap("AppName")
    public String appName;

    @NameInMap("Pk")
    public String pk;

    public static GetAliyunIdByPkRequest build(java.util.Map<String, ?> map) throws Exception {
        GetAliyunIdByPkRequest self = new GetAliyunIdByPkRequest();
        return TeaModel.build(map, self);
    }

    public GetAliyunIdByPkRequest setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public GetAliyunIdByPkRequest setPk(String pk) {
        this.pk = pk;
        return this;
    }
    public String getPk() {
        return this.pk;
    }

}
