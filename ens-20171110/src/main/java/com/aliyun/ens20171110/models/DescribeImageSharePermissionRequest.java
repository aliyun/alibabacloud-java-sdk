// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class DescribeImageSharePermissionRequest extends TeaModel {
    /**
     * <p>The ID of the Alibaba Cloud account.</p>
     */
    @NameInMap("AliyunId")
    public Long aliyunId;

    /**
     * <p>The ID of the image.</p>
     */
    @NameInMap("ImageId")
    public String imageId;

    /**
     * <p>The page number. Pages start from page **1**.</p>
     * <br>
     * <p>Default value: **1**.</p>
     */
    @NameInMap("PageNumber")
    public String pageNumber;

    /**
     * <p>The number of entries per page. Maximum value: **100**.</p>
     * <br>
     * <p>Default value: **10**.</p>
     */
    @NameInMap("PageSize")
    public String pageSize;

    public static DescribeImageSharePermissionRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeImageSharePermissionRequest self = new DescribeImageSharePermissionRequest();
        return TeaModel.build(map, self);
    }

    public DescribeImageSharePermissionRequest setAliyunId(Long aliyunId) {
        this.aliyunId = aliyunId;
        return this;
    }
    public Long getAliyunId() {
        return this.aliyunId;
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

}
