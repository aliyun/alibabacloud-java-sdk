// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class DescribeImageModifiedRecordsResponseBody extends TeaModel {
    @NameInMap("ImageModifiedRecords")
    public java.util.List<DescribeImageModifiedRecordsResponseBodyImageModifiedRecords> imageModifiedRecords;

    @NameInMap("NextToken")
    public String nextToken;

    @NameInMap("RequestId")
    public String requestId;

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
        @NameInMap("ImageId")
        public String imageId;

        @NameInMap("ImageName")
        public String imageName;

        @NameInMap("NewImageId")
        public String newImageId;

        @NameInMap("NewImageName")
        public String newImageName;

        @NameInMap("Status")
        public Integer status;

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
