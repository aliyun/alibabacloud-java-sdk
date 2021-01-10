// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpserverless20190615.models;

import com.aliyun.tea.*;

public class DescribeWebHostingFileResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Data")
    public DescribeWebHostingFileResponseBodyData data;

    public static DescribeWebHostingFileResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeWebHostingFileResponseBody self = new DescribeWebHostingFileResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeWebHostingFileResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeWebHostingFileResponseBody setData(DescribeWebHostingFileResponseBodyData data) {
        this.data = data;
        return this;
    }
    public DescribeWebHostingFileResponseBodyData getData() {
        return this.data;
    }

    public static class DescribeWebHostingFileResponseBodyData extends TeaModel {
        @NameInMap("FilePath")
        public String filePath;

        @NameInMap("ContentType")
        public String contentType;

        @NameInMap("ETag")
        public String ETag;

        @NameInMap("Size")
        public Long size;

        @NameInMap("Exists")
        public Boolean exists;

        @NameInMap("LastModifiedTime")
        public Long lastModifiedTime;

        @NameInMap("SignedUrl")
        public String signedUrl;

        public static DescribeWebHostingFileResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DescribeWebHostingFileResponseBodyData self = new DescribeWebHostingFileResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DescribeWebHostingFileResponseBodyData setFilePath(String filePath) {
            this.filePath = filePath;
            return this;
        }
        public String getFilePath() {
            return this.filePath;
        }

        public DescribeWebHostingFileResponseBodyData setContentType(String contentType) {
            this.contentType = contentType;
            return this;
        }
        public String getContentType() {
            return this.contentType;
        }

        public DescribeWebHostingFileResponseBodyData setETag(String ETag) {
            this.ETag = ETag;
            return this;
        }
        public String getETag() {
            return this.ETag;
        }

        public DescribeWebHostingFileResponseBodyData setSize(Long size) {
            this.size = size;
            return this;
        }
        public Long getSize() {
            return this.size;
        }

        public DescribeWebHostingFileResponseBodyData setExists(Boolean exists) {
            this.exists = exists;
            return this;
        }
        public Boolean getExists() {
            return this.exists;
        }

        public DescribeWebHostingFileResponseBodyData setLastModifiedTime(Long lastModifiedTime) {
            this.lastModifiedTime = lastModifiedTime;
            return this;
        }
        public Long getLastModifiedTime() {
            return this.lastModifiedTime;
        }

        public DescribeWebHostingFileResponseBodyData setSignedUrl(String signedUrl) {
            this.signedUrl = signedUrl;
            return this;
        }
        public String getSignedUrl() {
            return this.signedUrl;
        }

    }

}
