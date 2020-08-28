// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class DescribeMetricTopResponse extends TeaModel {
    @NameInMap("Code")
    @Validation(required = true)
    public String code;

    @NameInMap("Message")
    @Validation(required = true)
    public String message;

    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Datapoints")
    @Validation(required = true)
    public String datapoints;

    @NameInMap("Period")
    @Validation(required = true)
    public String period;

    public static DescribeMetricTopResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeMetricTopResponse self = new DescribeMetricTopResponse();
        return TeaModel.build(map, self);
    }

}
