// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class CheckUserInSecurityCenterWhiteListResponseBody extends TeaModel {
    @NameInMap("InWhiteList")
    public Boolean inWhiteList;

    @NameInMap("RequestId")
    public String requestId;

    public static CheckUserInSecurityCenterWhiteListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CheckUserInSecurityCenterWhiteListResponseBody self = new CheckUserInSecurityCenterWhiteListResponseBody();
        return TeaModel.build(map, self);
    }

    public CheckUserInSecurityCenterWhiteListResponseBody setInWhiteList(Boolean inWhiteList) {
        this.inWhiteList = inWhiteList;
        return this;
    }
    public Boolean getInWhiteList() {
        return this.inWhiteList;
    }

    public CheckUserInSecurityCenterWhiteListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
