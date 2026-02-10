// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class DescribeLiveCenterTransferResponseBody extends TeaModel {
    @NameInMap("LiveCenterTransferInfoList")
    public DescribeLiveCenterTransferResponseBodyLiveCenterTransferInfoList liveCenterTransferInfoList;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>C4865B85-664B-19D3-BB16-C62FB83C8226</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeLiveCenterTransferResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeLiveCenterTransferResponseBody self = new DescribeLiveCenterTransferResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeLiveCenterTransferResponseBody setLiveCenterTransferInfoList(DescribeLiveCenterTransferResponseBodyLiveCenterTransferInfoList liveCenterTransferInfoList) {
        this.liveCenterTransferInfoList = liveCenterTransferInfoList;
        return this;
    }
    public DescribeLiveCenterTransferResponseBodyLiveCenterTransferInfoList getLiveCenterTransferInfoList() {
        return this.liveCenterTransferInfoList;
    }

    public DescribeLiveCenterTransferResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeLiveCenterTransferResponseBodyLiveCenterTransferInfoListLiveCenterTransferInfo extends TeaModel {
        @NameInMap("AppName")
        public String appName;

        @NameInMap("DomainName")
        public String domainName;

        @NameInMap("DstUrl")
        public String dstUrl;

        @NameInMap("EndTime")
        public String endTime;

        @NameInMap("StartTime")
        public String startTime;

        @NameInMap("StreamName")
        public String streamName;

        @NameInMap("TransferArgs")
        public String transferArgs;

        public static DescribeLiveCenterTransferResponseBodyLiveCenterTransferInfoListLiveCenterTransferInfo build(java.util.Map<String, ?> map) throws Exception {
            DescribeLiveCenterTransferResponseBodyLiveCenterTransferInfoListLiveCenterTransferInfo self = new DescribeLiveCenterTransferResponseBodyLiveCenterTransferInfoListLiveCenterTransferInfo();
            return TeaModel.build(map, self);
        }

        public DescribeLiveCenterTransferResponseBodyLiveCenterTransferInfoListLiveCenterTransferInfo setAppName(String appName) {
            this.appName = appName;
            return this;
        }
        public String getAppName() {
            return this.appName;
        }

        public DescribeLiveCenterTransferResponseBodyLiveCenterTransferInfoListLiveCenterTransferInfo setDomainName(String domainName) {
            this.domainName = domainName;
            return this;
        }
        public String getDomainName() {
            return this.domainName;
        }

        public DescribeLiveCenterTransferResponseBodyLiveCenterTransferInfoListLiveCenterTransferInfo setDstUrl(String dstUrl) {
            this.dstUrl = dstUrl;
            return this;
        }
        public String getDstUrl() {
            return this.dstUrl;
        }

        public DescribeLiveCenterTransferResponseBodyLiveCenterTransferInfoListLiveCenterTransferInfo setEndTime(String endTime) {
            this.endTime = endTime;
            return this;
        }
        public String getEndTime() {
            return this.endTime;
        }

        public DescribeLiveCenterTransferResponseBodyLiveCenterTransferInfoListLiveCenterTransferInfo setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

        public DescribeLiveCenterTransferResponseBodyLiveCenterTransferInfoListLiveCenterTransferInfo setStreamName(String streamName) {
            this.streamName = streamName;
            return this;
        }
        public String getStreamName() {
            return this.streamName;
        }

        public DescribeLiveCenterTransferResponseBodyLiveCenterTransferInfoListLiveCenterTransferInfo setTransferArgs(String transferArgs) {
            this.transferArgs = transferArgs;
            return this;
        }
        public String getTransferArgs() {
            return this.transferArgs;
        }

    }

    public static class DescribeLiveCenterTransferResponseBodyLiveCenterTransferInfoList extends TeaModel {
        @NameInMap("LiveCenterTransferInfo")
        public java.util.List<DescribeLiveCenterTransferResponseBodyLiveCenterTransferInfoListLiveCenterTransferInfo> liveCenterTransferInfo;

        public static DescribeLiveCenterTransferResponseBodyLiveCenterTransferInfoList build(java.util.Map<String, ?> map) throws Exception {
            DescribeLiveCenterTransferResponseBodyLiveCenterTransferInfoList self = new DescribeLiveCenterTransferResponseBodyLiveCenterTransferInfoList();
            return TeaModel.build(map, self);
        }

        public DescribeLiveCenterTransferResponseBodyLiveCenterTransferInfoList setLiveCenterTransferInfo(java.util.List<DescribeLiveCenterTransferResponseBodyLiveCenterTransferInfoListLiveCenterTransferInfo> liveCenterTransferInfo) {
            this.liveCenterTransferInfo = liveCenterTransferInfo;
            return this;
        }
        public java.util.List<DescribeLiveCenterTransferResponseBodyLiveCenterTransferInfoListLiveCenterTransferInfo> getLiveCenterTransferInfo() {
            return this.liveCenterTransferInfo;
        }

    }

}
