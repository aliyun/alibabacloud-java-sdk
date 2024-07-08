// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dytnsapi20200217.models;

import com.aliyun.tea.*;

public class QueryTagInfoBySelectionRequest extends TeaModel {
    /**
     * <p>The industry ID.</p>
     * 
     * <strong>example:</strong>
     * <p>58</p>
     */
    @NameInMap("IndustryId")
    public Long industryId;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>The scene ID.</p>
     * 
     * <strong>example:</strong>
     * <p>83</p>
     */
    @NameInMap("SceneId")
    public Long sceneId;

    /**
     * <p>The tag ID.</p>
     * 
     * <strong>example:</strong>
     * <p>71</p>
     */
    @NameInMap("TagId")
    public Long tagId;

    public static QueryTagInfoBySelectionRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryTagInfoBySelectionRequest self = new QueryTagInfoBySelectionRequest();
        return TeaModel.build(map, self);
    }

    public QueryTagInfoBySelectionRequest setIndustryId(Long industryId) {
        this.industryId = industryId;
        return this;
    }
    public Long getIndustryId() {
        return this.industryId;
    }

    public QueryTagInfoBySelectionRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public QueryTagInfoBySelectionRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public QueryTagInfoBySelectionRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public QueryTagInfoBySelectionRequest setSceneId(Long sceneId) {
        this.sceneId = sceneId;
        return this;
    }
    public Long getSceneId() {
        return this.sceneId;
    }

    public QueryTagInfoBySelectionRequest setTagId(Long tagId) {
        this.tagId = tagId;
        return this;
    }
    public Long getTagId() {
        return this.tagId;
    }

}
