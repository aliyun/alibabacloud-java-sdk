// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class DescribeGtmInstanceRequest extends TeaModel {
    @NameInMap("Lang")
    public String lang;

    @NameInMap("UserClientIp")
    public String userClientIp;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("NeedDetailAttributes")
    public Boolean needDetailAttributes;

    public static DescribeGtmInstanceRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeGtmInstanceRequest self = new DescribeGtmInstanceRequest();
        return TeaModel.build(map, self);
    }

    public DescribeGtmInstanceRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public DescribeGtmInstanceRequest setUserClientIp(String userClientIp) {
        this.userClientIp = userClientIp;
        return this;
    }
    public String getUserClientIp() {
        return this.userClientIp;
    }

    public DescribeGtmInstanceRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public DescribeGtmInstanceRequest setNeedDetailAttributes(Boolean needDetailAttributes) {
        this.needDetailAttributes = needDetailAttributes;
        return this;
    }
    public Boolean getNeedDetailAttributes() {
        return this.needDetailAttributes;
    }

}
