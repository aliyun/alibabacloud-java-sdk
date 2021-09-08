// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudgameapi20200728.models;

import com.aliyun.tea.*;

public class ListBoughtGamesRequest extends TeaModel {
    @NameInMap("AccountId")
    public String accountId;

    @NameInMap("AccountDomain")
    public String accountDomain;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    public static ListBoughtGamesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListBoughtGamesRequest self = new ListBoughtGamesRequest();
        return TeaModel.build(map, self);
    }

    public ListBoughtGamesRequest setAccountId(String accountId) {
        this.accountId = accountId;
        return this;
    }
    public String getAccountId() {
        return this.accountId;
    }

    public ListBoughtGamesRequest setAccountDomain(String accountDomain) {
        this.accountDomain = accountDomain;
        return this;
    }
    public String getAccountDomain() {
        return this.accountDomain;
    }

    public ListBoughtGamesRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListBoughtGamesRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

}
