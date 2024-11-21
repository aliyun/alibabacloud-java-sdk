// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class CreateSiteRequest extends TeaModel {
    /**
     * <p>The DNS setup. Valid values:</p>
     * <ul>
     * <li><strong>NS</strong></li>
     * <li><strong>CNAME</strong></li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>NS</p>
     */
    @NameInMap("AccessType")
    public String accessType;

    /**
     * <p>The service location. Valid values:</p>
     * <ul>
     * <li><strong>domestic</strong>: the Chinese mainland</li>
     * <li><strong>global</strong>: global</li>
     * <li><strong>overseas</strong>: outside the Chinese mainland</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>domestic</p>
     */
    @NameInMap("Coverage")
    public String coverage;

    /**
     * <p>The instance ID, which can be obtained by calling the <a href="https://help.aliyun.com/document_detail/2852398.html">ListUserRatePlanInstances</a> operation. Specify at least one of the instance ID and website ID. If you specify both of them, the instance ID is used.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>dbaudit-cn-nwy349jdb03</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The ID of the resource group. If you leave this parameter empty, the system uses the default resource group ID.</p>
     * 
     * <strong>example:</strong>
     * <p>rg-acfmw4znnok****</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    /**
     * <p>The website name.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>CreateSite</p>
     */
    @NameInMap("SiteName")
    public String siteName;

    public static CreateSiteRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateSiteRequest self = new CreateSiteRequest();
        return TeaModel.build(map, self);
    }

    public CreateSiteRequest setAccessType(String accessType) {
        this.accessType = accessType;
        return this;
    }
    public String getAccessType() {
        return this.accessType;
    }

    public CreateSiteRequest setCoverage(String coverage) {
        this.coverage = coverage;
        return this;
    }
    public String getCoverage() {
        return this.coverage;
    }

    public CreateSiteRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public CreateSiteRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public CreateSiteRequest setSiteName(String siteName) {
        this.siteName = siteName;
        return this;
    }
    public String getSiteName() {
        return this.siteName;
    }

}
