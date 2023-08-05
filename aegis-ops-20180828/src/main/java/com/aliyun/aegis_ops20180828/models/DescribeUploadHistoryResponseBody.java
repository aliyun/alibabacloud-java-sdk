// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aegis_ops20180828.models;

import com.aliyun.tea.*;

public class DescribeUploadHistoryResponseBody extends TeaModel {
    @NameInMap("FileUploadHistoryInfos")
    public DescribeUploadHistoryResponseBodyFileUploadHistoryInfos fileUploadHistoryInfos;

    public static DescribeUploadHistoryResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeUploadHistoryResponseBody self = new DescribeUploadHistoryResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeUploadHistoryResponseBody setFileUploadHistoryInfos(DescribeUploadHistoryResponseBodyFileUploadHistoryInfos fileUploadHistoryInfos) {
        this.fileUploadHistoryInfos = fileUploadHistoryInfos;
        return this;
    }
    public DescribeUploadHistoryResponseBodyFileUploadHistoryInfos getFileUploadHistoryInfos() {
        return this.fileUploadHistoryInfos;
    }

    public static class DescribeUploadHistoryResponseBodyFileUploadHistoryInfosFileUploadHistoryInfo extends TeaModel {
        @NameInMap("FilePath")
        public String filePath;

        @NameInMap("OssKey")
        public String ossKey;

        @NameInMap("TaskId")
        public String taskId;

        public static DescribeUploadHistoryResponseBodyFileUploadHistoryInfosFileUploadHistoryInfo build(java.util.Map<String, ?> map) throws Exception {
            DescribeUploadHistoryResponseBodyFileUploadHistoryInfosFileUploadHistoryInfo self = new DescribeUploadHistoryResponseBodyFileUploadHistoryInfosFileUploadHistoryInfo();
            return TeaModel.build(map, self);
        }

        public DescribeUploadHistoryResponseBodyFileUploadHistoryInfosFileUploadHistoryInfo setFilePath(String filePath) {
            this.filePath = filePath;
            return this;
        }
        public String getFilePath() {
            return this.filePath;
        }

        public DescribeUploadHistoryResponseBodyFileUploadHistoryInfosFileUploadHistoryInfo setOssKey(String ossKey) {
            this.ossKey = ossKey;
            return this;
        }
        public String getOssKey() {
            return this.ossKey;
        }

        public DescribeUploadHistoryResponseBodyFileUploadHistoryInfosFileUploadHistoryInfo setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

    }

    public static class DescribeUploadHistoryResponseBodyFileUploadHistoryInfos extends TeaModel {
        @NameInMap("FileUploadHistoryInfo")
        public java.util.List<DescribeUploadHistoryResponseBodyFileUploadHistoryInfosFileUploadHistoryInfo> fileUploadHistoryInfo;

        public static DescribeUploadHistoryResponseBodyFileUploadHistoryInfos build(java.util.Map<String, ?> map) throws Exception {
            DescribeUploadHistoryResponseBodyFileUploadHistoryInfos self = new DescribeUploadHistoryResponseBodyFileUploadHistoryInfos();
            return TeaModel.build(map, self);
        }

        public DescribeUploadHistoryResponseBodyFileUploadHistoryInfos setFileUploadHistoryInfo(java.util.List<DescribeUploadHistoryResponseBodyFileUploadHistoryInfosFileUploadHistoryInfo> fileUploadHistoryInfo) {
            this.fileUploadHistoryInfo = fileUploadHistoryInfo;
            return this;
        }
        public java.util.List<DescribeUploadHistoryResponseBodyFileUploadHistoryInfosFileUploadHistoryInfo> getFileUploadHistoryInfo() {
            return this.fileUploadHistoryInfo;
        }

    }

}
