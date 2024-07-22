// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.appstream_center20210220.models;

import com.aliyun.tea.*;

public class RefreshLoginTokenResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>v12369636c721ba6b3ddb1683341016775c3f63e4d0e78f120f9a0544ed826b7af7daf747c402f0d0730b52f451b70****</p>
     */
    @NameInMap("LoginToken")
    public String loginToken;

    /**
     * <strong>example:</strong>
     * <p>419F31B9-1FDF-5644-ABA3-D00026FA****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static RefreshLoginTokenResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RefreshLoginTokenResponseBody self = new RefreshLoginTokenResponseBody();
        return TeaModel.build(map, self);
    }

    public RefreshLoginTokenResponseBody setLoginToken(String loginToken) {
        this.loginToken = loginToken;
        return this;
    }
    public String getLoginToken() {
        return this.loginToken;
    }

    public RefreshLoginTokenResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
