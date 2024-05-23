// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class DescribeImagesRequest extends TeaModel {
    /**
     * <p>The ID of the Edge Node Service (ENS) node.</p>
     */
    @NameInMap("EnsRegionId")
    public String ensRegionId;

    /**
     * <p>The ID of the image. You can specify only one image ID.</p>
     * <br>
     * <p>Custom images and public images are supported.</p>
     */
    @NameInMap("ImageId")
    public String imageId;

    /**
     * <p>The name of the custom image. The name must be 2 to 128 characters in length The name must start with a letter and cannot start with `acs:` or `aliyun`. The name cannot contain `http://` or `https://`. The name can contain letters, digits, periods (.), colons (:), underscores (_), and hyphens (-).</p>
     * <br>
     * <p>By default, this parameter is left empty, which indicates that the original name is retained.</p>
     */
    @NameInMap("ImageName")
    public String imageName;

    /**
     * <p>The page number. Pages start from page **1**.</p>
     * <br>
     * <p>Default value: **1**.</p>
     */
    @NameInMap("PageNumber")
    public String pageNumber;

    /**
     * <p>The number of entries per page. Maximum value: **50**.</p>
     * <br>
     * <p>Default value: **10**.</p>
     */
    @NameInMap("PageSize")
    public String pageSize;

    /**
     * <p>The ID of the snapshot.</p>
     */
    @NameInMap("SnapshotId")
    public String snapshotId;

    /**
     * <p>This parameter is unavailable.</p>
     */
    @NameInMap("Status")
    public String status;

    public static DescribeImagesRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeImagesRequest self = new DescribeImagesRequest();
        return TeaModel.build(map, self);
    }

    public DescribeImagesRequest setEnsRegionId(String ensRegionId) {
        this.ensRegionId = ensRegionId;
        return this;
    }
    public String getEnsRegionId() {
        return this.ensRegionId;
    }

    public DescribeImagesRequest setImageId(String imageId) {
        this.imageId = imageId;
        return this;
    }
    public String getImageId() {
        return this.imageId;
    }

    public DescribeImagesRequest setImageName(String imageName) {
        this.imageName = imageName;
        return this;
    }
    public String getImageName() {
        return this.imageName;
    }

    public DescribeImagesRequest setPageNumber(String pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public String getPageNumber() {
        return this.pageNumber;
    }

    public DescribeImagesRequest setPageSize(String pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public String getPageSize() {
        return this.pageSize;
    }

    public DescribeImagesRequest setSnapshotId(String snapshotId) {
        this.snapshotId = snapshotId;
        return this;
    }
    public String getSnapshotId() {
        return this.snapshotId;
    }

    public DescribeImagesRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

}
