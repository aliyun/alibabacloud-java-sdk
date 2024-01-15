// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class DescribeUserConnectTimeResponseBody extends TeaModel {
    @NameInMap("Count")
    public Integer count;

    @NameInMap("Data")
    public java.util.List<DescribeUserConnectTimeResponseBodyData> data;

    @NameInMap("NextToken")
    public String nextToken;

    @NameInMap("RequestId")
    public String requestId;

    public static DescribeUserConnectTimeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeUserConnectTimeResponseBody self = new DescribeUserConnectTimeResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeUserConnectTimeResponseBody setCount(Integer count) {
        this.count = count;
        return this;
    }
    public Integer getCount() {
        return this.count;
    }

    public DescribeUserConnectTimeResponseBody setData(java.util.List<DescribeUserConnectTimeResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<DescribeUserConnectTimeResponseBodyData> getData() {
        return this.data;
    }

    public DescribeUserConnectTimeResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public DescribeUserConnectTimeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeUserConnectTimeResponseBodyData extends TeaModel {
        @NameInMap("EndConnectTime")
        public String endConnectTime;

        @NameInMap("EndUserId")
        public String endUserId;

        @NameInMap("OversoldGroupId")
        public String oversoldGroupId;

        @NameInMap("StartConnectTime")
        public String startConnectTime;

        @NameInMap("UserDesktopId")
        public String userDesktopId;

        @NameInMap("UserGroupId")
        public String userGroupId;

        public static DescribeUserConnectTimeResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DescribeUserConnectTimeResponseBodyData self = new DescribeUserConnectTimeResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DescribeUserConnectTimeResponseBodyData setEndConnectTime(String endConnectTime) {
            this.endConnectTime = endConnectTime;
            return this;
        }
        public String getEndConnectTime() {
            return this.endConnectTime;
        }

        public DescribeUserConnectTimeResponseBodyData setEndUserId(String endUserId) {
            this.endUserId = endUserId;
            return this;
        }
        public String getEndUserId() {
            return this.endUserId;
        }

        public DescribeUserConnectTimeResponseBodyData setOversoldGroupId(String oversoldGroupId) {
            this.oversoldGroupId = oversoldGroupId;
            return this;
        }
        public String getOversoldGroupId() {
            return this.oversoldGroupId;
        }

        public DescribeUserConnectTimeResponseBodyData setStartConnectTime(String startConnectTime) {
            this.startConnectTime = startConnectTime;
            return this;
        }
        public String getStartConnectTime() {
            return this.startConnectTime;
        }

        public DescribeUserConnectTimeResponseBodyData setUserDesktopId(String userDesktopId) {
            this.userDesktopId = userDesktopId;
            return this;
        }
        public String getUserDesktopId() {
            return this.userDesktopId;
        }

        public DescribeUserConnectTimeResponseBodyData setUserGroupId(String userGroupId) {
            this.userGroupId = userGroupId;
            return this;
        }
        public String getUserGroupId() {
            return this.userGroupId;
        }

    }

}
