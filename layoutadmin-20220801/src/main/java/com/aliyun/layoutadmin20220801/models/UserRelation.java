// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.layoutadmin20220801.models;

import com.aliyun.tea.*;

public class UserRelation extends TeaModel {
    @NameInMap("BusinessId")
    public String businessId;

    @NameInMap("GmtCreated")
    public String gmtCreated;

    @NameInMap("RelationId")
    public String relationId;

    @NameInMap("UserId")
    public String userId;

    public static UserRelation build(java.util.Map<String, ?> map) throws Exception {
        UserRelation self = new UserRelation();
        return TeaModel.build(map, self);
    }

    public UserRelation setBusinessId(String businessId) {
        this.businessId = businessId;
        return this;
    }
    public String getBusinessId() {
        return this.businessId;
    }

    public UserRelation setGmtCreated(String gmtCreated) {
        this.gmtCreated = gmtCreated;
        return this;
    }
    public String getGmtCreated() {
        return this.gmtCreated;
    }

    public UserRelation setRelationId(String relationId) {
        this.relationId = relationId;
        return this;
    }
    public String getRelationId() {
        return this.relationId;
    }

    public UserRelation setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

}
