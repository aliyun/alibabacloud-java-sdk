// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aas20150701.models;

import com.aliyun.tea.*;

public class DeleteAccessKeyForAccountRequest extends TeaModel {
    @NameInMap("AKId")
    public String AKId;

    @NameInMap("PK")
    public String PK;

    public static DeleteAccessKeyForAccountRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteAccessKeyForAccountRequest self = new DeleteAccessKeyForAccountRequest();
        return TeaModel.build(map, self);
    }

    public DeleteAccessKeyForAccountRequest setAKId(String AKId) {
        this.AKId = AKId;
        return this;
    }
    public String getAKId() {
        return this.AKId;
    }

    public DeleteAccessKeyForAccountRequest setPK(String PK) {
        this.PK = PK;
        return this;
    }
    public String getPK() {
        return this.PK;
    }

}
