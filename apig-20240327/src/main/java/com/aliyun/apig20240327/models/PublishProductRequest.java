// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class PublishProductRequest extends TeaModel {
    /**
     * <p>The ID of the HiMarket portal to which the API product is published. This parameter specifies the target portal for the publication. You can query the publication record by portal dimension by calling ListPortalPublications. This ID also appears in the publication record details and is paired with portalName.</p>
     * 
     * <strong>example:</strong>
     * <p>portal-xxxxxxxx</p>
     */
    @NameInMap("portalId")
    public String portalId;

    public static PublishProductRequest build(java.util.Map<String, ?> map) throws Exception {
        PublishProductRequest self = new PublishProductRequest();
        return TeaModel.build(map, self);
    }

    public PublishProductRequest setPortalId(String portalId) {
        this.portalId = portalId;
        return this;
    }
    public String getPortalId() {
        return this.portalId;
    }

}
