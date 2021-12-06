// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.antiddos_public20170518.models;

import com.aliyun.tea.*;

public class DescribeCapRequest extends TeaModel {
    @NameInMap("BegTime")
    public Long begTime;

    @NameInMap("DdosRegionId")
    public String ddosRegionId;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("InstanceType")
    public String instanceType;

    public static DescribeCapRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeCapRequest self = new DescribeCapRequest();
        return TeaModel.build(map, self);
    }

    public DescribeCapRequest setBegTime(Long begTime) {
        this.begTime = begTime;
        return this;
    }
    public Long getBegTime() {
        return this.begTime;
    }

    public DescribeCapRequest setDdosRegionId(String ddosRegionId) {
        this.ddosRegionId = ddosRegionId;
        return this;
    }
    public String getDdosRegionId() {
        return this.ddosRegionId;
    }

    public DescribeCapRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public DescribeCapRequest setInstanceType(String instanceType) {
        this.instanceType = instanceType;
        return this;
    }
    public String getInstanceType() {
        return this.instanceType;
    }

}
