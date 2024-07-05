// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20200930.models;

import com.aliyun.tea.*;

public class ListTriggersResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>MTIzNDU2Nzg6aW1tdGVzdDpleGFtcGxlYnVja2V0OmRhdGFzZXQwMDE6b3NzOi8vZXhhbXBsZWJ1Y2tldC9zYW1wbGVvYmplY3QxLmpwZw==</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <strong>example:</strong>
     * <p>F480BFAF-E778-5079-93AD-1E4631******</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Triggers")
    public java.util.List<DataIngestion> triggers;

    public static ListTriggersResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListTriggersResponseBody self = new ListTriggersResponseBody();
        return TeaModel.build(map, self);
    }

    public ListTriggersResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListTriggersResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListTriggersResponseBody setTriggers(java.util.List<DataIngestion> triggers) {
        this.triggers = triggers;
        return this;
    }
    public java.util.List<DataIngestion> getTriggers() {
        return this.triggers;
    }

}
