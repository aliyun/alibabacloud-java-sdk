// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudwifi_pop20191118.models;

import com.aliyun.tea.*;

public class NewApgroupConfigRequest extends TeaModel {
    @NameInMap("AppName")
    @Validation(required = true)
    public String appName;

    @NameInMap("AppCode")
    @Validation(required = true)
    public String appCode;

    @NameInMap("ParentApgroupId")
    @Validation(required = true)
    public String parentApgroupId;

    @NameInMap("Name")
    @Validation(required = true)
    public String name;

    public static NewApgroupConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        NewApgroupConfigRequest self = new NewApgroupConfigRequest();
        return TeaModel.build(map, self);
    }

}
