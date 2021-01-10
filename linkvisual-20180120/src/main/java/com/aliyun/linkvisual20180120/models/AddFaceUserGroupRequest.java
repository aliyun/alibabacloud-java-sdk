// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkvisual20180120.models;

import com.aliyun.tea.*;

public class AddFaceUserGroupRequest extends TeaModel {
    @NameInMap("ApiProduct")
    public String apiProduct;

    @NameInMap("ApiRevision")
    public String apiRevision;

    @NameInMap("IsolationId")
    public String isolationId;

    @NameInMap("UserGroupName")
    public String userGroupName;

    public static AddFaceUserGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        AddFaceUserGroupRequest self = new AddFaceUserGroupRequest();
        return TeaModel.build(map, self);
    }

    public AddFaceUserGroupRequest setApiProduct(String apiProduct) {
        this.apiProduct = apiProduct;
        return this;
    }
    public String getApiProduct() {
        return this.apiProduct;
    }

    public AddFaceUserGroupRequest setApiRevision(String apiRevision) {
        this.apiRevision = apiRevision;
        return this;
    }
    public String getApiRevision() {
        return this.apiRevision;
    }

    public AddFaceUserGroupRequest setIsolationId(String isolationId) {
        this.isolationId = isolationId;
        return this;
    }
    public String getIsolationId() {
        return this.isolationId;
    }

    public AddFaceUserGroupRequest setUserGroupName(String userGroupName) {
        this.userGroupName = userGroupName;
        return this;
    }
    public String getUserGroupName() {
        return this.userGroupName;
    }

}
