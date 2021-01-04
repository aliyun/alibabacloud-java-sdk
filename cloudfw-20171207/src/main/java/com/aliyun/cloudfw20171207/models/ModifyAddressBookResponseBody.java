// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class ModifyAddressBookResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static ModifyAddressBookResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyAddressBookResponseBody self = new ModifyAddressBookResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyAddressBookResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
