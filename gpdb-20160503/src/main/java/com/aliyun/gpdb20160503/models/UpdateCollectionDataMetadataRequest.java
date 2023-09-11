// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gpdb20160503.models;

import com.aliyun.tea.*;

public class UpdateCollectionDataMetadataRequest extends TeaModel {
    @NameInMap("Collection")
    public String collection;

    @NameInMap("DBInstanceId")
    public String DBInstanceId;

    @NameInMap("Filter")
    public String filter;

    @NameInMap("Ids")
    public java.util.List<String> ids;

    @NameInMap("Metadata")
    public java.util.Map<String, ?> metadata;

    @NameInMap("Namespace")
    public String namespace;

    @NameInMap("NamespacePassword")
    public String namespacePassword;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("RegionId")
    public String regionId;

    public static UpdateCollectionDataMetadataRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateCollectionDataMetadataRequest self = new UpdateCollectionDataMetadataRequest();
        return TeaModel.build(map, self);
    }

    public UpdateCollectionDataMetadataRequest setCollection(String collection) {
        this.collection = collection;
        return this;
    }
    public String getCollection() {
        return this.collection;
    }

    public UpdateCollectionDataMetadataRequest setDBInstanceId(String DBInstanceId) {
        this.DBInstanceId = DBInstanceId;
        return this;
    }
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    public UpdateCollectionDataMetadataRequest setFilter(String filter) {
        this.filter = filter;
        return this;
    }
    public String getFilter() {
        return this.filter;
    }

    public UpdateCollectionDataMetadataRequest setIds(java.util.List<String> ids) {
        this.ids = ids;
        return this;
    }
    public java.util.List<String> getIds() {
        return this.ids;
    }

    public UpdateCollectionDataMetadataRequest setMetadata(java.util.Map<String, ?> metadata) {
        this.metadata = metadata;
        return this;
    }
    public java.util.Map<String, ?> getMetadata() {
        return this.metadata;
    }

    public UpdateCollectionDataMetadataRequest setNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }
    public String getNamespace() {
        return this.namespace;
    }

    public UpdateCollectionDataMetadataRequest setNamespacePassword(String namespacePassword) {
        this.namespacePassword = namespacePassword;
        return this;
    }
    public String getNamespacePassword() {
        return this.namespacePassword;
    }

    public UpdateCollectionDataMetadataRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public UpdateCollectionDataMetadataRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
