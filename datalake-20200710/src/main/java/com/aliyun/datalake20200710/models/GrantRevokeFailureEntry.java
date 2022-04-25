// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.datalake20200710.models;

import com.aliyun.tea.*;

public class GrantRevokeFailureEntry extends TeaModel {
    @NameInMap("ErrorDetail")
    public ErrorDetail errorDetail;

    @NameInMap("GrantRevokeEntry")
    public GrantRevokeEntry grantRevokeEntry;

    public static GrantRevokeFailureEntry build(java.util.Map<String, ?> map) throws Exception {
        GrantRevokeFailureEntry self = new GrantRevokeFailureEntry();
        return TeaModel.build(map, self);
    }

    public GrantRevokeFailureEntry setErrorDetail(ErrorDetail errorDetail) {
        this.errorDetail = errorDetail;
        return this;
    }
    public ErrorDetail getErrorDetail() {
        return this.errorDetail;
    }

    public GrantRevokeFailureEntry setGrantRevokeEntry(GrantRevokeEntry grantRevokeEntry) {
        this.grantRevokeEntry = grantRevokeEntry;
        return this;
    }
    public GrantRevokeEntry getGrantRevokeEntry() {
        return this.grantRevokeEntry;
    }

}
