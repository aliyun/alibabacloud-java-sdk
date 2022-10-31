// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class PlayChoosenShowResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ShowId")
    public String showId;

    public static PlayChoosenShowResponseBody build(java.util.Map<String, ?> map) throws Exception {
        PlayChoosenShowResponseBody self = new PlayChoosenShowResponseBody();
        return TeaModel.build(map, self);
    }

    public PlayChoosenShowResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public PlayChoosenShowResponseBody setShowId(String showId) {
        this.showId = showId;
        return this;
    }
    public String getShowId() {
        return this.showId;
    }

}
