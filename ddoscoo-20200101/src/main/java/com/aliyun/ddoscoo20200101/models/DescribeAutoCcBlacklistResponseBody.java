// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20200101.models;

import com.aliyun.tea.*;

public class DescribeAutoCcBlacklistResponseBody extends TeaModel {
    @NameInMap("TotalCount")
    public Long totalCount;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("AutoCcBlacklist")
    public java.util.List<DescribeAutoCcBlacklistResponseBodyAutoCcBlacklist> autoCcBlacklist;

    public static DescribeAutoCcBlacklistResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeAutoCcBlacklistResponseBody self = new DescribeAutoCcBlacklistResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeAutoCcBlacklistResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public DescribeAutoCcBlacklistResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeAutoCcBlacklistResponseBody setAutoCcBlacklist(java.util.List<DescribeAutoCcBlacklistResponseBodyAutoCcBlacklist> autoCcBlacklist) {
        this.autoCcBlacklist = autoCcBlacklist;
        return this;
    }
    public java.util.List<DescribeAutoCcBlacklistResponseBodyAutoCcBlacklist> getAutoCcBlacklist() {
        return this.autoCcBlacklist;
    }

    public static class DescribeAutoCcBlacklistResponseBodyAutoCcBlacklist extends TeaModel {
        @NameInMap("Type")
        public String type;

        @NameInMap("EndTime")
        public Long endTime;

        @NameInMap("SourceIp")
        public String sourceIp;

        @NameInMap("DestIp")
        public String destIp;

        public static DescribeAutoCcBlacklistResponseBodyAutoCcBlacklist build(java.util.Map<String, ?> map) throws Exception {
            DescribeAutoCcBlacklistResponseBodyAutoCcBlacklist self = new DescribeAutoCcBlacklistResponseBodyAutoCcBlacklist();
            return TeaModel.build(map, self);
        }

        public DescribeAutoCcBlacklistResponseBodyAutoCcBlacklist setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
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

        public DescribeAutoCcBlacklistResponseBodyAutoCcBlacklist setDestIp(String destIp) {
            this.destIp = destIp;
            return this;
        }
        public String getDestIp() {
            return this.destIp;
        }

    }

}
