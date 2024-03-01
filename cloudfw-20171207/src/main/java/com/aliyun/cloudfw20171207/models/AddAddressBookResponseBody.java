// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class AddAddressBookResponseBody extends TeaModel {
    /**
     * <p>The UUID of the returned address book.</p>
     */
    @NameInMap("GroupUuid")
    public String groupUuid;

    /**
     * <p>The request ID.</p>
     */
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
