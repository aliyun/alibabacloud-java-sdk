// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gpdb20160503.models;

import com.aliyun.tea.*;

public class UpdateCollectionDataMetadataShrinkRequest extends TeaModel {
    @NameInMap("Collection")
    public String collection;

    @NameInMap("DBInstanceId")
    public String DBInstanceId;

    @NameInMap("Filter")
    public String filter;

    @NameInMap("Ids")
    public String idsShrink;

    @NameInMap("Metadata")
    public String metadataShrink;

    @NameInMap("Namespace")
    public String namespace;

    @NameInMap("NamespacePassword")
    public String namespacePassword;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("RegionId")
    public String regionId;

    public static UpdateCollectionDataMetadataShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateCollectionDataMetadataShrinkRequest self = new UpdateCollectionDataMetadataShrinkRequest();
        return TeaModel.build(map, self);
    }

    public UpdateCollectionDataMetadataShrinkRequest setCollection(String collection) {
        this.collection = collection;
        return this;
    }
    public String getCollection() {
        return this.collection;
    }

    public UpdateCollectionDataMetadataShrinkRequest setDBInstanceId(String DBInstanceId) {
        this.DBInstanceId = DBInstanceId;
        return this;
    }
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    public UpdateCollectionDataMetadataShrinkRequest setFilter(String filter) {
        this.filter = filter;
        return this;
    }
    public String getFilter() {
        return this.filter;
    }

    public UpdateCollectionDataMetadataShrinkRequest setIdsShrink(String idsShrink) {
        this.idsShrink = idsShrink;
        return this;
    }
    public String getIdsShrink() {
        return this.idsShrink;
    }

    public UpdateCollectionDataMetadataShrinkRequest setMetadataShrink(String metadataShrink) {
        this.metadataShrink = metadataShrink;
        return this;
    }
    public String getMetadataShrink() {
        return this.metadataShrink;
    }

    public UpdateCollectionDataMetadataShrinkRequest setNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }
    public String getNamespace() {
        return this.namespace;
    }

    public UpdateCollectionDataMetadataShrinkRequest setNamespacePassword(String namespacePassword) {
        this.namespacePassword = namespacePassword;
        return this;
    }
    public String getNamespacePassword() {
        return this.namespacePassword;
    }

    public UpdateCollectionDataMetadataShrinkRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public UpdateCollectionDataMetadataShrinkRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
