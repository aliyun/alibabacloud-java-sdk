// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class UpdateGtmInstanceGlobalConfigRequest extends TeaModel {
    @NameInMap("Lang")
    public String lang;

    @NameInMap("InstanceId")
    @Validation(required = true)
    public String instanceId;

    @NameInMap("InstanceName")
    public String instanceName;

    @NameInMap("Ttl")
    public Integer ttl;

    @NameInMap("UserDomainName")
    public String userDomainName;

    @NameInMap("LbaStrategy")
    public String lbaStrategy;

    @NameInMap("AlertGroup")
    public String alertGroup;

    @NameInMap("CnameMode")
    public String cnameMode;

    @NameInMap("CnameCustomDomainName")
    public String cnameCustomDomainName;

    public static UpdateGtmInstanceGlobalConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateGtmInstanceGlobalConfigRequest self = new UpdateGtmInstanceGlobalConfigRequest();
        return TeaModel.build(map, self);
    }

}
