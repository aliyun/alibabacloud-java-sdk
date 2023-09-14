// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imarketing20220704.models;

import com.aliyun.tea.*;

public class QueryBenefitGrantResultRequest extends TeaModel {
    @NameInMap("CloducodeFlowNo")
    public String cloducodeFlowNo;

    @NameInMap("OuterCustomerId")
    public String outerCustomerId;

    public static QueryBenefitGrantResultRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryBenefitGrantResultRequest self = new QueryBenefitGrantResultRequest();
        return TeaModel.build(map, self);
    }

    public QueryBenefitGrantResultRequest setCloducodeFlowNo(String cloducodeFlowNo) {
        this.cloducodeFlowNo = cloducodeFlowNo;
        return this;
    }
    public String getCloducodeFlowNo() {
        return this.cloducodeFlowNo;
    }

    public QueryBenefitGrantResultRequest setOuterCustomerId(String outerCustomerId) {
        this.outerCustomerId = outerCustomerId;
        return this;
    }
    public String getOuterCustomerId() {
        return this.outerCustomerId;
    }

}
