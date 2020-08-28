// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eci20180808.models;

import com.aliyun.tea.*;

public class DescribeContainerLogResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("ContainerName")
    @Validation(required = true)
    public String containerName;

    @NameInMap("Content")
    @Validation(required = true)
    public String content;

    public static DescribeContainerLogResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeContainerLogResponse self = new DescribeContainerLogResponse();
        return TeaModel.build(map, self);
    }

}
