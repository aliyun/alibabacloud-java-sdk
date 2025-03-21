// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eflo_controller20221215.models;

import com.aliyun.tea.*;

public class CreateNodeGroupRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>i118191731740041623425</p>
     */
    @NameInMap("ClusterId")
    public String clusterId;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("NodeGroup")
    public CreateNodeGroupRequestNodeGroup nodeGroup;

    @NameInMap("NodeUnit")
    public java.util.Map<String, ?> nodeUnit;

    public static CreateNodeGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateNodeGroupRequest self = new CreateNodeGroupRequest();
        return TeaModel.build(map, self);
    }

    public CreateNodeGroupRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public CreateNodeGroupRequest setNodeGroup(CreateNodeGroupRequestNodeGroup nodeGroup) {
        this.nodeGroup = nodeGroup;
        return this;
    }
    public CreateNodeGroupRequestNodeGroup getNodeGroup() {
        return this.nodeGroup;
    }

    public CreateNodeGroupRequest setNodeUnit(java.util.Map<String, ?> nodeUnit) {
        this.nodeUnit = nodeUnit;
        return this;
    }
    public java.util.Map<String, ?> getNodeUnit() {
        return this.nodeUnit;
    }

    public static class CreateNodeGroupRequestNodeGroup extends TeaModel {
        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-wulanchabu-b</p>
         */
        @NameInMap("Az")
        public String az;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>i191887641687336652616</p>
         */
        @NameInMap("ImageId")
        public String imageId;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>mock-machine-type3</p>
         */
        @NameInMap("MachineType")
        public String machineType;

        @NameInMap("NodeGroupDescription")
        public String nodeGroupDescription;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>PAI-LINGJUN</p>
         */
        @NameInMap("NodeGroupName")
        public String nodeGroupName;

        public static CreateNodeGroupRequestNodeGroup build(java.util.Map<String, ?> map) throws Exception {
            CreateNodeGroupRequestNodeGroup self = new CreateNodeGroupRequestNodeGroup();
            return TeaModel.build(map, self);
        }

        public CreateNodeGroupRequestNodeGroup setAz(String az) {
            this.az = az;
            return this;
        }
        public String getAz() {
            return this.az;
        }

        public CreateNodeGroupRequestNodeGroup setImageId(String imageId) {
            this.imageId = imageId;
            return this;
        }
        public String getImageId() {
            return this.imageId;
        }

        public CreateNodeGroupRequestNodeGroup setMachineType(String machineType) {
            this.machineType = machineType;
            return this;
        }
        public String getMachineType() {
            return this.machineType;
        }

        public CreateNodeGroupRequestNodeGroup setNodeGroupDescription(String nodeGroupDescription) {
            this.nodeGroupDescription = nodeGroupDescription;
            return this;
        }
        public String getNodeGroupDescription() {
            return this.nodeGroupDescription;
        }

        public CreateNodeGroupRequestNodeGroup setNodeGroupName(String nodeGroupName) {
            this.nodeGroupName = nodeGroupName;
            return this;
        }
        public String getNodeGroupName() {
            return this.nodeGroupName;
        }

    }

}
