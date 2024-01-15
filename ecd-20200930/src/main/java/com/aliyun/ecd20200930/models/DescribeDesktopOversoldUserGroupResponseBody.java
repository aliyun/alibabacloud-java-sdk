// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class DescribeDesktopOversoldUserGroupResponseBody extends TeaModel {
    @NameInMap("Count")
    public Integer count;

    @NameInMap("Data")
    public java.util.List<DescribeDesktopOversoldUserGroupResponseBodyData> data;

    @NameInMap("NextToken")
    public String nextToken;

    @NameInMap("RequestId")
    public String requestId;

    public static DescribeDesktopOversoldUserGroupResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDesktopOversoldUserGroupResponseBody self = new DescribeDesktopOversoldUserGroupResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDesktopOversoldUserGroupResponseBody setCount(Integer count) {
        this.count = count;
        return this;
    }
    public Integer getCount() {
        return this.count;
    }

    public DescribeDesktopOversoldUserGroupResponseBody setData(java.util.List<DescribeDesktopOversoldUserGroupResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<DescribeDesktopOversoldUserGroupResponseBodyData> getData() {
        return this.data;
    }

    public DescribeDesktopOversoldUserGroupResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public DescribeDesktopOversoldUserGroupResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeDesktopOversoldUserGroupResponseBodyData extends TeaModel {
        @NameInMap("ImageId")
        public String imageId;

        @NameInMap("Name")
        public String name;

        @NameInMap("OversoldGroupId")
        public String oversoldGroupId;

        @NameInMap("PolicyGroupId")
        public String policyGroupId;

        @NameInMap("UserGroupId")
        public String userGroupId;

        public static DescribeDesktopOversoldUserGroupResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DescribeDesktopOversoldUserGroupResponseBodyData self = new DescribeDesktopOversoldUserGroupResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DescribeDesktopOversoldUserGroupResponseBodyData setImageId(String imageId) {
            this.imageId = imageId;
            return this;
        }
        public String getImageId() {
            return this.imageId;
        }

        public DescribeDesktopOversoldUserGroupResponseBodyData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeDesktopOversoldUserGroupResponseBodyData setOversoldGroupId(String oversoldGroupId) {
            this.oversoldGroupId = oversoldGroupId;
            return this;
        }
        public String getOversoldGroupId() {
            return this.oversoldGroupId;
        }

        public DescribeDesktopOversoldUserGroupResponseBodyData setPolicyGroupId(String policyGroupId) {
            this.policyGroupId = policyGroupId;
            return this;
        }
        public String getPolicyGroupId() {
            return this.policyGroupId;
        }

        public DescribeDesktopOversoldUserGroupResponseBodyData setUserGroupId(String userGroupId) {
            this.userGroupId = userGroupId;
            return this;
        }
        public String getUserGroupId() {
            return this.userGroupId;
        }

    }

}
