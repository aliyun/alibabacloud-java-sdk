// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class DescribeLiveCenterTransferResponseBody extends TeaModel {
    /**
     * <p>The stream relay information.</p>
     */
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
        /**
         * <p>The name of the application to which the live stream belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>teststream</p>
         */
        @NameInMap("AppName")
        public String appName;

        /**
         * <p>The streaming domain.</p>
         * 
         * <strong>example:</strong>
         * <p>example.com</p>
         */
        @NameInMap("DomainName")
        public String domainName;

        /**
         * <p>The third-party URL to which the live stream is relayed.</p>
         * 
         * <strong>example:</strong>
         * <p>rtmp://push.example2.aliyunlive.com/testapp1/teststream2</p>
         */
        @NameInMap("DstUrl")
        public String dstUrl;

        /**
         * <p>The end time of stream relay.</p>
         * 
         * <strong>example:</strong>
         * <p>2022-04-29T15:16:00Z</p>
         */
        @NameInMap("EndTime")
        public String endTime;

        /**
         * <p>The start time of stream relay.</p>
         * 
         * <strong>example:</strong>
         * <p>2022-04-28T15:16:00Z</p>
         */
        @NameInMap("StartTime")
        public String startTime;

        /**
         * <p>The name of the live stream.</p>
         * 
         * <strong>example:</strong>
         * <p>teststream</p>
         */
        @NameInMap("StreamName")
        public String streamName;

        /**
         * <p>The validity period of stream relay. Valid values:</p>
         * <ul>
         * <li><strong>always</strong>: The stream can always be relayed.</li>
         * <li><strong>time</strong>: The stream can be relayed in a specified time period.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>time</p>
         */
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
