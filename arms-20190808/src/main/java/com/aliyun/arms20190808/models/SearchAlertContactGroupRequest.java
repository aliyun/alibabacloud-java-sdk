// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class SearchAlertContactGroupRequest extends TeaModel {
    @NameInMap("ContactGroupName")
    public String contactGroupName;

    @NameInMap("RegionId")
    @Validation(required = true)
    public String regionId;

    @NameInMap("ProxyUserId")
    public String proxyUserId;

    @NameInMap("ContactName")
    public String contactName;

    @NameInMap("ContactId")
    public Long contactId;

    public static SearchAlertContactGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        SearchAlertContactGroupRequest self = new SearchAlertContactGroupRequest();
        return TeaModel.build(map, self);
    }

}
