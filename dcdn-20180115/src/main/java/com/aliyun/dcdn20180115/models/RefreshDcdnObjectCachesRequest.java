// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class RefreshDcdnObjectCachesRequest extends TeaModel {
    /**
     * <p>Specifies whether to refresh resources in a directory if the resources are different from the resources in the same directory in the origin server. Default value: false.</p>
     * <br>
     * <p>*   **true**: refresh all resources in the directory.</p>
     * <p>*   **false**: refresh the changed resources in the directory.</p>
     */
    @NameInMap("Force")
    public Boolean force;

    /**
     * <p>The path of the objects that you want to refresh. Separate multiple URLs with line feed characters (\n) or a pair of carriage return and line feed characters (\r\n).</p>
     */
    @NameInMap("ObjectPath")
    public String objectPath;

    /**
     * <p>The refresh type. Valid values:</p>
     * <br>
     * <p>*   **File** (default): refreshres resources based on URLs.</p>
     * <p>*   **Directory**: refreshes resources based on directories.</p>
     * <p>*   **Regex**: refreshes content based on regular expressions.</p>
     * <p>*   **IgnoreParams**: removes the question mark (`?`) and parameters after `?` in a request URL and refreshes content. After you call this operation with the request URL submitted, the system compares the submitted URL with the URL of the cached resource without specific parameters. If the URLs match, the DCDN POPs refresh the cached resource.</p>
     * <br>
     * <p>>*   For more information about features of URL refresh and directory refresh, see [Refresh and prefetch resources](~~64936~~).</p>
     * <p>>*   If you set ObjectType to Directory, the resources in the directory that you want to refresh are marked as expired. You cannot delete the directory. If clients request resources after the resources on POPs are marked as expired, DCDN checks whether the resources on your origin server are updated with a later version. If a later version exists, DCDN retrieves the resources of the later version and returns the resources to the clients. Otherwise, DCDN retrieves the 304 status code from the origin server.</p>
     */
    @NameInMap("ObjectType")
    public String objectType;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("SecurityToken")
    public String securityToken;

    public static RefreshDcdnObjectCachesRequest build(java.util.Map<String, ?> map) throws Exception {
        RefreshDcdnObjectCachesRequest self = new RefreshDcdnObjectCachesRequest();
        return TeaModel.build(map, self);
    }

    public RefreshDcdnObjectCachesRequest setForce(Boolean force) {
        this.force = force;
        return this;
    }
    public Boolean getForce() {
        return this.force;
    }

    public RefreshDcdnObjectCachesRequest setObjectPath(String objectPath) {
        this.objectPath = objectPath;
        return this;
    }
    public String getObjectPath() {
        return this.objectPath;
    }

    public RefreshDcdnObjectCachesRequest setObjectType(String objectType) {
        this.objectType = objectType;
        return this;
    }
    public String getObjectType() {
        return this.objectType;
    }

    public RefreshDcdnObjectCachesRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public RefreshDcdnObjectCachesRequest setSecurityToken(String securityToken) {
        this.securityToken = securityToken;
        return this;
    }
    public String getSecurityToken() {
        return this.securityToken;
    }

}
