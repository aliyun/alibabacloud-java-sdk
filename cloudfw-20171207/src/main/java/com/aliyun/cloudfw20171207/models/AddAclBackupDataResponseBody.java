// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class AddAclBackupDataResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>244EA37C-D2AB-54A7-B6E3-7ED0E9A1****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static AddAclBackupDataResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AddAclBackupDataResponseBody self = new AddAclBackupDataResponseBody();
        return TeaModel.build(map, self);
    }

    public AddAclBackupDataResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
