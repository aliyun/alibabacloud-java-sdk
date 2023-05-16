// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class DescribeAICImagesRequest extends TeaModel {
    @NameInMap("Description")
    public String description;

    @NameInMap("ImageId")
    public String imageId;

    @NameInMap("ImageType")
    public String imageType;

    @NameInMap("ImageUrl")
    public String imageUrl;

    @NameInMap("MaxDate")
    public String maxDate;

    @NameInMap("MinDate")
    public String minDate;

    @NameInMap("PageNumber")
    public String pageNumber;

    @NameInMap("PageSize")
    public String pageSize;

    @NameInMap("Status")
    public String status;

    public static DescribeAICImagesRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeAICImagesRequest self = new DescribeAICImagesRequest();
        return TeaModel.build(map, self);
    }

    public DescribeAICImagesRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public DescribeAICImagesRequest setImageId(String imageId) {
        this.imageId = imageId;
        return this;
    }
    public String getImageId() {
        return this.imageId;
    }

    public DescribeAICImagesRequest setImageType(String imageType) {
        this.imageType = imageType;
        return this;
    }
    public String getImageType() {
        return this.imageType;
    }

    public DescribeAICImagesRequest setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
        return this;
    }
    public String getImageUrl() {
        return this.imageUrl;
    }

    public DescribeAICImagesRequest setMaxDate(String maxDate) {
        this.maxDate = maxDate;
        return this;
    }
    public String getMaxDate() {
        return this.maxDate;
    }

    public DescribeAICImagesRequest setMinDate(String minDate) {
        this.minDate = minDate;
        return this;
    }
    public String getMinDate() {
        return this.minDate;
    }

    public DescribeAICImagesRequest setPageNumber(String pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public String getPageNumber() {
        return this.pageNumber;
    }

    public DescribeAICImagesRequest setPageSize(String pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public String getPageSize() {
        return this.pageSize;
    }

    public DescribeAICImagesRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

}
