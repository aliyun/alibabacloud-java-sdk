// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dds20151201.models;

import com.aliyun.tea.*;

public class ModifyDBInstanceConnectionStringResponseBody extends TeaModel {
    @NameInMap("ModifiedConnectionString")
    public String modifiedConnectionString;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>FF36A84C-0694-42D0-861D-C383E8E4FAAF</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ModifyDBInstanceConnectionStringResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyDBInstanceConnectionStringResponseBody self = new ModifyDBInstanceConnectionStringResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyDBInstanceConnectionStringResponseBody setModifiedConnectionString(String modifiedConnectionString) {
        this.modifiedConnectionString = modifiedConnectionString;
        return this;
    }
    public String getModifiedConnectionString() {
        return this.modifiedConnectionString;
    }

    public ModifyDBInstanceConnectionStringResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
