// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class DescribeRtcCloudRecordingFilesResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p><strong><strong><strong>58-5876-</strong></strong>-83CA-B56278</strong>****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The task information.</p>
     */
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

    public static class DescribeRtcCloudRecordingFilesResponseBodyTaskInfoRecordFileListVodMediaList extends TeaModel {
        /**
         * <p>The array of media resource IDs generated during recording.</p>
         */
        @NameInMap("MediaIds")
        public java.util.List<String> mediaIds;

        /**
         * <p>The array of automatically merged media resource IDs generated after recording ends.</p>
         */
        @NameInMap("MergedIds")
        public java.util.List<String> mergedIds;

        /**
         * <p>The subscribed stream.</p>
         * <ul>
         * <li>For stream mixing recording, the value is always Mix.</li>
         * <li>For single-stream recording, the value is Single::{UserId}::{Suffix}.<ul>
         * <li>UserId is the UserId corresponding to this stream.</li>
         * <li>Suffix depends on the StreamType and SourceType specified during subscription.<ul>
         * <li>When StreamType is 0: if SourceType is 0, Suffix is AV::C. If SourceType is 1, Suffix is AV::S.</li>
         * <li>When StreamType is 1: Suffix can only be A.</li>
         * <li>When StreamType is 2 (not supported for single-stream recording): if SourceType is 0, Suffix is V::C. If SourceType is 1, Suffix is V::S.</li>
         * </ul>
         * </li>
         * </ul>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Single::UserA::AV::C</p>
         */
        @NameInMap("Stream")
        public String stream;

        public static DescribeRtcCloudRecordingFilesResponseBodyTaskInfoRecordFileListVodMediaList build(java.util.Map<String, ?> map) throws Exception {
            DescribeRtcCloudRecordingFilesResponseBodyTaskInfoRecordFileListVodMediaList self = new DescribeRtcCloudRecordingFilesResponseBodyTaskInfoRecordFileListVodMediaList();
            return TeaModel.build(map, self);
        }

        public DescribeRtcCloudRecordingFilesResponseBodyTaskInfoRecordFileListVodMediaList setMediaIds(java.util.List<String> mediaIds) {
            this.mediaIds = mediaIds;
            return this;
        }
        public java.util.List<String> getMediaIds() {
            return this.mediaIds;
        }

        public DescribeRtcCloudRecordingFilesResponseBodyTaskInfoRecordFileListVodMediaList setMergedIds(java.util.List<String> mergedIds) {
            this.mergedIds = mergedIds;
            return this;
        }
        public java.util.List<String> getMergedIds() {
            return this.mergedIds;
        }

        public DescribeRtcCloudRecordingFilesResponseBodyTaskInfoRecordFileListVodMediaList setStream(String stream) {
            this.stream = stream;
            return this;
        }
        public String getStream() {
            return this.stream;
        }

    }

    public static class DescribeRtcCloudRecordingFilesResponseBodyTaskInfoRecordFileList extends TeaModel {
        /**
         * <p>The array of HLS recording file names.</p>
         */
        @NameInMap("HlsFileList")
        public java.util.List<String> hlsFileList;

        /**
         * <p>The array of MP3 recording file names.</p>
         */
        @NameInMap("Mp3FileList")
        public java.util.List<String> mp3FileList;

        /**
         * <p>The array of MP4 recording file names.</p>
         */
        @NameInMap("Mp4FileList")
        public java.util.List<String> mp4FileList;

        /**
         * <p>The array of VOD media resources. When recording to VOD, this is the collection of recording files for each subscribed stream, where each item corresponds to a subscribed stream.</p>
         */
        @NameInMap("VodMediaList")
        public java.util.List<DescribeRtcCloudRecordingFilesResponseBodyTaskInfoRecordFileListVodMediaList> vodMediaList;

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

        public DescribeRtcCloudRecordingFilesResponseBodyTaskInfoRecordFileList setVodMediaList(java.util.List<DescribeRtcCloudRecordingFilesResponseBodyTaskInfoRecordFileListVodMediaList> vodMediaList) {
            this.vodMediaList = vodMediaList;
            return this;
        }
        public java.util.List<DescribeRtcCloudRecordingFilesResponseBodyTaskInfoRecordFileListVodMediaList> getVodMediaList() {
            return this.vodMediaList;
        }

    }

    public static class DescribeRtcCloudRecordingFilesResponseBodyTaskInfo extends TeaModel {
        /**
         * <p>The list of recording files.</p>
         */
        @NameInMap("RecordFileList")
        public DescribeRtcCloudRecordingFilesResponseBodyTaskInfoRecordFileList recordFileList;

        /**
         * <p>The task status. Valid values:</p>
         * <ul>
         * <li>RUNNING</li>
         * <li>RECOVERING</li>
         * <li>STOPPING</li>
         * <li>STOPPED.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>RUNNING</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The task ID passed in the request.</p>
         * 
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
