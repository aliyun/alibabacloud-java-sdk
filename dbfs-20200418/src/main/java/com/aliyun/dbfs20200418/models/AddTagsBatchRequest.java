// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dbfs20200418.models;

import com.aliyun.tea.*;

public class AddTagsBatchRequest extends TeaModel {
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("DbfsList")
    public String dbfsList;

    @NameInMap("Tags")
    public String tags;

    @NameInMap("ClientToken")
    public String clientToken;

    public static AddTagsBatchRequest build(java.util.Map<String, ?> map) throws Exception {
        AddTagsBatchRequest self = new AddTagsBatchRequest();
        return TeaModel.build(map, self);
    }

    public AddTagsBatchRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public AddTagsBatchRequest setDbfsList(String dbfsList) {
        this.dbfsList = dbfsList;
        return this;
    }
    public String getDbfsList() {
        return this.dbfsList;
    }

    public AddTagsBatchRequest setTags(String tags) {
        this.tags = tags;
        return this;
    }
    public String getTags() {
        return this.tags;
    }

    public AddTagsBatchRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

}
