// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class MoveDomainResourceGroupRequest extends TeaModel {
    /**
     * <p>The language of the values of specific response parameters. Default value: en. Valid values: en, zh, and ja.</p>
     * 
     * <strong>example:</strong>
     * <p>en</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>The ID of the new resource group.</p>
     * <p>You can view the resource group ID in the <a href="https://resourcemanager.console.aliyun.com/resource-groups?">Resource Management console</a>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>rg-aekzzk7hx3glaoq</p>
     */
    @NameInMap("NewResourceGroupId")
    public String newResourceGroupId;

    /**
     * <p>The domain name.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>example.com</p>
     */
    @NameInMap("ResourceId")
    public String resourceId;

    public static MoveDomainResourceGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        MoveDomainResourceGroupRequest self = new MoveDomainResourceGroupRequest();
        return TeaModel.build(map, self);
    }

    public MoveDomainResourceGroupRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public MoveDomainResourceGroupRequest setNewResourceGroupId(String newResourceGroupId) {
        this.newResourceGroupId = newResourceGroupId;
        return this;
    }
    public String getNewResourceGroupId() {
        return this.newResourceGroupId;
    }

    public MoveDomainResourceGroupRequest setResourceId(String resourceId) {
        this.resourceId = resourceId;
        return this;
    }
    public String getResourceId() {
        return this.resourceId;
    }

}
