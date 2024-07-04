// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class DescribeSelfImagesRequest extends TeaModel {
    /**
     * <p>The ID of the image. Fuzzy search is supported.</p>
     * 
     * <strong>example:</strong>
     * <p>centos_6_08_64_20G_a****</p>
     */
    @NameInMap("ImageId")
    public String imageId;

    /**
     * <p>The name of the image. Fuzzy search is supported.</p>
     * 
     * <strong>example:</strong>
     * <p>centos_6_08_64_20G_a****</p>
     */
    @NameInMap("ImageName")
    public String imageName;

    /**
     * <p>The page number to return. Pages start from page <strong>1</strong>. Default value: <strong>1</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries per page.</p>
     * <p>Default value: 10.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The ID of the snapshot.</p>
     * 
     * <strong>example:</strong>
     * <p>sp-5xg63dmojc1oaa3pk****</p>
     */
    @NameInMap("SnapshotId")
    public String snapshotId;

    public static DescribeSelfImagesRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeSelfImagesRequest self = new DescribeSelfImagesRequest();
        return TeaModel.build(map, self);
    }

    public DescribeSelfImagesRequest setImageId(String imageId) {
        this.imageId = imageId;
        return this;
    }
    public String getImageId() {
        return this.imageId;
    }

    public DescribeSelfImagesRequest setImageName(String imageName) {
        this.imageName = imageName;
        return this;
    }
    public String getImageName() {
        return this.imageName;
    }

    public DescribeSelfImagesRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeSelfImagesRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeSelfImagesRequest setSnapshotId(String snapshotId) {
        this.snapshotId = snapshotId;
        return this;
    }
    public String getSnapshotId() {
        return this.snapshotId;
    }

}
