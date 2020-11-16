// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class DescribeRoomKickoutUserListResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("TotalNum")
    @Validation(required = true)
    public Integer totalNum;

    @NameInMap("TotalPage")
    @Validation(required = true)
    public Integer totalPage;

    @NameInMap("UserList")
    @Validation(required = true)
    public java.util.List<DescribeRoomKickoutUserListResponseUserList> userList;

    public static DescribeRoomKickoutUserListResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeRoomKickoutUserListResponse self = new DescribeRoomKickoutUserListResponse();
        return TeaModel.build(map, self);
    }

    public DescribeRoomKickoutUserListResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeRoomKickoutUserListResponse setTotalNum(Integer totalNum) {
        this.totalNum = totalNum;
        return this;
    }
    public Integer getTotalNum() {
        return this.totalNum;
    }

    public DescribeRoomKickoutUserListResponse setTotalPage(Integer totalPage) {
        this.totalPage = totalPage;
        return this;
    }
    public Integer getTotalPage() {
        return this.totalPage;
    }

    public DescribeRoomKickoutUserListResponse setUserList(java.util.List<DescribeRoomKickoutUserListResponseUserList> userList) {
        this.userList = userList;
        return this;
    }
    public java.util.List<DescribeRoomKickoutUserListResponseUserList> getUserList() {
        return this.userList;
    }

    public static class DescribeRoomKickoutUserListResponseUserList extends TeaModel {
        @NameInMap("AppUid")
        @Validation(required = true)
        public String appUid;

        @NameInMap("OpStartTime")
        @Validation(required = true)
        public String opStartTime;

        @NameInMap("OpEndTime")
        @Validation(required = true)
        public String opEndTime;

        public static DescribeRoomKickoutUserListResponseUserList build(java.util.Map<String, ?> map) throws Exception {
            DescribeRoomKickoutUserListResponseUserList self = new DescribeRoomKickoutUserListResponseUserList();
            return TeaModel.build(map, self);
        }

        public DescribeRoomKickoutUserListResponseUserList setAppUid(String appUid) {
            this.appUid = appUid;
            return this;
        }
        public String getAppUid() {
            return this.appUid;
        }

        public DescribeRoomKickoutUserListResponseUserList setOpStartTime(String opStartTime) {
            this.opStartTime = opStartTime;
            return this;
        }
        public String getOpStartTime() {
            return this.opStartTime;
        }

        public DescribeRoomKickoutUserListResponseUserList setOpEndTime(String opEndTime) {
            this.opEndTime = opEndTime;
            return this;
        }
        public String getOpEndTime() {
            return this.opEndTime;
        }

    }

}
