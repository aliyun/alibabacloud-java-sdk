// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imp20210630.models;

import com.aliyun.tea.*;

public class DescribeMeterImpPlayBackTimeByLiveIdResponseBody extends TeaModel {
    @NameInMap("Data")
    public java.util.List<DescribeMeterImpPlayBackTimeByLiveIdResponseBodyData> data;

    // Id
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeMeterImpPlayBackTimeByLiveIdResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeMeterImpPlayBackTimeByLiveIdResponseBody self = new DescribeMeterImpPlayBackTimeByLiveIdResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeMeterImpPlayBackTimeByLiveIdResponseBody setData(java.util.List<DescribeMeterImpPlayBackTimeByLiveIdResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<DescribeMeterImpPlayBackTimeByLiveIdResponseBodyData> getData() {
        return this.data;
    }

    public DescribeMeterImpPlayBackTimeByLiveIdResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeMeterImpPlayBackTimeByLiveIdResponseBodyData extends TeaModel {
        @NameInMap("WatchTime")
        public Long watchTime;

        public static DescribeMeterImpPlayBackTimeByLiveIdResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DescribeMeterImpPlayBackTimeByLiveIdResponseBodyData self = new DescribeMeterImpPlayBackTimeByLiveIdResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DescribeMeterImpPlayBackTimeByLiveIdResponseBodyData setWatchTime(Long watchTime) {
            this.watchTime = watchTime;
            return this;
        }
        public Long getWatchTime() {
            return this.watchTime;
        }

    }

}
