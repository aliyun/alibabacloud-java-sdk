// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class ResumePhysicalNodeRequest extends TeaModel {
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
    @NameInMap("ResumeCommand")
    public ResumePhysicalNodeRequestResumeCommand resumeCommand;

    public static ResumePhysicalNodeRequest build(java.util.Map<String, ?> map) throws Exception {
        ResumePhysicalNodeRequest self = new ResumePhysicalNodeRequest();
        return TeaModel.build(map, self);
    }

    public ResumePhysicalNodeRequest setEnv(String env) {
        this.env = env;
        return this;
    }
    public String getEnv() {
        return this.env;
    }

    public ResumePhysicalNodeRequest setOpTenantId(Long opTenantId) {
        this.opTenantId = opTenantId;
        return this;
    }
    public Long getOpTenantId() {
        return this.opTenantId;
    }

    public ResumePhysicalNodeRequest setResumeCommand(ResumePhysicalNodeRequestResumeCommand resumeCommand) {
        this.resumeCommand = resumeCommand;
        return this;
    }
    public ResumePhysicalNodeRequestResumeCommand getResumeCommand() {
        return this.resumeCommand;
    }

    public static class ResumePhysicalNodeRequestResumeCommand extends TeaModel {
        /**
         * <p>This parameter is required.</p>
         */
        @NameInMap("NodeIdList")
        public java.util.List<String> nodeIdList;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>102011</p>
         */
        @NameInMap("ProjectId")
        public Long projectId;

        public static ResumePhysicalNodeRequestResumeCommand build(java.util.Map<String, ?> map) throws Exception {
            ResumePhysicalNodeRequestResumeCommand self = new ResumePhysicalNodeRequestResumeCommand();
            return TeaModel.build(map, self);
        }

        public ResumePhysicalNodeRequestResumeCommand setNodeIdList(java.util.List<String> nodeIdList) {
            this.nodeIdList = nodeIdList;
            return this;
        }
        public java.util.List<String> getNodeIdList() {
            return this.nodeIdList;
        }

        public ResumePhysicalNodeRequestResumeCommand setProjectId(Long projectId) {
            this.projectId = projectId;
            return this;
        }
        public Long getProjectId() {
            return this.projectId;
        }

    }

}
