// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class DescribeMetricDataResponse extends TeaModel {
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

    public static DescribeMetricDataResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeMetricDataResponse self = new DescribeMetricDataResponse();
        return TeaModel.build(map, self);
    }

}
