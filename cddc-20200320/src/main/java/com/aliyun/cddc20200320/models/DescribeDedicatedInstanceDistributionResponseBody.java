// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cddc20200320.models;

import com.aliyun.tea.*;

public class DescribeDedicatedInstanceDistributionResponseBody extends TeaModel {
    @NameInMap("DBClass")
    public java.util.Map<String, ?> DBClass;

    @NameInMap("DBVersion")
    public java.util.Map<String, ?> DBVersion;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("InstanceCount")
    public Integer instanceCount;

    @NameInMap("DBType")
    public java.util.Map<String, ?> DBType;

    @NameInMap("DedicatedHostGroupId")
    public String dedicatedHostGroupId;

    public static DescribeDedicatedInstanceDistributionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDedicatedInstanceDistributionResponseBody self = new DescribeDedicatedInstanceDistributionResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDedicatedInstanceDistributionResponseBody setDBClass(java.util.Map<String, ?> DBClass) {
        this.DBClass = DBClass;
        return this;
    }
    public java.util.Map<String, ?> getDBClass() {
        return this.DBClass;
    }

    public DescribeDedicatedInstanceDistributionResponseBody setDBVersion(java.util.Map<String, ?> DBVersion) {
        this.DBVersion = DBVersion;
        return this;
    }
    public java.util.Map<String, ?> getDBVersion() {
        return this.DBVersion;
    }

    public DescribeDedicatedInstanceDistributionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeDedicatedInstanceDistributionResponseBody setInstanceCount(Integer instanceCount) {
        this.instanceCount = instanceCount;
        return this;
    }
    public Integer getInstanceCount() {
        return this.instanceCount;
    }

    public DescribeDedicatedInstanceDistributionResponseBody setDBType(java.util.Map<String, ?> DBType) {
        this.DBType = DBType;
        return this;
    }
    public java.util.Map<String, ?> getDBType() {
        return this.DBType;
    }

    public DescribeDedicatedInstanceDistributionResponseBody setDedicatedHostGroupId(String dedicatedHostGroupId) {
        this.dedicatedHostGroupId = dedicatedHostGroupId;
        return this;
    }
    public String getDedicatedHostGroupId() {
        return this.dedicatedHostGroupId;
    }

}
