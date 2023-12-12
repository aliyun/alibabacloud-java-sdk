// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hitsdb20200615.models;

import com.aliyun.tea.*;

public class ListLdpsComputeGroupsResponseBody extends TeaModel {
    @NameInMap("GroupList")
    public java.util.List<ListLdpsComputeGroupsResponseBodyGroupList> groupList;

    @NameInMap("RequestId")
    public String requestId;

    public static ListLdpsComputeGroupsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListLdpsComputeGroupsResponseBody self = new ListLdpsComputeGroupsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListLdpsComputeGroupsResponseBody setGroupList(java.util.List<ListLdpsComputeGroupsResponseBodyGroupList> groupList) {
        this.groupList = groupList;
        return this;
    }
    public java.util.List<ListLdpsComputeGroupsResponseBodyGroupList> getGroupList() {
        return this.groupList;
    }

    public ListLdpsComputeGroupsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListLdpsComputeGroupsResponseBodyGroupList extends TeaModel {
        @NameInMap("GroupName")
        public String groupName;

        @NameInMap("Properties")
        public java.util.Map<String, ?> properties;

        public static ListLdpsComputeGroupsResponseBodyGroupList build(java.util.Map<String, ?> map) throws Exception {
            ListLdpsComputeGroupsResponseBodyGroupList self = new ListLdpsComputeGroupsResponseBodyGroupList();
            return TeaModel.build(map, self);
        }

        public ListLdpsComputeGroupsResponseBodyGroupList setGroupName(String groupName) {
            this.groupName = groupName;
            return this;
        }
        public String getGroupName() {
            return this.groupName;
        }

        public ListLdpsComputeGroupsResponseBodyGroupList setProperties(java.util.Map<String, ?> properties) {
            this.properties = properties;
            return this;
        }
        public java.util.Map<String, ?> getProperties() {
            return this.properties;
        }

    }

}
