// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth_intl20220809.models;

import com.aliyun.tea.*;

public class TempAccessTokenIntlRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>none</p>
     */
    @NameInMap("Type")
    public String type;

    public static TempAccessTokenIntlRequest build(java.util.Map<String, ?> map) throws Exception {
        TempAccessTokenIntlRequest self = new TempAccessTokenIntlRequest();
        return TeaModel.build(map, self);
    }

    public TempAccessTokenIntlRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
