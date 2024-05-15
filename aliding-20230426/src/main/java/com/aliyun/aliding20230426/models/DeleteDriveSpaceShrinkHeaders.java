// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class DeleteDriveSpaceShrinkHeaders extends TeaModel {
    @NameInMap("commonHeaders")
    public java.util.Map<String, String> commonHeaders;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("AccountContext")
    public String accountContextShrink;

    public static DeleteDriveSpaceShrinkHeaders build(java.util.Map<String, ?> map) throws Exception {
        DeleteDriveSpaceShrinkHeaders self = new DeleteDriveSpaceShrinkHeaders();
        return TeaModel.build(map, self);
    }

    public DeleteDriveSpaceShrinkHeaders setCommonHeaders(java.util.Map<String, String> commonHeaders) {
        this.commonHeaders = commonHeaders;
        return this;
    }
    public java.util.Map<String, String> getCommonHeaders() {
        return this.commonHeaders;
    }

    public DeleteDriveSpaceShrinkHeaders setAccountContextShrink(String accountContextShrink) {
        this.accountContextShrink = accountContextShrink;
        return this;
    }
    public String getAccountContextShrink() {
        return this.accountContextShrink;
    }

}
