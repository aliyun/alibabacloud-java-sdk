// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class SearchAlertContactRequest extends TeaModel {
    @NameInMap("ContactName")
    public String contactName;

    @NameInMap("Phone")
    public String phone;

    @NameInMap("Email")
    public String email;

    @NameInMap("CurrentPage")
    @Validation(required = true)
    public String currentPage;

    @NameInMap("PageSize")
    @Validation(required = true)
    public String pageSize;

    @NameInMap("RegionId")
    @Validation(required = true)
    public String regionId;

    @NameInMap("ProxyUserId")
    public String proxyUserId;

    public static SearchAlertContactRequest build(java.util.Map<String, ?> map) throws Exception {
        SearchAlertContactRequest self = new SearchAlertContactRequest();
        return TeaModel.build(map, self);
    }

}
