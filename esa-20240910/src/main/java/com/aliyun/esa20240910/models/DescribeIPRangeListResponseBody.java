// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class DescribeIPRangeListResponseBody extends TeaModel {
    @NameInMap("Content")
    public java.util.List<DescribeIPRangeListResponseBodyContent> content;

    /**
     * <strong>example:</strong>
     * <p>CB1A380B-09F0-41BB-A198-72F8FD6DA2FE</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeIPRangeListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeIPRangeListResponseBody self = new DescribeIPRangeListResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeIPRangeListResponseBody setContent(java.util.List<DescribeIPRangeListResponseBodyContent> content) {
        this.content = content;
        return this;
    }
    public java.util.List<DescribeIPRangeListResponseBodyContent> getContent() {
        return this.content;
    }

    public DescribeIPRangeListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeIPRangeListResponseBodyContent extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>172.16.0.0/12</p>
         */
        @NameInMap("Cidr")
        public String cidr;

        /**
         * <strong>example:</strong>
         * <p>IPv4</p>
         */
        @NameInMap("IpType")
        public String ipType;

        public static DescribeIPRangeListResponseBodyContent build(java.util.Map<String, ?> map) throws Exception {
            DescribeIPRangeListResponseBodyContent self = new DescribeIPRangeListResponseBodyContent();
            return TeaModel.build(map, self);
        }

        public DescribeIPRangeListResponseBodyContent setCidr(String cidr) {
            this.cidr = cidr;
            return this;
        }
        public String getCidr() {
            return this.cidr;
        }

        public DescribeIPRangeListResponseBodyContent setIpType(String ipType) {
            this.ipType = ipType;
            return this;
        }
        public String getIpType() {
            return this.ipType;
        }

    }

}
