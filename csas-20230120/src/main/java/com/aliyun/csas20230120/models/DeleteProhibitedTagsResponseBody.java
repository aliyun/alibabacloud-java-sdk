// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csas20230120.models;

import com.aliyun.tea.*;

public class DeleteProhibitedTagsResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>A900F300-AF09-5A39-954F-50B8CF733FD6</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteProhibitedTagsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteProhibitedTagsResponseBody self = new DeleteProhibitedTagsResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteProhibitedTagsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
