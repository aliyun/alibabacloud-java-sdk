// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.microgw20200810.models;

import com.aliyun.tea.*;

public class GetAuthTicketByIdResponseBody extends TeaModel {
    // code
    @NameInMap("code")
    public Long code;

    // data
    @NameInMap("data")
    public java.util.List<GetAuthTicketByIdResponseBodyData> data;

    // message
    @NameInMap("message")
    public String message;

    public static GetAuthTicketByIdResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetAuthTicketByIdResponseBody self = new GetAuthTicketByIdResponseBody();
        return TeaModel.build(map, self);
    }

    public GetAuthTicketByIdResponseBody setCode(Long code) {
        this.code = code;
        return this;
    }
    public Long getCode() {
        return this.code;
    }

    public GetAuthTicketByIdResponseBody setData(java.util.List<GetAuthTicketByIdResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<GetAuthTicketByIdResponseBodyData> getData() {
        return this.data;
    }

    public GetAuthTicketByIdResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public static class GetAuthTicketByIdResponseBodyData extends TeaModel {
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

        public static GetAuthTicketByIdResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetAuthTicketByIdResponseBodyData self = new GetAuthTicketByIdResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetAuthTicketByIdResponseBodyData setClientToken(String clientToken) {
            this.clientToken = clientToken;
            return this;
        }
        public String getClientToken() {
            return this.clientToken;
        }

        public GetAuthTicketByIdResponseBodyData setComment(String comment) {
            this.comment = comment;
            return this;
        }
        public String getComment() {
            return this.comment;
        }

        public GetAuthTicketByIdResponseBodyData setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public GetAuthTicketByIdResponseBodyData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetAuthTicketByIdResponseBodyData setServerKey(String serverKey) {
            this.serverKey = serverKey;
            return this;
        }
        public String getServerKey() {
            return this.serverKey;
        }

        public GetAuthTicketByIdResponseBodyData setTicketType(String ticketType) {
            this.ticketType = ticketType;
            return this;
        }
        public String getTicketType() {
            return this.ticketType;
        }

        public GetAuthTicketByIdResponseBodyData setValidEndTime(String validEndTime) {
            this.validEndTime = validEndTime;
            return this;
        }
        public String getValidEndTime() {
            return this.validEndTime;
        }

        public GetAuthTicketByIdResponseBodyData setValidStartTime(String validStartTime) {
            this.validStartTime = validStartTime;
            return this;
        }
        public String getValidStartTime() {
            return this.validStartTime;
        }

    }

}
