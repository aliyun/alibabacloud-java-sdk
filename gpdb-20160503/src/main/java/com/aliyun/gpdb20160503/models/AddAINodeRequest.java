// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gpdb20160503.models;

import com.aliyun.tea.*;

public class AddAINodeRequest extends TeaModel {
    /**
     * <p>The ID of the resource pool to which the AI node belongs.</p>
     * 
     * <strong>example:</strong>
     * <p>aipool-xxxxx</p>
     */
    @NameInMap("AINodePoolId")
    public String AINodePoolId;

    /**
     * <p>The AI node specifications.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("AINodeSpecInfos")
    public java.util.List<AddAINodeRequestAINodeSpecInfos> AINodeSpecInfos;

    /**
     * <p>The cluster ID.</p>
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
         * <p>The number of AI nodes.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("NodeNum")
        public String nodeNum;

        /**
         * <p>The AI node specifications.</p>
         * <pre><code>ADB.AIStandard.1
         * ADB.AIMedium.1
         * ADB.AILarge.1
         * ADB.AIStandard.2
         * ADB.AIMedium.2
         * ADB.AILarge.2
         * ADB.AIXLarge.2
         * ADB.AIStandard.6
         * ADB.AIMedium.6
         * ADB.AILarge.6
         * ADB.AIXLarge.6
         * ADB.AIStandard.3
         * ADB.AIMedium.3
         * ADB.AILarge.3
         * ADB.AIXLarge.3
         * ADB.AIStandard.4
         * ADB.AIMedium.4
         * ADB.AILarge.4
         * ADB.AIXLarge.4
         * ADB.AIStandard.5
         * ADB.AIMedium.5
         * ADB.AILarge.5
         * ADB.AIXLarge.5
         * ADB.AIStandard.8
         * ADB.AIMedium.8
         * ADB.AILarge.8
         * ADB.AIXLarge.8
         * ADB.AI2XLarge.8
         * </code></pre>
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
