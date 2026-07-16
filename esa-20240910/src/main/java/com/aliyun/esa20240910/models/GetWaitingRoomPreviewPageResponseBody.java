// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class GetWaitingRoomPreviewPageResponseBody extends TeaModel {
    /**
     * <p>The waiting room preview page URL.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="http://waitingroom.myalicdn.com/testxxxx">http://waitingroom.myalicdn.com/testxxxx</a></p>
     */
    @NameInMap("PageUrl")
    public String pageUrl;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>9732E117-8A37-49FD-A36F-ABBB87556CA7</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static GetWaitingRoomPreviewPageResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetWaitingRoomPreviewPageResponseBody self = new GetWaitingRoomPreviewPageResponseBody();
        return TeaModel.build(map, self);
    }

    public GetWaitingRoomPreviewPageResponseBody setPageUrl(String pageUrl) {
        this.pageUrl = pageUrl;
        return this;
    }
    public String getPageUrl() {
        return this.pageUrl;
    }

    public GetWaitingRoomPreviewPageResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
