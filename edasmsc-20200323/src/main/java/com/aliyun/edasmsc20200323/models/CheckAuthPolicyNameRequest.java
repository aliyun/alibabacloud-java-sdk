// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.edasmsc20200323.models;

import com.aliyun.tea.*;

public class CheckAuthPolicyNameRequest extends TeaModel {
    @NameInMap("Region")
    @Validation(required = true)
    public String region;

    @NameInMap("PolicyName")
    @Validation(required = true)
    public String policyName;

    @NameInMap("Source")
    @Validation(required = true)
    public String source;

    public static CheckAuthPolicyNameRequest build(java.util.Map<String, ?> map) throws Exception {
        CheckAuthPolicyNameRequest self = new CheckAuthPolicyNameRequest();
        return TeaModel.build(map, self);
    }

}
