// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class ImportAppAlertRulesRequest extends TeaModel {
    @NameInMap("TemplateAlertId")
    public String templateAlertId;

    @NameInMap("Pids")
    @Validation(required = true)
    public String pids;

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

    public static ImportAppAlertRulesRequest build(java.util.Map<String, ?> map) throws Exception {
        ImportAppAlertRulesRequest self = new ImportAppAlertRulesRequest();
        return TeaModel.build(map, self);
    }

}
