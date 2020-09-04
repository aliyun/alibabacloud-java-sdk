// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emas_devops20191204.models;

import com.aliyun.tea.*;

public class GetScmAppConfigResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Bid")
    @Validation(required = true)
    public String bid;

    @NameInMap("ScmAddr")
    @Validation(required = true)
    public String scmAddr;

    @NameInMap("CurrentAccessIdentifier")
    @Validation(required = true)
    public java.util.Map<String, ?> currentAccessIdentifier;

    @NameInMap("ScmAccessIdentifiers")
    @Validation(required = true)
    public java.util.Map<String, ?> scmAccessIdentifiers;

    @NameInMap("Branch")
    @Validation(required = true)
    public String branch;

    public static GetScmAppConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        GetScmAppConfigResponse self = new GetScmAppConfigResponse();
        return TeaModel.build(map, self);
    }

    public GetScmAppConfigResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetScmAppConfigResponse setBid(String bid) {
        this.bid = bid;
        return this;
    }
    public String getBid() {
        return this.bid;
    }

    public GetScmAppConfigResponse setScmAddr(String scmAddr) {
        this.scmAddr = scmAddr;
        return this;
    }
    public String getScmAddr() {
        return this.scmAddr;
    }

    public GetScmAppConfigResponse setCurrentAccessIdentifier(java.util.Map<String, ?> currentAccessIdentifier) {
        this.currentAccessIdentifier = currentAccessIdentifier;
        return this;
    }
    public java.util.Map<String, ?> getCurrentAccessIdentifier() {
        return this.currentAccessIdentifier;
    }

    public GetScmAppConfigResponse setScmAccessIdentifiers(java.util.Map<String, ?> scmAccessIdentifiers) {
        this.scmAccessIdentifiers = scmAccessIdentifiers;
        return this;
    }
    public java.util.Map<String, ?> getScmAccessIdentifiers() {
        return this.scmAccessIdentifiers;
    }

    public GetScmAppConfigResponse setBranch(String branch) {
        this.branch = branch;
        return this;
    }
    public String getBranch() {
        return this.branch;
    }

}
