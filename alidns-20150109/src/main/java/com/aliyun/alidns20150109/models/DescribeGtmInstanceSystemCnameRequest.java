// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class DescribeGtmInstanceSystemCnameRequest extends TeaModel {
    /**
     * <p>The ID of the Global Traffic Manager (GTM) instance.</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The language used by the user.</p>
     */
    @NameInMap("Lang")
    public String lang;

    public static DescribeGtmInstanceSystemCnameRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeGtmInstanceSystemCnameRequest self = new DescribeGtmInstanceSystemCnameRequest();
        return TeaModel.build(map, self);
    }

    public DescribeGtmInstanceSystemCnameRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public DescribeGtmInstanceSystemCnameRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

}
