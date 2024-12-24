// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.metaspace20220307.models;

import com.aliyun.tea.*;

public class EndAllCoordinationByOwnerRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("LoginRegionId")
    public String loginRegionId;

    /**
     * <strong>example:</strong>
     * <p>v2c4e2ef03d62******</p>
     */
    @NameInMap("LoginToken")
    public String loginToken;

    /**
     * <strong>example:</strong>
     * <p>ecd-68a7ddrt0******</p>
     */
    @NameInMap("ResourceId")
    public String resourceId;

    /**
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("ResourceRegionId")
    public String resourceRegionId;

    /**
     * <strong>example:</strong>
     * <p>CloudDesktop</p>
     */
    @NameInMap("ResourceType")
    public String resourceType;

    /**
     * <strong>example:</strong>
     * <p>09e2b2e6-3181******</p>
     */
    @NameInMap("SessionId")
    public String sessionId;

    public static EndAllCoordinationByOwnerRequest build(java.util.Map<String, ?> map) throws Exception {
        EndAllCoordinationByOwnerRequest self = new EndAllCoordinationByOwnerRequest();
        return TeaModel.build(map, self);
    }

    public EndAllCoordinationByOwnerRequest setLoginRegionId(String loginRegionId) {
        this.loginRegionId = loginRegionId;
        return this;
    }
    public String getLoginRegionId() {
        return this.loginRegionId;
    }

    public EndAllCoordinationByOwnerRequest setLoginToken(String loginToken) {
        this.loginToken = loginToken;
        return this;
    }
    public String getLoginToken() {
        return this.loginToken;
    }

    public EndAllCoordinationByOwnerRequest setResourceId(String resourceId) {
        this.resourceId = resourceId;
        return this;
    }
    public String getResourceId() {
        return this.resourceId;
    }

    public EndAllCoordinationByOwnerRequest setResourceRegionId(String resourceRegionId) {
        this.resourceRegionId = resourceRegionId;
        return this;
    }
    public String getResourceRegionId() {
        return this.resourceRegionId;
    }

    public EndAllCoordinationByOwnerRequest setResourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }
    public String getResourceType() {
        return this.resourceType;
    }

    public EndAllCoordinationByOwnerRequest setSessionId(String sessionId) {
        this.sessionId = sessionId;
        return this;
    }
    public String getSessionId() {
        return this.sessionId;
    }

}
