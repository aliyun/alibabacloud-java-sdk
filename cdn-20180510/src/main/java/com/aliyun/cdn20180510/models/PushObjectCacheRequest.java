// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class PushObjectCacheRequest extends TeaModel {
    // The accelerated region where content is to be prefetched. Valid values:
    // 
    // *   **domestic**: **Chinese Mainland Only**
    // *   **overseas**: **Global (Excluding the Chinese Mainland)**
    // 
    // If you do not set this parameter, content in the accelerated region of the domain name is prefetched. Content is prefetched based on the following rules:
    // 
    // *   If the accelerated region is set to ****Chinese Mainland Only****, content in regions in the Chinese mainland is prefetched.
    // *   If the accelerated region is set to **Global**, content in all regions is prefetched.
    // *   If the accelerated region is set to **Global (Excluding the Chinese Mainland)**, content in regions outside the Chinese mainland is prefetched.
    @NameInMap("Area")
    public String area;

    // Specifies whether to prefetch content to POPs. Valid values:
    // 
    // *   **true**: prefetch content to L2 edge nodes.
    // *   **false**: prefetch content to regular edge nodes. Regular edge nodes can be L2 edge nodes or L3 edge nodes. Default value: **false**.
    @NameInMap("L2Preload")
    public Boolean l2Preload;

    // The URLs based on which content is prefetched. Format: **accelerated domain name/files to be prefetched**.
    // 
    // >  Separate URLs with line feeds (\n or \r\n). Each object path can be up to 1,024 characters in length.
    @NameInMap("ObjectPath")
    public String objectPath;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("SecurityToken")
    public String securityToken;

    public static PushObjectCacheRequest build(java.util.Map<String, ?> map) throws Exception {
        PushObjectCacheRequest self = new PushObjectCacheRequest();
        return TeaModel.build(map, self);
    }

    public PushObjectCacheRequest setArea(String area) {
        this.area = area;
        return this;
    }
    public String getArea() {
        return this.area;
    }

    public PushObjectCacheRequest setL2Preload(Boolean l2Preload) {
        this.l2Preload = l2Preload;
        return this;
    }
    public Boolean getL2Preload() {
        return this.l2Preload;
    }

    public PushObjectCacheRequest setObjectPath(String objectPath) {
        this.objectPath = objectPath;
        return this;
    }
    public String getObjectPath() {
        return this.objectPath;
    }

    public PushObjectCacheRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public PushObjectCacheRequest setSecurityToken(String securityToken) {
        this.securityToken = securityToken;
        return this;
    }
    public String getSecurityToken() {
        return this.securityToken;
    }

}
