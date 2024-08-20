// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class RefreshErObjectCachesRequest extends TeaModel {
    /**
     * <p>Specifies whether to refresh resources in a directory if the resources requested are different from the resources on the origin server. Default value: false.</p>
     * <ul>
     * <li><strong>true</strong>: refreshes all resources in the directory.</li>
     * <li><strong>false</strong>: refreshes the changed resources in the directory.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("Force")
    public Boolean force;

    /**
     * <p>The domain names that are merged for refreshing. POPs that provide services for the domain names are refreshed.</p>
     * <blockquote>
     * <p> Separate multiple domain names with commas (,).</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>a.test.com,b.test.com</p>
     */
    @NameInMap("MergeDomainName")
    public String mergeDomainName;

    /**
     * <p>The URL that you want to refresh.</p>
     * <blockquote>
     * <ul>
     * <li>Separate URLs with line feeds (\n or \r\n). Each object path can be up to 1,024 characters in length.</li>
     * <li>The URLs in a request must belong to the same domain name.</li>
     * <li>You can refresh up to 1,000 URLs in each request.</li>
     * </ul>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="http://example.com/examplefile.txt">http://example.com/examplefile.txt</a></p>
     */
    @NameInMap("ObjectPath")
    public String objectPath;

    /**
     * <p>The refresh type. Valid values:</p>
     * <ul>
     * <li><strong>File</strong> (default): refreshes content based on URLs.</li>
     * <li><strong>Directory</strong>: refreshes content based on directories.</li>
     * <li><strong>Regex</strong>: refreshes content based on regular expressions.</li>
     * <li><strong>IgnoreParams</strong>: removes the question mark (<code>?</code>) and parameters after the question mark (<code>?</code>) in a request URL and refreshes content. After you call this operation with the request URL submitted, the system compares the submitted URL with the URL of the cached resource without specific parameters. If the URLs match, the points of presence (POPs) refresh the cached resource.</li>
     * </ul>
     * <blockquote>
     * <p> If you refresh the files in one or more directories, the resources in the directory that you want to refresh are marked as expired. You cannot delete the directory. If clients request resources on POPs that are marked as expired, Dynamic Content Delivery Network (DCDN) checks whether the resources on your origin server are updated. If resources are updated, DCDN retrieves the latest version of the resources and returns the resources to the clients. Otherwise, the origin server returns the 304 status code.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>File</p>
     */
    @NameInMap("ObjectType")
    public String objectType;

    /**
     * <p>The ID of the routine, which is in the format of &quot;Name.Subdomain&quot; and is the unique identifier of a custom routine.</p>
     * 
     * <strong>example:</strong>
     * <p>test.mysubdomain</p>
     */
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
