// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.companyreg20200306.models;

import com.aliyun.tea.*;

public class QueryUserNeedAuthResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>True</p>
     */
    @NameInMap("NeedAuth")
    public Boolean needAuth;

    /**
     * <strong>example:</strong>
     * <p>2C859C36-886C-5BE7-A606-01F38A5374D6</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>True</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static QueryUserNeedAuthResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryUserNeedAuthResponseBody self = new QueryUserNeedAuthResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryUserNeedAuthResponseBody setNeedAuth(Boolean needAuth) {
        this.needAuth = needAuth;
        return this;
    }
    public Boolean getNeedAuth() {
        return this.needAuth;
    }

    public QueryUserNeedAuthResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryUserNeedAuthResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
