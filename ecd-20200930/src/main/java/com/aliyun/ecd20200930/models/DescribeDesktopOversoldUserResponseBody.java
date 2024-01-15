// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class DescribeDesktopOversoldUserResponseBody extends TeaModel {
    @NameInMap("Count")
    public Integer count;

    @NameInMap("Data")
    public java.util.List<DescribeDesktopOversoldUserResponseBodyData> data;

    @NameInMap("NextToken")
    public String nextToken;

    @NameInMap("RequestId")
    public String requestId;

    public static DescribeDesktopOversoldUserResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDesktopOversoldUserResponseBody self = new DescribeDesktopOversoldUserResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDesktopOversoldUserResponseBody setCount(Integer count) {
        this.count = count;
        return this;
    }
    public Integer getCount() {
        return this.count;
    }

    public DescribeDesktopOversoldUserResponseBody setData(java.util.List<DescribeDesktopOversoldUserResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<DescribeDesktopOversoldUserResponseBodyData> getData() {
        return this.data;
    }

    public DescribeDesktopOversoldUserResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public DescribeDesktopOversoldUserResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeDesktopOversoldUserResponseBodyData extends TeaModel {
        @NameInMap("EndUserId")
        public String endUserId;

        @NameInMap("OversoldGroupId")
        public String oversoldGroupId;

        @NameInMap("UserDesktopId")
        public String userDesktopId;

        @NameInMap("UserGroupId")
        public String userGroupId;

        public static DescribeDesktopOversoldUserResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DescribeDesktopOversoldUserResponseBodyData self = new DescribeDesktopOversoldUserResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DescribeDesktopOversoldUserResponseBodyData setEndUserId(String endUserId) {
            this.endUserId = endUserId;
            return this;
        }
        public String getEndUserId() {
            return this.endUserId;
        }

        public DescribeDesktopOversoldUserResponseBodyData setOversoldGroupId(String oversoldGroupId) {
            this.oversoldGroupId = oversoldGroupId;
            return this;
        }
        public String getOversoldGroupId() {
            return this.oversoldGroupId;
        }

        public DescribeDesktopOversoldUserResponseBodyData setUserDesktopId(String userDesktopId) {
            this.userDesktopId = userDesktopId;
            return this;
        }
        public String getUserDesktopId() {
            return this.userDesktopId;
        }

        public DescribeDesktopOversoldUserResponseBodyData setUserGroupId(String userGroupId) {
            this.userGroupId = userGroupId;
            return this;
        }
        public String getUserGroupId() {
            return this.userGroupId;
        }

    }

}
