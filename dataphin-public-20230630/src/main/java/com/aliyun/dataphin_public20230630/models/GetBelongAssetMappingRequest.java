// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class GetBelongAssetMappingRequest extends TeaModel {
    @NameInMap("AssetMappingQuery")
    public GetBelongAssetMappingRequestAssetMappingQuery assetMappingQuery;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>30001011</p>
     */
    @NameInMap("OpTenantId")
    public Long opTenantId;

    public static GetBelongAssetMappingRequest build(java.util.Map<String, ?> map) throws Exception {
        GetBelongAssetMappingRequest self = new GetBelongAssetMappingRequest();
        return TeaModel.build(map, self);
    }

    public GetBelongAssetMappingRequest setAssetMappingQuery(GetBelongAssetMappingRequestAssetMappingQuery assetMappingQuery) {
        this.assetMappingQuery = assetMappingQuery;
        return this;
    }
    public GetBelongAssetMappingRequestAssetMappingQuery getAssetMappingQuery() {
        return this.assetMappingQuery;
    }

    public GetBelongAssetMappingRequest setOpTenantId(Long opTenantId) {
        this.opTenantId = opTenantId;
        return this;
    }
    public Long getOpTenantId() {
        return this.opTenantId;
    }

    public static class GetBelongAssetMappingRequestAssetMappingQuery extends TeaModel {
        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1121</p>
         */
        @NameInMap("BelongGuid")
        public String belongGuid;

        /**
         * <strong>example:</strong>
         * <p>VALID</p>
         */
        @NameInMap("RelationType")
        public String relationType;

        public static GetBelongAssetMappingRequestAssetMappingQuery build(java.util.Map<String, ?> map) throws Exception {
            GetBelongAssetMappingRequestAssetMappingQuery self = new GetBelongAssetMappingRequestAssetMappingQuery();
            return TeaModel.build(map, self);
        }

        public GetBelongAssetMappingRequestAssetMappingQuery setBelongGuid(String belongGuid) {
            this.belongGuid = belongGuid;
            return this;
        }
        public String getBelongGuid() {
            return this.belongGuid;
        }

        public GetBelongAssetMappingRequestAssetMappingQuery setRelationType(String relationType) {
            this.relationType = relationType;
            return this;
        }
        public String getRelationType() {
            return this.relationType;
        }

    }

}
