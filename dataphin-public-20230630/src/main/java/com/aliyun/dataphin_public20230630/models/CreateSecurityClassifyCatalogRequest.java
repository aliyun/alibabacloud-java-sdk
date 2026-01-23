// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class CreateSecurityClassifyCatalogRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("CreateCommand")
    public CreateSecurityClassifyCatalogRequestCreateCommand createCommand;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>30001011</p>
     */
    @NameInMap("OpTenantId")
    public Long opTenantId;

    public static CreateSecurityClassifyCatalogRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateSecurityClassifyCatalogRequest self = new CreateSecurityClassifyCatalogRequest();
        return TeaModel.build(map, self);
    }

    public CreateSecurityClassifyCatalogRequest setCreateCommand(CreateSecurityClassifyCatalogRequestCreateCommand createCommand) {
        this.createCommand = createCommand;
        return this;
    }
    public CreateSecurityClassifyCatalogRequestCreateCommand getCreateCommand() {
        return this.createCommand;
    }

    public CreateSecurityClassifyCatalogRequest setOpTenantId(Long opTenantId) {
        this.opTenantId = opTenantId;
        return this;
    }
    public Long getOpTenantId() {
        return this.opTenantId;
    }

    public static class CreateSecurityClassifyCatalogRequestCreateCommand extends TeaModel {
        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("Name")
        public String name;

        @NameInMap("OwnerList")
        public java.util.List<String> ownerList;

        /**
         * <strong>example:</strong>
         * <p>/d1/</p>
         */
        @NameInMap("ParentPath")
        public String parentPath;

        /**
         * <strong>example:</strong>
         * <p>PUBLIC</p>
         */
        @NameInMap("VisibleType")
        public String visibleType;

        public static CreateSecurityClassifyCatalogRequestCreateCommand build(java.util.Map<String, ?> map) throws Exception {
            CreateSecurityClassifyCatalogRequestCreateCommand self = new CreateSecurityClassifyCatalogRequestCreateCommand();
            return TeaModel.build(map, self);
        }

        public CreateSecurityClassifyCatalogRequestCreateCommand setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public CreateSecurityClassifyCatalogRequestCreateCommand setOwnerList(java.util.List<String> ownerList) {
            this.ownerList = ownerList;
            return this;
        }
        public java.util.List<String> getOwnerList() {
            return this.ownerList;
        }

        public CreateSecurityClassifyCatalogRequestCreateCommand setParentPath(String parentPath) {
            this.parentPath = parentPath;
            return this;
        }
        public String getParentPath() {
            return this.parentPath;
        }

        public CreateSecurityClassifyCatalogRequestCreateCommand setVisibleType(String visibleType) {
            this.visibleType = visibleType;
            return this;
        }
        public String getVisibleType() {
            return this.visibleType;
        }

    }

}
