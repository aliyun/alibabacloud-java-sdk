// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eds_aic20230930.models;

import com.aliyun.tea.*;

public class DescribeImageListRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>imgc-075cllfeuazh0****</p>
     */
    @NameInMap("ImageId")
    public String imageId;

    @NameInMap("ImageName")
    public String imageName;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>System</p>
     */
    @NameInMap("ImageType")
    public String imageType;

    /**
     * <strong>example:</strong>
     * <p>20</p>
     * 
     * <strong>if can be null:</strong>
     * <p>true</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <strong>example:</strong>
     * <p>AAAAAV3MpHK1AP0pfERHZN5pu6kw9dGL5jves2FS9RLq****</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
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
