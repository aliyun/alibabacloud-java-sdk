// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class ListDNAFilesResponseBody extends TeaModel {
    @NameInMap("FileList")
    public java.util.List<ListDNAFilesResponseBodyFileList> fileList;

    @NameInMap("NextPageToken")
    public String nextPageToken;

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
        @NameInMap("Bucket")
        public String bucket;

        @NameInMap("Location")
        public String location;

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
