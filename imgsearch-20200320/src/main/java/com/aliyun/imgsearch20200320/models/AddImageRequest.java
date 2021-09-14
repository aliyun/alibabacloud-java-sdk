// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imgsearch20200320.models;

import com.aliyun.tea.*;

public class AddImageRequest extends TeaModel {
    @NameInMap("DbName")
    public String dbName;

    @NameInMap("ImageUrl")
    public String imageUrl;

    @NameInMap("ExtraData")
    public String extraData;

    @NameInMap("EntityId")
    public String entityId;

    public static AddImageRequest build(java.util.Map<String, ?> map) throws Exception {
        AddImageRequest self = new AddImageRequest();
        return TeaModel.build(map, self);
    }

    public AddImageRequest setDbName(String dbName) {
        this.dbName = dbName;
        return this;
    }
    public String getDbName() {
        return this.dbName;
    }

    public AddImageRequest setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
        return this;
    }
    public String getImageUrl() {
        return this.imageUrl;
    }

    public AddImageRequest setExtraData(String extraData) {
        this.extraData = extraData;
        return this;
    }
    public String getExtraData() {
        return this.extraData;
    }

    public AddImageRequest setEntityId(String entityId) {
        this.entityId = entityId;
        return this;
    }
    public String getEntityId() {
        return this.entityId;
    }

}
