// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aegis_ops20180828.models;

import com.aliyun.tea.*;

public class DescribeHasGraphShrinkRequest extends TeaModel {
    @NameInMap("AliUid")
    public Long aliUid;

    @NameInMap("SecurityAlarmList")
    public String securityAlarmListShrink;

    public static DescribeHasGraphShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeHasGraphShrinkRequest self = new DescribeHasGraphShrinkRequest();
        return TeaModel.build(map, self);
    }

    public DescribeHasGraphShrinkRequest setAliUid(Long aliUid) {
        this.aliUid = aliUid;
        return this;
    }
    public Long getAliUid() {
        return this.aliUid;
    }

    public DescribeHasGraphShrinkRequest setSecurityAlarmListShrink(String securityAlarmListShrink) {
        this.securityAlarmListShrink = securityAlarmListShrink;
        return this;
    }
    public String getSecurityAlarmListShrink() {
        return this.securityAlarmListShrink;
    }

}
