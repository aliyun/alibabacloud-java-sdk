// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyvmsapi20170525.models;

import com.aliyun.tea.*;

public class QueryRobotv2AllListResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Data")
    @Validation(required = true)
    public String data;

    @NameInMap("Code")
    @Validation(required = true)
    public String code;

    @NameInMap("Message")
    @Validation(required = true)
    public String message;

    public static QueryRobotv2AllListResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryRobotv2AllListResponse self = new QueryRobotv2AllListResponse();
        return TeaModel.build(map, self);
    }

}
