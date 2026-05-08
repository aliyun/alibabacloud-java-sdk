// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.marketing_event20210101.models;

import com.aliyun.tea.*;

public class QueryQwenConferenceSgTicketPopRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>bPbXgB8nSzI9UIbdqAWaOhtr7T3p1Ryr</p>
     */
    @NameInMap("TicketToken")
    public String ticketToken;

    public static QueryQwenConferenceSgTicketPopRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryQwenConferenceSgTicketPopRequest self = new QueryQwenConferenceSgTicketPopRequest();
        return TeaModel.build(map, self);
    }

    public QueryQwenConferenceSgTicketPopRequest setTicketToken(String ticketToken) {
        this.ticketToken = ticketToken;
        return this;
    }
    public String getTicketToken() {
        return this.ticketToken;
    }

}
