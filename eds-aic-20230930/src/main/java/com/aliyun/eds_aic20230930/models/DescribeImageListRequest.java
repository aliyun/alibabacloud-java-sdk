// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eds_aic20230930.models;

import com.aliyun.tea.*;

public class DescribeImageListRequest extends TeaModel {
    /**
     * <p>An array of tag objects.</p>
     */
    @NameInMap("ImageBizTags")
    public java.util.List<DescribeImageListRequestImageBizTags> imageBizTags;

    /**
     * <p>The image ID.</p>
     * 
     * <strong>example:</strong>
     * <p>imgc-075cllfeuazh0****</p>
     */
    @NameInMap("ImageId")
    public String imageId;

    /**
     * <p>The image name.</p>
     * 
     * <strong>example:</strong>
     * <p>Android 12 system image</p>
     */
    @NameInMap("ImageName")
    public String imageName;

    /**
     * <blockquote>
     * <p>This parameter is not yet available.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>null</p>
     */
    @NameInMap("ImagePackageType")
    public String imagePackageType;

    /**
     * <p>The image type.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>System</p>
     */
    @NameInMap("ImageType")
    public String imageType;

    /**
     * <p>The instance type.</p>
     * 
     * <strong>example:</strong>
     * <p>cpm.gx7.10xlarge</p>
     */
    @NameInMap("InstanceType")
    public String instanceType;

    /**
     * <p>The maximum number of entries to return on each page for a paged query. Valid values: 1 to 100. Default value: 20.</p>
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
     * <p>The token that specifies the position from which to start the query. If you leave this parameter empty, the query starts from the beginning.</p>
     * 
     * <strong>example:</strong>
     * <p>AAAAAV3MpHK1AP0pfERHZN5pu6kw9dGL5jves2FS9RLq****</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The status of the image.</p>
     * 
     * <strong>example:</strong>
     * <p>AVAILABLE</p>
     */
    @NameInMap("Status")
    public String status;

    @NameInMap("SystemType")
    public String systemType;

    public static DescribeImageListRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeImageListRequest self = new DescribeImageListRequest();
        return TeaModel.build(map, self);
    }

    public DescribeImageListRequest setImageBizTags(java.util.List<DescribeImageListRequestImageBizTags> imageBizTags) {
        this.imageBizTags = imageBizTags;
        return this;
    }
    public java.util.List<DescribeImageListRequestImageBizTags> getImageBizTags() {
        return this.imageBizTags;
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

    public DescribeImageListRequest setInstanceType(String instanceType) {
        this.instanceType = instanceType;
        return this;
    }
    public String getInstanceType() {
        return this.instanceType;
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

    public DescribeImageListRequest setSystemType(String systemType) {
        this.systemType = systemType;
        return this;
    }
    public String getSystemType() {
        return this.systemType;
    }

    public static class DescribeImageListRequestImageBizTags extends TeaModel {
        /**
         * <p>The tag key.</p>
         * 
         * <strong>example:</strong>
         * <p>key1</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The tag value.</p>
         * 
         * <strong>example:</strong>
         * <p>value1</p>
         */
        @NameInMap("Value")
        public String value;

        public static DescribeImageListRequestImageBizTags build(java.util.Map<String, ?> map) throws Exception {
            DescribeImageListRequestImageBizTags self = new DescribeImageListRequestImageBizTags();
            return TeaModel.build(map, self);
        }

        public DescribeImageListRequestImageBizTags setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public DescribeImageListRequestImageBizTags setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
