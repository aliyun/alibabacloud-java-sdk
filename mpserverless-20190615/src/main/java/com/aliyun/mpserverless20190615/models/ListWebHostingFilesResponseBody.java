// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpserverless20190615.models;

import com.aliyun.tea.*;

public class ListWebHostingFilesResponseBody extends TeaModel {
    @NameInMap("Data")
    public ListWebHostingFilesResponseBodyData data;

    @NameInMap("RequestId")
    public String requestId;

    public static ListWebHostingFilesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListWebHostingFilesResponseBody self = new ListWebHostingFilesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListWebHostingFilesResponseBody setData(ListWebHostingFilesResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ListWebHostingFilesResponseBodyData getData() {
        return this.data;
    }

    public ListWebHostingFilesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListWebHostingFilesResponseBodyDataWebHostingFiles extends TeaModel {
        @NameInMap("ContentType")
        public String contentType;

        @NameInMap("ETag")
        public String ETag;

        @NameInMap("FilePath")
        public String filePath;

        @NameInMap("LastModifiedTime")
        public Long lastModifiedTime;

        @NameInMap("SignedUrl")
        public String signedUrl;

        @NameInMap("Size")
        public Long size;

        public static ListWebHostingFilesResponseBodyDataWebHostingFiles build(java.util.Map<String, ?> map) throws Exception {
            ListWebHostingFilesResponseBodyDataWebHostingFiles self = new ListWebHostingFilesResponseBodyDataWebHostingFiles();
            return TeaModel.build(map, self);
        }

        public ListWebHostingFilesResponseBodyDataWebHostingFiles setContentType(String contentType) {
            this.contentType = contentType;
            return this;
        }
        public String getContentType() {
            return this.contentType;
        }

        public ListWebHostingFilesResponseBodyDataWebHostingFiles setETag(String ETag) {
            this.ETag = ETag;
            return this;
        }
        public String getETag() {
            return this.ETag;
        }

        public ListWebHostingFilesResponseBodyDataWebHostingFiles setFilePath(String filePath) {
            this.filePath = filePath;
            return this;
        }
        public String getFilePath() {
            return this.filePath;
        }

        public ListWebHostingFilesResponseBodyDataWebHostingFiles setLastModifiedTime(Long lastModifiedTime) {
            this.lastModifiedTime = lastModifiedTime;
            return this;
        }
        public Long getLastModifiedTime() {
            return this.lastModifiedTime;
        }

        public ListWebHostingFilesResponseBodyDataWebHostingFiles setSignedUrl(String signedUrl) {
            this.signedUrl = signedUrl;
            return this;
        }
        public String getSignedUrl() {
            return this.signedUrl;
        }

        public ListWebHostingFilesResponseBodyDataWebHostingFiles setSize(Long size) {
            this.size = size;
            return this;
        }
        public Long getSize() {
            return this.size;
        }

    }

    public static class ListWebHostingFilesResponseBodyData extends TeaModel {
        @NameInMap("Count")
        public Integer count;

        @NameInMap("NextMarker")
        public String nextMarker;

        @NameInMap("WebHostingFiles")
        public java.util.List<ListWebHostingFilesResponseBodyDataWebHostingFiles> webHostingFiles;

        public static ListWebHostingFilesResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListWebHostingFilesResponseBodyData self = new ListWebHostingFilesResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListWebHostingFilesResponseBodyData setCount(Integer count) {
            this.count = count;
            return this;
        }
        public Integer getCount() {
            return this.count;
        }

        public ListWebHostingFilesResponseBodyData setNextMarker(String nextMarker) {
            this.nextMarker = nextMarker;
            return this;
        }
        public String getNextMarker() {
            return this.nextMarker;
        }

        public ListWebHostingFilesResponseBodyData setWebHostingFiles(java.util.List<ListWebHostingFilesResponseBodyDataWebHostingFiles> webHostingFiles) {
            this.webHostingFiles = webHostingFiles;
            return this;
        }
        public java.util.List<ListWebHostingFilesResponseBodyDataWebHostingFiles> getWebHostingFiles() {
            return this.webHostingFiles;
        }

    }

}
