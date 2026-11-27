// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nas20170626.models;

import com.aliyun.tea.*;

public class DetachVscFromFilesystemsResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>2D69A58F-345C-4FDE-88E4-BF518948****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DetachVscFromFilesystemsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DetachVscFromFilesystemsResponseBody self = new DetachVscFromFilesystemsResponseBody();
        return TeaModel.build(map, self);
    }

    public DetachVscFromFilesystemsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
