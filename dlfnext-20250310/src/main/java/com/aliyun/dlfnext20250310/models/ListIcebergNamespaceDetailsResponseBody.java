// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dlfnext20250310.models;

import com.aliyun.tea.*;

public class ListIcebergNamespaceDetailsResponseBody extends TeaModel {
    @NameInMap("namespaceDetails")
    public java.util.List<Namespace> namespaceDetails;

    /**
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
