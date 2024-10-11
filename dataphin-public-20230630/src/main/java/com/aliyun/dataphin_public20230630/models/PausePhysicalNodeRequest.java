// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class PausePhysicalNodeRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>PROD</p>
     */
    @NameInMap("Env")
    public String env;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>30001011</p>
     */
    @NameInMap("OpTenantId")
    public Long opTenantId;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("PauseCommand")
    public PausePhysicalNodeRequestPauseCommand pauseCommand;

    public static PausePhysicalNodeRequest build(java.util.Map<String, ?> map) throws Exception {
        PausePhysicalNodeRequest self = new PausePhysicalNodeRequest();
        return TeaModel.build(map, self);
    }

    public PausePhysicalNodeRequest setEnv(String env) {
        this.env = env;
        return this;
    }
    public String getEnv() {
        return this.env;
    }

    public PausePhysicalNodeRequest setOpTenantId(Long opTenantId) {
        this.opTenantId = opTenantId;
        return this;
    }
    public Long getOpTenantId() {
        return this.opTenantId;
    }

    public PausePhysicalNodeRequest setPauseCommand(PausePhysicalNodeRequestPauseCommand pauseCommand) {
        this.pauseCommand = pauseCommand;
        return this;
    }
    public PausePhysicalNodeRequestPauseCommand getPauseCommand() {
        return this.pauseCommand;
    }

    public static class PausePhysicalNodeRequestPauseCommand extends TeaModel {
        /**
         * <p>This parameter is required.</p>
         */
        @NameInMap("NodeIdList")
        public java.util.List<String> nodeIdList;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>13222210</p>
         */
        @NameInMap("ProjectId")
        public Long projectId;

        public static PausePhysicalNodeRequestPauseCommand build(java.util.Map<String, ?> map) throws Exception {
            PausePhysicalNodeRequestPauseCommand self = new PausePhysicalNodeRequestPauseCommand();
            return TeaModel.build(map, self);
        }

        public PausePhysicalNodeRequestPauseCommand setNodeIdList(java.util.List<String> nodeIdList) {
            this.nodeIdList = nodeIdList;
            return this;
        }
        public java.util.List<String> getNodeIdList() {
            return this.nodeIdList;
        }

        public PausePhysicalNodeRequestPauseCommand setProjectId(Long projectId) {
            this.projectId = projectId;
            return this;
        }
        public Long getProjectId() {
            return this.projectId;
        }

    }

}
