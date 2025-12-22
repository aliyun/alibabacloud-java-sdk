// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dlfnext20250310.models;

import com.aliyun.tea.*;

public class ListViewsResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>E8ABEB1C3DB893D16576269017992F57</p>
     */
    @NameInMap("nextPageToken")
    public String nextPageToken;

    @NameInMap("views")
    public java.util.List<String> views;

    public static ListViewsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListViewsResponseBody self = new ListViewsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListViewsResponseBody setNextPageToken(String nextPageToken) {
        this.nextPageToken = nextPageToken;
        return this;
    }
    public String getNextPageToken() {
        return this.nextPageToken;
    }

    public ListViewsResponseBody setViews(java.util.List<String> views) {
        this.views = views;
        return this;
    }
    public java.util.List<String> getViews() {
        return this.views;
    }

}
