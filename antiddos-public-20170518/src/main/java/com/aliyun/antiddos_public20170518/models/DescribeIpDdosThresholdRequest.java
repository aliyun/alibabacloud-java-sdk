// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.antiddos_public20170518.models;

import com.aliyun.tea.*;

public class DescribeIpDdosThresholdRequest extends TeaModel {
    @NameInMap("DdosRegionId")
    public String ddosRegionId;

    @NameInMap("DdosType")
    public String ddosType;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("InstanceType")
    public String instanceType;

    @NameInMap("InternetIp")
    public String internetIp;

    public static DescribeIpDdosThresholdRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeIpDdosThresholdRequest self = new DescribeIpDdosThresholdRequest();
        return TeaModel.build(map, self);
    }

    public DescribeIpDdosThresholdRequest setDdosRegionId(String ddosRegionId) {
        this.ddosRegionId = ddosRegionId;
        return this;
    }
    public String getDdosRegionId() {
        return this.ddosRegionId;
    }

    public DescribeIpDdosThresholdRequest setDdosType(String ddosType) {
        this.ddosType = ddosType;
        return this;
    }
    public String getDdosType() {
        return this.ddosType;
    }

    public DescribeIpDdosThresholdRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public DescribeIpDdosThresholdRequest setInstanceType(String instanceType) {
        this.instanceType = instanceType;
        return this;
    }
    public String getInstanceType() {
        return this.instanceType;
    }

    public DescribeIpDdosThresholdRequest setInternetIp(String internetIp) {
        this.internetIp = internetIp;
        return this;
    }
    public String getInternetIp() {
        return this.internetIp;
    }

}
