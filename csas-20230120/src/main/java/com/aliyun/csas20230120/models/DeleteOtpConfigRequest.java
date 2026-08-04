// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csas20230120.models;

import com.aliyun.tea.*;

public class DeleteOtpConfigRequest extends TeaModel {
    /**
     * <p>The username.</p>
     * 
     * <strong>example:</strong>
     * <p>张三</p>
     */
    @NameInMap("Username")
    public String username;

    public static DeleteOtpConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteOtpConfigRequest self = new DeleteOtpConfigRequest();
        return TeaModel.build(map, self);
    }

    public DeleteOtpConfigRequest setUsername(String username) {
        this.username = username;
        return this;
    }
    public String getUsername() {
        return this.username;
    }

}
