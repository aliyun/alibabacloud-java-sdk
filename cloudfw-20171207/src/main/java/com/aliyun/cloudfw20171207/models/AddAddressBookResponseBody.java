// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class AddAddressBookResponseBody extends TeaModel {
    // The UUID of the returned address book.
    @NameInMap("GroupUuid")
    public String groupUuid;

    // The ID of the request.
    @NameInMap("RequestId")
    public String requestId;

    public static AddAddressBookResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AddAddressBookResponseBody self = new AddAddressBookResponseBody();
        return TeaModel.build(map, self);
    }

    public AddAddressBookResponseBody setGroupUuid(String groupUuid) {
        this.groupUuid = groupUuid;
        return this;
    }
    public String getGroupUuid() {
        return this.groupUuid;
    }

    public AddAddressBookResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
