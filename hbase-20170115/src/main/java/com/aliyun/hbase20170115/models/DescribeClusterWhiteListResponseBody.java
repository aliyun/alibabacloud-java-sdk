// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hbase20170115.models;

import com.aliyun.tea.*;

public class DescribeClusterWhiteListResponseBody extends TeaModel {
    @NameInMap("GroupItems")
    public DescribeClusterWhiteListResponseBodyGroupItems groupItems;

    @NameInMap("RequestId")
    public String requestId;

    public static DescribeClusterWhiteListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeClusterWhiteListResponseBody self = new DescribeClusterWhiteListResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeClusterWhiteListResponseBody setGroupItems(DescribeClusterWhiteListResponseBodyGroupItems groupItems) {
        this.groupItems = groupItems;
        return this;
    }
    public DescribeClusterWhiteListResponseBodyGroupItems getGroupItems() {
        return this.groupItems;
    }

    public DescribeClusterWhiteListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeClusterWhiteListResponseBodyGroupItems extends TeaModel {
        @NameInMap("WhiteIp")
        public java.util.List<String> whiteIp;

        public static DescribeClusterWhiteListResponseBodyGroupItems build(java.util.Map<String, ?> map) throws Exception {
            DescribeClusterWhiteListResponseBodyGroupItems self = new DescribeClusterWhiteListResponseBodyGroupItems();
            return TeaModel.build(map, self);
        }

        public DescribeClusterWhiteListResponseBodyGroupItems setWhiteIp(java.util.List<String> whiteIp) {
            this.whiteIp = whiteIp;
            return this;
        }
        public java.util.List<String> getWhiteIp() {
            return this.whiteIp;
        }

    }

}
