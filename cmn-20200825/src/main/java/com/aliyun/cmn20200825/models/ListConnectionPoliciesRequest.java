// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cmn20200825.models;

import com.aliyun.tea.*;

public class ListConnectionPoliciesRequest extends TeaModel {
    // 返回结果的最大个数。
    @NameInMap("MaxResults")
    public Integer maxResults;

    // 当总结果个数大于MaxResults时，用于翻页的token。
    @NameInMap("NextToken")
    public String nextToken;

    @NameInMap("InstanceId")
    public String instanceId;

    // 架构迭代uid
    @NameInMap("ArchitectureIterationId")
    public String architectureIterationId;

    // 连接策略id
    @NameInMap("ConnectionPolicyId")
    public String connectionPolicyId;

    // 上联模块uid
    @NameInMap("UplinkArchitectureModuleId")
    public String uplinkArchitectureModuleId;

    // 下联模块uid
    @NameInMap("DownlinkArchitectureModuleId")
    public String downlinkArchitectureModuleId;

    // 上联设备uid
    @NameInMap("UplinkArchitectureDeviceId")
    public String uplinkArchitectureDeviceId;

    // 下联设备uid
    @NameInMap("DownlinkArchitectureDeviceId")
    public String downlinkArchitectureDeviceId;

    public static ListConnectionPoliciesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListConnectionPoliciesRequest self = new ListConnectionPoliciesRequest();
        return TeaModel.build(map, self);
    }

    public ListConnectionPoliciesRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListConnectionPoliciesRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListConnectionPoliciesRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ListConnectionPoliciesRequest setArchitectureIterationId(String architectureIterationId) {
        this.architectureIterationId = architectureIterationId;
        return this;
    }
    public String getArchitectureIterationId() {
        return this.architectureIterationId;
    }

    public ListConnectionPoliciesRequest setConnectionPolicyId(String connectionPolicyId) {
        this.connectionPolicyId = connectionPolicyId;
        return this;
    }
    public String getConnectionPolicyId() {
        return this.connectionPolicyId;
    }

    public ListConnectionPoliciesRequest setUplinkArchitectureModuleId(String uplinkArchitectureModuleId) {
        this.uplinkArchitectureModuleId = uplinkArchitectureModuleId;
        return this;
    }
    public String getUplinkArchitectureModuleId() {
        return this.uplinkArchitectureModuleId;
    }

    public ListConnectionPoliciesRequest setDownlinkArchitectureModuleId(String downlinkArchitectureModuleId) {
        this.downlinkArchitectureModuleId = downlinkArchitectureModuleId;
        return this;
    }
    public String getDownlinkArchitectureModuleId() {
        return this.downlinkArchitectureModuleId;
    }

    public ListConnectionPoliciesRequest setUplinkArchitectureDeviceId(String uplinkArchitectureDeviceId) {
        this.uplinkArchitectureDeviceId = uplinkArchitectureDeviceId;
        return this;
    }
    public String getUplinkArchitectureDeviceId() {
        return this.uplinkArchitectureDeviceId;
    }

    public ListConnectionPoliciesRequest setDownlinkArchitectureDeviceId(String downlinkArchitectureDeviceId) {
        this.downlinkArchitectureDeviceId = downlinkArchitectureDeviceId;
        return this;
    }
    public String getDownlinkArchitectureDeviceId() {
        return this.downlinkArchitectureDeviceId;
    }

}
