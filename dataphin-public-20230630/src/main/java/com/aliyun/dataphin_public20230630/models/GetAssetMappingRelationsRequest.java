// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class GetAssetMappingRelationsRequest extends TeaModel {
    @NameInMap("AssetMappingQuery")
    public GetAssetMappingRelationsRequestAssetMappingQuery assetMappingQuery;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>30001011</p>
     */
    @NameInMap("OpTenantId")
    public Long opTenantId;

    public static GetAssetMappingRelationsRequest build(java.util.Map<String, ?> map) throws Exception {
        GetAssetMappingRelationsRequest self = new GetAssetMappingRelationsRequest();
        return TeaModel.build(map, self);
    }

    public GetAssetMappingRelationsRequest setAssetMappingQuery(GetAssetMappingRelationsRequestAssetMappingQuery assetMappingQuery) {
        this.assetMappingQuery = assetMappingQuery;
        return this;
    }
    public GetAssetMappingRelationsRequestAssetMappingQuery getAssetMappingQuery() {
        return this.assetMappingQuery;
    }

    public GetAssetMappingRelationsRequest setOpTenantId(Long opTenantId) {
        this.opTenantId = opTenantId;
        return this;
    }
    public Long getOpTenantId() {
        return this.opTenantId;
    }

    public static class GetAssetMappingRelationsRequestAssetMappingQuery extends TeaModel {
        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>INDEX</p>
         */
        @NameInMap("AssetType")
        public String assetType;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1121</p>
         */
        @NameInMap("Guid")
        public String guid;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>VALID</p>
         */
        @NameInMap("RelationType")
        public String relationType;

        public static GetAssetMappingRelationsRequestAssetMappingQuery build(java.util.Map<String, ?> map) throws Exception {
            GetAssetMappingRelationsRequestAssetMappingQuery self = new GetAssetMappingRelationsRequestAssetMappingQuery();
            return TeaModel.build(map, self);
        }

        public GetAssetMappingRelationsRequestAssetMappingQuery setAssetType(String assetType) {
            this.assetType = assetType;
            return this;
        }
        public String getAssetType() {
            return this.assetType;
        }

        public GetAssetMappingRelationsRequestAssetMappingQuery setGuid(String guid) {
            this.guid = guid;
            return this;
        }
        public String getGuid() {
            return this.guid;
        }

        public GetAssetMappingRelationsRequestAssetMappingQuery setRelationType(String relationType) {
            this.relationType = relationType;
            return this;
        }
        public String getRelationType() {
            return this.relationType;
        }

    }

}
