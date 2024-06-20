// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20200101.models;

import com.aliyun.tea.*;

public class DescribeInstanceStatusResponseBody extends TeaModel {
    /**
     * <p>The ID of the instance.</p>
     * 
     * <strong>example:</strong>
     * <p>ddoscoo-cn-6ja1y6p5****</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The status of the instance. Valid values:</p>
     * <ul>
     * <li><strong>1</strong>: normal</li>
     * <li><strong>2</strong>: expired</li>
     * <li><strong>3</strong>: overdue</li>
     * <li><strong>4</strong>: released</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("InstanceStatus")
    public Integer instanceStatus;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>112777CC-2AD6-46FC-A263-00B931406FCD</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeInstanceStatusResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeInstanceStatusResponseBody self = new DescribeInstanceStatusResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeInstanceStatusResponseBody setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public DescribeInstanceStatusResponseBody setInstanceStatus(Integer instanceStatus) {
        this.instanceStatus = instanceStatus;
        return this;
    }
    public Integer getInstanceStatus() {
        return this.instanceStatus;
    }

    public DescribeInstanceStatusResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
