// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.edasmsc20200323.models;

import com.aliyun.tea.*;

public class UpdateAuthPolicyRequest extends TeaModel {
    @NameInMap("Name")
    public String name;

    @NameInMap("Source")
    public String source;

    @NameInMap("Id")
    @Validation(required = true)
    public String id;

    @NameInMap("Region")
    public String region;

    @NameInMap("Enable")
    public String enable;

    @NameInMap("AppId")
    public String appId;

    @NameInMap("Protocol")
    public String protocol;

    @NameInMap("AuthRule")
    public String authRule;

    public static UpdateAuthPolicyRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateAuthPolicyRequest self = new UpdateAuthPolicyRequest();
        return TeaModel.build(map, self);
    }

}
