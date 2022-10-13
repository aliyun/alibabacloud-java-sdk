// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class DescribeAICImagesResponseBody extends TeaModel {
    @NameInMap("Images")
    public java.util.List<DescribeAICImagesResponseBodyImages> images;

    @NameInMap("RequestId")
    public String requestId;

    public static DescribeAICImagesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeAICImagesResponseBody self = new DescribeAICImagesResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeAICImagesResponseBody setImages(java.util.List<DescribeAICImagesResponseBodyImages> images) {
        this.images = images;
        return this;
    }
    public java.util.List<DescribeAICImagesResponseBodyImages> getImages() {
        return this.images;
    }

    public DescribeAICImagesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeAICImagesResponseBodyImages extends TeaModel {
        @NameInMap("CreationTime")
        public String creationTime;

        @NameInMap("ImageId")
        public String imageId;

        @NameInMap("ImageUrl")
        public String imageUrl;

        @NameInMap("Status")
        public String status;

        @NameInMap("User")
        public String user;

        public static DescribeAICImagesResponseBodyImages build(java.util.Map<String, ?> map) throws Exception {
            DescribeAICImagesResponseBodyImages self = new DescribeAICImagesResponseBodyImages();
            return TeaModel.build(map, self);
        }

        public DescribeAICImagesResponseBodyImages setCreationTime(String creationTime) {
            this.creationTime = creationTime;
            return this;
        }
        public String getCreationTime() {
            return this.creationTime;
        }

        public DescribeAICImagesResponseBodyImages setImageId(String imageId) {
            this.imageId = imageId;
            return this;
        }
        public String getImageId() {
            return this.imageId;
        }

        public DescribeAICImagesResponseBodyImages setImageUrl(String imageUrl) {
            this.imageUrl = imageUrl;
            return this;
        }
        public String getImageUrl() {
            return this.imageUrl;
        }

        public DescribeAICImagesResponseBodyImages setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeAICImagesResponseBodyImages setUser(String user) {
            this.user = user;
            return this;
        }
        public String getUser() {
            return this.user;
        }

    }

}
