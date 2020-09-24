// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.microgw20200810.models;

import com.aliyun.tea.*;

public class FindAuthTicketsResponseBody extends TeaModel {
    // code
    @NameInMap("code")
    public Long code;

    // data
    @NameInMap("data")
    public FindAuthTicketsResponseBodyData data;

    // message
    @NameInMap("message")
    public String message;

    public static FindAuthTicketsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        FindAuthTicketsResponseBody self = new FindAuthTicketsResponseBody();
        return TeaModel.build(map, self);
    }

    public FindAuthTicketsResponseBody setCode(Long code) {
        this.code = code;
        return this;
    }
    public Long getCode() {
        return this.code;
    }

    public FindAuthTicketsResponseBody setData(FindAuthTicketsResponseBodyData data) {
        this.data = data;
        return this;
    }
    public FindAuthTicketsResponseBodyData getData() {
        return this.data;
    }

    public FindAuthTicketsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public static class FindAuthTicketsResponseBodyDataList extends TeaModel {
        // clientToken
        @NameInMap("clientToken")
        public String clientToken;

        // comment
        @NameInMap("comment")
        public String comment;

        // id
        @NameInMap("id")
        public Long id;

        // name
        @NameInMap("name")
        public String name;

        // serverKey
        @NameInMap("serverKey")
        public String serverKey;

        // ticketType
        @NameInMap("ticketType")
        public String ticketType;

        // validEndTime
        @NameInMap("validEndTime")
        public String validEndTime;

        // validStartTime
        @NameInMap("validStartTime")
        public String validStartTime;

        public static FindAuthTicketsResponseBodyDataList build(java.util.Map<String, ?> map) throws Exception {
            FindAuthTicketsResponseBodyDataList self = new FindAuthTicketsResponseBodyDataList();
            return TeaModel.build(map, self);
        }

        public FindAuthTicketsResponseBodyDataList setClientToken(String clientToken) {
            this.clientToken = clientToken;
            return this;
        }
        public String getClientToken() {
            return this.clientToken;
        }

        public FindAuthTicketsResponseBodyDataList setComment(String comment) {
            this.comment = comment;
            return this;
        }
        public String getComment() {
            return this.comment;
        }

        public FindAuthTicketsResponseBodyDataList setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public FindAuthTicketsResponseBodyDataList setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public FindAuthTicketsResponseBodyDataList setServerKey(String serverKey) {
            this.serverKey = serverKey;
            return this;
        }
        public String getServerKey() {
            return this.serverKey;
        }

        public FindAuthTicketsResponseBodyDataList setTicketType(String ticketType) {
            this.ticketType = ticketType;
            return this;
        }
        public String getTicketType() {
            return this.ticketType;
        }

        public FindAuthTicketsResponseBodyDataList setValidEndTime(String validEndTime) {
            this.validEndTime = validEndTime;
            return this;
        }
        public String getValidEndTime() {
            return this.validEndTime;
        }

        public FindAuthTicketsResponseBodyDataList setValidStartTime(String validStartTime) {
            this.validStartTime = validStartTime;
            return this;
        }
        public String getValidStartTime() {
            return this.validStartTime;
        }

    }

    public static class FindAuthTicketsResponseBodyData extends TeaModel {
        // list
        @NameInMap("list")
        public java.util.List<FindAuthTicketsResponseBodyDataList> list;

        // totalCount
        @NameInMap("totalCount")
        public Long totalCount;

        public static FindAuthTicketsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            FindAuthTicketsResponseBodyData self = new FindAuthTicketsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public FindAuthTicketsResponseBodyData setList(java.util.List<FindAuthTicketsResponseBodyDataList> list) {
            this.list = list;
            return this;
        }
        public java.util.List<FindAuthTicketsResponseBodyDataList> getList() {
            return this.list;
        }

        public FindAuthTicketsResponseBodyData setTotalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Long getTotalCount() {
            return this.totalCount;
        }

    }

}
