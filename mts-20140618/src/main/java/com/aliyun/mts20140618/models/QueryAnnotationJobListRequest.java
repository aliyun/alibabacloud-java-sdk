// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mts20140618.models;

import com.aliyun.tea.*;

public class QueryAnnotationJobListRequest extends TeaModel {
    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    @NameInMap("AnnotationJobIds")
    public String annotationJobIds;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    public static QueryAnnotationJobListRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryAnnotationJobListRequest self = new QueryAnnotationJobListRequest();
        return TeaModel.build(map, self);
    }

    public QueryAnnotationJobListRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public QueryAnnotationJobListRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public QueryAnnotationJobListRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public QueryAnnotationJobListRequest setAnnotationJobIds(String annotationJobIds) {
        this.annotationJobIds = annotationJobIds;
        return this;
    }
    public String getAnnotationJobIds() {
        return this.annotationJobIds;
    }

    public QueryAnnotationJobListRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

}
