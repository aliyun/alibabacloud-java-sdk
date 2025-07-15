// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class DescribeUidOnlineStreamsResponseBody extends TeaModel {
    @NameInMap("Data")
    public java.util.List<DescribeUidOnlineStreamsResponseBodyData> data;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TotalNum")
    public Long totalNum;

    public static DescribeUidOnlineStreamsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeUidOnlineStreamsResponseBody self = new DescribeUidOnlineStreamsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeUidOnlineStreamsResponseBody setData(java.util.List<DescribeUidOnlineStreamsResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<DescribeUidOnlineStreamsResponseBodyData> getData() {
        return this.data;
    }

    public DescribeUidOnlineStreamsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeUidOnlineStreamsResponseBody setTotalNum(Long totalNum) {
        this.totalNum = totalNum;
        return this;
    }
    public Long getTotalNum() {
        return this.totalNum;
    }

    public static class DescribeUidOnlineStreamsResponseBodyData extends TeaModel {
        @NameInMap("AppName")
        public String appName;

        @NameInMap("DomainName")
        public String domainName;

        @NameInMap("StreamName")
        public String streamName;

        public static DescribeUidOnlineStreamsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DescribeUidOnlineStreamsResponseBodyData self = new DescribeUidOnlineStreamsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DescribeUidOnlineStreamsResponseBodyData setAppName(String appName) {
            this.appName = appName;
            return this;
        }
        public String getAppName() {
            return this.appName;
        }

        public DescribeUidOnlineStreamsResponseBodyData setDomainName(String domainName) {
            this.domainName = domainName;
            return this;
        }
        public String getDomainName() {
            return this.domainName;
        }

        public DescribeUidOnlineStreamsResponseBodyData setStreamName(String streamName) {
            this.streamName = streamName;
            return this;
        }
        public String getStreamName() {
            return this.streamName;
        }

    }

}
