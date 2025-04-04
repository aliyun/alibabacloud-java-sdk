// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20180116.models;

import com.aliyun.tea.*;

public class QueryAddressListRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>LMALL2***100001</p>
     */
    @NameInMap("BizId")
    public String bizId;

    /**
     * <strong>example:</strong>
     * <p>12312</p>
     */
    @NameInMap("ThirdPartyUserId")
    public String thirdPartyUserId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("UseAnonymousTbAccount")
    public Boolean useAnonymousTbAccount;

    public static QueryAddressListRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryAddressListRequest self = new QueryAddressListRequest();
        return TeaModel.build(map, self);
    }

    public QueryAddressListRequest setBizId(String bizId) {
        this.bizId = bizId;
        return this;
    }
    public String getBizId() {
        return this.bizId;
    }

    public QueryAddressListRequest setThirdPartyUserId(String thirdPartyUserId) {
        this.thirdPartyUserId = thirdPartyUserId;
        return this;
    }
    public String getThirdPartyUserId() {
        return this.thirdPartyUserId;
    }

    public QueryAddressListRequest setUseAnonymousTbAccount(Boolean useAnonymousTbAccount) {
        this.useAnonymousTbAccount = useAnonymousTbAccount;
        return this;
    }
    public Boolean getUseAnonymousTbAccount() {
        return this.useAnonymousTbAccount;
    }

}
