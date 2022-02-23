// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aas20150701.models;

import com.aliyun.tea.*;

public class GetBasicInfoForAccountResponseBody extends TeaModel {
    @NameInMap("AccountStatus")
    public String accountStatus;

    @NameInMap("LastLoginDate")
    public String lastLoginDate;

    @NameInMap("PK")
    public String PK;

    @NameInMap("RequestId")
    public String requestId;

    public static GetBasicInfoForAccountResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetBasicInfoForAccountResponseBody self = new GetBasicInfoForAccountResponseBody();
        return TeaModel.build(map, self);
    }

    public GetBasicInfoForAccountResponseBody setAccountStatus(String accountStatus) {
        this.accountStatus = accountStatus;
        return this;
    }
    public String getAccountStatus() {
        return this.accountStatus;
    }

    public GetBasicInfoForAccountResponseBody setLastLoginDate(String lastLoginDate) {
        this.lastLoginDate = lastLoginDate;
        return this;
    }
    public String getLastLoginDate() {
        return this.lastLoginDate;
    }

    public GetBasicInfoForAccountResponseBody setPK(String PK) {
        this.PK = PK;
        return this;
    }
    public String getPK() {
        return this.PK;
    }

    public GetBasicInfoForAccountResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
