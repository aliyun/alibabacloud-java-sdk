// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.edasmsc20200323.models;

import com.aliyun.tea.*;

public class AddAuthPolicyRequest extends TeaModel {
    @NameInMap("Name")
    @Validation(required = true)
    public String name;

    @NameInMap("Source")
    @Validation(required = true)
    public String source;

    @NameInMap("Region")
    @Validation(required = true)
    public String region;

    @NameInMap("Enable")
    @Validation(required = true)
    public String enable;

    @NameInMap("AppId")
    @Validation(required = true)
    public String appId;

    @NameInMap("Protocol")
    @Validation(required = true)
    public String protocol;

    @NameInMap("AuthRule")
    @Validation(required = true)
    public String authRule;

    @NameInMap("NamespaceId")
    public String namespaceId;

    public static AddAuthPolicyRequest build(java.util.Map<String, ?> map) throws Exception {
        AddAuthPolicyRequest self = new AddAuthPolicyRequest();
        return TeaModel.build(map, self);
    }

}
