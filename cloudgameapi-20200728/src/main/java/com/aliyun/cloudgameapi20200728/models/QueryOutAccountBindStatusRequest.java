// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudgameapi20200728.models;

import com.aliyun.tea.*;

public class QueryOutAccountBindStatusRequest extends TeaModel {
    @NameInMap("AccountDomain")
    public String accountDomain;

    @NameInMap("AccountId")
    public String accountId;

    @NameInMap("GameId")
    public String gameId;

    public static QueryOutAccountBindStatusRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryOutAccountBindStatusRequest self = new QueryOutAccountBindStatusRequest();
        return TeaModel.build(map, self);
    }

    public QueryOutAccountBindStatusRequest setAccountDomain(String accountDomain) {
        this.accountDomain = accountDomain;
        return this;
    }
    public String getAccountDomain() {
        return this.accountDomain;
    }

    public QueryOutAccountBindStatusRequest setAccountId(String accountId) {
        this.accountId = accountId;
        return this;
    }
    public String getAccountId() {
        return this.accountId;
    }

    public QueryOutAccountBindStatusRequest setGameId(String gameId) {
        this.gameId = gameId;
        return this;
    }
    public String getGameId() {
        return this.gameId;
    }

}
