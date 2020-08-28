// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class DescribeGtmInstanceStatusResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("AddrNotAvailableNum")
    @Validation(required = true)
    public Integer addrNotAvailableNum;

    @NameInMap("AddrPoolNotAvailableNum")
    @Validation(required = true)
    public Integer addrPoolNotAvailableNum;

    @NameInMap("SwitchToFailoverStrategyNum")
    @Validation(required = true)
    public Integer switchToFailoverStrategyNum;

    @NameInMap("StrategyNotAvailableNum")
    @Validation(required = true)
    public Integer strategyNotAvailableNum;

    @NameInMap("Status")
    @Validation(required = true)
    public String status;

    @NameInMap("StatusReason")
    @Validation(required = true)
    public String statusReason;

    public static DescribeGtmInstanceStatusResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeGtmInstanceStatusResponse self = new DescribeGtmInstanceStatusResponse();
        return TeaModel.build(map, self);
    }

}
