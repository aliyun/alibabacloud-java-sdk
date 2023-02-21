// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.btripopen20220520.models;

import com.aliyun.tea.*;

public class QueryReimbursementOrderRequest extends TeaModel {
    @NameInMap("reimb_order_no")
    public String reimbOrderNo;

    @NameInMap("sub_corp_id")
    public String subCorpId;

    public static QueryReimbursementOrderRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryReimbursementOrderRequest self = new QueryReimbursementOrderRequest();
        return TeaModel.build(map, self);
    }

    public QueryReimbursementOrderRequest setReimbOrderNo(String reimbOrderNo) {
        this.reimbOrderNo = reimbOrderNo;
        return this;
    }
    public String getReimbOrderNo() {
        return this.reimbOrderNo;
    }

    public QueryReimbursementOrderRequest setSubCorpId(String subCorpId) {
        this.subCorpId = subCorpId;
        return this;
    }
    public String getSubCorpId() {
        return this.subCorpId;
    }

}
