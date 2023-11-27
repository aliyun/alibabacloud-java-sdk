// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live_interaction20201214.models;

import com.aliyun.tea.*;

public class ListRoomMessagesRequest extends TeaModel {
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
        @NameInMap("Domain")
        public String domain;

        @NameInMap("PageNumber")
        public Integer pageNumber;

        @NameInMap("PageSize")
        public Integer pageSize;

        @NameInMap("RoomId")
        public String roomId;

        @NameInMap("SubType")
        public Integer subType;

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

    }

}
