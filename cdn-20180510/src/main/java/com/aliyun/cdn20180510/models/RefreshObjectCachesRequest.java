// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class RefreshObjectCachesRequest extends TeaModel {
    // The URLs from which content is refreshed. Format: **Accelerated domain name**/**Paths or directories of files that you want to refresh**.
    // 
    // Separate multiple URLs with line feed characters (\n) or a pair of carriage return and line feed characters (\r\n).
    @NameInMap("ObjectPath")
    public String objectPath;

    // The type of the object that you want to refresh. Valid values:
    // 
    // *   **File**: refreshes one or more files.
    // *   **Directory**: refreshes the files in one or more directories.
    // *   **Regex**: refreshes content based on regular expressions.
    // 
    // If you set the ObjectType parameter to File or Directory, you can view [Refresh and prefetch resources](~~27140~~) to obtain more information. If you set the ObjectType parameter to Regex, you can view [Configure URL refresh rules that contain regular expressions](~~146195~~) to obtain more information.
    // 
    // If you set the ObjectType parameter to Directory, the resources in the directory that you want to refresh are marked as expired. You cannot delete the directory. If clients request resources on POPs that are marked as expired, Alibaba Cloud CDN checks whether the resources on your origin server are updated. If resources are updated, Alibaba Cloud CDN retrieves the most recent version of the resources and returns the resources to the clients. Otherwise, the origin server returns the 304 status code.
    @NameInMap("ObjectType")
    public String objectType;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("SecurityToken")
    public String securityToken;

    public static RefreshObjectCachesRequest build(java.util.Map<String, ?> map) throws Exception {
        RefreshObjectCachesRequest self = new RefreshObjectCachesRequest();
        return TeaModel.build(map, self);
    }

    public RefreshObjectCachesRequest setObjectPath(String objectPath) {
        this.objectPath = objectPath;
        return this;
    }
    public String getObjectPath() {
        return this.objectPath;
    }

    public RefreshObjectCachesRequest setObjectType(String objectType) {
        this.objectType = objectType;
        return this;
    }
    public String getObjectType() {
        return this.objectType;
    }

    public RefreshObjectCachesRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public RefreshObjectCachesRequest setSecurityToken(String securityToken) {
        this.securityToken = securityToken;
        return this;
    }
    public String getSecurityToken() {
        return this.securityToken;
    }

}
