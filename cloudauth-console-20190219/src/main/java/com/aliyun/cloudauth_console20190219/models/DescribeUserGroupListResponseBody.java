// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth_console20190219.models;

import com.aliyun.tea.*;

public class DescribeUserGroupListResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Data")
    public java.util.List<DescribeUserGroupListResponseBodyData> data;

    @NameInMap("Success")
    public Boolean success;

    public static DescribeUserGroupListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeUserGroupListResponseBody self = new DescribeUserGroupListResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeUserGroupListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeUserGroupListResponseBody setData(java.util.List<DescribeUserGroupListResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<DescribeUserGroupListResponseBodyData> getData() {
        return this.data;
    }

    public DescribeUserGroupListResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class DescribeUserGroupListResponseBodyData extends TeaModel {
        @NameInMap("GroupName")
        public String groupName;

        @NameInMap("GroupUserCount")
        public Integer groupUserCount;

        @NameInMap("Id")
        public Long id;

        public static DescribeUserGroupListResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DescribeUserGroupListResponseBodyData self = new DescribeUserGroupListResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DescribeUserGroupListResponseBodyData setGroupName(String groupName) {
            this.groupName = groupName;
            return this;
        }
        public String getGroupName() {
            return this.groupName;
        }

        public DescribeUserGroupListResponseBodyData setGroupUserCount(Integer groupUserCount) {
            this.groupUserCount = groupUserCount;
            return this;
        }
        public Integer getGroupUserCount() {
            return this.groupUserCount;
        }

        public DescribeUserGroupListResponseBodyData setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

    }

}
