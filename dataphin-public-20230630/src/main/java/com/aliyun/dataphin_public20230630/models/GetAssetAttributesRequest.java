// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class GetAssetAttributesRequest extends TeaModel {
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
     * <p>The ID of the operator user.</p>
     * 
     * <strong>example:</strong>
     * <p>30001011</p>
     */
    @NameInMap("OpUserId")
    public String opUserId;

    /**
     * <p>The query instruction.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("QueryCommand")
    public GetAssetAttributesRequestQueryCommand queryCommand;

    public static GetAssetAttributesRequest build(java.util.Map<String, ?> map) throws Exception {
        GetAssetAttributesRequest self = new GetAssetAttributesRequest();
        return TeaModel.build(map, self);
    }

    public GetAssetAttributesRequest setOpTenantId(Long opTenantId) {
        this.opTenantId = opTenantId;
        return this;
    }
    public Long getOpTenantId() {
        return this.opTenantId;
    }

    public GetAssetAttributesRequest setOpUserId(String opUserId) {
        this.opUserId = opUserId;
        return this;
    }
    public String getOpUserId() {
        return this.opUserId;
    }

    public GetAssetAttributesRequest setQueryCommand(GetAssetAttributesRequestQueryCommand queryCommand) {
        this.queryCommand = queryCommand;
        return this;
    }
    public GetAssetAttributesRequestQueryCommand getQueryCommand() {
        return this.queryCommand;
    }

    public static class GetAssetAttributesRequestQueryCommand extends TeaModel {
        /**
         * <p>The list of property codes to return. If this parameter is not specified, all custom properties of the asset are returned.</p>
         */
        @NameInMap("AttributeCodeList")
        public java.util.List<String> attributeCodeList;

        /**
         * <p>The list of asset GUIDs. A maximum of 50 GUIDs are supported.</p>
         * <p>This parameter is required.</p>
         */
        @NameInMap("GuidList")
        public java.util.List<String> guidList;

        public static GetAssetAttributesRequestQueryCommand build(java.util.Map<String, ?> map) throws Exception {
            GetAssetAttributesRequestQueryCommand self = new GetAssetAttributesRequestQueryCommand();
            return TeaModel.build(map, self);
        }

        public GetAssetAttributesRequestQueryCommand setAttributeCodeList(java.util.List<String> attributeCodeList) {
            this.attributeCodeList = attributeCodeList;
            return this;
        }
        public java.util.List<String> getAttributeCodeList() {
            return this.attributeCodeList;
        }

        public GetAssetAttributesRequestQueryCommand setGuidList(java.util.List<String> guidList) {
            this.guidList = guidList;
            return this;
        }
        public java.util.List<String> getGuidList() {
            return this.guidList;
        }

    }

}
