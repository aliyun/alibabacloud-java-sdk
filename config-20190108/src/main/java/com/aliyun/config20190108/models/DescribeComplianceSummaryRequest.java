// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.config20190108.models;

import com.aliyun.tea.*;

public class DescribeComplianceSummaryRequest extends TeaModel {
    @NameInMap("MemberId")
    public Long memberId;

    @NameInMap("MultiAccount")
    public Boolean multiAccount;

    public static DescribeComplianceSummaryRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeComplianceSummaryRequest self = new DescribeComplianceSummaryRequest();
        return TeaModel.build(map, self);
    }

    public DescribeComplianceSummaryRequest setMemberId(Long memberId) {
        this.memberId = memberId;
        return this;
    }
    public Long getMemberId() {
        return this.memberId;
    }

    public DescribeComplianceSummaryRequest setMultiAccount(Boolean multiAccount) {
        this.multiAccount = multiAccount;
        return this;
    }
    public Boolean getMultiAccount() {
        return this.multiAccount;
    }

}
