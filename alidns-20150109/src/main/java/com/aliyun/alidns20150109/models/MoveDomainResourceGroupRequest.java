// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class MoveDomainResourceGroupRequest extends TeaModel {
    @NameInMap("Lang")
    public String lang;

    @NameInMap("NewResourceGroupId")
    public String newResourceGroupId;

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
