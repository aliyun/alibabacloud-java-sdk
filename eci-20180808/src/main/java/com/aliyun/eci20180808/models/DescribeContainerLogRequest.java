// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eci20180808.models;

import com.aliyun.tea.*;

public class DescribeContainerLogRequest extends TeaModel {
    @NameInMap("RegionId")
    @Validation(required = true)
    public String regionId;

    @NameInMap("ContainerGroupId")
    @Validation(required = true)
    public String containerGroupId;

    @NameInMap("ContainerName")
    @Validation(required = true)
    public String containerName;

    @NameInMap("StartTime")
    public String startTime;

    @NameInMap("Tail")
    public Integer tail;

    @NameInMap("LastTime")
    public Boolean lastTime;

    @NameInMap("SinceSeconds")
    public Integer sinceSeconds;

    @NameInMap("LimitBytes")
    public Long limitBytes;

    public static DescribeContainerLogRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeContainerLogRequest self = new DescribeContainerLogRequest();
        return TeaModel.build(map, self);
    }

}
