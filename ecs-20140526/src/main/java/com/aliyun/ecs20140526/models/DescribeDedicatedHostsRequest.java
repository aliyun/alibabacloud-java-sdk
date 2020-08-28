// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DescribeDedicatedHostsRequest extends TeaModel {
    @NameInMap("RegionId")
    @Validation(required = true)
    public String regionId;

    @NameInMap("ZoneId")
    public String zoneId;

    @NameInMap("DedicatedHostIds")
    public String dedicatedHostIds;

    @NameInMap("DedicatedHostName")
    public String dedicatedHostName;

    @NameInMap("Status")
    public String status;

    @NameInMap("DedicatedHostType")
    public String dedicatedHostType;

    @NameInMap("LockReason")
    public String lockReason;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("Tag")
    public java.util.List<DescribeDedicatedHostsRequestTag> tag;

    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    public static DescribeDedicatedHostsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeDedicatedHostsRequest self = new DescribeDedicatedHostsRequest();
        return TeaModel.build(map, self);
    }

    public static class DescribeDedicatedHostsRequestTag extends TeaModel {
        @NameInMap("Key")
        @Validation(required = true)
        public String key;

        @NameInMap("Value")
        @Validation(required = true)
        public String value;

        public static DescribeDedicatedHostsRequestTag build(java.util.Map<String, ?> map) throws Exception {
            DescribeDedicatedHostsRequestTag self = new DescribeDedicatedHostsRequestTag();
            return TeaModel.build(map, self);
        }

    }

}
