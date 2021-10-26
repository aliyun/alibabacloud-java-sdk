// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160714.models;

import com.aliyun.tea.*;

public class SynchronizeGroupConfigFlowStartRequest extends TeaModel {
    @NameInMap("SecurityToken")
    public String securityToken;

    @NameInMap("FlowId")
    public String flowId;

    @NameInMap("ModifyPolicy")
    public String modifyPolicy;

    @NameInMap("VpcName")
    public String vpcName;

    @NameInMap("VpcSchema")
    public String vpcSchema;

    @NameInMap("Include")
    public java.util.List<String> include;

    @NameInMap("Exclude")
    public java.util.List<String> exclude;

    public static SynchronizeGroupConfigFlowStartRequest build(java.util.Map<String, ?> map) throws Exception {
        SynchronizeGroupConfigFlowStartRequest self = new SynchronizeGroupConfigFlowStartRequest();
        return TeaModel.build(map, self);
    }

    public SynchronizeGroupConfigFlowStartRequest setSecurityToken(String securityToken) {
        this.securityToken = securityToken;
        return this;
    }
    public String getSecurityToken() {
        return this.securityToken;
    }

    public SynchronizeGroupConfigFlowStartRequest setFlowId(String flowId) {
        this.flowId = flowId;
        return this;
    }
    public String getFlowId() {
        return this.flowId;
    }

    public SynchronizeGroupConfigFlowStartRequest setModifyPolicy(String modifyPolicy) {
        this.modifyPolicy = modifyPolicy;
        return this;
    }
    public String getModifyPolicy() {
        return this.modifyPolicy;
    }

    public SynchronizeGroupConfigFlowStartRequest setVpcName(String vpcName) {
        this.vpcName = vpcName;
        return this;
    }
    public String getVpcName() {
        return this.vpcName;
    }

    public SynchronizeGroupConfigFlowStartRequest setVpcSchema(String vpcSchema) {
        this.vpcSchema = vpcSchema;
        return this;
    }
    public String getVpcSchema() {
        return this.vpcSchema;
    }

    public SynchronizeGroupConfigFlowStartRequest setInclude(java.util.List<String> include) {
        this.include = include;
        return this;
    }
    public java.util.List<String> getInclude() {
        return this.include;
    }

    public SynchronizeGroupConfigFlowStartRequest setExclude(java.util.List<String> exclude) {
        this.exclude = exclude;
        return this;
    }
    public java.util.List<String> getExclude() {
        return this.exclude;
    }

}
