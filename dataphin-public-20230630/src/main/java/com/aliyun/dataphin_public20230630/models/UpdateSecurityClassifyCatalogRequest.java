// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class UpdateSecurityClassifyCatalogRequest extends TeaModel {
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
     * <p>The ID of the operator.</p>
     * 
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
    public UpdateSecurityClassifyCatalogRequestUpdateCommand updateCommand;

    public static UpdateSecurityClassifyCatalogRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateSecurityClassifyCatalogRequest self = new UpdateSecurityClassifyCatalogRequest();
        return TeaModel.build(map, self);
    }

    public UpdateSecurityClassifyCatalogRequest setOpTenantId(Long opTenantId) {
        this.opTenantId = opTenantId;
        return this;
    }
    public Long getOpTenantId() {
        return this.opTenantId;
    }

    public UpdateSecurityClassifyCatalogRequest setOpUserId(String opUserId) {
        this.opUserId = opUserId;
        return this;
    }
    public String getOpUserId() {
        return this.opUserId;
    }

    public UpdateSecurityClassifyCatalogRequest setUpdateCommand(UpdateSecurityClassifyCatalogRequestUpdateCommand updateCommand) {
        this.updateCommand = updateCommand;
        return this;
    }
    public UpdateSecurityClassifyCatalogRequestUpdateCommand getUpdateCommand() {
        return this.updateCommand;
    }

    public static class UpdateSecurityClassifyCatalogRequestUpdateCommand extends TeaModel {
        /**
         * <p>The name of the classification catalog.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The list of administrator IDs. This parameter is valid only when the parent catalog is the root catalog.</p>
         */
        @NameInMap("OwnerList")
        public java.util.List<String> ownerList;

        /**
         * <p>The full path of the parent classification catalog. Default value: /.</p>
         * 
         * <strong>example:</strong>
         * <p>/d1/</p>
         */
        @NameInMap("ParentPath")
        public String parentPath;

        /**
         * <p>The original full path of the catalog.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>/d1/d2/</p>
         */
        @NameInMap("Path")
        public String path;

        /**
         * <p>The classification visibility scope. Valid values: PUBLIC (public) and PRIVATE (visible only to administrators). Default value: PUBLIC. This parameter is valid only when the parent catalog is the root catalog.</p>
         * 
         * <strong>example:</strong>
         * <p>PUBLIC</p>
         */
        @NameInMap("VisibleType")
        public String visibleType;

        public static UpdateSecurityClassifyCatalogRequestUpdateCommand build(java.util.Map<String, ?> map) throws Exception {
            UpdateSecurityClassifyCatalogRequestUpdateCommand self = new UpdateSecurityClassifyCatalogRequestUpdateCommand();
            return TeaModel.build(map, self);
        }

        public UpdateSecurityClassifyCatalogRequestUpdateCommand setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public UpdateSecurityClassifyCatalogRequestUpdateCommand setOwnerList(java.util.List<String> ownerList) {
            this.ownerList = ownerList;
            return this;
        }
        public java.util.List<String> getOwnerList() {
            return this.ownerList;
        }

        public UpdateSecurityClassifyCatalogRequestUpdateCommand setParentPath(String parentPath) {
            this.parentPath = parentPath;
            return this;
        }
        public String getParentPath() {
            return this.parentPath;
        }

        public UpdateSecurityClassifyCatalogRequestUpdateCommand setPath(String path) {
            this.path = path;
            return this;
        }
        public String getPath() {
            return this.path;
        }

        public UpdateSecurityClassifyCatalogRequestUpdateCommand setVisibleType(String visibleType) {
            this.visibleType = visibleType;
            return this;
        }
        public String getVisibleType() {
            return this.visibleType;
        }

    }

}
