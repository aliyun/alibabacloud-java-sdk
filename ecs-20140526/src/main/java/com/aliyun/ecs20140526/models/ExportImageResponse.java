// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class ExportImageResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("TaskId")
    @Validation(required = true)
    public String taskId;

    @NameInMap("RegionId")
    @Validation(required = true)
    public String regionId;

    public static ExportImageResponse build(java.util.Map<String, ?> map) throws Exception {
        ExportImageResponse self = new ExportImageResponse();
        return TeaModel.build(map, self);
    }

}
