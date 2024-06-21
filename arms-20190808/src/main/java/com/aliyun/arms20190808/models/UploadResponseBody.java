// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class UploadResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>A5EC8221-08F2-4C95-9AF1-49FD998C****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The returned data.</p>
     */
    @NameInMap("UploadResult")
    public UploadResponseBodyUploadResult uploadResult;

    public static UploadResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UploadResponseBody self = new UploadResponseBody();
        return TeaModel.build(map, self);
    }

    public UploadResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UploadResponseBody setUploadResult(UploadResponseBodyUploadResult uploadResult) {
        this.uploadResult = uploadResult;
        return this;
    }
    public UploadResponseBodyUploadResult getUploadResult() {
        return this.uploadResult;
    }

    public static class UploadResponseBodyUploadResult extends TeaModel {
        /**
         * <p>The ID of the SourceMap file.</p>
         * 
         * <strong>example:</strong>
         * <p>123</p>
         */
        @NameInMap("Fid")
        public String fid;

        /**
         * <p>The name of the SourceMap file.</p>
         * 
         * <strong>example:</strong>
         * <p>test.js.map</p>
         */
        @NameInMap("FileName")
        public String fileName;

        /**
         * <p>The time when the file was uploaded.</p>
         * 
         * <strong>example:</strong>
         * <p>1650272251</p>
         */
        @NameInMap("UploadTime")
        public String uploadTime;

        public static UploadResponseBodyUploadResult build(java.util.Map<String, ?> map) throws Exception {
            UploadResponseBodyUploadResult self = new UploadResponseBodyUploadResult();
            return TeaModel.build(map, self);
        }

        public UploadResponseBodyUploadResult setFid(String fid) {
            this.fid = fid;
            return this;
        }
        public String getFid() {
            return this.fid;
        }

        public UploadResponseBodyUploadResult setFileName(String fileName) {
            this.fileName = fileName;
            return this;
        }
        public String getFileName() {
            return this.fileName;
        }

        public UploadResponseBodyUploadResult setUploadTime(String uploadTime) {
            this.uploadTime = uploadTime;
            return this;
        }
        public String getUploadTime() {
            return this.uploadTime;
        }

    }

}
