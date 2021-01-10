// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkvisual20180120.models;

import com.aliyun.tea.*;

public class DeleteFaceUserGroupRequest extends TeaModel {
    @NameInMap("ApiProduct")
    public String apiProduct;

    @NameInMap("ApiRevision")
    public String apiRevision;

    @NameInMap("IsolationId")
    public String isolationId;

    @NameInMap("UserGroupId")
    public String userGroupId;

    public static DeleteFaceUserGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteFaceUserGroupRequest self = new DeleteFaceUserGroupRequest();
        return TeaModel.build(map, self);
    }

    public DeleteFaceUserGroupRequest setApiProduct(String apiProduct) {
        this.apiProduct = apiProduct;
        return this;
    }
    public String getApiProduct() {
        return this.apiProduct;
    }

    public DeleteFaceUserGroupRequest setApiRevision(String apiRevision) {
        this.apiRevision = apiRevision;
        return this;
    }
    public String getApiRevision() {
        return this.apiRevision;
    }

    public DeleteFaceUserGroupRequest setIsolationId(String isolationId) {
        this.isolationId = isolationId;
        return this;
    }
    public String getIsolationId() {
        return this.isolationId;
    }

    public DeleteFaceUserGroupRequest setUserGroupId(String userGroupId) {
        this.userGroupId = userGroupId;
        return this;
    }
    public String getUserGroupId() {
        return this.userGroupId;
    }

}
