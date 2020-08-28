// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DescribeSnapshotLinksRequest extends TeaModel {
    @NameInMap("RegionId")
    @Validation(required = true)
    public String regionId;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("DiskIds")
    public String diskIds;

    @NameInMap("SnapshotLinkIds")
    public String snapshotLinkIds;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    public static DescribeSnapshotLinksRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeSnapshotLinksRequest self = new DescribeSnapshotLinksRequest();
        return TeaModel.build(map, self);
    }

}
