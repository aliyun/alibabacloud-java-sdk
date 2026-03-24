// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class RefreshObjectCachesRequest extends TeaModel {
    /**
     * <p>When the comparison between the source content and the source site resources is consistent, should the resources within the corresponding range be forcibly refreshed. The default is false.</p>
     * <ul>
     * <li><strong>true</strong>: purges all resources in the range that corresponds to the type of the purge task. If you set this parameter to true, when the requested resource matches the resource in the range that corresponds to the type of the purge task, the POP retrieves the resource from the origin server, returns the resource to the client, and caches the resource.</li>
     * <li><strong>false</strong>: purges the changed resources in the range that corresponds to the type of the purge task. If you set this parameter to false, when the requested resource matches the resource in the range that corresponds to the type of the purge task, the POP obtains the Last-Modified parameter of the resource from the origin server. If the obtained value of the Last-Modified parameter is the same as that of the cached resource, the cached resource is returned. Otherwise, the POP retrieves the resource from the origin server, returns the resource to the client, and caches the resource.</li>
     * </ul>
     * <blockquote>
     * <p> This parameter takes effect only when the ObjectType parameter is not set to File.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("Force")
    public Boolean force;

    /**
     * <ul>
     * <li>If you submit multiple URLs or directories at a time, separate them with line breaks (\n) or (\r\n).</li>
     * <li>The total number of domain names contained all URLs in a submitted task cannot exceed 10.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="http://example.com/image/1.png%5C%5Cnhttp://aliyundoc.com/image/2.png">http://example.com/image/1.png\\nhttp://aliyundoc.com/image/2.png</a></p>
     */
    @NameInMap("ObjectPath")
    public String objectPath;

    /**
     * <p>The type of the object that you want to refresh. Valid values:</p>
     * <ul>
     * <li><strong>File</strong> (default): refreshes one or more files.</li>
     * <li><strong>Directory</strong>: refreshes the files in one or more directories.</li>
     * <li><strong>Regex</strong>: refreshes content based on regular expressions.</li>
     * <li><strong>ExQuery</strong>: omits parameters after the question mark in the URL and refreshes content.</li>
     * </ul>
     * <p>If you set the ObjectType parameter to File or Directory, you can view <a href="https://help.aliyun.com/document_detail/27140.html">Refresh and prefetch resources</a> to obtain more information. If you set the ObjectType parameter to Regex, you can view <a href="https://help.aliyun.com/document_detail/146195.html">Configure URL refresh rules that contain regular expressions</a> to obtain more information.</p>
     * <p>If you set the ObjectType parameter to Directory, the resources in the directory that you want to refresh are marked as expired. You cannot delete the directory. If clients request resources on POPs that are marked as expired, Alibaba Cloud CDN checks whether the resources on your origin server are updated. If resources are updated, Alibaba Cloud CDN retrieves the latest version of the resources and returns the resources to the clients. Otherwise, the origin server returns the 304 status code.</p>
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
