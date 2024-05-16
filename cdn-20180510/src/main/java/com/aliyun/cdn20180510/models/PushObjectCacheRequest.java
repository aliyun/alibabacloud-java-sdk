// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class PushObjectCacheRequest extends TeaModel {
    /**
     * <p>The accelerated region where content is to be prefetched. Valid values:</p>
     * <br>
     * <p>*   **domestic****: Chinese mainland**</p>
     * <p>*   **overseas****: regions outside the Chinese mainland**</p>
     * <br>
     * <p>If you do not set this parameter, content in the accelerated region of the domain name is prefetched.</p>
     * <br>
     * <p>*   If the accelerated region is set to **Mainland China Only**, content in regions in the Chinese mainland is prefetched.</p>
     * <p>*   If the accelerated region is set to **Global**, content in all regions is prefetched.</p>
     * <p>*   If the accelerated region is set to **Global (Excluding Mainland China)**, content in regions outside the Chinese mainland is prefetched.</p>
     */
    @NameInMap("Area")
    public String area;

    /**
     * <p>Specifies whether to prefetch content to POPs. Valid values:</p>
     * <br>
     * <p>*   **true**: prefetches content to POPs.</p>
     * <p>*   **false**: prefetches content to regular POPs. Regular POPs can be L2 POPs or L3 POPs. Default value: **false**.</p>
     */
    @NameInMap("L2Preload")
    public Boolean l2Preload;

    /**
     * <p>The URLs based on which content is prefetched. Format: **accelerated domain name/files to be prefetched**.</p>
     * <br>
     * <p>> Separate URLs with line feeds (\\n or \\r\\n). Each object path can be up to 1,024 characters in length.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("ObjectPath")
    public String objectPath;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("SecurityToken")
    public String securityToken;

    /**
     * <p>The custom header for prefetch in the JSON format.</p>
     */
    @NameInMap("WithHeader")
    public String withHeader;

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

    public PushObjectCacheRequest setWithHeader(String withHeader) {
        this.withHeader = withHeader;
        return this;
    }
    public String getWithHeader() {
        return this.withHeader;
    }

}
