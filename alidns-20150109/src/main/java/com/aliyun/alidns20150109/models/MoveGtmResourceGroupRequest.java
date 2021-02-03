// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class MoveGtmResourceGroupRequest extends TeaModel {
    @NameInMap("Lang")
    public String lang;

    @NameInMap("ResourceId")
    public String resourceId;

    @NameInMap("NewResourceGroupId")
    public String newResourceGroupId;

    @NameInMap("UserClientIp")
    public String userClientIp;

    public static MoveGtmResourceGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        MoveGtmResourceGroupRequest self = new MoveGtmResourceGroupRequest();
        return TeaModel.build(map, self);
    }

    public MoveGtmResourceGroupRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public MoveGtmResourceGroupRequest setResourceId(String resourceId) {
        this.resourceId = resourceId;
        return this;
    }
    public String getResourceId() {
        return this.resourceId;
    }

    public MoveGtmResourceGroupRequest setNewResourceGroupId(String newResourceGroupId) {
        this.newResourceGroupId = newResourceGroupId;
        return this;
    }
    public String getNewResourceGroupId() {
        return this.newResourceGroupId;
    }

    public MoveGtmResourceGroupRequest setUserClientIp(String userClientIp) {
        this.userClientIp = userClientIp;
        return this;
    }
    public String getUserClientIp() {
        return this.userClientIp;
    }

}
