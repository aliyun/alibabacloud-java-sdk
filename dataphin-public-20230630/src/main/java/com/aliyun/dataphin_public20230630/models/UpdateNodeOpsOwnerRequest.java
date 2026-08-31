// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class UpdateNodeOpsOwnerRequest extends TeaModel {
    /**
     * <p>The command for updating O&amp;M owners.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("Command")
    public UpdateNodeOpsOwnerRequestCommand command;

    /**
     * <p>The tenant ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>30001011</p>
     */
    @NameInMap("OpTenantId")
    public Long opTenantId;

    /**
     * <p>The ID of the operator user.</p>
     * 
     * <strong>example:</strong>
     * <p>30001011</p>
     */
    @NameInMap("OpUserId")
    public String opUserId;

    public static UpdateNodeOpsOwnerRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateNodeOpsOwnerRequest self = new UpdateNodeOpsOwnerRequest();
        return TeaModel.build(map, self);
    }

    public UpdateNodeOpsOwnerRequest setCommand(UpdateNodeOpsOwnerRequestCommand command) {
        this.command = command;
        return this;
    }
    public UpdateNodeOpsOwnerRequestCommand getCommand() {
        return this.command;
    }

    public UpdateNodeOpsOwnerRequest setOpTenantId(Long opTenantId) {
        this.opTenantId = opTenantId;
        return this;
    }
    public Long getOpTenantId() {
        return this.opTenantId;
    }

    public UpdateNodeOpsOwnerRequest setOpUserId(String opUserId) {
        this.opUserId = opUserId;
        return this;
    }
    public String getOpUserId() {
        return this.opUserId;
    }

    public static class UpdateNodeOpsOwnerRequestCommandNodeIdList extends TeaModel {
        /**
         * <p>The node ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>n_8198365584737107968</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <p>The node source type. Only offline nodes are supported. Valid values:</p>
         * <ul>
         * <li>DATA_PROCESS: compute node.</li>
         * <li>PIPELINE: integration node.</li>
         * <li>BLACK_BOX: logical table.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>DATA_PROCESS</p>
         */
        @NameInMap("NodeFromType")
        public String nodeFromType;

        /**
         * <p>The node type. Valid values:</p>
         * <ul>
         * <li>DATA_PROCESS: compute node.</li>
         * <li>PIPELINE_NODE: integration node.</li>
         * <li>BBOX_LOGIC_TABLE_NODE: logical table.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>DATA_PROCESS</p>
         */
        @NameInMap("NodeType")
        public String nodeType;

        public static UpdateNodeOpsOwnerRequestCommandNodeIdList build(java.util.Map<String, ?> map) throws Exception {
            UpdateNodeOpsOwnerRequestCommandNodeIdList self = new UpdateNodeOpsOwnerRequestCommandNodeIdList();
            return TeaModel.build(map, self);
        }

        public UpdateNodeOpsOwnerRequestCommandNodeIdList setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public UpdateNodeOpsOwnerRequestCommandNodeIdList setNodeFromType(String nodeFromType) {
            this.nodeFromType = nodeFromType;
            return this;
        }
        public String getNodeFromType() {
            return this.nodeFromType;
        }

        public UpdateNodeOpsOwnerRequestCommandNodeIdList setNodeType(String nodeType) {
            this.nodeType = nodeType;
            return this;
        }
        public String getNodeType() {
            return this.nodeType;
        }

    }

    public static class UpdateNodeOpsOwnerRequestCommand extends TeaModel {
        /**
         * <p>The list of nodes. Only offline nodes are supported.</p>
         * <p>This parameter is required.</p>
         */
        @NameInMap("NodeIdList")
        public java.util.List<UpdateNodeOpsOwnerRequestCommandNodeIdList> nodeIdList;

        /**
         * <p>The updated O&amp;M owners. Specify a list of user account IDs. A maximum of 50 IDs are supported.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>123456</p>
         */
        @NameInMap("OpsOwnerList")
        public java.util.List<String> opsOwnerList;

        public static UpdateNodeOpsOwnerRequestCommand build(java.util.Map<String, ?> map) throws Exception {
            UpdateNodeOpsOwnerRequestCommand self = new UpdateNodeOpsOwnerRequestCommand();
            return TeaModel.build(map, self);
        }

        public UpdateNodeOpsOwnerRequestCommand setNodeIdList(java.util.List<UpdateNodeOpsOwnerRequestCommandNodeIdList> nodeIdList) {
            this.nodeIdList = nodeIdList;
            return this;
        }
        public java.util.List<UpdateNodeOpsOwnerRequestCommandNodeIdList> getNodeIdList() {
            return this.nodeIdList;
        }

        public UpdateNodeOpsOwnerRequestCommand setOpsOwnerList(java.util.List<String> opsOwnerList) {
            this.opsOwnerList = opsOwnerList;
            return this;
        }
        public java.util.List<String> getOpsOwnerList() {
            return this.opsOwnerList;
        }

    }

}
