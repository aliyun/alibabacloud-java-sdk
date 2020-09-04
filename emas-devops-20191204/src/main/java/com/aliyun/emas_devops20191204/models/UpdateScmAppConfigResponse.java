// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emas_devops20191204.models;

import com.aliyun.tea.*;

public class UpdateScmAppConfigResponse extends TeaModel {
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

    public static UpdateScmAppConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateScmAppConfigResponse self = new UpdateScmAppConfigResponse();
        return TeaModel.build(map, self);
    }

    public UpdateScmAppConfigResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UpdateScmAppConfigResponse setBid(String bid) {
        this.bid = bid;
        return this;
    }
    public String getBid() {
        return this.bid;
    }

    public UpdateScmAppConfigResponse setScmAddr(String scmAddr) {
        this.scmAddr = scmAddr;
        return this;
    }
    public String getScmAddr() {
        return this.scmAddr;
    }

    public UpdateScmAppConfigResponse setCurrentAccessIdentifier(java.util.Map<String, ?> currentAccessIdentifier) {
        this.currentAccessIdentifier = currentAccessIdentifier;
        return this;
    }
    public java.util.Map<String, ?> getCurrentAccessIdentifier() {
        return this.currentAccessIdentifier;
    }

    public UpdateScmAppConfigResponse setScmAccessIdentifiers(java.util.Map<String, ?> scmAccessIdentifiers) {
        this.scmAccessIdentifiers = scmAccessIdentifiers;
        return this;
    }
    public java.util.Map<String, ?> getScmAccessIdentifiers() {
        return this.scmAccessIdentifiers;
    }

    public UpdateScmAppConfigResponse setBranch(String branch) {
        this.branch = branch;
        return this;
    }
    public String getBranch() {
        return this.branch;
    }

}
