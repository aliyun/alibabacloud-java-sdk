// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudwifi_pop20191118.models;

import com.aliyun.tea.*;

public class AddApListToApgroupRequest extends TeaModel {
    @NameInMap("AppName")
    @Validation(required = true)
    public String appName;

    @NameInMap("AppCode")
    @Validation(required = true)
    public String appCode;

    @NameInMap("ApMacList")
    @Validation(required = true)
    public java.util.Map<String, ?> apMacList;

    @NameInMap("ApGroupId")
    @Validation(required = true)
    public String apGroupId;

    public static AddApListToApgroupRequest build(java.util.Map<String, ?> map) throws Exception {
        AddApListToApgroupRequest self = new AddApListToApgroupRequest();
        return TeaModel.build(map, self);
    }

}
