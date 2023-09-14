// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class DescribeMeterImsLiveSnapshotUsageResponseBody extends TeaModel {
    @NameInMap("Data")
    public java.util.List<DescribeMeterImsLiveSnapshotUsageResponseBodyData> data;

    /**
     * <p>Id</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeMeterImsLiveSnapshotUsageResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeMeterImsLiveSnapshotUsageResponseBody self = new DescribeMeterImsLiveSnapshotUsageResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeMeterImsLiveSnapshotUsageResponseBody setData(java.util.List<DescribeMeterImsLiveSnapshotUsageResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<DescribeMeterImsLiveSnapshotUsageResponseBodyData> getData() {
        return this.data;
    }

    public DescribeMeterImsLiveSnapshotUsageResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeMeterImsLiveSnapshotUsageResponseBodyData extends TeaModel {
        @NameInMap("Count")
        public Long count;

        @NameInMap("Time")
        public Long time;

        public static DescribeMeterImsLiveSnapshotUsageResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DescribeMeterImsLiveSnapshotUsageResponseBodyData self = new DescribeMeterImsLiveSnapshotUsageResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DescribeMeterImsLiveSnapshotUsageResponseBodyData setCount(Long count) {
            this.count = count;
            return this;
        }
        public Long getCount() {
            return this.count;
        }

        public DescribeMeterImsLiveSnapshotUsageResponseBodyData setTime(Long time) {
            this.time = time;
            return this;
        }
        public Long getTime() {
            return this.time;
        }

    }

}
