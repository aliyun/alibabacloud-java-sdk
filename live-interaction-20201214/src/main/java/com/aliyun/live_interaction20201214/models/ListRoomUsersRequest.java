// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live_interaction20201214.models;

import com.aliyun.tea.*;

public class ListRoomUsersRequest extends TeaModel {
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
        @NameInMap("Domain")
        public String domain;

        @NameInMap("PageNumber")
        public Integer pageNumber;

        @NameInMap("PageSize")
        public Integer pageSize;

        @NameInMap("RoomId")
        public String roomId;

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

        public ListRoomUsersRequestRequest setRoomId(String roomId) {
            this.roomId = roomId;
            return this;
        }
        public String getRoomId() {
            return this.roomId;
        }

    }

}
