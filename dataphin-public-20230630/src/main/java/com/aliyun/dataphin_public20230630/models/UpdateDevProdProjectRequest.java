// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class UpdateDevProdProjectRequest extends TeaModel {
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

    /**
     * <p>The update command.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("UpdateCommand")
    public UpdateDevProdProjectRequestUpdateCommand updateCommand;

    public static UpdateDevProdProjectRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateDevProdProjectRequest self = new UpdateDevProdProjectRequest();
        return TeaModel.build(map, self);
    }

    public UpdateDevProdProjectRequest setOpTenantId(Long opTenantId) {
        this.opTenantId = opTenantId;
        return this;
    }
    public Long getOpTenantId() {
        return this.opTenantId;
    }

    public UpdateDevProdProjectRequest setOpUserId(String opUserId) {
        this.opUserId = opUserId;
        return this;
    }
    public String getOpUserId() {
        return this.opUserId;
    }

    public UpdateDevProdProjectRequest setUpdateCommand(UpdateDevProdProjectRequestUpdateCommand updateCommand) {
        this.updateCommand = updateCommand;
        return this;
    }
    public UpdateDevProdProjectRequestUpdateCommand getUpdateCommand() {
        return this.updateCommand;
    }

    public static class UpdateDevProdProjectRequestUpdateCommandWhiteLists extends TeaModel {
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

        public static UpdateDevProdProjectRequestUpdateCommandWhiteLists build(java.util.Map<String, ?> map) throws Exception {
            UpdateDevProdProjectRequestUpdateCommandWhiteLists self = new UpdateDevProdProjectRequestUpdateCommandWhiteLists();
            return TeaModel.build(map, self);
        }

        public UpdateDevProdProjectRequestUpdateCommandWhiteLists setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public UpdateDevProdProjectRequestUpdateCommandWhiteLists setIp(String ip) {
            this.ip = ip;
            return this;
        }
        public String getIp() {
            return this.ip;
        }

        public UpdateDevProdProjectRequestUpdateCommandWhiteLists setPort(String port) {
            this.port = port;
            return this;
        }
        public String getPort() {
            return this.port;
        }

    }

    public static class UpdateDevProdProjectRequestUpdateCommand extends TeaModel {
        /**
         * <p>The business unit ID.</p>
         * 
         * <strong>example:</strong>
         * <p>1001</p>
         */
        @NameInMap("BizUnitId")
        public Long bizUnitId;

        /**
         * <p>The ID of the offline compute source in the development environment.</p>
         * 
         * <strong>example:</strong>
         * <p>2001</p>
         */
        @NameInMap("DevComputeSourceId")
        public Long devComputeSourceId;

        /**
         * <p>The description of the development environment.</p>
         * 
         * <strong>example:</strong>
         * <p>dev desc</p>
         */
        @NameInMap("DevDescription")
        public String devDescription;

        /**
         * <p>The ID of the real-time compute source in the development environment.</p>
         * 
         * <strong>example:</strong>
         * <p>2002</p>
         */
        @NameInMap("DevStreamComputeSourceId")
        public Long devStreamComputeSourceId;

        /**
         * <p>The display name of the project.</p>
         * 
         * <strong>example:</strong>
         * <p>My project.</p>
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
         * <p>The project name.</p>
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
         * <p>The ID of the offline compute source in the production environment.</p>
         * 
         * <strong>example:</strong>
         * <p>2003</p>
         */
        @NameInMap("ProdComputeSourceId")
        public Long prodComputeSourceId;

        /**
         * <p>The description of the production environment.</p>
         * 
         * <strong>example:</strong>
         * <p>prod desc</p>
         */
        @NameInMap("ProdDescription")
        public String prodDescription;

        /**
         * <p>The ID of the real-time compute source in the production environment.</p>
         * 
         * <strong>example:</strong>
         * <p>2004</p>
         */
        @NameInMap("ProdStreamComputeSourceId")
        public Long prodStreamComputeSourceId;

        /**
         * <p>The sandbox whitelist.</p>
         */
        @NameInMap("WhiteLists")
        public java.util.List<UpdateDevProdProjectRequestUpdateCommandWhiteLists> whiteLists;

        public static UpdateDevProdProjectRequestUpdateCommand build(java.util.Map<String, ?> map) throws Exception {
            UpdateDevProdProjectRequestUpdateCommand self = new UpdateDevProdProjectRequestUpdateCommand();
            return TeaModel.build(map, self);
        }

        public UpdateDevProdProjectRequestUpdateCommand setBizUnitId(Long bizUnitId) {
            this.bizUnitId = bizUnitId;
            return this;
        }
        public Long getBizUnitId() {
            return this.bizUnitId;
        }

        public UpdateDevProdProjectRequestUpdateCommand setDevComputeSourceId(Long devComputeSourceId) {
            this.devComputeSourceId = devComputeSourceId;
            return this;
        }
        public Long getDevComputeSourceId() {
            return this.devComputeSourceId;
        }

        public UpdateDevProdProjectRequestUpdateCommand setDevDescription(String devDescription) {
            this.devDescription = devDescription;
            return this;
        }
        public String getDevDescription() {
            return this.devDescription;
        }

        public UpdateDevProdProjectRequestUpdateCommand setDevStreamComputeSourceId(Long devStreamComputeSourceId) {
            this.devStreamComputeSourceId = devStreamComputeSourceId;
            return this;
        }
        public Long getDevStreamComputeSourceId() {
            return this.devStreamComputeSourceId;
        }

        public UpdateDevProdProjectRequestUpdateCommand setDisplayName(String displayName) {
            this.displayName = displayName;
            return this;
        }
        public String getDisplayName() {
            return this.displayName;
        }

        public UpdateDevProdProjectRequestUpdateCommand setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public UpdateDevProdProjectRequestUpdateCommand setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public UpdateDevProdProjectRequestUpdateCommand setNameSpaceTag(String nameSpaceTag) {
            this.nameSpaceTag = nameSpaceTag;
            return this;
        }
        public String getNameSpaceTag() {
            return this.nameSpaceTag;
        }

        public UpdateDevProdProjectRequestUpdateCommand setProdComputeSourceId(Long prodComputeSourceId) {
            this.prodComputeSourceId = prodComputeSourceId;
            return this;
        }
        public Long getProdComputeSourceId() {
            return this.prodComputeSourceId;
        }

        public UpdateDevProdProjectRequestUpdateCommand setProdDescription(String prodDescription) {
            this.prodDescription = prodDescription;
            return this;
        }
        public String getProdDescription() {
            return this.prodDescription;
        }

        public UpdateDevProdProjectRequestUpdateCommand setProdStreamComputeSourceId(Long prodStreamComputeSourceId) {
            this.prodStreamComputeSourceId = prodStreamComputeSourceId;
            return this;
        }
        public Long getProdStreamComputeSourceId() {
            return this.prodStreamComputeSourceId;
        }

        public UpdateDevProdProjectRequestUpdateCommand setWhiteLists(java.util.List<UpdateDevProdProjectRequestUpdateCommandWhiteLists> whiteLists) {
            this.whiteLists = whiteLists;
            return this;
        }
        public java.util.List<UpdateDevProdProjectRequestUpdateCommandWhiteLists> getWhiteLists() {
            return this.whiteLists;
        }

    }

}
