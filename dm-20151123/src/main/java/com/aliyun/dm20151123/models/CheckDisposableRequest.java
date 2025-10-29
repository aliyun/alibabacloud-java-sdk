// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dm20151123.models;

import com.aliyun.tea.*;

public class CheckDisposableRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p><a href="mailto:Txxxxm@xxxx.com">Txxxxm@xxxx.com</a></p>
     */
    @NameInMap("Email")
    public String email;

    public static CheckDisposableRequest build(java.util.Map<String, ?> map) throws Exception {
        CheckDisposableRequest self = new CheckDisposableRequest();
        return TeaModel.build(map, self);
    }

    public CheckDisposableRequest setEmail(String email) {
        this.email = email;
        return this;
    }
    public String getEmail() {
        return this.email;
    }

}
