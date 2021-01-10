// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class DescribeRoomKickoutUserListResponseBody extends TeaModel {
    @NameInMap("TotalNum")
    public Integer totalNum;

    @NameInMap("TotalPage")
    public Integer totalPage;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("UserList")
    public java.util.List<DescribeRoomKickoutUserListResponseBodyUserList> userList;

    public static DescribeRoomKickoutUserListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeRoomKickoutUserListResponseBody self = new DescribeRoomKickoutUserListResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeRoomKickoutUserListResponseBody setTotalNum(Integer totalNum) {
        this.totalNum = totalNum;
        return this;
    }
    public Integer getTotalNum() {
        return this.totalNum;
    }

    public DescribeRoomKickoutUserListResponseBody setTotalPage(Integer totalPage) {
        this.totalPage = totalPage;
        return this;
    }
    public Integer getTotalPage() {
        return this.totalPage;
    }

    public DescribeRoomKickoutUserListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeRoomKickoutUserListResponseBody setUserList(java.util.List<DescribeRoomKickoutUserListResponseBodyUserList> userList) {
        this.userList = userList;
        return this;
    }
    public java.util.List<DescribeRoomKickoutUserListResponseBodyUserList> getUserList() {
        return this.userList;
    }

    public static class DescribeRoomKickoutUserListResponseBodyUserList extends TeaModel {
        @NameInMap("OpEndTime")
        public String opEndTime;

        @NameInMap("AppUid")
        public String appUid;

        @NameInMap("OpStartTime")
        public String opStartTime;

        public static DescribeRoomKickoutUserListResponseBodyUserList build(java.util.Map<String, ?> map) throws Exception {
            DescribeRoomKickoutUserListResponseBodyUserList self = new DescribeRoomKickoutUserListResponseBodyUserList();
            return TeaModel.build(map, self);
        }

        public DescribeRoomKickoutUserListResponseBodyUserList setOpEndTime(String opEndTime) {
            this.opEndTime = opEndTime;
            return this;
        }
        public String getOpEndTime() {
            return this.opEndTime;
        }

        public DescribeRoomKickoutUserListResponseBodyUserList setAppUid(String appUid) {
            this.appUid = appUid;
            return this;
        }
        public String getAppUid() {
            return this.appUid;
        }

        public DescribeRoomKickoutUserListResponseBodyUserList setOpStartTime(String opStartTime) {
            this.opStartTime = opStartTime;
            return this;
        }
        public String getOpStartTime() {
            return this.opStartTime;
        }

    }

}
