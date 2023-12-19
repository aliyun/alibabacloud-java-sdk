// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hbr20170908.models;

import com.aliyun.tea.*;

public class DeleteBackupClientResourceShrinkRequest extends TeaModel {
    /**
     * <p>The IDs of HBR clients. You can specify a maximum of 100 client IDs.</p>
     */
    @NameInMap("ClientIds")
    public String clientIdsShrink;

    public static DeleteBackupClientResourceShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteBackupClientResourceShrinkRequest self = new DeleteBackupClientResourceShrinkRequest();
        return TeaModel.build(map, self);
    }

    public DeleteBackupClientResourceShrinkRequest setClientIdsShrink(String clientIdsShrink) {
        this.clientIdsShrink = clientIdsShrink;
        return this;
    }
    public String getClientIdsShrink() {
        return this.clientIdsShrink;
    }

}
