// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eds_aic20230930.models;

import com.aliyun.tea.*;

public class DescribeImageListRequest extends TeaModel {
    /**
     * <p>The ID of the image.</p>
     * 
     * <strong>example:</strong>
     * <p>imgc-075cllfeuazh0****</p>
     */
    @NameInMap("ImageId")
    public String imageId;

    /**
     * <p>The name of the image.</p>
     * 
     * <strong>example:</strong>
     * <p>Android 12 image</p>
     */
    @NameInMap("ImageName")
    public String imageName;

    /**
     * <p>Image package type.</p>
     * 
     * <strong>example:</strong>
     * <p>VM</p>
     */
    @NameInMap("ImagePackageType")
    public String imagePackageType;

    /**
     * <p>The type of the image.</p>
     * <p>Valid values:</p>
     * <ul>
     * <li>User: custom images.</li>
     * <li>System: system images.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>System</p>
     */
    @NameInMap("ImageType")
    public String imageType;

    /**
     * <p>The number of entries per page. Valid values: 1 to 100. Default value: 20.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     * 
     * <strong>if can be null:</strong>
     * <p>true</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The pagination token that is used in the next request to retrieve a new page of results. If the parameter is left empty, the data is queried from the first entry.</p>
     * 
     * <strong>example:</strong>
     * <p>AAAAAV3MpHK1AP0pfERHZN5pu6kw9dGL5jves2FS9RLq****</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The state of the image.</p>
     * <p>Valid values:</p>
     * <ul>
     * <li>AVAILABLE: The image is available.</li>
     * <li>DELETE: The image is deleted.</li>
     * <li>INIT: The image is being initialized.</li>
     * <li>CREATE_FAILED: The image failed to be created.</li>
     * <li>CREATING: The image is being created.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>AVAILABLE</p>
     */
    @NameInMap("Status")
    public String status;

    public static DescribeImageListRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeImageListRequest self = new DescribeImageListRequest();
        return TeaModel.build(map, self);
    }

    public DescribeImageListRequest setImageId(String imageId) {
        this.imageId = imageId;
        return this;
    }
    public String getImageId() {
        return this.imageId;
    }

    public DescribeImageListRequest setImageName(String imageName) {
        this.imageName = imageName;
        return this;
    }
    public String getImageName() {
        return this.imageName;
    }

    public DescribeImageListRequest setImagePackageType(String imagePackageType) {
        this.imagePackageType = imagePackageType;
        return this;
    }
    public String getImagePackageType() {
        return this.imagePackageType;
    }

    public DescribeImageListRequest setImageType(String imageType) {
        this.imageType = imageType;
        return this;
    }
    public String getImageType() {
        return this.imageType;
    }

    public DescribeImageListRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public DescribeImageListRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public DescribeImageListRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

}
