// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dt_oc_info20200401.models;

import com.aliyun.tea.*;

public class SearchCorpByKeywordRequest extends TeaModel {
    @NameInMap("Account")
    public String account;

    @NameInMap("Keyword")
    public String keyword;

    @NameInMap("Limit")
    public Integer limit;

    @NameInMap("Offset")
    public Integer offset;

    public static SearchCorpByKeywordRequest build(java.util.Map<String, ?> map) throws Exception {
        SearchCorpByKeywordRequest self = new SearchCorpByKeywordRequest();
        return TeaModel.build(map, self);
    }

    public SearchCorpByKeywordRequest setAccount(String account) {
        this.account = account;
        return this;
    }
    public String getAccount() {
        return this.account;
    }

    public SearchCorpByKeywordRequest setKeyword(String keyword) {
        this.keyword = keyword;
        return this;
    }
    public String getKeyword() {
        return this.keyword;
    }

    public SearchCorpByKeywordRequest setLimit(Integer limit) {
        this.limit = limit;
        return this;
    }
    public Integer getLimit() {
        return this.limit;
    }

    public SearchCorpByKeywordRequest setOffset(Integer offset) {
        this.offset = offset;
        return this;
    }
    public Integer getOffset() {
        return this.offset;
    }

}
