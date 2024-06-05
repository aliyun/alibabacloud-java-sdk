// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_dg20230914.models;

import com.aliyun.tea.*;

public class AddDatabaseListRequest extends TeaModel {
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("DatabaseString")
    public String databaseString;

    public static AddDatabaseListRequest build(java.util.Map<String, ?> map) throws Exception {
        AddDatabaseListRequest self = new AddDatabaseListRequest();
        return TeaModel.build(map, self);
    }

    public AddDatabaseListRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public AddDatabaseListRequest setDatabaseString(String databaseString) {
        this.databaseString = databaseString;
        return this;
    }
    public String getDatabaseString() {
        return this.databaseString;
    }

}
