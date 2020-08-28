// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.edasmsc20200323.models;

import com.aliyun.tea.*;

public class ListOutlierPolicyRequest extends TeaModel {
    @NameInMap("PolicyName")
    public String policyName;

    @NameInMap("Region")
    @Validation(required = true)
    public String region;

    @NameInMap("Source")
    @Validation(required = true)
    public String source;

    @NameInMap("AppName")
    public String appName;

    @NameInMap("PageNumber")
    @Validation(required = true)
    public String pageNumber;

    @NameInMap("PageSize")
    @Validation(required = true)
    public String pageSize;

    @NameInMap("RpcType")
    public String rpcType;

    public static ListOutlierPolicyRequest build(java.util.Map<String, ?> map) throws Exception {
        ListOutlierPolicyRequest self = new ListOutlierPolicyRequest();
        return TeaModel.build(map, self);
    }

}
