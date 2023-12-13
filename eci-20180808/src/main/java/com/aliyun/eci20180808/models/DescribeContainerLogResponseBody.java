// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eci20180808.models;

import com.aliyun.tea.*;

public class DescribeContainerLogResponseBody extends TeaModel {
    /**
     * <p>The container name.</p>
     */
    @NameInMap("ContainerName")
    public String containerName;

    /**
     * <p>The content of the log.</p>
     */
    @NameInMap("Content")
    public String content;

    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeContainerLogResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeContainerLogResponseBody self = new DescribeContainerLogResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeContainerLogResponseBody setContainerName(String containerName) {
        this.containerName = containerName;
        return this;
    }
    public String getContainerName() {
        return this.containerName;
    }

    public DescribeContainerLogResponseBody setContent(String content) {
        this.content = content;
        return this;
    }
    public String getContent() {
        return this.content;
    }

    public DescribeContainerLogResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
