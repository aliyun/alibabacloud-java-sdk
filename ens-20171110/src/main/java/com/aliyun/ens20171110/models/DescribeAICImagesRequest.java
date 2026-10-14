// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class DescribeAICImagesRequest extends TeaModel {
    /**
     * <p>The description of the image.</p>
     * 
     * <strong>example:</strong>
     * <p>Console test operation</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The ID of the Android in Container (AIC) image.</p>
     * 
     * <strong>example:</strong>
     * <p>m-ad0ddaddc2d54adeaa09b7c0f1e****</p>
     */
    @NameInMap("ImageId")
    public String imageId;

    /**
     * <p>The image type. Valid values:</p>
     * <ul>
     * <li><p><strong>public</strong>: public image.</p>
     * </li>
     * <li><p><strong>private</strong>: custom image.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>public</p>
     */
    @NameInMap("ImageType")
    public String imageType;

    /**
     * <p>The URL of the AIC image repository.</p>
     * 
     * <strong>example:</strong>
     * <p>****.alibaba-inc.com/aic/socimage:test</p>
     */
    @NameInMap("ImageUrl")
    public String imageUrl;

    /**
     * <p>The end time of the query. Format: &quot;2006-01-02&quot;. By default, no time limit is applied.</p>
     * 
     * <strong>example:</strong>
     * <p>2022-02-02</p>
     */
    @NameInMap("MaxDate")
    public String maxDate;

    /**
     * <p>The start time of the query. Format: &quot;2006-01-02&quot;. By default, no time limit is applied.</p>
     * 
     * <strong>example:</strong>
     * <p>2022-01-02</p>
     */
    @NameInMap("MinDate")
    public String minDate;

    /**
     * <p>The page number. The value starts from <strong>1</strong>.
     * Default value: <strong>1</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public String pageNumber;

    /**
     * <p>The number of entries per page for paging. Maximum value: <strong>100</strong>.
     * Default value: <strong>10</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public String pageSize;

    /**
     * <p>The image status. Valid values:</p>
     * <ul>
     * <li><p><strong>verifying</strong>: pending verification.</p>
     * </li>
     * <li><p><strong>disable</strong>: unavailable.</p>
     * </li>
     * <li><p><strong>available</strong>: available.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>available</p>
     */
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
