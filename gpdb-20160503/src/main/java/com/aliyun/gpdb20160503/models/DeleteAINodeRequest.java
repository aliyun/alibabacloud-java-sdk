// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gpdb20160503.models;

import com.aliyun.tea.*;

public class DeleteAINodeRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("AINodeNum")
    public Integer AINodeNum;

    /**
     * <strong>example:</strong>
     * <p>aipool-xxxx</p>
     */
    @NameInMap("AINodePoolId")
    public String AINodePoolId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>gp-xxxxxxxxx</p>
     */
    @NameInMap("DBInstanceId")
    public String DBInstanceId;

    @NameInMap("NodeNames")
    public java.util.List<String> nodeNames;

    public static DeleteAINodeRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteAINodeRequest self = new DeleteAINodeRequest();
        return TeaModel.build(map, self);
    }

    public DeleteAINodeRequest setAINodeNum(Integer AINodeNum) {
        this.AINodeNum = AINodeNum;
        return this;
    }
    public Integer getAINodeNum() {
        return this.AINodeNum;
    }

    public DeleteAINodeRequest setAINodePoolId(String AINodePoolId) {
        this.AINodePoolId = AINodePoolId;
        return this;
    }
    public String getAINodePoolId() {
        return this.AINodePoolId;
    }

    public DeleteAINodeRequest setDBInstanceId(String DBInstanceId) {
        this.DBInstanceId = DBInstanceId;
        return this;
    }
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    public DeleteAINodeRequest setNodeNames(java.util.List<String> nodeNames) {
        this.nodeNames = nodeNames;
        return this;
    }
    public java.util.List<String> getNodeNames() {
        return this.nodeNames;
    }

}
