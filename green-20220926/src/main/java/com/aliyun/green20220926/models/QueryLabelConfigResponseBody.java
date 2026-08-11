// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20220926.models;

import com.aliyun.tea.*;

public class QueryLabelConfigResponseBody extends TeaModel {
    /**
     * <p>The content moderation configuration.</p>
     */
    @NameInMap("ContentModeration")
    public java.util.List<?> contentModeration;

    /**
     * <p>The ID assigned by the backend to uniquely identify a request. You can use this ID to troubleshoot issues.</p>
     * 
     * <strong>example:</strong>
     * <p>AAAAAA-BBBB-CCCCC-DDDD-EEEEEEEE****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static QueryLabelConfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryLabelConfigResponseBody self = new QueryLabelConfigResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryLabelConfigResponseBody setContentModeration(java.util.List<?> contentModeration) {
        this.contentModeration = contentModeration;
        return this;
    }
    public java.util.List<?> getContentModeration() {
        return this.contentModeration;
    }

    public QueryLabelConfigResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
