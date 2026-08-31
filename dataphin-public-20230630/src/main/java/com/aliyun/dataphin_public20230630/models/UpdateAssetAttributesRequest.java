// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class UpdateAssetAttributesRequest extends TeaModel {
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
    public UpdateAssetAttributesRequestUpdateCommand updateCommand;

    public static UpdateAssetAttributesRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateAssetAttributesRequest self = new UpdateAssetAttributesRequest();
        return TeaModel.build(map, self);
    }

    public UpdateAssetAttributesRequest setOpTenantId(Long opTenantId) {
        this.opTenantId = opTenantId;
        return this;
    }
    public Long getOpTenantId() {
        return this.opTenantId;
    }

    public UpdateAssetAttributesRequest setOpUserId(String opUserId) {
        this.opUserId = opUserId;
        return this;
    }
    public String getOpUserId() {
        return this.opUserId;
    }

    public UpdateAssetAttributesRequest setUpdateCommand(UpdateAssetAttributesRequestUpdateCommand updateCommand) {
        this.updateCommand = updateCommand;
        return this;
    }
    public UpdateAssetAttributesRequestUpdateCommand getUpdateCommand() {
        return this.updateCommand;
    }

    public static class UpdateAssetAttributesRequestUpdateCommandAssetAttributeUpdateListAttributeList extends TeaModel {
        /**
         * <p>The property code. This value must match the AttributeCode returned by the GetAssetTypeAttributeCodes operation.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>data_level</p>
         */
        @NameInMap("AttributeCode")
        public String attributeCode;

        /**
         * <p>The list of property values. For a single-value property, pass one element. For a multi-value property, pass multiple elements. Pass an empty array [] to clear the property value.</p>
         * <p>This parameter is required.</p>
         */
        @NameInMap("Values")
        public java.util.List<String> values;

        public static UpdateAssetAttributesRequestUpdateCommandAssetAttributeUpdateListAttributeList build(java.util.Map<String, ?> map) throws Exception {
            UpdateAssetAttributesRequestUpdateCommandAssetAttributeUpdateListAttributeList self = new UpdateAssetAttributesRequestUpdateCommandAssetAttributeUpdateListAttributeList();
            return TeaModel.build(map, self);
        }

        public UpdateAssetAttributesRequestUpdateCommandAssetAttributeUpdateListAttributeList setAttributeCode(String attributeCode) {
            this.attributeCode = attributeCode;
            return this;
        }
        public String getAttributeCode() {
            return this.attributeCode;
        }

        public UpdateAssetAttributesRequestUpdateCommandAssetAttributeUpdateListAttributeList setValues(java.util.List<String> values) {
            this.values = values;
            return this;
        }
        public java.util.List<String> getValues() {
            return this.values;
        }

    }

    public static class UpdateAssetAttributesRequestUpdateCommandAssetAttributeUpdateList extends TeaModel {
        /**
         * <p>The list of properties to update.</p>
         * <p>This parameter is required.</p>
         */
        @NameInMap("AttributeList")
        public java.util.List<UpdateAssetAttributesRequestUpdateCommandAssetAttributeUpdateListAttributeList> attributeList;

        /**
         * <p>The globally unique identifier (GUID) of the asset. You can obtain this value by calling operations such as ListCatalogAssets and GetTableColumnByTableGuids.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>odps.project_a.table_orders</p>
         */
        @NameInMap("Guid")
        public String guid;

        public static UpdateAssetAttributesRequestUpdateCommandAssetAttributeUpdateList build(java.util.Map<String, ?> map) throws Exception {
            UpdateAssetAttributesRequestUpdateCommandAssetAttributeUpdateList self = new UpdateAssetAttributesRequestUpdateCommandAssetAttributeUpdateList();
            return TeaModel.build(map, self);
        }

        public UpdateAssetAttributesRequestUpdateCommandAssetAttributeUpdateList setAttributeList(java.util.List<UpdateAssetAttributesRequestUpdateCommandAssetAttributeUpdateListAttributeList> attributeList) {
            this.attributeList = attributeList;
            return this;
        }
        public java.util.List<UpdateAssetAttributesRequestUpdateCommandAssetAttributeUpdateListAttributeList> getAttributeList() {
            return this.attributeList;
        }

        public UpdateAssetAttributesRequestUpdateCommandAssetAttributeUpdateList setGuid(String guid) {
            this.guid = guid;
            return this;
        }
        public String getGuid() {
            return this.guid;
        }

    }

    public static class UpdateAssetAttributesRequestUpdateCommand extends TeaModel {
        /**
         * <p>The list of asset property updates. A maximum of 50 entries can be specified in a single request.</p>
         * <p>This parameter is required.</p>
         */
        @NameInMap("AssetAttributeUpdateList")
        public java.util.List<UpdateAssetAttributesRequestUpdateCommandAssetAttributeUpdateList> assetAttributeUpdateList;

        public static UpdateAssetAttributesRequestUpdateCommand build(java.util.Map<String, ?> map) throws Exception {
            UpdateAssetAttributesRequestUpdateCommand self = new UpdateAssetAttributesRequestUpdateCommand();
            return TeaModel.build(map, self);
        }

        public UpdateAssetAttributesRequestUpdateCommand setAssetAttributeUpdateList(java.util.List<UpdateAssetAttributesRequestUpdateCommandAssetAttributeUpdateList> assetAttributeUpdateList) {
            this.assetAttributeUpdateList = assetAttributeUpdateList;
            return this;
        }
        public java.util.List<UpdateAssetAttributesRequestUpdateCommandAssetAttributeUpdateList> getAssetAttributeUpdateList() {
            return this.assetAttributeUpdateList;
        }

    }

}
