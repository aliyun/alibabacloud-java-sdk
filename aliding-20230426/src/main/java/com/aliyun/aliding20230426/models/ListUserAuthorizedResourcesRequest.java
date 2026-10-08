// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class ListUserAuthorizedResourcesRequest extends TeaModel {
    @NameInMap("NextToken")
    public String nextToken;

    @NameInMap("PermissionCode")
    public String permissionCode;

    @NameInMap("ResourceType")
    public String resourceType;

    public static ListUserAuthorizedResourcesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListUserAuthorizedResourcesRequest self = new ListUserAuthorizedResourcesRequest();
        return TeaModel.build(map, self);
    }

    public ListUserAuthorizedResourcesRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListUserAuthorizedResourcesRequest setPermissionCode(String permissionCode) {
        this.permissionCode = permissionCode;
        return this;
    }
    public String getPermissionCode() {
        return this.permissionCode;
    }

    public ListUserAuthorizedResourcesRequest setResourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }
    public String getResourceType() {
        return this.resourceType;
    }

}
