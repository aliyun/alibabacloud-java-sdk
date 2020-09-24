// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.microgw20200810.models;

import com.aliyun.tea.*;

public class CreateAuthTicketRequest extends TeaModel {
    // AuthTicketCreationDTO
    @NameInMap("data")
    public CreateAuthTicketRequestData data;

    public static CreateAuthTicketRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateAuthTicketRequest self = new CreateAuthTicketRequest();
        return TeaModel.build(map, self);
    }

    public CreateAuthTicketRequest setData(CreateAuthTicketRequestData data) {
        this.data = data;
        return this;
    }
    public CreateAuthTicketRequestData getData() {
        return this.data;
    }

    public static class CreateAuthTicketRequestData extends TeaModel {
        // comment
        @NameInMap("comment")
        public String comment;

        // gatewayId
        @NameInMap("gatewayId")
        public Long gatewayId;

        // name
        @NameInMap("name")
        public String name;

        // ticketType
        @NameInMap("ticketType")
        public String ticketType;

        @NameInMap("validDuration")
        public Long validDuration;

        public static CreateAuthTicketRequestData build(java.util.Map<String, ?> map) throws Exception {
            CreateAuthTicketRequestData self = new CreateAuthTicketRequestData();
            return TeaModel.build(map, self);
        }

        public CreateAuthTicketRequestData setComment(String comment) {
            this.comment = comment;
            return this;
        }
        public String getComment() {
            return this.comment;
        }

        public CreateAuthTicketRequestData setGatewayId(Long gatewayId) {
            this.gatewayId = gatewayId;
            return this;
        }
        public Long getGatewayId() {
            return this.gatewayId;
        }

        public CreateAuthTicketRequestData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public CreateAuthTicketRequestData setTicketType(String ticketType) {
            this.ticketType = ticketType;
            return this;
        }
        public String getTicketType() {
            return this.ticketType;
        }

        public CreateAuthTicketRequestData setValidDuration(Long validDuration) {
            this.validDuration = validDuration;
            return this;
        }
        public Long getValidDuration() {
            return this.validDuration;
        }

    }

}
