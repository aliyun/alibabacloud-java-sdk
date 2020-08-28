// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class ImportCustomAlertRulesRequest extends TeaModel {
    @NameInMap("RegionId")
    @Validation(required = true)
    public String regionId;

    @NameInMap("ContactGroupIds")
    public String contactGroupIds;

    @NameInMap("IsAutoStart")
    public Boolean isAutoStart;

    @NameInMap("TemplageAlertConfig")
    public String templageAlertConfig;

    @NameInMap("ProxyUserId")
    public String proxyUserId;

    public static ImportCustomAlertRulesRequest build(java.util.Map<String, ?> map) throws Exception {
        ImportCustomAlertRulesRequest self = new ImportCustomAlertRulesRequest();
        return TeaModel.build(map, self);
    }

}
