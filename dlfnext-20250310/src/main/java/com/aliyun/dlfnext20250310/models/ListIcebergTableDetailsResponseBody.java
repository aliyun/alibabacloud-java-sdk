// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dlfnext20250310.models;

import com.aliyun.tea.*;

public class ListIcebergTableDetailsResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>&quot;&quot;</p>
     */
    @NameInMap("nextPageToken")
    public String nextPageToken;

    @NameInMap("tableDetails")
    public java.util.List<IcebergTable> tableDetails;

    public static ListIcebergTableDetailsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListIcebergTableDetailsResponseBody self = new ListIcebergTableDetailsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListIcebergTableDetailsResponseBody setNextPageToken(String nextPageToken) {
        this.nextPageToken = nextPageToken;
        return this;
    }
    public String getNextPageToken() {
        return this.nextPageToken;
    }

    public ListIcebergTableDetailsResponseBody setTableDetails(java.util.List<IcebergTable> tableDetails) {
        this.tableDetails = tableDetails;
        return this;
    }
    public java.util.List<IcebergTable> getTableDetails() {
        return this.tableDetails;
    }

}
