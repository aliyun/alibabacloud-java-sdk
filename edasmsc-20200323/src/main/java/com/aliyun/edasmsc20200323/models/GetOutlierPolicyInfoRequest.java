// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.edasmsc20200323.models;

import com.aliyun.tea.*;

public class GetOutlierPolicyInfoRequest extends TeaModel {
    @NameInMap("PolicyId")
    @Validation(required = true)
    public String policyId;

    public static GetOutlierPolicyInfoRequest build(java.util.Map<String, ?> map) throws Exception {
        GetOutlierPolicyInfoRequest self = new GetOutlierPolicyInfoRequest();
        return TeaModel.build(map, self);
    }

}
