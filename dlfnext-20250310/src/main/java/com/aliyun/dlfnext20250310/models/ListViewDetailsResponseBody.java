// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dlfnext20250310.models;

import com.aliyun.tea.*;

public class ListViewDetailsResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>“”</p>
     */
    @NameInMap("nextPageToken")
    public String nextPageToken;

    @NameInMap("viewDetails")
    public java.util.List<View> viewDetails;

    public static ListViewDetailsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListViewDetailsResponseBody self = new ListViewDetailsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListViewDetailsResponseBody setNextPageToken(String nextPageToken) {
        this.nextPageToken = nextPageToken;
        return this;
    }
    public String getNextPageToken() {
        return this.nextPageToken;
    }

    public ListViewDetailsResponseBody setViewDetails(java.util.List<View> viewDetails) {
        this.viewDetails = viewDetails;
        return this;
    }
    public java.util.List<View> getViewDetails() {
        return this.viewDetails;
    }

}
