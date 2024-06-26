// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class ListDNAFilesResponseBody extends TeaModel {
    @NameInMap("FileList")
    public java.util.List<ListDNAFilesResponseBodyFileList> fileList;

    /**
     * <strong>example:</strong>
     * <p>ae0fd49c0840e14daf0d66a75b83****</p>
     */
    @NameInMap("NextPageToken")
    public String nextPageToken;

    /**
     * <strong>example:</strong>
     * <p>2AE89FA5-E620-56C7-9B80-75D09757385A</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ListDNAFilesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListDNAFilesResponseBody self = new ListDNAFilesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListDNAFilesResponseBody setFileList(java.util.List<ListDNAFilesResponseBodyFileList> fileList) {
        this.fileList = fileList;
        return this;
    }
    public java.util.List<ListDNAFilesResponseBodyFileList> getFileList() {
        return this.fileList;
    }

    public ListDNAFilesResponseBody setNextPageToken(String nextPageToken) {
        this.nextPageToken = nextPageToken;
        return this;
    }
    public String getNextPageToken() {
        return this.nextPageToken;
    }

    public ListDNAFilesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListDNAFilesResponseBodyFileListInputFile extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>example-bucket</p>
         */
        @NameInMap("Bucket")
        public String bucket;

        /**
         * <strong>example:</strong>
         * <p>oss-cn-beijing</p>
         */
        @NameInMap("Location")
        public String location;

        /**
         * <strong>example:</strong>
         * <p>example-****.mp4</p>
         */
        @NameInMap("Object")
        public String object;

        public static ListDNAFilesResponseBodyFileListInputFile build(java.util.Map<String, ?> map) throws Exception {
            ListDNAFilesResponseBodyFileListInputFile self = new ListDNAFilesResponseBodyFileListInputFile();
            return TeaModel.build(map, self);
        }

        public ListDNAFilesResponseBodyFileListInputFile setBucket(String bucket) {
            this.bucket = bucket;
            return this;
        }
        public String getBucket() {
            return this.bucket;
        }

        public ListDNAFilesResponseBodyFileListInputFile setLocation(String location) {
            this.location = location;
            return this;
        }
        public String getLocation() {
            return this.location;
        }

        public ListDNAFilesResponseBodyFileListInputFile setObject(String object) {
            this.object = object;
            return this;
        }
        public String getObject() {
            return this.object;
        }

    }

    public static class ListDNAFilesResponseBodyFileList extends TeaModel {
        @NameInMap("InputFile")
        public ListDNAFilesResponseBodyFileListInputFile inputFile;

        /**
         * <strong>example:</strong>
         * <p>ae0fd49c0840e14daf0d66a75b83****</p>
         */
        @NameInMap("PrimaryKey")
        public String primaryKey;

        public static ListDNAFilesResponseBodyFileList build(java.util.Map<String, ?> map) throws Exception {
            ListDNAFilesResponseBodyFileList self = new ListDNAFilesResponseBodyFileList();
            return TeaModel.build(map, self);
        }

        public ListDNAFilesResponseBodyFileList setInputFile(ListDNAFilesResponseBodyFileListInputFile inputFile) {
            this.inputFile = inputFile;
            return this;
        }
        public ListDNAFilesResponseBodyFileListInputFile getInputFile() {
            return this.inputFile;
        }

        public ListDNAFilesResponseBodyFileList setPrimaryKey(String primaryKey) {
            this.primaryKey = primaryKey;
            return this;
        }
        public String getPrimaryKey() {
            return this.primaryKey;
        }

    }

}
