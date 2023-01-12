// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cmn20200825.models;

import com.aliyun.tea.*;

public class ListConnectionPoliciesRequest extends TeaModel {
    /**
     * <p>架构迭代uid</p>
     */
    @NameInMap("ArchitectureIterationId")
    public String architectureIterationId;

    /**
     * <p>连接策略名字</p>
     */
    @NameInMap("ConnectionPolicyId")
    public String connectionPolicyId;

    /**
     * <p>下联设备uid</p>
     */
    @NameInMap("DownlinkArchitectureDeviceId")
    public String downlinkArchitectureDeviceId;

    /**
     * <p>下联模块uid</p>
     */
    @NameInMap("DownlinkArchitectureModuleId")
    public String downlinkArchitectureModuleId;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("MaxResults")
    public Integer maxResults;

    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>上联设备uid</p>
     */
    @NameInMap("UplinkArchitectureDeviceId")
    public String uplinkArchitectureDeviceId;

    /**
     * <p>上联模块uid</p>
     */
    @NameInMap("UplinkArchitectureModuleId")
    public String uplinkArchitectureModuleId;

    public static ListConnectionPoliciesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListConnectionPoliciesRequest self = new ListConnectionPoliciesRequest();
        return TeaModel.build(map, self);
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

    public ListConnectionPoliciesRequest setDownlinkArchitectureDeviceId(String downlinkArchitectureDeviceId) {
        this.downlinkArchitectureDeviceId = downlinkArchitectureDeviceId;
        return this;
    }
    public String getDownlinkArchitectureDeviceId() {
        return this.downlinkArchitectureDeviceId;
    }

    public ListConnectionPoliciesRequest setDownlinkArchitectureModuleId(String downlinkArchitectureModuleId) {
        this.downlinkArchitectureModuleId = downlinkArchitectureModuleId;
        return this;
    }
    public String getDownlinkArchitectureModuleId() {
        return this.downlinkArchitectureModuleId;
    }

    public ListConnectionPoliciesRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
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

    public ListConnectionPoliciesRequest setUplinkArchitectureDeviceId(String uplinkArchitectureDeviceId) {
        this.uplinkArchitectureDeviceId = uplinkArchitectureDeviceId;
        return this;
    }
    public String getUplinkArchitectureDeviceId() {
        return this.uplinkArchitectureDeviceId;
    }

    public ListConnectionPoliciesRequest setUplinkArchitectureModuleId(String uplinkArchitectureModuleId) {
        this.uplinkArchitectureModuleId = uplinkArchitectureModuleId;
        return this;
    }
    public String getUplinkArchitectureModuleId() {
        return this.uplinkArchitectureModuleId;
    }

}
