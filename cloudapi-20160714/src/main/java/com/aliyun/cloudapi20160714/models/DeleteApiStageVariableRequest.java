// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160714.models;

import com.aliyun.tea.*;

public class DeleteApiStageVariableRequest extends TeaModel {
    /**
     * <p>The ID of the API group.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>523e8dc7bbe04613b5b1d726c2a7889d</p>
     */
    @NameInMap("GroupId")
    public String groupId;

    @NameInMap("SecurityToken")
    public String securityToken;

    /**
     * <p>The ID of the runtime environment.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>6EF60BEC-0242-43AF-BB20-270359FB54A7</p>
     */
    @NameInMap("StageId")
    public String stageId;

    /**
     * <p>The name of the variable to be deleted. This parameter is case-sensitive.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>serverName</p>
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
