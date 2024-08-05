// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160714.models;

import com.aliyun.tea.*;

public class AddAccessControlListEntryResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>CEB6EC62-B6C7-5082-A45A-45A204724AC2</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static AddAccessControlListEntryResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AddAccessControlListEntryResponseBody self = new AddAccessControlListEntryResponseBody();
        return TeaModel.build(map, self);
    }

    public AddAccessControlListEntryResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
