// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.facebody20191230.models;

import com.aliyun.tea.*;

public class AddFaceAdvanceRequest extends TeaModel {
    @NameInMap("ImageUrlObject")
    @Validation(required = true)
    public java.io.InputStream imageUrlObject;

    @NameInMap("DbName")
    @Validation(required = true)
    public String dbName;

    @NameInMap("EntityId")
    @Validation(required = true)
    public String entityId;

    @NameInMap("ExtraData")
    public String extraData;

    public static AddFaceAdvanceRequest build(java.util.Map<String, ?> map) throws Exception {
        AddFaceAdvanceRequest self = new AddFaceAdvanceRequest();
        return TeaModel.build(map, self);
    }

    public AddFaceAdvanceRequest setImageUrlObject(java.io.InputStream imageUrlObject) {
        this.imageUrlObject = imageUrlObject;
        return this;
    }
    public java.io.InputStream getImageUrlObject() {
        return this.imageUrlObject;
    }

    public AddFaceAdvanceRequest setDbName(String dbName) {
        this.dbName = dbName;
        return this;
    }
    public String getDbName() {
        return this.dbName;
    }

    public AddFaceAdvanceRequest setEntityId(String entityId) {
        this.entityId = entityId;
        return this;
    }
    public String getEntityId() {
        return this.entityId;
    }

    public AddFaceAdvanceRequest setExtraData(String extraData) {
        this.extraData = extraData;
        return this;
    }
    public String getExtraData() {
        return this.extraData;
    }

}
