// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class AddFavoritePublicMediaResponseBody extends TeaModel {
    /**
     * <p>A list of Media Asset IDs that were not added to your Favorites. This happens if a Media Asset does not exist or is already in your Favorites.</p>
     */
    @NameInMap("IgnoredList")
    public java.util.List<String> ignoredList;

    /**
     * <p>The Request ID.</p>
     * 
     * <strong>example:</strong>
     * <p><strong><strong><strong>11-DB8D-4A9A-875B-275798</strong></strong></strong></p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static AddFavoritePublicMediaResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AddFavoritePublicMediaResponseBody self = new AddFavoritePublicMediaResponseBody();
        return TeaModel.build(map, self);
    }

    public AddFavoritePublicMediaResponseBody setIgnoredList(java.util.List<String> ignoredList) {
        this.ignoredList = ignoredList;
        return this;
    }
    public java.util.List<String> getIgnoredList() {
        return this.ignoredList;
    }

    public AddFavoritePublicMediaResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
