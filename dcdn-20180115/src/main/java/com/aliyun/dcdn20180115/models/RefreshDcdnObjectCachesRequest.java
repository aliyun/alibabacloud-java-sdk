// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class RefreshDcdnObjectCachesRequest extends TeaModel {
    /**
     * <p>Specifies whether to refresh resources in a directory if the resources are different from the resources in the same directory in the origin server. Default value: false.</p>
     * <ul>
     * <li><strong>true</strong>: refresh all resources in the directory.</li>
     * <li><strong>false</strong>: refresh the changed resources in the directory.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("Force")
    public Boolean force;

    /**
     * <p>The path of the objects that you want to refresh. Separate multiple URLs with line feed characters (\n) or a pair of carriage return and line feed characters (\r\n).</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>example.com/example.txt</p>
     */
    @NameInMap("ObjectPath")
    public String objectPath;

    /**
     * <p>The refresh type. Valid values:</p>
     * <ul>
     * <li><strong>File</strong> (default): refreshes resources based on URLs.</li>
     * <li><strong>Directory</strong>: refreshes resources based on directories.</li>
     * <li><strong>Regex</strong>: refreshes content based on regular expressions.</li>
     * <li><strong>IgnoreParams</strong>: removes the question mark (<code>?</code>) and parameters after <code>?</code> in a request URL and refreshes content. After you call this operation with the request URL submitted, the system compares the submitted URL with the URL of the cached resource without specific parameters. If the URLs match, the DCDN POPs refresh the cached resource.</li>
     * </ul>
     * <blockquote>
     * <ul>
     * <li>For more information about features of URL refresh and directory refresh, see <a href="https://help.aliyun.com/document_detail/64936.html">Refresh and prefetch resources</a>.</li>
     * <li>If you set ObjectType to Directory, the resources in the directory that you want to refresh are marked as expired. You cannot delete the directory. If clients request resources after the resources on POPs are marked as expired, DCDN checks whether the resources on your origin server are updated with a later version. If a later version exists, DCDN retrieves the resources of the later version and returns the resources to the clients. Otherwise, DCDN retrieves the 304 status code from the origin server.</li>
     * </ul>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>File</p>
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
