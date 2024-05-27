// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class DescribeGtmInstanceStatusRequest extends TeaModel {
    /**
     * <p>The ID of the instance to query.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The language in which you want the values of some response parameters to be returned. These response parameters support multiple languages.</p>
     */
    @NameInMap("Lang")
    public String lang;

    public static DescribeGtmInstanceStatusRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeGtmInstanceStatusRequest self = new DescribeGtmInstanceStatusRequest();
        return TeaModel.build(map, self);
    }

    public DescribeGtmInstanceStatusRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public DescribeGtmInstanceStatusRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

}
