// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class DescribeImageSharePermissionRequest extends TeaModel {
    @NameInMap("ImageId")
    @Validation(required = true)
    public String imageId;

    @NameInMap("PageNumber")
    public String pageNumber;

    @NameInMap("PageSize")
    public String pageSize;

    @NameInMap("AliyunId")
    public Long aliyunId;

    public static DescribeImageSharePermissionRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeImageSharePermissionRequest self = new DescribeImageSharePermissionRequest();
        return TeaModel.build(map, self);
    }

    public DescribeImageSharePermissionRequest setImageId(String imageId) {
        this.imageId = imageId;
        return this;
    }
    public String getImageId() {
        return this.imageId;
    }

    public DescribeImageSharePermissionRequest setPageNumber(String pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public String getPageNumber() {
        return this.pageNumber;
    }

    public DescribeImageSharePermissionRequest setPageSize(String pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public String getPageSize() {
        return this.pageSize;
    }

    public DescribeImageSharePermissionRequest setAliyunId(Long aliyunId) {
        this.aliyunId = aliyunId;
        return this;
    }
    public Long getAliyunId() {
        return this.aliyunId;
    }

}
