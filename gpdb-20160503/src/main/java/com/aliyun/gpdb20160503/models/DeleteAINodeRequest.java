// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gpdb20160503.models;

import com.aliyun.tea.*;

public class DeleteAINodeRequest extends TeaModel {
    /**
     * <p>The number of AINodes to be deleted.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("AINodeNum")
    public Integer AINodeNum;

    /**
     * <p>The ID of the AINode resource pool.</p>
     * 
     * <strong>example:</strong>
     * <p>aipool-xxxx</p>
     */
    @NameInMap("AINodePoolId")
    public String AINodePoolId;

    /**
     * <p>The ID of the instance.</p>
     * <blockquote>
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/86911.html">DescribeDBInstances</a> operation to query the information about all AnalyticDB for PostgreSQL instances within a region, including instance IDs.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>gp-xxxxxxxxx</p>
     */
    @NameInMap("DBInstanceId")
    public String DBInstanceId;

    /**
     * <p>The list of AINodes to be deleted.</p>
     */
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
