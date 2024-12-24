// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.metaspace20220307.models;

import com.aliyun.tea.*;

public class ApplyCoordinationWithCodeRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>PA3MU***</p>
     */
    @NameInMap("CoordinationCode")
    public String coordinationCode;

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
     * <p>09e2b2e6-3181******</p>
     */
    @NameInMap("SessionId")
    public String sessionId;

    /**
     * <strong>example:</strong>
     * <p>A8B35215993FBF283F28D61******</p>
     */
    @NameInMap("Uuid")
    public String uuid;

    public static ApplyCoordinationWithCodeRequest build(java.util.Map<String, ?> map) throws Exception {
        ApplyCoordinationWithCodeRequest self = new ApplyCoordinationWithCodeRequest();
        return TeaModel.build(map, self);
    }

    public ApplyCoordinationWithCodeRequest setCoordinationCode(String coordinationCode) {
        this.coordinationCode = coordinationCode;
        return this;
    }
    public String getCoordinationCode() {
        return this.coordinationCode;
    }

    public ApplyCoordinationWithCodeRequest setLoginRegionId(String loginRegionId) {
        this.loginRegionId = loginRegionId;
        return this;
    }
    public String getLoginRegionId() {
        return this.loginRegionId;
    }

    public ApplyCoordinationWithCodeRequest setLoginToken(String loginToken) {
        this.loginToken = loginToken;
        return this;
    }
    public String getLoginToken() {
        return this.loginToken;
    }

    public ApplyCoordinationWithCodeRequest setSessionId(String sessionId) {
        this.sessionId = sessionId;
        return this;
    }
    public String getSessionId() {
        return this.sessionId;
    }

    public ApplyCoordinationWithCodeRequest setUuid(String uuid) {
        this.uuid = uuid;
        return this;
    }
    public String getUuid() {
        return this.uuid;
    }

}
