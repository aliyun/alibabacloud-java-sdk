// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.edasmsc20200323.models;

import com.aliyun.tea.*;

public class CreateOutlierConfigRequest extends TeaModel {
    @NameInMap("PolicyName")
    @Validation(required = true)
    public String policyName;

    @NameInMap("PolicyDescription")
    public String policyDescription;

    @NameInMap("Region")
    @Validation(required = true)
    public String region;

    @NameInMap("AppList")
    @Validation(required = true)
    public String appList;

    @NameInMap("OutlierConfig")
    @Validation(required = true)
    public String outlierConfig;

    @NameInMap("Source")
    @Validation(required = true)
    public String source;

    public static CreateOutlierConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateOutlierConfigRequest self = new CreateOutlierConfigRequest();
        return TeaModel.build(map, self);
    }

}
