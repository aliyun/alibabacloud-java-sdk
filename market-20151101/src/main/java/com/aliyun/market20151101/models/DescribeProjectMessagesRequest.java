// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.market20151101.models;

import com.aliyun.tea.*;

public class DescribeProjectMessagesRequest extends TeaModel {
    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("PageIndex")
    public Integer pageIndex;

    public static DescribeProjectMessagesRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeProjectMessagesRequest self = new DescribeProjectMessagesRequest();
        return TeaModel.build(map, self);
    }

    public DescribeProjectMessagesRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public DescribeProjectMessagesRequest setPageIndex(Integer pageIndex) {
        this.pageIndex = pageIndex;
        return this;
    }
    public Integer getPageIndex() {
        return this.pageIndex;
    }

}
