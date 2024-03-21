// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class RefreshErObjectCachesRequest extends TeaModel {
    /**
     * <p>Specifies whether to refresh resources in a directory if the resources requested are different from the resources on the origin server. Default value: false.</p>
     * <br>
     * <p>*   **true**: refreshes all resources in the directory.</p>
     * <p>*   **false**: refreshes the changed resources in the directory.</p>
     */
    @NameInMap("Force")
    public Boolean force;

    /**
     * <p>Domain names that are merged for refreshing. POPs that provide services for the domain names are refreshed.</p>
     * <br>
     * <p>> Separate multiple domain names with commas (,).</p>
     */
    @NameInMap("MergeDomainName")
    public String mergeDomainName;

    /**
     * <p>The URL that you want to refresh.</p>
     * <br>
     * <p>> *   Separate URLs with line feeds (\n or \r\n). Each object path can be up to 1,024 characters in length.</p>
     * <p>>*   The URLs in a request must belong to the same domain name.</p>
     * <p>>*   You can refresh up to 1,000 URLs in each request.</p>
     */
    @NameInMap("ObjectPath")
    public String objectPath;

    /**
     * <p>The refresh type. Valid values:</p>
     * <br>
     * <p>*   **File** (default): refreshes resources based on URLs.</p>
     * <p>*   **Directory**: refreshes resources based on directories.</p>
     * <p>*   **Regex**: refreshes content based on regular expressions.</p>
     * <p>*   **IgnoreParams**: removes the question mark (`?`) and parameters after `?` in a request URL and refreshes content. After you call this operation with the request URL submitted, the system compares the submitted URL with the URL of the cached resource that does not include the query string. If the URLs match, the DCDN POPs refresh the cached resource.</p>
     * <br>
     * <p>> *   If you set ObjectType to Directory, the resources in the directory that you want to refresh are marked as expired. You cannot delete the directory. If clients request resources after the resources on POPs are marked as expired, DCDN checks whether the resources on your origin server are updated with a later version. If a later version exists, DCDN retrieves the resources of the later version and returns the resources to the clients. Otherwise, DCDN retrieves the 304 status code from the origin server.</p>
     */
    @NameInMap("ObjectType")
    public String objectType;

    @NameInMap("RoutineId")
    public String routineId;

    public static RefreshErObjectCachesRequest build(java.util.Map<String, ?> map) throws Exception {
        RefreshErObjectCachesRequest self = new RefreshErObjectCachesRequest();
        return TeaModel.build(map, self);
    }

    public RefreshErObjectCachesRequest setForce(Boolean force) {
        this.force = force;
        return this;
    }
    public Boolean getForce() {
        return this.force;
    }

    public RefreshErObjectCachesRequest setMergeDomainName(String mergeDomainName) {
        this.mergeDomainName = mergeDomainName;
        return this;
    }
    public String getMergeDomainName() {
        return this.mergeDomainName;
    }

    public RefreshErObjectCachesRequest setObjectPath(String objectPath) {
        this.objectPath = objectPath;
        return this;
    }
    public String getObjectPath() {
        return this.objectPath;
    }

    public RefreshErObjectCachesRequest setObjectType(String objectType) {
        this.objectType = objectType;
        return this;
    }
    public String getObjectType() {
        return this.objectType;
    }

    public RefreshErObjectCachesRequest setRoutineId(String routineId) {
        this.routineId = routineId;
        return this;
    }
    public String getRoutineId() {
        return this.routineId;
    }

}
