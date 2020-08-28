// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudwifi_pop20191118.models;

import com.aliyun.tea.*;

public class QueryJobOrderRequest extends TeaModel {
    @NameInMap("AppName")
    public String appName;

    @NameInMap("AppCode")
    public String appCode;

    @NameInMap("OrderId")
    @Validation(required = true)
    public Long orderId;

    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    public static QueryJobOrderRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryJobOrderRequest self = new QueryJobOrderRequest();
        return TeaModel.build(map, self);
    }

}
