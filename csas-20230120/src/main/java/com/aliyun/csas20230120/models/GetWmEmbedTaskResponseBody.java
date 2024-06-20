// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csas20230120.models;

import com.aliyun.tea.*;

public class GetWmEmbedTaskResponseBody extends TeaModel {
    @NameInMap("Data")
    public GetWmEmbedTaskResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>D6707286-A50E-57B1-B2CF-EFAC59E850D8</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static GetWmEmbedTaskResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetWmEmbedTaskResponseBody self = new GetWmEmbedTaskResponseBody();
        return TeaModel.build(map, self);
    }

    public GetWmEmbedTaskResponseBody setData(GetWmEmbedTaskResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetWmEmbedTaskResponseBodyData getData() {
        return this.data;
    }

    public GetWmEmbedTaskResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetWmEmbedTaskResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p><a href="https://example.com/embed-****.pdf">https://example.com/embed-****.pdf</a></p>
         */
        @NameInMap("FileUrl")
        public String fileUrl;

        /**
         * <strong>example:</strong>
         * <p>171859****</p>
         */
        @NameInMap("FileUrlExp")
        public String fileUrlExp;

        /**
         * <strong>example:</strong>
         * <p>embed-****.pdf</p>
         */
        @NameInMap("Filename")
        public String filename;

        /**
         * <strong>example:</strong>
         * <p>d41d8cd98f00b204e9800998ecf8****</p>
         */
        @NameInMap("OutFileHashMd5")
        public String outFileHashMd5;

        /**
         * <strong>example:</strong>
         * <p>123**</p>
         */
        @NameInMap("OutFileSize")
        public Long outFileSize;

        /**
         * <strong>example:</strong>
         * <p>job:5GfrJYsoaffmCE7Z5bZtjUxxxxxxxxxx</p>
         */
        @NameInMap("TaskId")
        public String taskId;

        /**
         * <strong>example:</strong>
         * <p>Success</p>
         */
        @NameInMap("TaskStatus")
        public String taskStatus;

        public static GetWmEmbedTaskResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetWmEmbedTaskResponseBodyData self = new GetWmEmbedTaskResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetWmEmbedTaskResponseBodyData setFileUrl(String fileUrl) {
            this.fileUrl = fileUrl;
            return this;
        }
        public String getFileUrl() {
            return this.fileUrl;
        }

        public GetWmEmbedTaskResponseBodyData setFileUrlExp(String fileUrlExp) {
            this.fileUrlExp = fileUrlExp;
            return this;
        }
        public String getFileUrlExp() {
            return this.fileUrlExp;
        }

        public GetWmEmbedTaskResponseBodyData setFilename(String filename) {
            this.filename = filename;
            return this;
        }
        public String getFilename() {
            return this.filename;
        }

        public GetWmEmbedTaskResponseBodyData setOutFileHashMd5(String outFileHashMd5) {
            this.outFileHashMd5 = outFileHashMd5;
            return this;
        }
        public String getOutFileHashMd5() {
            return this.outFileHashMd5;
        }

        public GetWmEmbedTaskResponseBodyData setOutFileSize(Long outFileSize) {
            this.outFileSize = outFileSize;
            return this;
        }
        public Long getOutFileSize() {
            return this.outFileSize;
        }

        public GetWmEmbedTaskResponseBodyData setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

        public GetWmEmbedTaskResponseBodyData setTaskStatus(String taskStatus) {
            this.taskStatus = taskStatus;
            return this;
        }
        public String getTaskStatus() {
            return this.taskStatus;
        }

    }

}
