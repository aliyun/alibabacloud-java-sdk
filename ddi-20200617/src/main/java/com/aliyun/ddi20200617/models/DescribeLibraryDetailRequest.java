// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddi20200617.models;

import com.aliyun.tea.*;

public class DescribeLibraryDetailRequest extends TeaModel {
    @NameInMap("LibraryBizId")
    public String libraryBizId;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    public static DescribeLibraryDetailRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeLibraryDetailRequest self = new DescribeLibraryDetailRequest();
        return TeaModel.build(map, self);
    }

    public DescribeLibraryDetailRequest setLibraryBizId(String libraryBizId) {
        this.libraryBizId = libraryBizId;
        return this;
    }
    public String getLibraryBizId() {
        return this.libraryBizId;
    }

    public DescribeLibraryDetailRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeLibraryDetailRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

}
