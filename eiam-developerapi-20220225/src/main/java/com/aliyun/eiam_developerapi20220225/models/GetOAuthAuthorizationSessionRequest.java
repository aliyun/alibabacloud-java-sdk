// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam_developerapi20220225.models;

import com.aliyun.tea.*;

public class GetOAuthAuthorizationSessionRequest extends TeaModel {
    /**
     * <p>The authorization session URI.</p>
     * <blockquote>
     * <p>Returned by the FetchOAuthAuthenticationToken call.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>urn:ietf:params:oauth:request_uri:atpoas_01l6ljnvrpc5niakl3gj3amxxxxxx</p>
     */
    @NameInMap("sessionUri")
    public String sessionUri;

    public static GetOAuthAuthorizationSessionRequest build(java.util.Map<String, ?> map) throws Exception {
        GetOAuthAuthorizationSessionRequest self = new GetOAuthAuthorizationSessionRequest();
        return TeaModel.build(map, self);
    }

    public GetOAuthAuthorizationSessionRequest setSessionUri(String sessionUri) {
        this.sessionUri = sessionUri;
        return this;
    }
    public String getSessionUri() {
        return this.sessionUri;
    }

}
