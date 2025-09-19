// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fc20230330.models;

import com.aliyun.tea.*;

public class ListSessionsOutput extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>MTIzNCNhYmM=</p>
     */
    @NameInMap("nextToken")
    public String nextToken;

    @NameInMap("sessions")
    public java.util.List<Session> sessions;

    public static ListSessionsOutput build(java.util.Map<String, ?> map) throws Exception {
        ListSessionsOutput self = new ListSessionsOutput();
        return TeaModel.build(map, self);
    }

    public ListSessionsOutput setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListSessionsOutput setSessions(java.util.List<Session> sessions) {
        this.sessions = sessions;
        return this;
    }
    public java.util.List<Session> getSessions() {
        return this.sessions;
    }

}
