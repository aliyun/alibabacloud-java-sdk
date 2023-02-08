// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mts20140618.models;

import com.aliyun.tea.*;

public class ListFpShotFilesResponseBody extends TeaModel {
    /**
     * <p>The media fingerprint files. For more information, see the "FpShotFile" section of the [Data types](~~29251~~) topic.</p>
     */
    @NameInMap("FpShotFileList")
    public ListFpShotFilesResponseBodyFpShotFileList fpShotFileList;

    /**
     * <p>The token of the next page.</p>
     */
    @NameInMap("NextPageToken")
    public String nextPageToken;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ListFpShotFilesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListFpShotFilesResponseBody self = new ListFpShotFilesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListFpShotFilesResponseBody setFpShotFileList(ListFpShotFilesResponseBodyFpShotFileList fpShotFileList) {
        this.fpShotFileList = fpShotFileList;
        return this;
    }
    public ListFpShotFilesResponseBodyFpShotFileList getFpShotFileList() {
        return this.fpShotFileList;
    }

    public ListFpShotFilesResponseBody setNextPageToken(String nextPageToken) {
        this.nextPageToken = nextPageToken;
        return this;
    }
    public String getNextPageToken() {
        return this.nextPageToken;
    }

    public ListFpShotFilesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListFpShotFilesResponseBodyFpShotFileListFpShotFileInputFile extends TeaModel {
        /**
         * <p>The name of the OSS bucket in which the input file is stored.</p>
         */
        @NameInMap("Bucket")
        public String bucket;

        /**
         * <p>The ID of the OSS region in which the input file resides.</p>
         */
        @NameInMap("Location")
        public String location;

        /**
         * <p>The name of the Object Storage Service (OSS) object that is used as the input file.</p>
         */
        @NameInMap("Object")
        public String object;

        public static ListFpShotFilesResponseBodyFpShotFileListFpShotFileInputFile build(java.util.Map<String, ?> map) throws Exception {
            ListFpShotFilesResponseBodyFpShotFileListFpShotFileInputFile self = new ListFpShotFilesResponseBodyFpShotFileListFpShotFileInputFile();
            return TeaModel.build(map, self);
        }

        public ListFpShotFilesResponseBodyFpShotFileListFpShotFileInputFile setBucket(String bucket) {
            this.bucket = bucket;
            return this;
        }
        public String getBucket() {
            return this.bucket;
        }

        public ListFpShotFilesResponseBodyFpShotFileListFpShotFileInputFile setLocation(String location) {
            this.location = location;
            return this;
        }
        public String getLocation() {
            return this.location;
        }

        public ListFpShotFilesResponseBodyFpShotFileListFpShotFileInputFile setObject(String object) {
            this.object = object;
            return this;
        }
        public String getObject() {
            return this.object;
        }

    }

    public static class ListFpShotFilesResponseBodyFpShotFileListFpShotFile extends TeaModel {
        /**
         * <p>The ID of the video file.</p>
         */
        @NameInMap("FileId")
        public String fileId;

        /**
         * <p>The information about the job input.</p>
         */
        @NameInMap("InputFile")
        public ListFpShotFilesResponseBodyFpShotFileListFpShotFileInputFile inputFile;

        /**
         * <p>The unique primary key of the video.</p>
         */
        @NameInMap("PrimaryKey")
        public String primaryKey;

        @NameInMap("StoreTime")
        public String storeTime;

        public static ListFpShotFilesResponseBodyFpShotFileListFpShotFile build(java.util.Map<String, ?> map) throws Exception {
            ListFpShotFilesResponseBodyFpShotFileListFpShotFile self = new ListFpShotFilesResponseBodyFpShotFileListFpShotFile();
            return TeaModel.build(map, self);
        }

        public ListFpShotFilesResponseBodyFpShotFileListFpShotFile setFileId(String fileId) {
            this.fileId = fileId;
            return this;
        }
        public String getFileId() {
            return this.fileId;
        }

        public ListFpShotFilesResponseBodyFpShotFileListFpShotFile setInputFile(ListFpShotFilesResponseBodyFpShotFileListFpShotFileInputFile inputFile) {
            this.inputFile = inputFile;
            return this;
        }
        public ListFpShotFilesResponseBodyFpShotFileListFpShotFileInputFile getInputFile() {
            return this.inputFile;
        }

        public ListFpShotFilesResponseBodyFpShotFileListFpShotFile setPrimaryKey(String primaryKey) {
            this.primaryKey = primaryKey;
            return this;
        }
        public String getPrimaryKey() {
            return this.primaryKey;
        }

        public ListFpShotFilesResponseBodyFpShotFileListFpShotFile setStoreTime(String storeTime) {
            this.storeTime = storeTime;
            return this;
        }
        public String getStoreTime() {
            return this.storeTime;
        }

    }

    public static class ListFpShotFilesResponseBodyFpShotFileList extends TeaModel {
        @NameInMap("FpShotFile")
        public java.util.List<ListFpShotFilesResponseBodyFpShotFileListFpShotFile> fpShotFile;

        public static ListFpShotFilesResponseBodyFpShotFileList build(java.util.Map<String, ?> map) throws Exception {
            ListFpShotFilesResponseBodyFpShotFileList self = new ListFpShotFilesResponseBodyFpShotFileList();
            return TeaModel.build(map, self);
        }

        public ListFpShotFilesResponseBodyFpShotFileList setFpShotFile(java.util.List<ListFpShotFilesResponseBodyFpShotFileListFpShotFile> fpShotFile) {
            this.fpShotFile = fpShotFile;
            return this;
        }
        public java.util.List<ListFpShotFilesResponseBodyFpShotFileListFpShotFile> getFpShotFile() {
            return this.fpShotFile;
        }

    }

}
