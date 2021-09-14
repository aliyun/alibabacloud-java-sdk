// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imgsearch20200320.models;

import com.aliyun.tea.*;

public class AddImageAdvanceRequest extends TeaModel {
    @NameInMap("ImageUrlObject")
    @Validation(required = true)
    public java.io.InputStream imageUrlObject;

    @NameInMap("DbName")
    public String dbName;

    @NameInMap("ExtraData")
    public String extraData;

    @NameInMap("EntityId")
    public String entityId;

    public static AddImageAdvanceRequest build(java.util.Map<String, ?> map) throws Exception {
        AddImageAdvanceRequest self = new AddImageAdvanceRequest();
        return TeaModel.build(map, self);
    }

    public AddImageAdvanceRequest setImageUrlObject(java.io.InputStream imageUrlObject) {
        this.imageUrlObject = imageUrlObject;
        return this;
    }
    public java.io.InputStream getImageUrlObject() {
        return this.imageUrlObject;
    }

    public AddImageAdvanceRequest setDbName(String dbName) {
        this.dbName = dbName;
        return this;
    }
    public String getDbName() {
        return this.dbName;
    }

    public AddImageAdvanceRequest setExtraData(String extraData) {
        this.extraData = extraData;
        return this;
    }
    public String getExtraData() {
        return this.extraData;
    }

    public AddImageAdvanceRequest setEntityId(String entityId) {
        this.entityId = entityId;
        return this;
    }
    public String getEntityId() {
        return this.entityId;
    }

}
