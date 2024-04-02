// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20170823.models;

import com.aliyun.tea.*;

public class VerifyWebsiteInstanceRequest extends TeaModel {
    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("Lang")
    public String lang;

    @NameInMap("SourceIp")
    public String sourceIp;

    @NameInMap("VerifyMethod")
    public String verifyMethod;

    public static VerifyWebsiteInstanceRequest build(java.util.Map<String, ?> map) throws Exception {
        VerifyWebsiteInstanceRequest self = new VerifyWebsiteInstanceRequest();
        return TeaModel.build(map, self);
    }

    public VerifyWebsiteInstanceRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public VerifyWebsiteInstanceRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public VerifyWebsiteInstanceRequest setSourceIp(String sourceIp) {
        this.sourceIp = sourceIp;
        return this;
    }
    public String getSourceIp() {
        return this.sourceIp;
    }

    public VerifyWebsiteInstanceRequest setVerifyMethod(String verifyMethod) {
        this.verifyMethod = verifyMethod;
        return this;
    }
    public String getVerifyMethod() {
        return this.verifyMethod;
    }

}
