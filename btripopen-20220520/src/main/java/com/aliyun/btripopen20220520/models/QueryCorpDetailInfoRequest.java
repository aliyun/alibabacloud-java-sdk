// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.btripopen20220520.models;

import com.aliyun.tea.*;

public class QueryCorpDetailInfoRequest extends TeaModel {
    @NameInMap("account_id")
    public String accountId;

    /**
     * <strong>example:</strong>
     * <p>btripxxxxxx</p>
     */
    @NameInMap("target_corp_id")
    public String targetCorpId;

    @NameInMap("target_third_corp_id")
    public String targetThirdCorpId;

    public static QueryCorpDetailInfoRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryCorpDetailInfoRequest self = new QueryCorpDetailInfoRequest();
        return TeaModel.build(map, self);
    }

    public QueryCorpDetailInfoRequest setAccountId(String accountId) {
        this.accountId = accountId;
        return this;
    }
    public String getAccountId() {
        return this.accountId;
    }

    public QueryCorpDetailInfoRequest setTargetCorpId(String targetCorpId) {
        this.targetCorpId = targetCorpId;
        return this;
    }
    public String getTargetCorpId() {
        return this.targetCorpId;
    }

    public QueryCorpDetailInfoRequest setTargetThirdCorpId(String targetThirdCorpId) {
        this.targetThirdCorpId = targetThirdCorpId;
        return this;
    }
    public String getTargetThirdCorpId() {
        return this.targetThirdCorpId;
    }

}
