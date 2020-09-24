// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.microgw20200810.models;

import com.aliyun.tea.*;

public class UpdateAuthTicketRequest extends TeaModel {
    // A short description of struct
    @NameInMap("data")
    public UpdateAuthTicketRequestData data;

    public static UpdateAuthTicketRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateAuthTicketRequest self = new UpdateAuthTicketRequest();
        return TeaModel.build(map, self);
    }

    public UpdateAuthTicketRequest setData(UpdateAuthTicketRequestData data) {
        this.data = data;
        return this;
    }
    public UpdateAuthTicketRequestData getData() {
        return this.data;
    }

    public static class UpdateAuthTicketRequestData extends TeaModel {
        // comment
        @NameInMap("comment")
        public String comment;

        // id
        @NameInMap("id")
        public Long id;

        public static UpdateAuthTicketRequestData build(java.util.Map<String, ?> map) throws Exception {
            UpdateAuthTicketRequestData self = new UpdateAuthTicketRequestData();
            return TeaModel.build(map, self);
        }

        public UpdateAuthTicketRequestData setComment(String comment) {
            this.comment = comment;
            return this;
        }
        public String getComment() {
            return this.comment;
        }

        public UpdateAuthTicketRequestData setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

    }

}
