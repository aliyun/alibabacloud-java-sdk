// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class DescribeImageModifiedRecordsResponseBody extends TeaModel {
    /**
     * <p>Details about the image modification record.</p>
     */
    @NameInMap("ImageModifiedRecords")
    public java.util.List<DescribeImageModifiedRecordsResponseBodyImageModifiedRecords> imageModifiedRecords;

    /**
     * <p>If the NextToken parameter is empty, no next page exists.</p>
     * 
     * <strong>example:</strong>
     * <p>AAAAAV3MpHK1AP0pfERHZN5pu6koN7RqHg3d2z8LKmSoe821</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>DC40EE61-7E83-59ED-AEA6-7EE9C437F352</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of image modification records.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static DescribeImageModifiedRecordsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeImageModifiedRecordsResponseBody self = new DescribeImageModifiedRecordsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeImageModifiedRecordsResponseBody setImageModifiedRecords(java.util.List<DescribeImageModifiedRecordsResponseBodyImageModifiedRecords> imageModifiedRecords) {
        this.imageModifiedRecords = imageModifiedRecords;
        return this;
    }
    public java.util.List<DescribeImageModifiedRecordsResponseBodyImageModifiedRecords> getImageModifiedRecords() {
        return this.imageModifiedRecords;
    }

    public DescribeImageModifiedRecordsResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public DescribeImageModifiedRecordsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeImageModifiedRecordsResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class DescribeImageModifiedRecordsResponseBodyImageModifiedRecords extends TeaModel {
        /**
         * <p>The ID of the original image.</p>
         * 
         * <strong>example:</strong>
         * <p>m-8rnz2imrpcfuh****</p>
         */
        @NameInMap("ImageId")
        public String imageId;

        /**
         * <p>The name of the original image.</p>
         * 
         * <strong>example:</strong>
         * <p>win10-0307</p>
         */
        @NameInMap("ImageName")
        public String imageName;

        /**
         * <p>The ID of the new image after the image was modified.</p>
         * 
         * <strong>example:</strong>
         * <p>xxxNewImageID</p>
         */
        @NameInMap("NewImageId")
        public String newImageId;

        /**
         * <p>The name of the new image after the image was modified.</p>
         * 
         * <strong>example:</strong>
         * <p>xxxxImageID</p>
         */
        @NameInMap("NewImageName")
        public String newImageName;

        /**
         * <p>The status of the image modification.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li><p>0: The image is being modified.</p>
         * </li>
         * <li><p>1: The image is successfully modified.</p>
         * </li>
         * <li><p>2: The image fails to be modified.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Status")
        public Integer status;

        /**
         * <p>The time when the image was last modified.</p>
         * 
         * <strong>example:</strong>
         * <p>2022-03-03T02:43:44.851Z</p>
         */
        @NameInMap("UpdateTime")
        public String updateTime;

        public static DescribeImageModifiedRecordsResponseBodyImageModifiedRecords build(java.util.Map<String, ?> map) throws Exception {
            DescribeImageModifiedRecordsResponseBodyImageModifiedRecords self = new DescribeImageModifiedRecordsResponseBodyImageModifiedRecords();
            return TeaModel.build(map, self);
        }

        public DescribeImageModifiedRecordsResponseBodyImageModifiedRecords setImageId(String imageId) {
            this.imageId = imageId;
            return this;
        }
        public String getImageId() {
            return this.imageId;
        }

        public DescribeImageModifiedRecordsResponseBodyImageModifiedRecords setImageName(String imageName) {
            this.imageName = imageName;
            return this;
        }
        public String getImageName() {
            return this.imageName;
        }

        public DescribeImageModifiedRecordsResponseBodyImageModifiedRecords setNewImageId(String newImageId) {
            this.newImageId = newImageId;
            return this;
        }
        public String getNewImageId() {
            return this.newImageId;
        }

        public DescribeImageModifiedRecordsResponseBodyImageModifiedRecords setNewImageName(String newImageName) {
            this.newImageName = newImageName;
            return this;
        }
        public String getNewImageName() {
            return this.newImageName;
        }

        public DescribeImageModifiedRecordsResponseBodyImageModifiedRecords setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

        public DescribeImageModifiedRecordsResponseBodyImageModifiedRecords setUpdateTime(String updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public String getUpdateTime() {
            return this.updateTime;
        }

    }

}
