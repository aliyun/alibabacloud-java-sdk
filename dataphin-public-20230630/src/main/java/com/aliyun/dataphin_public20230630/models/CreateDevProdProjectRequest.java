// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class CreateDevProdProjectRequest extends TeaModel {
    /**
     * <p>The create command.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("CreateCommand")
    public CreateDevProdProjectRequestCreateCommand createCommand;

    /**
     * <p>The tenant ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>30001011</p>
     */
    @NameInMap("OpTenantId")
    public Long opTenantId;

    public static CreateDevProdProjectRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateDevProdProjectRequest self = new CreateDevProdProjectRequest();
        return TeaModel.build(map, self);
    }

    public CreateDevProdProjectRequest setCreateCommand(CreateDevProdProjectRequestCreateCommand createCommand) {
        this.createCommand = createCommand;
        return this;
    }
    public CreateDevProdProjectRequestCreateCommand getCreateCommand() {
        return this.createCommand;
    }

    public CreateDevProdProjectRequest setOpTenantId(Long opTenantId) {
        this.opTenantId = opTenantId;
        return this;
    }
    public Long getOpTenantId() {
        return this.opTenantId;
    }

    public static class CreateDevProdProjectRequestCreateCommandWhiteLists extends TeaModel {
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

        public static CreateDevProdProjectRequestCreateCommandWhiteLists build(java.util.Map<String, ?> map) throws Exception {
            CreateDevProdProjectRequestCreateCommandWhiteLists self = new CreateDevProdProjectRequestCreateCommandWhiteLists();
            return TeaModel.build(map, self);
        }

        public CreateDevProdProjectRequestCreateCommandWhiteLists setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public CreateDevProdProjectRequestCreateCommandWhiteLists setIp(String ip) {
            this.ip = ip;
            return this;
        }
        public String getIp() {
            return this.ip;
        }

        public CreateDevProdProjectRequestCreateCommandWhiteLists setPort(String port) {
            this.port = port;
            return this;
        }
        public String getPort() {
            return this.port;
        }

    }

    public static class CreateDevProdProjectRequestCreateCommand extends TeaModel {
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
        public java.util.List<CreateDevProdProjectRequestCreateCommandWhiteLists> whiteLists;

        public static CreateDevProdProjectRequestCreateCommand build(java.util.Map<String, ?> map) throws Exception {
            CreateDevProdProjectRequestCreateCommand self = new CreateDevProdProjectRequestCreateCommand();
            return TeaModel.build(map, self);
        }

        public CreateDevProdProjectRequestCreateCommand setBizUnitId(Long bizUnitId) {
            this.bizUnitId = bizUnitId;
            return this;
        }
        public Long getBizUnitId() {
            return this.bizUnitId;
        }

        public CreateDevProdProjectRequestCreateCommand setDevComputeSourceId(Long devComputeSourceId) {
            this.devComputeSourceId = devComputeSourceId;
            return this;
        }
        public Long getDevComputeSourceId() {
            return this.devComputeSourceId;
        }

        public CreateDevProdProjectRequestCreateCommand setDevDescription(String devDescription) {
            this.devDescription = devDescription;
            return this;
        }
        public String getDevDescription() {
            return this.devDescription;
        }

        public CreateDevProdProjectRequestCreateCommand setDevStreamComputeSourceId(Long devStreamComputeSourceId) {
            this.devStreamComputeSourceId = devStreamComputeSourceId;
            return this;
        }
        public Long getDevStreamComputeSourceId() {
            return this.devStreamComputeSourceId;
        }

        public CreateDevProdProjectRequestCreateCommand setDisplayName(String displayName) {
            this.displayName = displayName;
            return this;
        }
        public String getDisplayName() {
            return this.displayName;
        }

        public CreateDevProdProjectRequestCreateCommand setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public CreateDevProdProjectRequestCreateCommand setNameSpaceTag(String nameSpaceTag) {
            this.nameSpaceTag = nameSpaceTag;
            return this;
        }
        public String getNameSpaceTag() {
            return this.nameSpaceTag;
        }

        public CreateDevProdProjectRequestCreateCommand setProdComputeSourceId(Long prodComputeSourceId) {
            this.prodComputeSourceId = prodComputeSourceId;
            return this;
        }
        public Long getProdComputeSourceId() {
            return this.prodComputeSourceId;
        }

        public CreateDevProdProjectRequestCreateCommand setProdDescription(String prodDescription) {
            this.prodDescription = prodDescription;
            return this;
        }
        public String getProdDescription() {
            return this.prodDescription;
        }

        public CreateDevProdProjectRequestCreateCommand setProdStreamComputeSourceId(Long prodStreamComputeSourceId) {
            this.prodStreamComputeSourceId = prodStreamComputeSourceId;
            return this;
        }
        public Long getProdStreamComputeSourceId() {
            return this.prodStreamComputeSourceId;
        }

        public CreateDevProdProjectRequestCreateCommand setWhiteLists(java.util.List<CreateDevProdProjectRequestCreateCommandWhiteLists> whiteLists) {
            this.whiteLists = whiteLists;
            return this;
        }
        public java.util.List<CreateDevProdProjectRequestCreateCommandWhiteLists> getWhiteLists() {
            return this.whiteLists;
        }

    }

}
