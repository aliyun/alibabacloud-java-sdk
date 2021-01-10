// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eci20180808.models;

import com.aliyun.tea.*;

public class DescribeContainerLogResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ContainerName")
    public String containerName;

    @NameInMap("Content")
    public String content;

    public static DescribeContainerLogResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeContainerLogResponseBody self = new DescribeContainerLogResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeContainerLogResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
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

}
