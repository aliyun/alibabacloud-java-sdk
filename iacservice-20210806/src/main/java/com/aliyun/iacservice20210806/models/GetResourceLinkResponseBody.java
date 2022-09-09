// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iacservice20210806.models;

import com.aliyun.tea.*;

public class GetResourceLinkResponseBody extends TeaModel {
    @NameInMap("link")
    public String link;

    @NameInMap("requestId")
    public String requestId;

    public static GetResourceLinkResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetResourceLinkResponseBody self = new GetResourceLinkResponseBody();
        return TeaModel.build(map, self);
    }

    public GetResourceLinkResponseBody setLink(String link) {
        this.link = link;
        return this;
    }
    public String getLink() {
        return this.link;
    }

    public GetResourceLinkResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
