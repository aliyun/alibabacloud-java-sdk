// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20200101.models;

import com.aliyun.tea.*;

public class DescribeAutoCcWhitelistResponseBody extends TeaModel {
    /**
     * <p>An array that consists of details of the IP address in the whitelist of the instance.</p>
     */
    @NameInMap("AutoCcWhitelist")
    public java.util.List<DescribeAutoCcWhitelistResponseBodyAutoCcWhitelist> autoCcWhitelist;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>F09D085E-5E0F-4FF2-B32E-F4A644049162</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of returned IP addresses in the whitelist.</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("TotalCount")
    public Long totalCount;

    public static DescribeAutoCcWhitelistResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeAutoCcWhitelistResponseBody self = new DescribeAutoCcWhitelistResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeAutoCcWhitelistResponseBody setAutoCcWhitelist(java.util.List<DescribeAutoCcWhitelistResponseBodyAutoCcWhitelist> autoCcWhitelist) {
        this.autoCcWhitelist = autoCcWhitelist;
        return this;
    }
    public java.util.List<DescribeAutoCcWhitelistResponseBodyAutoCcWhitelist> getAutoCcWhitelist() {
        return this.autoCcWhitelist;
    }

    public DescribeAutoCcWhitelistResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeAutoCcWhitelistResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static class DescribeAutoCcWhitelistResponseBodyAutoCcWhitelist extends TeaModel {
        /**
         * <p>The IP address of the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>203.<em><strong>.</strong></em>.117</p>
         */
        @NameInMap("DestIp")
        public String destIp;

        /**
         * <p>The validity period of the IP address in the whitelist. Unit: seconds. <strong>0</strong> indicates that the IP address in the whitelist never expires.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("EndTime")
        public Long endTime;

        /**
         * <p>The IP addresses that is contained in the IP address whitelist.</p>
         * 
         * <strong>example:</strong>
         * <p>2.2.2.2</p>
         */
        @NameInMap("SourceIp")
        public String sourceIp;

        /**
         * <p>The mode of how an IP address is added to the whitelist. Valid values:</p>
         * <ul>
         * <li><strong>manual</strong>: manually added</li>
         * <li><strong>auto</strong>: automatically added</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>manual</p>
         */
        @NameInMap("Type")
        public String type;

        public static DescribeAutoCcWhitelistResponseBodyAutoCcWhitelist build(java.util.Map<String, ?> map) throws Exception {
            DescribeAutoCcWhitelistResponseBodyAutoCcWhitelist self = new DescribeAutoCcWhitelistResponseBodyAutoCcWhitelist();
            return TeaModel.build(map, self);
        }

        public DescribeAutoCcWhitelistResponseBodyAutoCcWhitelist setDestIp(String destIp) {
            this.destIp = destIp;
            return this;
        }
        public String getDestIp() {
            return this.destIp;
        }

        public DescribeAutoCcWhitelistResponseBodyAutoCcWhitelist setEndTime(Long endTime) {
            this.endTime = endTime;
            return this;
        }
        public Long getEndTime() {
            return this.endTime;
        }

        public DescribeAutoCcWhitelistResponseBodyAutoCcWhitelist setSourceIp(String sourceIp) {
            this.sourceIp = sourceIp;
            return this;
        }
        public String getSourceIp() {
            return this.sourceIp;
        }

        public DescribeAutoCcWhitelistResponseBodyAutoCcWhitelist setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

}
