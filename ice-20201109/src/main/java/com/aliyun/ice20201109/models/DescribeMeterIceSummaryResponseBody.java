// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class DescribeMeterIceSummaryResponseBody extends TeaModel {
    @NameInMap("Data")
    public java.util.List<DescribeMeterIceSummaryResponseBodyData> data;

    // Id
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeMeterIceSummaryResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeMeterIceSummaryResponseBody self = new DescribeMeterIceSummaryResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeMeterIceSummaryResponseBody setData(java.util.List<DescribeMeterIceSummaryResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<DescribeMeterIceSummaryResponseBodyData> getData() {
        return this.data;
    }

    public DescribeMeterIceSummaryResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeMeterIceSummaryResponseBodyData extends TeaModel {
        @NameInMap("EditingDuration")
        public String editingDuration;

        @NameInMap("LiveTranscodeDuration")
        public Long liveTranscodeDuration;

        @NameInMap("MpsAiDuration")
        public Long mpsAiDuration;

        @NameInMap("MpsTranscodeDuration")
        public Long mpsTranscodeDuration;

        @NameInMap("MpsTranscodeUHDDuration")
        public Long mpsTranscodeUHDDuration;

        public static DescribeMeterIceSummaryResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DescribeMeterIceSummaryResponseBodyData self = new DescribeMeterIceSummaryResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DescribeMeterIceSummaryResponseBodyData setEditingDuration(String editingDuration) {
            this.editingDuration = editingDuration;
            return this;
        }
        public String getEditingDuration() {
            return this.editingDuration;
        }

        public DescribeMeterIceSummaryResponseBodyData setLiveTranscodeDuration(Long liveTranscodeDuration) {
            this.liveTranscodeDuration = liveTranscodeDuration;
            return this;
        }
        public Long getLiveTranscodeDuration() {
            return this.liveTranscodeDuration;
        }

        public DescribeMeterIceSummaryResponseBodyData setMpsAiDuration(Long mpsAiDuration) {
            this.mpsAiDuration = mpsAiDuration;
            return this;
        }
        public Long getMpsAiDuration() {
            return this.mpsAiDuration;
        }

        public DescribeMeterIceSummaryResponseBodyData setMpsTranscodeDuration(Long mpsTranscodeDuration) {
            this.mpsTranscodeDuration = mpsTranscodeDuration;
            return this;
        }
        public Long getMpsTranscodeDuration() {
            return this.mpsTranscodeDuration;
        }

        public DescribeMeterIceSummaryResponseBodyData setMpsTranscodeUHDDuration(Long mpsTranscodeUHDDuration) {
            this.mpsTranscodeUHDDuration = mpsTranscodeUHDDuration;
            return this;
        }
        public Long getMpsTranscodeUHDDuration() {
            return this.mpsTranscodeUHDDuration;
        }

    }

}
