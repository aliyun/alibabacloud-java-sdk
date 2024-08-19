// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class AddAddressBookResponseBody extends TeaModel {
    /**
     * <p>The UUID of the returned address book.</p>
     * 
     * <strong>example:</strong>
     * <p>f04ac7ce-628b-4cb7-be61-310222b7****</p>
     */
    @NameInMap("GroupUuid")
    public String groupUuid;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>CBF1E9B7-D6A0-4E9E-AD3E-2B47E6C2****</p>
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
