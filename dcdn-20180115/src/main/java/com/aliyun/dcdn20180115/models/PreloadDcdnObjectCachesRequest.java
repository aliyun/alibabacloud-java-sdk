// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class PreloadDcdnObjectCachesRequest extends TeaModel {
    /**
     * <p>The acceleration region in which you want to prefetch content. If you do not specify a region, the value overseas is used.</p>
     * <br>
     * <p>*   **domestic**: Chinese mainland</p>
     * <p>*   **overseas**: outside the Chinese mainland</p>
     */
    @NameInMap("Area")
    public String area;

    /**
     * <p>Specifies whether to prefetch content to POPs. Valid values:</p>
     * <br>
     * <p>*   **true**: prefetches content to nodes that include L2 DCDN nodes.</p>
     * <p>*   **false**: prefetches content to L2 POPs or L3 POPs.</p>
     */
    @NameInMap("L2Preload")
    public Boolean l2Preload;

    /**
     * <p>The path of the content that you want to prefetch. Separate multiple URLs with line feed characters (\n) or a pair of carriage return and line feed characters (\r\n).</p>
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

    public static PreloadDcdnObjectCachesRequest build(java.util.Map<String, ?> map) throws Exception {
        PreloadDcdnObjectCachesRequest self = new PreloadDcdnObjectCachesRequest();
        return TeaModel.build(map, self);
    }

    public PreloadDcdnObjectCachesRequest setArea(String area) {
        this.area = area;
        return this;
    }
    public String getArea() {
        return this.area;
    }

    public PreloadDcdnObjectCachesRequest setL2Preload(Boolean l2Preload) {
        this.l2Preload = l2Preload;
        return this;
    }
    public Boolean getL2Preload() {
        return this.l2Preload;
    }

    public PreloadDcdnObjectCachesRequest setObjectPath(String objectPath) {
        this.objectPath = objectPath;
        return this;
    }
    public String getObjectPath() {
        return this.objectPath;
    }

    public PreloadDcdnObjectCachesRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public PreloadDcdnObjectCachesRequest setSecurityToken(String securityToken) {
        this.securityToken = securityToken;
        return this;
    }
    public String getSecurityToken() {
        return this.securityToken;
    }

    public PreloadDcdnObjectCachesRequest setWithHeader(String withHeader) {
        this.withHeader = withHeader;
        return this;
    }
    public String getWithHeader() {
        return this.withHeader;
    }

}
