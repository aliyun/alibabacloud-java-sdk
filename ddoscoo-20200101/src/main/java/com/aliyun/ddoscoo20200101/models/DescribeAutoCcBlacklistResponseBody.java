// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20200101.models;

import com.aliyun.tea.*;

public class DescribeAutoCcBlacklistResponseBody extends TeaModel {
    /**
     * <p>An array that consists of the details of the IP addresses in the blacklist of the instance.</p>
     */
    @NameInMap("AutoCcBlacklist")
    public java.util.List<DescribeAutoCcBlacklistResponseBodyAutoCcBlacklist> autoCcBlacklist;

    /**
     * <p>The ID of the request, which is used to locate and troubleshoot issues.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of returned IP addresses in the blacklist.</p>
     */
    @NameInMap("TotalCount")
    public Long totalCount;

    public static DescribeAutoCcBlacklistResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeAutoCcBlacklistResponseBody self = new DescribeAutoCcBlacklistResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeAutoCcBlacklistResponseBody setAutoCcBlacklist(java.util.List<DescribeAutoCcBlacklistResponseBodyAutoCcBlacklist> autoCcBlacklist) {
        this.autoCcBlacklist = autoCcBlacklist;
        return this;
    }
    public java.util.List<DescribeAutoCcBlacklistResponseBodyAutoCcBlacklist> getAutoCcBlacklist() {
        return this.autoCcBlacklist;
    }

    public DescribeAutoCcBlacklistResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeAutoCcBlacklistResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static class DescribeAutoCcBlacklistResponseBodyAutoCcBlacklist extends TeaModel {
        /**
         * <p>The IP address of the instance.</p>
         */
        @NameInMap("DestIp")
        public String destIp;

        /**
         * <p>The validity period of the IP address in the blacklist. The value is a UNIX timestamp. Unit: seconds.</p>
         */
        @NameInMap("EndTime")
        public Long endTime;

        /**
         * <p>The IP address in the blacklist.</p>
         */
        @NameInMap("SourceIp")
        public String sourceIp;

        /**
         * <p>The mode of how the IP address is added to the blacklist. Valid values:</p>
         * <br>
         * <p>*   **manual**: manually added</p>
         * <p>*   **auto**: automatically added</p>
         */
        @NameInMap("Type")
        public String type;

        public static DescribeAutoCcBlacklistResponseBodyAutoCcBlacklist build(java.util.Map<String, ?> map) throws Exception {
            DescribeAutoCcBlacklistResponseBodyAutoCcBlacklist self = new DescribeAutoCcBlacklistResponseBodyAutoCcBlacklist();
            return TeaModel.build(map, self);
        }

        public DescribeAutoCcBlacklistResponseBodyAutoCcBlacklist setDestIp(String destIp) {
            this.destIp = destIp;
            return this;
        }
        public String getDestIp() {
            return this.destIp;
        }

        public DescribeAutoCcBlacklistResponseBodyAutoCcBlacklist setEndTime(Long endTime) {
            this.endTime = endTime;
            return this;
        }
        public Long getEndTime() {
            return this.endTime;
        }

        public DescribeAutoCcBlacklistResponseBodyAutoCcBlacklist setSourceIp(String sourceIp) {
            this.sourceIp = sourceIp;
            return this;
        }
        public String getSourceIp() {
            return this.sourceIp;
        }

        public DescribeAutoCcBlacklistResponseBodyAutoCcBlacklist setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

}
