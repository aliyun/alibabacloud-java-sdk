// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class DescribeMonitorResourceQuotaAttributeRequest extends TeaModel {
    @NameInMap("ShowUsed")
    public Boolean showUsed;

    public static DescribeMonitorResourceQuotaAttributeRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeMonitorResourceQuotaAttributeRequest self = new DescribeMonitorResourceQuotaAttributeRequest();
        return TeaModel.build(map, self);
    }

    public DescribeMonitorResourceQuotaAttributeRequest setShowUsed(Boolean showUsed) {
        this.showUsed = showUsed;
        return this;
    }
    public Boolean getShowUsed() {
        return this.showUsed;
    }

}
