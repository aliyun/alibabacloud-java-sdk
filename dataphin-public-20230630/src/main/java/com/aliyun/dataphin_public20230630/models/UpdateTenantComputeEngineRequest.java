// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class UpdateTenantComputeEngineRequest extends TeaModel {
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
    @NameInMap("UpdateCommand")
    public UpdateTenantComputeEngineRequestUpdateCommand updateCommand;

    public static UpdateTenantComputeEngineRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateTenantComputeEngineRequest self = new UpdateTenantComputeEngineRequest();
        return TeaModel.build(map, self);
    }

    public UpdateTenantComputeEngineRequest setOpTenantId(Long opTenantId) {
        this.opTenantId = opTenantId;
        return this;
    }
    public Long getOpTenantId() {
        return this.opTenantId;
    }

    public UpdateTenantComputeEngineRequest setUpdateCommand(UpdateTenantComputeEngineRequestUpdateCommand updateCommand) {
        this.updateCommand = updateCommand;
        return this;
    }
    public UpdateTenantComputeEngineRequestUpdateCommand getUpdateCommand() {
        return this.updateCommand;
    }

    public static class UpdateTenantComputeEngineRequestUpdateCommand extends TeaModel {
        /**
         * <p>This parameter is required.</p>
         */
        @NameInMap("ClusterUrlList")
        public java.util.List<String> clusterUrlList;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>MacCompute</p>
         */
        @NameInMap("Type")
        public String type;

        /**
         * <strong>example:</strong>
         * <p>1.0</p>
         */
        @NameInMap("Version")
        public String version;

        public static UpdateTenantComputeEngineRequestUpdateCommand build(java.util.Map<String, ?> map) throws Exception {
            UpdateTenantComputeEngineRequestUpdateCommand self = new UpdateTenantComputeEngineRequestUpdateCommand();
            return TeaModel.build(map, self);
        }

        public UpdateTenantComputeEngineRequestUpdateCommand setClusterUrlList(java.util.List<String> clusterUrlList) {
            this.clusterUrlList = clusterUrlList;
            return this;
        }
        public java.util.List<String> getClusterUrlList() {
            return this.clusterUrlList;
        }

        public UpdateTenantComputeEngineRequestUpdateCommand setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public UpdateTenantComputeEngineRequestUpdateCommand setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

    }

}
