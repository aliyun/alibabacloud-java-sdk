// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gpdb20160503.models;

import com.aliyun.tea.*;

public class DescribeUserEncryptionKeyListRequest extends TeaModel {
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("PageNumber")
    public String pageNumber;

    @NameInMap("PageSize")
    public String pageSize;

    public static DescribeUserEncryptionKeyListRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeUserEncryptionKeyListRequest self = new DescribeUserEncryptionKeyListRequest();
        return TeaModel.build(map, self);
    }

    public DescribeUserEncryptionKeyListRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeUserEncryptionKeyListRequest setPageNumber(String pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public String getPageNumber() {
        return this.pageNumber;
    }

    public DescribeUserEncryptionKeyListRequest setPageSize(String pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public String getPageSize() {
        return this.pageSize;
    }

}
