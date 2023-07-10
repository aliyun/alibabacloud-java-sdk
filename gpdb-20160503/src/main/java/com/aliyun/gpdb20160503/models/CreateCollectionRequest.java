// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gpdb20160503.models;

import com.aliyun.tea.*;

public class CreateCollectionRequest extends TeaModel {
    @NameInMap("Collection")
    public String collection;

    @NameInMap("DBInstanceId")
    public String DBInstanceId;

    @NameInMap("Dimension")
    public Long dimension;

    @NameInMap("FullTextRetrievalFields")
    public String fullTextRetrievalFields;

    @NameInMap("ManagerAccount")
    public String managerAccount;

    @NameInMap("ManagerAccountPassword")
    public String managerAccountPassword;

    @NameInMap("Metadata")
    public String metadata;

    @NameInMap("Namespace")
    public String namespace;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("Parser")
    public String parser;

    @NameInMap("RegionId")
    public String regionId;

    public static CreateCollectionRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateCollectionRequest self = new CreateCollectionRequest();
        return TeaModel.build(map, self);
    }

    public CreateCollectionRequest setCollection(String collection) {
        this.collection = collection;
        return this;
    }
    public String getCollection() {
        return this.collection;
    }

    public CreateCollectionRequest setDBInstanceId(String DBInstanceId) {
        this.DBInstanceId = DBInstanceId;
        return this;
    }
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    public CreateCollectionRequest setDimension(Long dimension) {
        this.dimension = dimension;
        return this;
    }
    public Long getDimension() {
        return this.dimension;
    }

    public CreateCollectionRequest setFullTextRetrievalFields(String fullTextRetrievalFields) {
        this.fullTextRetrievalFields = fullTextRetrievalFields;
        return this;
    }
    public String getFullTextRetrievalFields() {
        return this.fullTextRetrievalFields;
    }

    public CreateCollectionRequest setManagerAccount(String managerAccount) {
        this.managerAccount = managerAccount;
        return this;
    }
    public String getManagerAccount() {
        return this.managerAccount;
    }

    public CreateCollectionRequest setManagerAccountPassword(String managerAccountPassword) {
        this.managerAccountPassword = managerAccountPassword;
        return this;
    }
    public String getManagerAccountPassword() {
        return this.managerAccountPassword;
    }

    public CreateCollectionRequest setMetadata(String metadata) {
        this.metadata = metadata;
        return this;
    }
    public String getMetadata() {
        return this.metadata;
    }

    public CreateCollectionRequest setNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }
    public String getNamespace() {
        return this.namespace;
    }

    public CreateCollectionRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public CreateCollectionRequest setParser(String parser) {
        this.parser = parser;
        return this;
    }
    public String getParser() {
        return this.parser;
    }

    public CreateCollectionRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
