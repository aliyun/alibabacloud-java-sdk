// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gpdb20160503.models;

import com.aliyun.tea.*;

public class AddAINodeRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>aipool-xxxxx</p>
     */
    @NameInMap("AINodePoolId")
    public String AINodePoolId;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("AINodeSpecInfos")
    public java.util.List<AddAINodeRequestAINodeSpecInfos> AINodeSpecInfos;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>gp-xxxxxxxxx</p>
     */
    @NameInMap("DBInstanceId")
    public String DBInstanceId;

    public static AddAINodeRequest build(java.util.Map<String, ?> map) throws Exception {
        AddAINodeRequest self = new AddAINodeRequest();
        return TeaModel.build(map, self);
    }

    public AddAINodeRequest setAINodePoolId(String AINodePoolId) {
        this.AINodePoolId = AINodePoolId;
        return this;
    }
    public String getAINodePoolId() {
        return this.AINodePoolId;
    }

    public AddAINodeRequest setAINodeSpecInfos(java.util.List<AddAINodeRequestAINodeSpecInfos> AINodeSpecInfos) {
        this.AINodeSpecInfos = AINodeSpecInfos;
        return this;
    }
    public java.util.List<AddAINodeRequestAINodeSpecInfos> getAINodeSpecInfos() {
        return this.AINodeSpecInfos;
    }

    public AddAINodeRequest setDBInstanceId(String DBInstanceId) {
        this.DBInstanceId = DBInstanceId;
        return this;
    }
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    public static class AddAINodeRequestAINodeSpecInfos extends TeaModel {
        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("NodeNum")
        public String nodeNum;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ADB.AIStandard.1</p>
         */
        @NameInMap("NodeSpec")
        public String nodeSpec;

        public static AddAINodeRequestAINodeSpecInfos build(java.util.Map<String, ?> map) throws Exception {
            AddAINodeRequestAINodeSpecInfos self = new AddAINodeRequestAINodeSpecInfos();
            return TeaModel.build(map, self);
        }

        public AddAINodeRequestAINodeSpecInfos setNodeNum(String nodeNum) {
            this.nodeNum = nodeNum;
            return this;
        }
        public String getNodeNum() {
            return this.nodeNum;
        }

        public AddAINodeRequestAINodeSpecInfos setNodeSpec(String nodeSpec) {
            this.nodeSpec = nodeSpec;
            return this;
        }
        public String getNodeSpec() {
            return this.nodeSpec;
        }

    }

}
