// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class DescribeRtcCloudRecordingFilesResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p><strong><strong><strong>58-5876-</strong></strong>-83CA-B56278</strong>****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TaskInfo")
    public DescribeRtcCloudRecordingFilesResponseBodyTaskInfo taskInfo;

    public static DescribeRtcCloudRecordingFilesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeRtcCloudRecordingFilesResponseBody self = new DescribeRtcCloudRecordingFilesResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeRtcCloudRecordingFilesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeRtcCloudRecordingFilesResponseBody setTaskInfo(DescribeRtcCloudRecordingFilesResponseBodyTaskInfo taskInfo) {
        this.taskInfo = taskInfo;
        return this;
    }
    public DescribeRtcCloudRecordingFilesResponseBodyTaskInfo getTaskInfo() {
        return this.taskInfo;
    }

    public static class DescribeRtcCloudRecordingFilesResponseBodyTaskInfoRecordFileList extends TeaModel {
        @NameInMap("HlsFileList")
        public java.util.List<String> hlsFileList;

        @NameInMap("Mp3FileList")
        public java.util.List<String> mp3FileList;

        @NameInMap("Mp4FileList")
        public java.util.List<String> mp4FileList;

        public static DescribeRtcCloudRecordingFilesResponseBodyTaskInfoRecordFileList build(java.util.Map<String, ?> map) throws Exception {
            DescribeRtcCloudRecordingFilesResponseBodyTaskInfoRecordFileList self = new DescribeRtcCloudRecordingFilesResponseBodyTaskInfoRecordFileList();
            return TeaModel.build(map, self);
        }

        public DescribeRtcCloudRecordingFilesResponseBodyTaskInfoRecordFileList setHlsFileList(java.util.List<String> hlsFileList) {
            this.hlsFileList = hlsFileList;
            return this;
        }
        public java.util.List<String> getHlsFileList() {
            return this.hlsFileList;
        }

        public DescribeRtcCloudRecordingFilesResponseBodyTaskInfoRecordFileList setMp3FileList(java.util.List<String> mp3FileList) {
            this.mp3FileList = mp3FileList;
            return this;
        }
        public java.util.List<String> getMp3FileList() {
            return this.mp3FileList;
        }

        public DescribeRtcCloudRecordingFilesResponseBodyTaskInfoRecordFileList setMp4FileList(java.util.List<String> mp4FileList) {
            this.mp4FileList = mp4FileList;
            return this;
        }
        public java.util.List<String> getMp4FileList() {
            return this.mp4FileList;
        }

    }

    public static class DescribeRtcCloudRecordingFilesResponseBodyTaskInfo extends TeaModel {
        @NameInMap("RecordFileList")
        public DescribeRtcCloudRecordingFilesResponseBodyTaskInfoRecordFileList recordFileList;

        /**
         * <strong>example:</strong>
         * <p>RUNNING</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <strong>example:</strong>
         * <p><strong><strong><strong>73-8501-</strong></strong>-8ac1-72295a</strong>****</p>
         */
        @NameInMap("TaskId")
        public String taskId;

        public static DescribeRtcCloudRecordingFilesResponseBodyTaskInfo build(java.util.Map<String, ?> map) throws Exception {
            DescribeRtcCloudRecordingFilesResponseBodyTaskInfo self = new DescribeRtcCloudRecordingFilesResponseBodyTaskInfo();
            return TeaModel.build(map, self);
        }

        public DescribeRtcCloudRecordingFilesResponseBodyTaskInfo setRecordFileList(DescribeRtcCloudRecordingFilesResponseBodyTaskInfoRecordFileList recordFileList) {
            this.recordFileList = recordFileList;
            return this;
        }
        public DescribeRtcCloudRecordingFilesResponseBodyTaskInfoRecordFileList getRecordFileList() {
            return this.recordFileList;
        }

        public DescribeRtcCloudRecordingFilesResponseBodyTaskInfo setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeRtcCloudRecordingFilesResponseBodyTaskInfo setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

    }

}
