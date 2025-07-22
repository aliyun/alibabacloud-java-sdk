// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dlfnext20250310.models;

import com.aliyun.tea.*;

public class ListTableDetailsResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>E8ABEB1C3DB893D16576269017992F57</p>
     */
    @NameInMap("nextPageToken")
    public String nextPageToken;

    @NameInMap("tableDetails")
    public java.util.List<Table> tableDetails;

    public static ListTableDetailsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListTableDetailsResponseBody self = new ListTableDetailsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListTableDetailsResponseBody setNextPageToken(String nextPageToken) {
        this.nextPageToken = nextPageToken;
        return this;
    }
    public String getNextPageToken() {
        return this.nextPageToken;
    }

    public ListTableDetailsResponseBody setTableDetails(java.util.List<Table> tableDetails) {
        this.tableDetails = tableDetails;
        return this;
    }
    public java.util.List<Table> getTableDetails() {
        return this.tableDetails;
    }

}
