// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class ListAllPublicMediaTagsRequest extends TeaModel {
    /**
     * <p>The business type of the media asset.</p>
     * 
     * <strong>example:</strong>
     * <p>&quot;sticker&quot;</p>
     */
    @NameInMap("BusinessType")
    public String businessType;

    /**
     * <p>The entity ID, which is used to distinguish between media assets of different types in the public domain.</p>
     * <p>Set this parameter to Copyright_Music, which indicates music in the public domain.</p>
     * 
     * <strong>example:</strong>
     * <p>Copyright_Music</p>
     */
    @NameInMap("EntityId")
    public String entityId;

    public static ListAllPublicMediaTagsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListAllPublicMediaTagsRequest self = new ListAllPublicMediaTagsRequest();
        return TeaModel.build(map, self);
    }

    public ListAllPublicMediaTagsRequest setBusinessType(String businessType) {
        this.businessType = businessType;
        return this;
    }
    public String getBusinessType() {
        return this.businessType;
    }

    public ListAllPublicMediaTagsRequest setEntityId(String entityId) {
        this.entityId = entityId;
        return this;
    }
    public String getEntityId() {
        return this.entityId;
    }

}
