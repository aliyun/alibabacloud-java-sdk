// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.appstream_center20210218.models;

import com.aliyun.tea.*;

public class ExpireLoginTokenRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>testuser</p>
     */
    @NameInMap("EndUserId")
    public String endUserId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>v185fdd7f6d39fa7861981639366085772e150a390a5bb7b43c4e62440d94fc392b945770e1596cebe90085ce0af4d****</p>
     */
    @NameInMap("LoginToken")
    public String loginToken;

    /**
     * <strong>example:</strong>
     * <p>cn-beijing+dir-172301****</p>
     */
    @NameInMap("OfficeSiteId")
    public String officeSiteId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>a863f4c3-2f1d-4971-8cf7-e2b92ae9****</p>
     */
    @NameInMap("SessionId")
    public String sessionId;

    public static ExpireLoginTokenRequest build(java.util.Map<String, ?> map) throws Exception {
        ExpireLoginTokenRequest self = new ExpireLoginTokenRequest();
        return TeaModel.build(map, self);
    }

    public ExpireLoginTokenRequest setEndUserId(String endUserId) {
        this.endUserId = endUserId;
        return this;
    }
    public String getEndUserId() {
        return this.endUserId;
    }

    public ExpireLoginTokenRequest setLoginToken(String loginToken) {
        this.loginToken = loginToken;
        return this;
    }
    public String getLoginToken() {
        return this.loginToken;
    }

    public ExpireLoginTokenRequest setOfficeSiteId(String officeSiteId) {
        this.officeSiteId = officeSiteId;
        return this;
    }
    public String getOfficeSiteId() {
        return this.officeSiteId;
    }

    public ExpireLoginTokenRequest setSessionId(String sessionId) {
        this.sessionId = sessionId;
        return this;
    }
    public String getSessionId() {
        return this.sessionId;
    }

}
