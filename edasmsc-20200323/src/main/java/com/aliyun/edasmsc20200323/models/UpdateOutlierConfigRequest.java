// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.edasmsc20200323.models;

import com.aliyun.tea.*;

public class UpdateOutlierConfigRequest extends TeaModel {
    @NameInMap("PolicyId")
    @Validation(required = true)
    public String policyId;

    @NameInMap("AppList")
    public String appList;

    @NameInMap("OutlierConfig")
    public String outlierConfig;

    public static UpdateOutlierConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateOutlierConfigRequest self = new UpdateOutlierConfigRequest();
        return TeaModel.build(map, self);
    }

}
