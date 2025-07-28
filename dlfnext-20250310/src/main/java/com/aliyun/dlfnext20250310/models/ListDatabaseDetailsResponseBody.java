// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dlfnext20250310.models;

import com.aliyun.tea.*;

public class ListDatabaseDetailsResponseBody extends TeaModel {
    @NameInMap("databaseDetails")
    public java.util.List<Database> databaseDetails;

    /**
     * <strong>example:</strong>
     * <p>E8ABEB1C3DB893D16576269017992F57</p>
     */
    @NameInMap("nextPageToken")
    public String nextPageToken;

    public static ListDatabaseDetailsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListDatabaseDetailsResponseBody self = new ListDatabaseDetailsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListDatabaseDetailsResponseBody setDatabaseDetails(java.util.List<Database> databaseDetails) {
        this.databaseDetails = databaseDetails;
        return this;
    }
    public java.util.List<Database> getDatabaseDetails() {
        return this.databaseDetails;
    }

    public ListDatabaseDetailsResponseBody setNextPageToken(String nextPageToken) {
        this.nextPageToken = nextPageToken;
        return this;
    }
    public String getNextPageToken() {
        return this.nextPageToken;
    }

}
