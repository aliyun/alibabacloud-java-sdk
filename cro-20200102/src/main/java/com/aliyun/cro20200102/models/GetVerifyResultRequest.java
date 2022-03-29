// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cro20200102.models;

import com.aliyun.tea.*;

public class GetVerifyResultRequest extends TeaModel {
    @NameInMap("AccountId")
    public String accountId;

    @NameInMap("Biz")
    public String biz;

    @NameInMap("Properties")
    public java.util.Map<String, ?> properties;

    @NameInMap("Source")
    public String source;

    @NameInMap("TicketId")
    public String ticketId;

    public static GetVerifyResultRequest build(java.util.Map<String, ?> map) throws Exception {
        GetVerifyResultRequest self = new GetVerifyResultRequest();
        return TeaModel.build(map, self);
    }

    public GetVerifyResultRequest setAccountId(String accountId) {
        this.accountId = accountId;
        return this;
    }
    public String getAccountId() {
        return this.accountId;
    }

    public GetVerifyResultRequest setBiz(String biz) {
        this.biz = biz;
        return this;
    }
    public String getBiz() {
        return this.biz;
    }

    public GetVerifyResultRequest setProperties(java.util.Map<String, ?> properties) {
        this.properties = properties;
        return this;
    }
    public java.util.Map<String, ?> getProperties() {
        return this.properties;
    }

    public GetVerifyResultRequest setSource(String source) {
        this.source = source;
        return this;
    }
    public String getSource() {
        return this.source;
    }

    public GetVerifyResultRequest setTicketId(String ticketId) {
        this.ticketId = ticketId;
        return this;
    }
    public String getTicketId() {
        return this.ticketId;
    }

}
