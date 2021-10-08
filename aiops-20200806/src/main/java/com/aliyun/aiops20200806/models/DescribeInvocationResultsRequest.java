// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiops20200806.models;

import com.aliyun.tea.*;

public class DescribeInvocationResultsRequest extends TeaModel {
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("InvokeId")
    public String invokeId;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("CommandId")
    public String commandId;

    public static DescribeInvocationResultsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeInvocationResultsRequest self = new DescribeInvocationResultsRequest();
        return TeaModel.build(map, self);
    }

    public DescribeInvocationResultsRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeInvocationResultsRequest setInvokeId(String invokeId) {
        this.invokeId = invokeId;
        return this;
    }
    public String getInvokeId() {
        return this.invokeId;
    }

    public DescribeInvocationResultsRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public DescribeInvocationResultsRequest setCommandId(String commandId) {
        this.commandId = commandId;
        return this;
    }
    public String getCommandId() {
        return this.commandId;
    }

}
