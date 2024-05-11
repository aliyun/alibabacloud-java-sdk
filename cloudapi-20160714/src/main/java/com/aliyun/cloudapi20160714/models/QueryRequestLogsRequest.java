// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160714.models;

import com.aliyun.tea.*;

public class QueryRequestLogsRequest extends TeaModel {
    /**
     * <p>The ID of the request log.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("RequestLogId")
    public String requestLogId;

    @NameInMap("SecurityToken")
    public String securityToken;

    public static QueryRequestLogsRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryRequestLogsRequest self = new QueryRequestLogsRequest();
        return TeaModel.build(map, self);
    }

    public QueryRequestLogsRequest setRequestLogId(String requestLogId) {
        this.requestLogId = requestLogId;
        return this;
    }
    public String getRequestLogId() {
        return this.requestLogId;
    }

    public QueryRequestLogsRequest setSecurityToken(String securityToken) {
        this.securityToken = securityToken;
        return this;
    }
    public String getSecurityToken() {
        return this.securityToken;
    }

}
