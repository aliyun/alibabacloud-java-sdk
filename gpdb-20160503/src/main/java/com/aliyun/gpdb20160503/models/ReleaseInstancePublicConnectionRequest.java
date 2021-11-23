// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gpdb20160503.models;

import com.aliyun.tea.*;

public class ReleaseInstancePublicConnectionRequest extends TeaModel {
    @NameInMap("AddressType")
    public String addressType;

    @NameInMap("CurrentConnectionString")
    public String currentConnectionString;

    @NameInMap("DBInstanceId")
    public String DBInstanceId;

    public static ReleaseInstancePublicConnectionRequest build(java.util.Map<String, ?> map) throws Exception {
        ReleaseInstancePublicConnectionRequest self = new ReleaseInstancePublicConnectionRequest();
        return TeaModel.build(map, self);
    }

    public ReleaseInstancePublicConnectionRequest setAddressType(String addressType) {
        this.addressType = addressType;
        return this;
    }
    public String getAddressType() {
        return this.addressType;
    }

    public ReleaseInstancePublicConnectionRequest setCurrentConnectionString(String currentConnectionString) {
        this.currentConnectionString = currentConnectionString;
        return this;
    }
    public String getCurrentConnectionString() {
        return this.currentConnectionString;
    }

    public ReleaseInstancePublicConnectionRequest setDBInstanceId(String DBInstanceId) {
        this.DBInstanceId = DBInstanceId;
        return this;
    }
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

}
