// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class CreateSiteRequest extends TeaModel {
    /**
     * <p>The access type for the site. Valid values:</p>
     * <ul>
     * <li><p><strong>NS</strong>: NS-based access.</p>
     * </li>
     * <li><p><strong>CNAME</strong>: CNAME-based access.</p>
     * </li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>NS</p>
     */
    @NameInMap("AccessType")
    public String accessType;

    /**
     * <p>The acceleration region. Valid values are:</p>
     * <ul>
     * <li><p><strong>domestic</strong>: Chinese mainland only.</p>
     * </li>
     * <li><p><strong>global</strong>: Global.</p>
     * </li>
     * <li><p><strong>overseas</strong>: Global (excluding the Chinese mainland).</p>
     * </li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>domestic</p>
     */
    @NameInMap("Coverage")
    public String coverage;

    /**
     * <p>The ID of the instance. You can obtain the instance ID by calling the <a href="https://help.aliyun.com/document_detail/2852398.html">ListUserRatePlanInstances</a> operation. You must specify either the instance ID or the site ID. If you specify both, the instance ID takes precedence.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>dbaudit-cn-nwy349jdb03</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The ID of the resource group. If you do not specify this parameter, the system automatically uses the ID of the default resource group.</p>
     * 
     * <strong>example:</strong>
     * <p>rg-acfmw4znnok****</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    /**
     * <p>The name of the site.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>example.com</p>
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
