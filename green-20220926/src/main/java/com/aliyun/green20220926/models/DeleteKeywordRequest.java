// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20220926.models;

import com.aliyun.tea.*;

public class DeleteKeywordRequest extends TeaModel {
    /**
     * <p>The IDs of the keywords to delete.</p>
     * 
     * <strong>example:</strong>
     * <p>[6715465]</p>
     */
    @NameInMap("KeywordIdList")
    public String keywordIdList;

    /**
     * <p>The IDs of the keywords to delete.</p>
     * 
     * <strong>example:</strong>
     * <p>[16754493]</p>
     */
    @NameInMap("KeywordIds")
    public String keywordIds;

    /**
     * <p>The ID of the keyword library.</p>
     * 
     * <strong>example:</strong>
     * <p>customxx_xxxx</p>
     */
    @NameInMap("LibId")
    public String libId;

    /**
     * <p>The region ID.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-shanghai</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The code of the keyword library.</p>
     * <ul>
     * <li>desensitize: masking keyword library.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>desensitize</p>
     */
    @NameInMap("TenantCode")
    public String tenantCode;

    public static DeleteKeywordRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteKeywordRequest self = new DeleteKeywordRequest();
        return TeaModel.build(map, self);
    }

    public DeleteKeywordRequest setKeywordIdList(String keywordIdList) {
        this.keywordIdList = keywordIdList;
        return this;
    }
    public String getKeywordIdList() {
        return this.keywordIdList;
    }

    public DeleteKeywordRequest setKeywordIds(String keywordIds) {
        this.keywordIds = keywordIds;
        return this;
    }
    public String getKeywordIds() {
        return this.keywordIds;
    }

    public DeleteKeywordRequest setLibId(String libId) {
        this.libId = libId;
        return this;
    }
    public String getLibId() {
        return this.libId;
    }

    public DeleteKeywordRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DeleteKeywordRequest setTenantCode(String tenantCode) {
        this.tenantCode = tenantCode;
        return this;
    }
    public String getTenantCode() {
        return this.tenantCode;
    }

}
