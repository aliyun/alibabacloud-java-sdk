// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class RefreshObjectCachesRequest extends TeaModel {
    /**
     * <p>Specifies whether to refresh resources in a directory if the resources are different from the resources in the same directory in the origin server. Default value: false.</p>
     * <br>
     * <p>*   **true**: refresh all resources in the directory.</p>
     * <p>*   **false**: refresh the changed resources in the directory.</p>
     */
    @NameInMap("Force")
    public Boolean force;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("ObjectPath")
    public String objectPath;

    /**
     * <p>The type of the object that you want to refresh. Valid values:</p>
     * <br>
     * <p>*   **File** (default): refreshes one or more files.</p>
     * <p>*   **Directory**: refreshes the files in one or more directories.</p>
     * <p>*   **Regex**: refreshes content based on regular expressions.</p>
     * <p>*   **ExQuery**: omits parameters after the question mark in the URL and refreshes content.</p>
     * <br>
     * <p>If you set the ObjectType parameter to File or Directory, you can view [Refresh and prefetch resources](https://help.aliyun.com/document_detail/27140.html) to obtain more information. If you set the ObjectType parameter to Regex, you can view [Configure URL refresh rules that contain regular expressions](https://help.aliyun.com/document_detail/146195.html) to obtain more information.</p>
     * <br>
     * <p>If you set the ObjectType parameter to Directory, the resources in the directory that you want to refresh are marked as expired. You cannot delete the directory. If clients request resources on POPs that are marked as expired, Alibaba Cloud CDN checks whether the resources on your origin server are updated. If resources are updated, Alibaba Cloud CDN retrieves the latest version of the resources and returns the resources to the clients. Otherwise, the origin server returns the 304 status code.</p>
     */
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

    public RefreshObjectCachesRequest setForce(Boolean force) {
        this.force = force;
        return this;
    }
    public Boolean getForce() {
        return this.force;
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
