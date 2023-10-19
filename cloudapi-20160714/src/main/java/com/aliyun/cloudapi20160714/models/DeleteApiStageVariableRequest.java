// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160714.models;

import com.aliyun.tea.*;

public class DeleteApiStageVariableRequest extends TeaModel {
    /**
     * <p>The ID of the API group.</p>
     */
    @NameInMap("GroupId")
    public String groupId;

    @NameInMap("SecurityToken")
    public String securityToken;

    /**
     * <p>The ID of the runtime environment.</p>
     */
    @NameInMap("StageId")
    public String stageId;

    /**
     * <p>The name of the variable to be deleted. This parameter is case-sensitive.</p>
     */
    @NameInMap("VariableName")
    public String variableName;

    public static DeleteApiStageVariableRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteApiStageVariableRequest self = new DeleteApiStageVariableRequest();
        return TeaModel.build(map, self);
    }

    public DeleteApiStageVariableRequest setGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }
    public String getGroupId() {
        return this.groupId;
    }

    public DeleteApiStageVariableRequest setSecurityToken(String securityToken) {
        this.securityToken = securityToken;
        return this;
    }
    public String getSecurityToken() {
        return this.securityToken;
    }

    public DeleteApiStageVariableRequest setStageId(String stageId) {
        this.stageId = stageId;
        return this;
    }
    public String getStageId() {
        return this.stageId;
    }

    public DeleteApiStageVariableRequest setVariableName(String variableName) {
        this.variableName = variableName;
        return this;
    }
    public String getVariableName() {
        return this.variableName;
    }

}
