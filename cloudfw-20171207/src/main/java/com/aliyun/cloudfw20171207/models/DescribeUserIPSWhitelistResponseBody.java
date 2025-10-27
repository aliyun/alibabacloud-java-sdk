// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class DescribeUserIPSWhitelistResponseBody extends TeaModel {
    @NameInMap("Ipv6Whitelists")
    public java.util.List<DescribeUserIPSWhitelistResponseBodyIpv6Whitelists> ipv6Whitelists;

    /**
     * <strong>example:</strong>
     * <p>04F788A5-6A47-5EA9-AC30-CA4DB98AD520</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Whitelists")
    public java.util.List<DescribeUserIPSWhitelistResponseBodyWhitelists> whitelists;

    public static DescribeUserIPSWhitelistResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeUserIPSWhitelistResponseBody self = new DescribeUserIPSWhitelistResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeUserIPSWhitelistResponseBody setIpv6Whitelists(java.util.List<DescribeUserIPSWhitelistResponseBodyIpv6Whitelists> ipv6Whitelists) {
        this.ipv6Whitelists = ipv6Whitelists;
        return this;
    }
    public java.util.List<DescribeUserIPSWhitelistResponseBodyIpv6Whitelists> getIpv6Whitelists() {
        return this.ipv6Whitelists;
    }

    public DescribeUserIPSWhitelistResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeUserIPSWhitelistResponseBody setWhitelists(java.util.List<DescribeUserIPSWhitelistResponseBodyWhitelists> whitelists) {
        this.whitelists = whitelists;
        return this;
    }
    public java.util.List<DescribeUserIPSWhitelistResponseBodyWhitelists> getWhitelists() {
        return this.whitelists;
    }

    public static class DescribeUserIPSWhitelistResponseBodyIpv6Whitelists extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Direction")
        public Long direction;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("ListType")
        public Long listType;

        /**
         * <strong>example:</strong>
         * <p>2408:400a:81a:7900:a77d:ea36:fcbf:de40/128</p>
         */
        @NameInMap("ListValue")
        public String listValue;

        @NameInMap("WhiteListValue")
        public java.util.List<String> whiteListValue;

        /**
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("WhiteType")
        public Long whiteType;

        public static DescribeUserIPSWhitelistResponseBodyIpv6Whitelists build(java.util.Map<String, ?> map) throws Exception {
            DescribeUserIPSWhitelistResponseBodyIpv6Whitelists self = new DescribeUserIPSWhitelistResponseBodyIpv6Whitelists();
            return TeaModel.build(map, self);
        }

        public DescribeUserIPSWhitelistResponseBodyIpv6Whitelists setDirection(Long direction) {
            this.direction = direction;
            return this;
        }
        public Long getDirection() {
            return this.direction;
        }

        public DescribeUserIPSWhitelistResponseBodyIpv6Whitelists setListType(Long listType) {
            this.listType = listType;
            return this;
        }
        public Long getListType() {
            return this.listType;
        }

        public DescribeUserIPSWhitelistResponseBodyIpv6Whitelists setListValue(String listValue) {
            this.listValue = listValue;
            return this;
        }
        public String getListValue() {
            return this.listValue;
        }

        public DescribeUserIPSWhitelistResponseBodyIpv6Whitelists setWhiteListValue(java.util.List<String> whiteListValue) {
            this.whiteListValue = whiteListValue;
            return this;
        }
        public java.util.List<String> getWhiteListValue() {
            return this.whiteListValue;
        }

        public DescribeUserIPSWhitelistResponseBodyIpv6Whitelists setWhiteType(Long whiteType) {
            this.whiteType = whiteType;
            return this;
        }
        public Long getWhiteType() {
            return this.whiteType;
        }

    }

    public static class DescribeUserIPSWhitelistResponseBodyWhitelists extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Direction")
        public Long direction;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("ListType")
        public Long listType;

        /**
         * <strong>example:</strong>
         * <p>10.10.200.4/32,10.10.200.25/32</p>
         */
        @NameInMap("ListValue")
        public String listValue;

        @NameInMap("WhiteListValue")
        public java.util.List<String> whiteListValue;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("WhiteType")
        public Long whiteType;

        public static DescribeUserIPSWhitelistResponseBodyWhitelists build(java.util.Map<String, ?> map) throws Exception {
            DescribeUserIPSWhitelistResponseBodyWhitelists self = new DescribeUserIPSWhitelistResponseBodyWhitelists();
            return TeaModel.build(map, self);
        }

        public DescribeUserIPSWhitelistResponseBodyWhitelists setDirection(Long direction) {
            this.direction = direction;
            return this;
        }
        public Long getDirection() {
            return this.direction;
        }

        public DescribeUserIPSWhitelistResponseBodyWhitelists setListType(Long listType) {
            this.listType = listType;
            return this;
        }
        public Long getListType() {
            return this.listType;
        }

        public DescribeUserIPSWhitelistResponseBodyWhitelists setListValue(String listValue) {
            this.listValue = listValue;
            return this;
        }
        public String getListValue() {
            return this.listValue;
        }

        public DescribeUserIPSWhitelistResponseBodyWhitelists setWhiteListValue(java.util.List<String> whiteListValue) {
            this.whiteListValue = whiteListValue;
            return this;
        }
        public java.util.List<String> getWhiteListValue() {
            return this.whiteListValue;
        }

        public DescribeUserIPSWhitelistResponseBodyWhitelists setWhiteType(Long whiteType) {
            this.whiteType = whiteType;
            return this;
        }
        public Long getWhiteType() {
            return this.whiteType;
        }

    }

}
