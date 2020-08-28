// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bssopenapi20171214.models;

import com.aliyun.tea.*;

public class UpgradeResourcePackageRequest extends TeaModel {
    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("EffectiveDate")
    public String effectiveDate;

    @NameInMap("Specification")
    public String specification;

    public static UpgradeResourcePackageRequest build(java.util.Map<String, ?> map) throws Exception {
        UpgradeResourcePackageRequest self = new UpgradeResourcePackageRequest();
        return TeaModel.build(map, self);
    }

}
