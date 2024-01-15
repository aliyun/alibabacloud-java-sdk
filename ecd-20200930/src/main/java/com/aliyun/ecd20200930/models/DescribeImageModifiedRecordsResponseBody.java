// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class DescribeImageModifiedRecordsResponseBody extends TeaModel {
    /**
     * <p>The image modification record collection.</p>
     */
    @NameInMap("ImageModifiedRecords")
    public java.util.List<DescribeImageModifiedRecordsResponseBodyImageModifiedRecords> imageModifiedRecords;

    /**
     * <p>If the NextToken parameter is empty, no next page exists.</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of image modification records.</p>
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
         * <p>The ID of the image before the change.</p>
         */
        @NameInMap("ImageId")
        public String imageId;

        /**
         * <p>The name of the image before the change.</p>
         */
        @NameInMap("ImageName")
        public String imageName;

        /**
         * <p>The ID of the new image.</p>
         */
        @NameInMap("NewImageId")
        public String newImageId;

        /**
         * <p>Add the image name.</p>
         */
        @NameInMap("NewImageName")
        public String newImageName;

        /**
         * <p>The status of the workspace.</p>
         */
        @NameInMap("Status")
        public Integer status;

        /**
         * <p>The last time when the disaster recovery plan was updated.</p>
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
