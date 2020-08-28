// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.edasmsc20200323.models;

import com.aliyun.tea.*;

public class GetAuthPolicyInfoRequest extends TeaModel {
    @NameInMap("PolicyId")
    @Validation(required = true)
    public String policyId;

    public static GetAuthPolicyInfoRequest build(java.util.Map<String, ?> map) throws Exception {
        GetAuthPolicyInfoRequest self = new GetAuthPolicyInfoRequest();
        return TeaModel.build(map, self);
    }

}
