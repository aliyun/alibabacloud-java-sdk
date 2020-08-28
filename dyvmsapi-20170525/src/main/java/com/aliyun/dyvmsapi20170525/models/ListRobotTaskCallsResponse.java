// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyvmsapi20170525.models;

import com.aliyun.tea.*;

public class ListRobotTaskCallsResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Data")
    @Validation(required = true)
    public String data;

    @NameInMap("PageSize")
    @Validation(required = true)
    public String pageSize;

    @NameInMap("PageNo")
    @Validation(required = true)
    public String pageNo;

    @NameInMap("TotalCount")
    @Validation(required = true)
    public String totalCount;

    @NameInMap("Code")
    @Validation(required = true)
    public String code;

    @NameInMap("Message")
    @Validation(required = true)
    public String message;

    public static ListRobotTaskCallsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListRobotTaskCallsResponse self = new ListRobotTaskCallsResponse();
        return TeaModel.build(map, self);
    }

}
