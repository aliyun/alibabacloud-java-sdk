// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aas20150701.models;

import com.aliyun.tea.*;

public class ListAccessKeysForAccountRequest extends TeaModel {
    @NameInMap("AKStatus")
    public String AKStatus;

    @NameInMap("AKType")
    public String AKType;

    @NameInMap("PK")
    public String PK;

    public static ListAccessKeysForAccountRequest build(java.util.Map<String, ?> map) throws Exception {
        ListAccessKeysForAccountRequest self = new ListAccessKeysForAccountRequest();
        return TeaModel.build(map, self);
    }

    public ListAccessKeysForAccountRequest setAKStatus(String AKStatus) {
        this.AKStatus = AKStatus;
        return this;
    }
    public String getAKStatus() {
        return this.AKStatus;
    }

    public ListAccessKeysForAccountRequest setAKType(String AKType) {
        this.AKType = AKType;
        return this;
    }
    public String getAKType() {
        return this.AKType;
    }

    public ListAccessKeysForAccountRequest setPK(String PK) {
        this.PK = PK;
        return this;
    }
    public String getPK() {
        return this.PK;
    }

}
