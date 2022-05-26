// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.account_crm20160606.models;

import com.aliyun.tea.*;

public class QueryAccountDeliveryAddressInfoRequest extends TeaModel {
    @NameInMap("AppName")
    public String appName;

    @NameInMap("Pk")
    public String pk;

    @NameInMap("RequestId")
    public String requestId;

    public static QueryAccountDeliveryAddressInfoRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryAccountDeliveryAddressInfoRequest self = new QueryAccountDeliveryAddressInfoRequest();
        return TeaModel.build(map, self);
    }

    public QueryAccountDeliveryAddressInfoRequest setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public QueryAccountDeliveryAddressInfoRequest setPk(String pk) {
        this.pk = pk;
        return this;
    }
    public String getPk() {
        return this.pk;
    }

    public QueryAccountDeliveryAddressInfoRequest setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
