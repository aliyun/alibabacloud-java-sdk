// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.microgw20200810.models;

import com.aliyun.tea.*;

public class UpdateAuthTicketRequest extends TeaModel {
    // comment
    @NameInMap("comment")
    public String comment;

    // id
    @NameInMap("id")
    public Long id;

    public static UpdateAuthTicketRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateAuthTicketRequest self = new UpdateAuthTicketRequest();
        return TeaModel.build(map, self);
    }

    public UpdateAuthTicketRequest setComment(String comment) {
        this.comment = comment;
        return this;
    }
    public String getComment() {
        return this.comment;
    }

    public UpdateAuthTicketRequest setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

}
