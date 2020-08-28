// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class SearchAlertRulesRequest extends TeaModel {
    @NameInMap("ProxyUserId")
    public String proxyUserId;

    @NameInMap("Title")
    public String title;

    @NameInMap("Type")
    public String type;

    @NameInMap("CurrentPage")
    public Integer currentPage;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("RegionId")
    @Validation(required = true)
    public String regionId;

    @NameInMap("Pid")
    public String pid;

    @NameInMap("AppType")
    public String appType;

    public static SearchAlertRulesRequest build(java.util.Map<String, ?> map) throws Exception {
        SearchAlertRulesRequest self = new SearchAlertRulesRequest();
        return TeaModel.build(map, self);
    }

}
