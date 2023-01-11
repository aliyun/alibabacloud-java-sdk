// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class UpdateAclRequest extends TeaModel {
    /**
     * <p>The language of the response. Valid values:</p>
     * <br>
     * <p>*   zh: Chinese</p>
     * <p>*   en: English</p>
     */
    @NameInMap("AcceptLanguage")
    public String acceptLanguage;

    /**
     * <p>The IP addresses or CIDR blocks in the IP address whitelist.</p>
     */
    @NameInMap("AclEntryList")
    public String aclEntryList;

    /**
     * <p>The ID of the instance.</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    public static UpdateAclRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateAclRequest self = new UpdateAclRequest();
        return TeaModel.build(map, self);
    }

    public UpdateAclRequest setAcceptLanguage(String acceptLanguage) {
        this.acceptLanguage = acceptLanguage;
        return this;
    }
    public String getAcceptLanguage() {
        return this.acceptLanguage;
    }

    public UpdateAclRequest setAclEntryList(String aclEntryList) {
        this.aclEntryList = aclEntryList;
        return this;
    }
    public String getAclEntryList() {
        return this.aclEntryList;
    }

    public UpdateAclRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}
