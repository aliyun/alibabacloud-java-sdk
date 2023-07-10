// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gpdb20160503.models;

import com.aliyun.tea.*;

public class DeleteCollectionDataRequest extends TeaModel {
    @NameInMap("Collection")
    public String collection;

    @NameInMap("CollectionData")
    public String collectionData;

    @NameInMap("DBInstanceId")
    public String DBInstanceId;

    @NameInMap("Namespace")
    public String namespace;

    @NameInMap("NamespacePassword")
    public String namespacePassword;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("RegionId")
    public String regionId;

    public static DeleteCollectionDataRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteCollectionDataRequest self = new DeleteCollectionDataRequest();
        return TeaModel.build(map, self);
    }

    public DeleteCollectionDataRequest setCollection(String collection) {
        this.collection = collection;
        return this;
    }
    public String getCollection() {
        return this.collection;
    }

    public DeleteCollectionDataRequest setCollectionData(String collectionData) {
        this.collectionData = collectionData;
        return this;
    }
    public String getCollectionData() {
        return this.collectionData;
    }

    public DeleteCollectionDataRequest setDBInstanceId(String DBInstanceId) {
        this.DBInstanceId = DBInstanceId;
        return this;
    }
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    public DeleteCollectionDataRequest setNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }
    public String getNamespace() {
        return this.namespace;
    }

    public DeleteCollectionDataRequest setNamespacePassword(String namespacePassword) {
        this.namespacePassword = namespacePassword;
        return this;
    }
    public String getNamespacePassword() {
        return this.namespacePassword;
    }

    public DeleteCollectionDataRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public DeleteCollectionDataRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
