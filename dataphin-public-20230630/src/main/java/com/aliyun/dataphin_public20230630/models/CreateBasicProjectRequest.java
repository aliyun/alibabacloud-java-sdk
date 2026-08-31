// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class CreateBasicProjectRequest extends TeaModel {
    /**
     * <p>The create command.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("CreateCommand")
    public CreateBasicProjectRequestCreateCommand createCommand;

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
     * <strong>example:</strong>
     * <p>30001011</p>
     */
    @NameInMap("OpUserId")
    public String opUserId;

    public static CreateBasicProjectRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateBasicProjectRequest self = new CreateBasicProjectRequest();
        return TeaModel.build(map, self);
    }

    public CreateBasicProjectRequest setCreateCommand(CreateBasicProjectRequestCreateCommand createCommand) {
        this.createCommand = createCommand;
        return this;
    }
    public CreateBasicProjectRequestCreateCommand getCreateCommand() {
        return this.createCommand;
    }

    public CreateBasicProjectRequest setOpTenantId(Long opTenantId) {
        this.opTenantId = opTenantId;
        return this;
    }
    public Long getOpTenantId() {
        return this.opTenantId;
    }

    public CreateBasicProjectRequest setOpUserId(String opUserId) {
        this.opUserId = opUserId;
        return this;
    }
    public String getOpUserId() {
        return this.opUserId;
    }

    public static class CreateBasicProjectRequestCreateCommandWhiteLists extends TeaModel {
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

        public static CreateBasicProjectRequestCreateCommandWhiteLists build(java.util.Map<String, ?> map) throws Exception {
            CreateBasicProjectRequestCreateCommandWhiteLists self = new CreateBasicProjectRequestCreateCommandWhiteLists();
            return TeaModel.build(map, self);
        }

        public CreateBasicProjectRequestCreateCommandWhiteLists setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public CreateBasicProjectRequestCreateCommandWhiteLists setIp(String ip) {
            this.ip = ip;
            return this;
        }
        public String getIp() {
            return this.ip;
        }

        public CreateBasicProjectRequestCreateCommandWhiteLists setPort(String port) {
            this.port = port;
            return this;
        }
        public String getPort() {
            return this.port;
        }

    }

    public static class CreateBasicProjectRequestCreateCommand extends TeaModel {
        /**
         * <p>The business unit ID.</p>
         * 
         * <strong>example:</strong>
         * <p>1001</p>
         */
        @NameInMap("BizUnitId")
        public Long bizUnitId;

        /**
         * <p>The offline compute source ID.</p>
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
         * <p>The project display name.</p>
         * 
         * <strong>example:</strong>
         * <p>My project.</p>
         */
        @NameInMap("DisplayName")
        public String displayName;

        /**
         * <p>The project name.</p>
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
         * <p>The real-time compute source ID.</p>
         * 
         * <strong>example:</strong>
         * <p>2002</p>
         */
        @NameInMap("StreamComputeSourceId")
        public Long streamComputeSourceId;

        /**
         * <p>The project type. If this parameter is left empty, the default value GENERAL is used.</p>
         * 
         * <strong>example:</strong>
         * <p>GENERAL</p>
         */
        @NameInMap("Type")
        public String type;

        /**
         * <p>The sandbox whitelist.</p>
         */
        @NameInMap("WhiteLists")
        public java.util.List<CreateBasicProjectRequestCreateCommandWhiteLists> whiteLists;

        public static CreateBasicProjectRequestCreateCommand build(java.util.Map<String, ?> map) throws Exception {
            CreateBasicProjectRequestCreateCommand self = new CreateBasicProjectRequestCreateCommand();
            return TeaModel.build(map, self);
        }

        public CreateBasicProjectRequestCreateCommand setBizUnitId(Long bizUnitId) {
            this.bizUnitId = bizUnitId;
            return this;
        }
        public Long getBizUnitId() {
            return this.bizUnitId;
        }

        public CreateBasicProjectRequestCreateCommand setComputeSourceId(Long computeSourceId) {
            this.computeSourceId = computeSourceId;
            return this;
        }
        public Long getComputeSourceId() {
            return this.computeSourceId;
        }

        public CreateBasicProjectRequestCreateCommand setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public CreateBasicProjectRequestCreateCommand setDisplayName(String displayName) {
            this.displayName = displayName;
            return this;
        }
        public String getDisplayName() {
            return this.displayName;
        }

        public CreateBasicProjectRequestCreateCommand setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public CreateBasicProjectRequestCreateCommand setNameSpaceTag(String nameSpaceTag) {
            this.nameSpaceTag = nameSpaceTag;
            return this;
        }
        public String getNameSpaceTag() {
            return this.nameSpaceTag;
        }

        public CreateBasicProjectRequestCreateCommand setStreamComputeSourceId(Long streamComputeSourceId) {
            this.streamComputeSourceId = streamComputeSourceId;
            return this;
        }
        public Long getStreamComputeSourceId() {
            return this.streamComputeSourceId;
        }

        public CreateBasicProjectRequestCreateCommand setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public CreateBasicProjectRequestCreateCommand setWhiteLists(java.util.List<CreateBasicProjectRequestCreateCommandWhiteLists> whiteLists) {
            this.whiteLists = whiteLists;
            return this;
        }
        public java.util.List<CreateBasicProjectRequestCreateCommandWhiteLists> getWhiteLists() {
            return this.whiteLists;
        }

    }

}
