// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr20160408.models;

import com.aliyun.tea.*;

public class DescribeLibraryDetailRequest extends TeaModel {
    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("LibraryBizId")
    public String libraryBizId;

    public static DescribeLibraryDetailRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeLibraryDetailRequest self = new DescribeLibraryDetailRequest();
        return TeaModel.build(map, self);
    }

    public DescribeLibraryDetailRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public DescribeLibraryDetailRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeLibraryDetailRequest setLibraryBizId(String libraryBizId) {
        this.libraryBizId = libraryBizId;
        return this;
    }
    public String getLibraryBizId() {
        return this.libraryBizId;
    }

}
