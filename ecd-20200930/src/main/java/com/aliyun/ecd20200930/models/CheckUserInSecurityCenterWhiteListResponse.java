// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class CheckUserInSecurityCenterWhiteListResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("InWhiteList")
    @Validation(required = true)
    public Boolean inWhiteList;

    public static CheckUserInSecurityCenterWhiteListResponse build(java.util.Map<String, ?> map) throws Exception {
        CheckUserInSecurityCenterWhiteListResponse self = new CheckUserInSecurityCenterWhiteListResponse();
        return TeaModel.build(map, self);
    }

    public CheckUserInSecurityCenterWhiteListResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CheckUserInSecurityCenterWhiteListResponse setInWhiteList(Boolean inWhiteList) {
        this.inWhiteList = inWhiteList;
        return this;
    }
    public Boolean getInWhiteList() {
        return this.inWhiteList;
    }

}
