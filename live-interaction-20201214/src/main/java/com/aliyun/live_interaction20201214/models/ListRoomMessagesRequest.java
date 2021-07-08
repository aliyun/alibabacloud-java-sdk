// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live_interaction20201214.models;

import com.aliyun.tea.*;

public class ListRoomMessagesRequest extends TeaModel {
    // 请求参数的结构体。
    @NameInMap("Request")
    public ListRoomMessagesRequestRequest request;

    public static ListRoomMessagesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListRoomMessagesRequest self = new ListRoomMessagesRequest();
        return TeaModel.build(map, self);
    }

    public ListRoomMessagesRequest setRequest(ListRoomMessagesRequestRequest request) {
        this.request = request;
        return this;
    }
    public ListRoomMessagesRequestRequest getRequest() {
        return this.request;
    }

    public static class ListRoomMessagesRequestRequest extends TeaModel {
        // 应用的appKey。
        @NameInMap("Domain")
        public String domain;

        // 房间ID，由调用CreateRoom时返回。
        @NameInMap("RoomId")
        public String roomId;

        // 要查询的消息的类型,请传递100000以上的整数，如果不传，则默认拉取全部类型的消息。
        @NameInMap("SubType")
        public Integer subType;

        // 分页查询时的页数，从1开始，每次分页查询时加1。
        @NameInMap("PageNumber")
        public Integer pageNumber;

        // 分页查询时的请求大小，要求大于0，且最大不得超过100。
        @NameInMap("PageSize")
        public Integer pageSize;

        public static ListRoomMessagesRequestRequest build(java.util.Map<String, ?> map) throws Exception {
            ListRoomMessagesRequestRequest self = new ListRoomMessagesRequestRequest();
            return TeaModel.build(map, self);
        }

        public ListRoomMessagesRequestRequest setDomain(String domain) {
            this.domain = domain;
            return this;
        }
        public String getDomain() {
            return this.domain;
        }

        public ListRoomMessagesRequestRequest setRoomId(String roomId) {
            this.roomId = roomId;
            return this;
        }
        public String getRoomId() {
            return this.roomId;
        }

        public ListRoomMessagesRequestRequest setSubType(Integer subType) {
            this.subType = subType;
            return this;
        }
        public Integer getSubType() {
            return this.subType;
        }

        public ListRoomMessagesRequestRequest setPageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }
        public Integer getPageNumber() {
            return this.pageNumber;
        }

        public ListRoomMessagesRequestRequest setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

    }

}
