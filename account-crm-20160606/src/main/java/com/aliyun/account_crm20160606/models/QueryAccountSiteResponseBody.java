// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.account_crm20160606.models;

import com.aliyun.tea.*;

public class QueryAccountSiteResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Site")
    public String site;

    @NameInMap("Success")
    public Boolean success;

    public static QueryAccountSiteResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryAccountSiteResponseBody self = new QueryAccountSiteResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryAccountSiteResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryAccountSiteResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryAccountSiteResponseBody setSite(String site) {
        this.site = site;
        return this;
    }
    public String getSite() {
        return this.site;
    }

    public QueryAccountSiteResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
