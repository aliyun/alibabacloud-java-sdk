// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class DescribeMeterImsSummaryResponseBody extends TeaModel {
    /**
     * <p>The usage statistics of IMS.</p>
     */
    @NameInMap("Data")
    public java.util.List<DescribeMeterImsSummaryResponseBodyData> data;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>BEA98A0C-7870-15FE-B96F-8880BB600A2C</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeMeterImsSummaryResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeMeterImsSummaryResponseBody self = new DescribeMeterImsSummaryResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeMeterImsSummaryResponseBody setData(java.util.List<DescribeMeterImsSummaryResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<DescribeMeterImsSummaryResponseBodyData> getData() {
        return this.data;
    }

    public DescribeMeterImsSummaryResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeMeterImsSummaryResponseBodyData extends TeaModel {
        /**
         * <p>The duration of video editing.</p>
         * 
         * <strong>example:</strong>
         * <p>8722</p>
         */
        @NameInMap("EditingDuration")
        public String editingDuration;

        /**
         * <p>The duration of live editing.</p>
         * 
         * <strong>example:</strong>
         * <p>2000</p>
         */
        @NameInMap("LiveEditDuration")
        public String liveEditDuration;

        /**
         * <p>The duration of live stream recording.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("LiveRecordDuration")
        public String liveRecordDuration;

        /**
         * <p>The number of live stream snapshots.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("LiveSnapshotCount")
        public String liveSnapshotCount;

        /**
         * <p>The duration of live stream transcoding.</p>
         * 
         * <strong>example:</strong>
         * <p>12356</p>
         */
        @NameInMap("LiveTranscodeDuration")
        public Long liveTranscodeDuration;

        /**
         * <p>The duration of AI processing.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("MpsAiDuration")
        public Long mpsAiDuration;

        /**
         * <p>The duration of video-on-demand (VOD) transcoding.</p>
         * 
         * <strong>example:</strong>
         * <p>17337</p>
         */
        @NameInMap("MpsTranscodeDuration")
        public Long mpsTranscodeDuration;

        /**
         * <p>The duration of audio and video enhancement.</p>
         * 
         * <strong>example:</strong>
         * <p>300</p>
         */
        @NameInMap("MpsTranscodeUHDDuration")
        public Long mpsTranscodeUHDDuration;

        public static DescribeMeterImsSummaryResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DescribeMeterImsSummaryResponseBodyData self = new DescribeMeterImsSummaryResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DescribeMeterImsSummaryResponseBodyData setEditingDuration(String editingDuration) {
            this.editingDuration = editingDuration;
            return this;
        }
        public String getEditingDuration() {
            return this.editingDuration;
        }

        public DescribeMeterImsSummaryResponseBodyData setLiveEditDuration(String liveEditDuration) {
            this.liveEditDuration = liveEditDuration;
            return this;
        }
        public String getLiveEditDuration() {
            return this.liveEditDuration;
        }

        public DescribeMeterImsSummaryResponseBodyData setLiveRecordDuration(String liveRecordDuration) {
            this.liveRecordDuration = liveRecordDuration;
            return this;
        }
        public String getLiveRecordDuration() {
            return this.liveRecordDuration;
        }

        public DescribeMeterImsSummaryResponseBodyData setLiveSnapshotCount(String liveSnapshotCount) {
            this.liveSnapshotCount = liveSnapshotCount;
            return this;
        }
        public String getLiveSnapshotCount() {
            return this.liveSnapshotCount;
        }

        public DescribeMeterImsSummaryResponseBodyData setLiveTranscodeDuration(Long liveTranscodeDuration) {
            this.liveTranscodeDuration = liveTranscodeDuration;
            return this;
        }
        public Long getLiveTranscodeDuration() {
            return this.liveTranscodeDuration;
        }

        public DescribeMeterImsSummaryResponseBodyData setMpsAiDuration(Long mpsAiDuration) {
            this.mpsAiDuration = mpsAiDuration;
            return this;
        }
        public Long getMpsAiDuration() {
            return this.mpsAiDuration;
        }

        public DescribeMeterImsSummaryResponseBodyData setMpsTranscodeDuration(Long mpsTranscodeDuration) {
            this.mpsTranscodeDuration = mpsTranscodeDuration;
            return this;
        }
        public Long getMpsTranscodeDuration() {
            return this.mpsTranscodeDuration;
        }

        public DescribeMeterImsSummaryResponseBodyData setMpsTranscodeUHDDuration(Long mpsTranscodeUHDDuration) {
            this.mpsTranscodeUHDDuration = mpsTranscodeUHDDuration;
            return this;
        }
        public Long getMpsTranscodeUHDDuration() {
            return this.mpsTranscodeUHDDuration;
        }

    }

}
