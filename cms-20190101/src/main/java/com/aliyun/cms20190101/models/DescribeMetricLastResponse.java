// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class DescribeMetricLastResponse extends TeaModel {
    @NameInMap("Code")
    @Validation(required = true)
    public String code;

    @NameInMap("Message")
    @Validation(required = true)
    public String message;

    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("NextToken")
    @Validation(required = true)
    public String nextToken;

    @NameInMap("Datapoints")
    @Validation(required = true)
    public String datapoints;

    @NameInMap("Period")
    @Validation(required = true)
    public String period;

    @NameInMap("Success")
    @Validation(required = true)
    public Boolean success;

    public static DescribeMetricLastResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeMetricLastResponse self = new DescribeMetricLastResponse();
        return TeaModel.build(map, self);
    }

}
