// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.airec20201126.models;

import com.aliyun.tea.*;

public class QueryRawDataRequest extends TeaModel {
    @NameInMap("imei")
    public String imei;

    /**
     * <p>The item ID. This parameter is required when the table parameter is set to item.</p>
     * 
     * <strong>example:</strong>
     * <p>112</p>
     */
    @NameInMap("itemId")
    public String itemId;

    /**
     * <p>The type of the item. This parameter is required when the table parameter is set to item.</p>
     * 
     * <strong>example:</strong>
     * <p>video</p>
     */
    @NameInMap("itemType")
    public String itemType;

    /**
     * <p>The user ID. This parameter is required when the table parameter is set to user.</p>
     * 
     * <strong>example:</strong>
     * <p>111</p>
     */
    @NameInMap("userId")
    public String userId;

    /**
     * <p>The type of the user. This parameter is required when the table parameter is set to user.</p>
     * 
     * <strong>example:</strong>
     * <p>app</p>
     */
    @NameInMap("userType")
    public String userType;

    public static QueryRawDataRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryRawDataRequest self = new QueryRawDataRequest();
        return TeaModel.build(map, self);
    }

    public QueryRawDataRequest setImei(String imei) {
        this.imei = imei;
        return this;
    }
    public String getImei() {
        return this.imei;
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
