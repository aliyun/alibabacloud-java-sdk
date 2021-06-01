// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imp_room20210515.models;

import com.aliyun.tea.*;

public class GetRoomListResponseBody extends TeaModel {
    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    // 业务结果
    @NameInMap("Result")
    public GetRoomListResponseBodyResult result;

    // 请求是否成功
    @NameInMap("ResponseSuccess")
    public Boolean responseSuccess;

    // 错误码
    @NameInMap("ErrorCode")
    public String errorCode;

    // 错误信息
    @NameInMap("ErrorMsg")
    public String errorMsg;

    public static GetRoomListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetRoomListResponseBody self = new GetRoomListResponseBody();
        return TeaModel.build(map, self);
    }

    public GetRoomListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetRoomListResponseBody setResult(GetRoomListResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public GetRoomListResponseBodyResult getResult() {
        return this.result;
    }

    public GetRoomListResponseBody setResponseSuccess(Boolean responseSuccess) {
        this.responseSuccess = responseSuccess;
        return this;
    }
    public Boolean getResponseSuccess() {
        return this.responseSuccess;
    }

    public GetRoomListResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public GetRoomListResponseBody setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
        return this;
    }
    public String getErrorMsg() {
        return this.errorMsg;
    }

    public static class GetRoomListResponseBodyResultRoomInfoList extends TeaModel {
        // 房间id
        @NameInMap("RoomId")
        public String roomId;

        // 房间标题名字
        @NameInMap("Title")
        public String title;

        // 房主的用户id
        @NameInMap("OwnerId")
        public String ownerId;

        // 业务类型
        @NameInMap("BizType")
        public String bizType;

        // 应用id，同appId
        @NameInMap("Domain")
        public String domain;

        public static GetRoomListResponseBodyResultRoomInfoList build(java.util.Map<String, ?> map) throws Exception {
            GetRoomListResponseBodyResultRoomInfoList self = new GetRoomListResponseBodyResultRoomInfoList();
            return TeaModel.build(map, self);
        }

        public GetRoomListResponseBodyResultRoomInfoList setRoomId(String roomId) {
            this.roomId = roomId;
            return this;
        }
        public String getRoomId() {
            return this.roomId;
        }

        public GetRoomListResponseBodyResultRoomInfoList setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

        public GetRoomListResponseBodyResultRoomInfoList setOwnerId(String ownerId) {
            this.ownerId = ownerId;
            return this;
        }
        public String getOwnerId() {
            return this.ownerId;
        }

        public GetRoomListResponseBodyResultRoomInfoList setBizType(String bizType) {
            this.bizType = bizType;
            return this;
        }
        public String getBizType() {
            return this.bizType;
        }

        public GetRoomListResponseBodyResultRoomInfoList setDomain(String domain) {
            this.domain = domain;
            return this;
        }
        public String getDomain() {
            return this.domain;
        }

    }

    public static class GetRoomListResponseBodyResult extends TeaModel {
        // 租户下的房间列表总数
        @NameInMap("Total")
        public Long total;

        // 是否还有下一页房间列表
        @NameInMap("HasMore")
        public Boolean hasMore;

        // 租户下的房间列表基础信息
        @NameInMap("RoomInfoList")
        public java.util.List<GetRoomListResponseBodyResultRoomInfoList> roomInfoList;

        public static GetRoomListResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            GetRoomListResponseBodyResult self = new GetRoomListResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public GetRoomListResponseBodyResult setTotal(Long total) {
            this.total = total;
            return this;
        }
        public Long getTotal() {
            return this.total;
        }

        public GetRoomListResponseBodyResult setHasMore(Boolean hasMore) {
            this.hasMore = hasMore;
            return this;
        }
        public Boolean getHasMore() {
            return this.hasMore;
        }

        public GetRoomListResponseBodyResult setRoomInfoList(java.util.List<GetRoomListResponseBodyResultRoomInfoList> roomInfoList) {
            this.roomInfoList = roomInfoList;
            return this;
        }
        public java.util.List<GetRoomListResponseBodyResultRoomInfoList> getRoomInfoList() {
            return this.roomInfoList;
        }

    }

}
