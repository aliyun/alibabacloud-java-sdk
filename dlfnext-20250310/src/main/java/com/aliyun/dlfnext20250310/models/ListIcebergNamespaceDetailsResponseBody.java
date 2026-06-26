// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dlfnext20250310.models;

import com.aliyun.tea.*;

public class ListIcebergNamespaceDetailsResponseBody extends TeaModel {
    /**
     * <p>The namespaces.</p>
     */
    @NameInMap("namespaceDetails")
    public java.util.List<Namespace> namespaceDetails;

    /**
     * <p>The token for the next page of results. If this parameter is not returned, all results have been retrieved.</p>
     * 
     * <strong>example:</strong>
     * <p>&quot;&quot;</p>
     */
    @NameInMap("nextPageToken")
    public String nextPageToken;

    public static ListIcebergNamespaceDetailsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListIcebergNamespaceDetailsResponseBody self = new ListIcebergNamespaceDetailsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListIcebergNamespaceDetailsResponseBody setNamespaceDetails(java.util.List<Namespace> namespaceDetails) {
        this.namespaceDetails = namespaceDetails;
        return this;
    }
    public java.util.List<Namespace> getNamespaceDetails() {
        return this.namespaceDetails;
    }

    public ListIcebergNamespaceDetailsResponseBody setNextPageToken(String nextPageToken) {
        this.nextPageToken = nextPageToken;
        return this;
    }
    public String getNextPageToken() {
        return this.nextPageToken;
    }

}
