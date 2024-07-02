// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20230930.models;

import com.aliyun.tea.*;

public class MemberAccountResult extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>&quot;yue***@newburn.cn&quot;</p>
     */
    @NameInMap("accountNo")
    public java.util.List<String> accountNo;

    /**
     * <strong>example:</strong>
     * <p>123</p>
     */
    @NameInMap("shopId")
    public String shopId;

    public static MemberAccountResult build(java.util.Map<String, ?> map) throws Exception {
        MemberAccountResult self = new MemberAccountResult();
        return TeaModel.build(map, self);
    }

    public MemberAccountResult setAccountNo(java.util.List<String> accountNo) {
        this.accountNo = accountNo;
        return this;
    }
    public java.util.List<String> getAccountNo() {
        return this.accountNo;
    }

    public MemberAccountResult setShopId(String shopId) {
        this.shopId = shopId;
        return this;
    }
    public String getShopId() {
        return this.shopId;
    }

}
