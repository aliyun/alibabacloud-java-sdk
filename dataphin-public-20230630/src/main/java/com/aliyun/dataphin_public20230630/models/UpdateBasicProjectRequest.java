// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class UpdateBasicProjectRequest extends TeaModel {
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
     * <p>The update command.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("UpdateCommand")
    public UpdateBasicProjectRequestUpdateCommand updateCommand;

    public static UpdateBasicProjectRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateBasicProjectRequest self = new UpdateBasicProjectRequest();
        return TeaModel.build(map, self);
    }

    public UpdateBasicProjectRequest setOpTenantId(Long opTenantId) {
        this.opTenantId = opTenantId;
        return this;
    }
    public Long getOpTenantId() {
        return this.opTenantId;
    }

    public UpdateBasicProjectRequest setUpdateCommand(UpdateBasicProjectRequestUpdateCommand updateCommand) {
        this.updateCommand = updateCommand;
        return this;
    }
    public UpdateBasicProjectRequestUpdateCommand getUpdateCommand() {
        return this.updateCommand;
    }

    public static class UpdateBasicProjectRequestUpdateCommandWhiteLists extends TeaModel {
        /**
         * <p>The description.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>IP</p>
         * 
         * <strong>example:</strong>
         * <p>127.0.0.1</p>
         */
        @NameInMap("Ip")
        public String ip;

        /**
         * <p>The port.</p>
         * 
         * <strong>example:</strong>
         * <p>8080</p>
         */
        @NameInMap("Port")
        public String port;

        public static UpdateBasicProjectRequestUpdateCommandWhiteLists build(java.util.Map<String, ?> map) throws Exception {
            UpdateBasicProjectRequestUpdateCommandWhiteLists self = new UpdateBasicProjectRequestUpdateCommandWhiteLists();
            return TeaModel.build(map, self);
        }

        public UpdateBasicProjectRequestUpdateCommandWhiteLists setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public UpdateBasicProjectRequestUpdateCommandWhiteLists setIp(String ip) {
            this.ip = ip;
            return this;
        }
        public String getIp() {
            return this.ip;
        }

        public UpdateBasicProjectRequestUpdateCommandWhiteLists setPort(String port) {
            this.port = port;
            return this;
        }
        public String getPort() {
            return this.port;
        }

    }

    public static class UpdateBasicProjectRequestUpdateCommand extends TeaModel {
        /**
         * <p>The business unit ID.</p>
         * 
         * <strong>example:</strong>
         * <p>1001</p>
         */
        @NameInMap("BizUnitId")
        public Long bizUnitId;

        /**
         * <p>The ID of the offline compute source.</p>
         * 
         * <strong>example:</strong>
         * <p>2001</p>
         */
        @NameInMap("ComputeSourceId")
        public Long computeSourceId;

        /**
         * <p>The project description.</p>
         * 
         * <strong>example:</strong>
         * <p>test project</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The display name of the project.</p>
         * 
         * <strong>example:</strong>
         * <p>MyProject.</p>
         */
        @NameInMap("DisplayName")
        public String displayName;

        /**
         * <p>The project ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>102311</p>
         */
        @NameInMap("Id")
        public Long id;

        /**
         * <p>The project name. This value cannot be modified. Pass in the current project name.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>my_project</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The namespace identifier.</p>
         * 
         * <strong>example:</strong>
         * <p>dev</p>
         */
        @NameInMap("NameSpaceTag")
        public String nameSpaceTag;

        /**
         * <p>The ID of the real-time compute source.</p>
         * 
         * <strong>example:</strong>
         * <p>2002</p>
         */
        @NameInMap("StreamComputeSourceId")
        public Long streamComputeSourceId;

        /**
         * <p>The sandbox whitelist.</p>
         */
        @NameInMap("WhiteLists")
        public java.util.List<UpdateBasicProjectRequestUpdateCommandWhiteLists> whiteLists;

        public static UpdateBasicProjectRequestUpdateCommand build(java.util.Map<String, ?> map) throws Exception {
            UpdateBasicProjectRequestUpdateCommand self = new UpdateBasicProjectRequestUpdateCommand();
            return TeaModel.build(map, self);
        }

        public UpdateBasicProjectRequestUpdateCommand setBizUnitId(Long bizUnitId) {
            this.bizUnitId = bizUnitId;
            return this;
        }
        public Long getBizUnitId() {
            return this.bizUnitId;
        }

        public UpdateBasicProjectRequestUpdateCommand setComputeSourceId(Long computeSourceId) {
            this.computeSourceId = computeSourceId;
            return this;
        }
        public Long getComputeSourceId() {
            return this.computeSourceId;
        }

        public UpdateBasicProjectRequestUpdateCommand setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public UpdateBasicProjectRequestUpdateCommand setDisplayName(String displayName) {
            this.displayName = displayName;
            return this;
        }
        public String getDisplayName() {
            return this.displayName;
        }

        public UpdateBasicProjectRequestUpdateCommand setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public UpdateBasicProjectRequestUpdateCommand setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public UpdateBasicProjectRequestUpdateCommand setNameSpaceTag(String nameSpaceTag) {
            this.nameSpaceTag = nameSpaceTag;
            return this;
        }
        public String getNameSpaceTag() {
            return this.nameSpaceTag;
        }

        public UpdateBasicProjectRequestUpdateCommand setStreamComputeSourceId(Long streamComputeSourceId) {
            this.streamComputeSourceId = streamComputeSourceId;
            return this;
        }
        public Long getStreamComputeSourceId() {
            return this.streamComputeSourceId;
        }

        public UpdateBasicProjectRequestUpdateCommand setWhiteLists(java.util.List<UpdateBasicProjectRequestUpdateCommandWhiteLists> whiteLists) {
            this.whiteLists = whiteLists;
            return this;
        }
        public java.util.List<UpdateBasicProjectRequestUpdateCommandWhiteLists> getWhiteLists() {
            return this.whiteLists;
        }

    }

}
