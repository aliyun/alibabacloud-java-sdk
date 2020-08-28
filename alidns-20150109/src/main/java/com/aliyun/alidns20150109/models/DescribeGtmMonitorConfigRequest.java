// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class DescribeGtmMonitorConfigRequest extends TeaModel {
    @NameInMap("Lang")
    public String lang;

    @NameInMap("MonitorConfigId")
    @Validation(required = true)
    public String monitorConfigId;

    public static DescribeGtmMonitorConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeGtmMonitorConfigRequest self = new DescribeGtmMonitorConfigRequest();
        return TeaModel.build(map, self);
    }

}
