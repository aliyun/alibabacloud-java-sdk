// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class GetNodeUpDownStreamRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("DownStreamDepth")
    public Integer downStreamDepth;

    /**
     * <strong>example:</strong>
     * <p>DEV</p>
     */
    @NameInMap("Env")
    public String env;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("NodeId")
    public GetNodeUpDownStreamRequestNodeId nodeId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>30001011</p>
     */
    @NameInMap("OpTenantId")
    public Long opTenantId;

    /**
     * <strong>example:</strong>
     * <p>113123</p>
     */
    @NameInMap("ProjectId")
    public Long projectId;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("UpStreamDepth")
    public Integer upStreamDepth;

    public static GetNodeUpDownStreamRequest build(java.util.Map<String, ?> map) throws Exception {
        GetNodeUpDownStreamRequest self = new GetNodeUpDownStreamRequest();
        return TeaModel.build(map, self);
    }

    public GetNodeUpDownStreamRequest setDownStreamDepth(Integer downStreamDepth) {
        this.downStreamDepth = downStreamDepth;
        return this;
    }
    public Integer getDownStreamDepth() {
        return this.downStreamDepth;
    }

    public GetNodeUpDownStreamRequest setEnv(String env) {
        this.env = env;
        return this;
    }
    public String getEnv() {
        return this.env;
    }

    public GetNodeUpDownStreamRequest setNodeId(GetNodeUpDownStreamRequestNodeId nodeId) {
        this.nodeId = nodeId;
        return this;
    }
    public GetNodeUpDownStreamRequestNodeId getNodeId() {
        return this.nodeId;
    }

    public GetNodeUpDownStreamRequest setOpTenantId(Long opTenantId) {
        this.opTenantId = opTenantId;
        return this;
    }
    public Long getOpTenantId() {
        return this.opTenantId;
    }

    public GetNodeUpDownStreamRequest setProjectId(Long projectId) {
        this.projectId = projectId;
        return this;
    }
    public Long getProjectId() {
        return this.projectId;
    }

    public GetNodeUpDownStreamRequest setUpStreamDepth(Integer upStreamDepth) {
        this.upStreamDepth = upStreamDepth;
        return this;
    }
    public Integer getUpStreamDepth() {
        return this.upStreamDepth;
    }

    public static class GetNodeUpDownStreamRequestNodeId extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>12</p>
         */
        @NameInMap("FieldIdList")
        public String fieldIdList;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>11313</p>
         */
        @NameInMap("Id")
        public String id;

        public static GetNodeUpDownStreamRequestNodeId build(java.util.Map<String, ?> map) throws Exception {
            GetNodeUpDownStreamRequestNodeId self = new GetNodeUpDownStreamRequestNodeId();
            return TeaModel.build(map, self);
        }

        public GetNodeUpDownStreamRequestNodeId setFieldIdList(String fieldIdList) {
            this.fieldIdList = fieldIdList;
            return this;
        }
        public String getFieldIdList() {
            return this.fieldIdList;
        }

        public GetNodeUpDownStreamRequestNodeId setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

    }

}
