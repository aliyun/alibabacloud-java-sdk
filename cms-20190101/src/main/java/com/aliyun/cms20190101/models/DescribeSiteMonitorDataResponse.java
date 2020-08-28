// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class DescribeSiteMonitorDataResponse extends TeaModel {
    @NameInMap("Code")
    @Validation(required = true)
    public String code;

    @NameInMap("Message")
    @Validation(required = true)
    public String message;

    @NameInMap("Success")
    @Validation(required = true)
    public String success;

    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("NextToken")
    @Validation(required = true)
    public String nextToken;

    @NameInMap("Data")
    @Validation(required = true)
    public String data;

    public static DescribeSiteMonitorDataResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeSiteMonitorDataResponse self = new DescribeSiteMonitorDataResponse();
        return TeaModel.build(map, self);
    }

}
