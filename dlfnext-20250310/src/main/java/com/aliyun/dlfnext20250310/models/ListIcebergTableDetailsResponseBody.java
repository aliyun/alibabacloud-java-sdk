// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dlfnext20250310.models;

import com.aliyun.tea.*;

public class ListIcebergTableDetailsResponseBody extends TeaModel {
    /**
     * <p>The token to retrieve the next page of results. If this parameter is null, all results have been returned.</p>
     * 
     * <strong>example:</strong>
     * <p>&quot;&quot;</p>
     */
    @NameInMap("nextPageToken")
    public String nextPageToken;

    /**
     * <p>A list of data tables.</p>
     */
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
