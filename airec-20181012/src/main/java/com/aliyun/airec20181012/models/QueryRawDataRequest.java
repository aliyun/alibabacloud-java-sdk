// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.airec20181012.models;

import com.aliyun.tea.*;

public class QueryRawDataRequest extends TeaModel {
    @NameInMap("ItemId")
    public String itemId;

    @NameInMap("ItemType")
    public String itemType;

    @NameInMap("UserId")
    public String userId;

    @NameInMap("UserType")
    public String userType;

    public static QueryRawDataRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryRawDataRequest self = new QueryRawDataRequest();
        return TeaModel.build(map, self);
    }

    public QueryRawDataRequest setItemId(String itemId) {
        this.itemId = itemId;
        return this;
    }
    public String getItemId() {
        return this.itemId;
    }

    public QueryRawDataRequest setItemType(String itemType) {
        this.itemType = itemType;
        return this;
    }
    public String getItemType() {
        return this.itemType;
    }

    public QueryRawDataRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

    public QueryRawDataRequest setUserType(String userType) {
        this.userType = userType;
        return this;
    }
    public String getUserType() {
        return this.userType;
    }

}
