// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class GetCatalogAssetDetailsRequest extends TeaModel {
    /**
     * <p>The paging query for the listing asset catalog list.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("GetCatalogAssetDetailsQuery")
    public GetCatalogAssetDetailsRequestGetCatalogAssetDetailsQuery getCatalogAssetDetailsQuery;

    /**
     * <p>The tenant ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>30001011</p>
     */
    @NameInMap("OpTenantId")
    public Long opTenantId;

    public static GetCatalogAssetDetailsRequest build(java.util.Map<String, ?> map) throws Exception {
        GetCatalogAssetDetailsRequest self = new GetCatalogAssetDetailsRequest();
        return TeaModel.build(map, self);
    }

    public GetCatalogAssetDetailsRequest setGetCatalogAssetDetailsQuery(GetCatalogAssetDetailsRequestGetCatalogAssetDetailsQuery getCatalogAssetDetailsQuery) {
        this.getCatalogAssetDetailsQuery = getCatalogAssetDetailsQuery;
        return this;
    }
    public GetCatalogAssetDetailsRequestGetCatalogAssetDetailsQuery getGetCatalogAssetDetailsQuery() {
        return this.getCatalogAssetDetailsQuery;
    }

    public GetCatalogAssetDetailsRequest setOpTenantId(Long opTenantId) {
        this.opTenantId = opTenantId;
        return this;
    }
    public Long getOpTenantId() {
        return this.opTenantId;
    }

    public static class GetCatalogAssetDetailsRequestGetCatalogAssetDetailsQuery extends TeaModel {
        /**
         * <p>The asset GUID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>dp_ds_table.300023201.7311626611751680256.load_test.abc</p>
         */
        @NameInMap("Guid")
        public String guid;

        /**
         * <p>Specifies whether to include the field list. Default value: false. Valid values:</p>
         * <ul>
         * <li>false: Not included.</li>
         * <li>true: Included.</li>
         * </ul>
         */
        @NameInMap("IncludeColumns")
        public Boolean includeColumns;

        /**
         * <p>Specifies whether to include detailed data. Default value: false. Valid values:</p>
         * <ul>
         * <li>false: Not included.</li>
         * <li>true: Included.</li>
         * </ul>
         */
        @NameInMap("IncludeDetailedAttributes")
        public Boolean includeDetailedAttributes;

        public static GetCatalogAssetDetailsRequestGetCatalogAssetDetailsQuery build(java.util.Map<String, ?> map) throws Exception {
            GetCatalogAssetDetailsRequestGetCatalogAssetDetailsQuery self = new GetCatalogAssetDetailsRequestGetCatalogAssetDetailsQuery();
            return TeaModel.build(map, self);
        }

        public GetCatalogAssetDetailsRequestGetCatalogAssetDetailsQuery setGuid(String guid) {
            this.guid = guid;
            return this;
        }
        public String getGuid() {
            return this.guid;
        }

        public GetCatalogAssetDetailsRequestGetCatalogAssetDetailsQuery setIncludeColumns(Boolean includeColumns) {
            this.includeColumns = includeColumns;
            return this;
        }
        public Boolean getIncludeColumns() {
            return this.includeColumns;
        }

        public GetCatalogAssetDetailsRequestGetCatalogAssetDetailsQuery setIncludeDetailedAttributes(Boolean includeDetailedAttributes) {
            this.includeDetailedAttributes = includeDetailedAttributes;
            return this;
        }
        public Boolean getIncludeDetailedAttributes() {
            return this.includeDetailedAttributes;
        }

    }

}
