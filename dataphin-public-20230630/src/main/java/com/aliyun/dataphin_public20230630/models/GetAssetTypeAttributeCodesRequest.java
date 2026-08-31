// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class GetAssetTypeAttributeCodesRequest extends TeaModel {
    /**
     * <p>The asset type filter. Valid values:</p>
     * <ul>
     * <li>TABLE: table.</li>
     * <li>COLUMN: column.</li>
     * <li>INDEX: metric.</li>
     * <li>BIZ_INDEX: business metric.</li>
     * <li>API: API.</li>
     * <li>PAGE: dashboard.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>TABLE</p>
     */
    @NameInMap("AssetType")
    public String assetType;

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

    public static GetAssetTypeAttributeCodesRequest build(java.util.Map<String, ?> map) throws Exception {
        GetAssetTypeAttributeCodesRequest self = new GetAssetTypeAttributeCodesRequest();
        return TeaModel.build(map, self);
    }

    public GetAssetTypeAttributeCodesRequest setAssetType(String assetType) {
        this.assetType = assetType;
        return this;
    }
    public String getAssetType() {
        return this.assetType;
    }

    public GetAssetTypeAttributeCodesRequest setOpTenantId(Long opTenantId) {
        this.opTenantId = opTenantId;
        return this;
    }
    public Long getOpTenantId() {
        return this.opTenantId;
    }

    public GetAssetTypeAttributeCodesRequest setOpUserId(String opUserId) {
        this.opUserId = opUserId;
        return this;
    }
    public String getOpUserId() {
        return this.opUserId;
    }

}
