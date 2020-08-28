// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DescribeStorageSetsRequest extends TeaModel {
    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("RegionId")
    @Validation(required = true)
    public String regionId;

    @NameInMap("StorageSetIds")
    public String storageSetIds;

    @NameInMap("ZoneId")
    public String zoneId;

    @NameInMap("StorageSetName")
    public String storageSetName;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    public static DescribeStorageSetsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeStorageSetsRequest self = new DescribeStorageSetsRequest();
        return TeaModel.build(map, self);
    }

}
