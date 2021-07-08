// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live_interaction20201214.models;

import com.aliyun.tea.*;

public class ListRoomUsersRequest extends TeaModel {
    // 请求参数的结构体。
    @NameInMap("Request")
    public ListRoomUsersRequestRequest request;

    public static ListRoomUsersRequest build(java.util.Map<String, ?> map) throws Exception {
        ListRoomUsersRequest self = new ListRoomUsersRequest();
        return TeaModel.build(map, self);
    }

    public ListRoomUsersRequest setRequest(ListRoomUsersRequestRequest request) {
        this.request = request;
        return this;
    }
    public ListRoomUsersRequestRequest getRequest() {
        return this.request;
    }

    public static class ListRoomUsersRequestRequest extends TeaModel {
        // 应用的appKey。
        @NameInMap("Domain")
        public String domain;

        // 房间ID，由调用CreateRoom时返回。
        @NameInMap("RoomId")
        public String roomId;

        // 分页查询时的页数，从1开始，每次分页查询时加1。
        @NameInMap("PageNumber")
        public Integer pageNumber;

        // 分页查询时的请求大小，要求大于0，最大不得超过100。
        @NameInMap("PageSize")
        public Integer pageSize;

        public static ListRoomUsersRequestRequest build(java.util.Map<String, ?> map) throws Exception {
            ListRoomUsersRequestRequest self = new ListRoomUsersRequestRequest();
            return TeaModel.build(map, self);
        }

        public ListRoomUsersRequestRequest setDomain(String domain) {
            this.domain = domain;
            return this;
        }
        public String getDomain() {
            return this.domain;
        }

        public ListRoomUsersRequestRequest setRoomId(String roomId) {
            this.roomId = roomId;
            return this;
        }
        public String getRoomId() {
            return this.roomId;
        }

        public ListRoomUsersRequestRequest setPageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }
        public Integer getPageNumber() {
            return this.pageNumber;
        }

        public ListRoomUsersRequestRequest setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

    }

}
