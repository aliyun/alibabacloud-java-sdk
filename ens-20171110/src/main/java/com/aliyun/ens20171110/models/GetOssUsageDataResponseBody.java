// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class GetOssUsageDataResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The array of usage data.</p>
     */
    @NameInMap("UsageList")
    public java.util.List<GetOssUsageDataResponseBodyUsageList> usageList;

    public static GetOssUsageDataResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetOssUsageDataResponseBody self = new GetOssUsageDataResponseBody();
        return TeaModel.build(map, self);
    }

    public GetOssUsageDataResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetOssUsageDataResponseBody setUsageList(java.util.List<GetOssUsageDataResponseBodyUsageList> usageList) {
        this.usageList = usageList;
        return this;
    }
    public java.util.List<GetOssUsageDataResponseBodyUsageList> getUsageList() {
        return this.usageList;
    }

    public static class GetOssUsageDataResponseBodyUsageList extends TeaModel {
        /**
         * <p>The inbound bandwidth over the intranet. Unit: bit/s.</p>
         */
        @NameInMap("LanRxBw")
        public Long lanRxBw;

        /**
         * <p>The outbound bandwidth over the intranet. Unit: bit/s.</p>
         */
        @NameInMap("LanTxBw")
        public Long lanTxBw;

        /**
         * <p>The number of time point within a day.</p>
         */
        @NameInMap("Point")
        public Long point;

        /**
         * <p>The point in time, in UTC. Format: 2010-01-21T09:50:23Z.</p>
         */
        @NameInMap("PointTs")
        public String pointTs;

        /**
         * <p>The storage usage. Unit: bytes.</p>
         */
        @NameInMap("StorageUsageByte")
        public Long storageUsageByte;

        /**
         * <p>The outbound bandwidth over the intranet. Unit: bit/s.</p>
         */
        @NameInMap("WanRxBw")
        public Long wanRxBw;

        /**
         * <p>The outbound bandwidth over the Internet. Unit: bit/s.</p>
         */
        @NameInMap("WanTxBw")
        public Long wanTxBw;

        public static GetOssUsageDataResponseBodyUsageList build(java.util.Map<String, ?> map) throws Exception {
            GetOssUsageDataResponseBodyUsageList self = new GetOssUsageDataResponseBodyUsageList();
            return TeaModel.build(map, self);
        }

        public GetOssUsageDataResponseBodyUsageList setLanRxBw(Long lanRxBw) {
            this.lanRxBw = lanRxBw;
            return this;
        }
        public Long getLanRxBw() {
            return this.lanRxBw;
        }

        public GetOssUsageDataResponseBodyUsageList setLanTxBw(Long lanTxBw) {
            this.lanTxBw = lanTxBw;
            return this;
        }
        public Long getLanTxBw() {
            return this.lanTxBw;
        }

        public GetOssUsageDataResponseBodyUsageList setPoint(Long point) {
            this.point = point;
            return this;
        }
        public Long getPoint() {
            return this.point;
        }

        public GetOssUsageDataResponseBodyUsageList setPointTs(String pointTs) {
            this.pointTs = pointTs;
            return this;
        }
        public String getPointTs() {
            return this.pointTs;
        }

        public GetOssUsageDataResponseBodyUsageList setStorageUsageByte(Long storageUsageByte) {
            this.storageUsageByte = storageUsageByte;
            return this;
        }
        public Long getStorageUsageByte() {
            return this.storageUsageByte;
        }

        public GetOssUsageDataResponseBodyUsageList setWanRxBw(Long wanRxBw) {
            this.wanRxBw = wanRxBw;
            return this;
        }
        public Long getWanRxBw() {
            return this.wanRxBw;
        }

        public GetOssUsageDataResponseBodyUsageList setWanTxBw(Long wanTxBw) {
            this.wanTxBw = wanTxBw;
            return this;
        }
        public Long getWanTxBw() {
            return this.wanTxBw;
        }

    }

}
