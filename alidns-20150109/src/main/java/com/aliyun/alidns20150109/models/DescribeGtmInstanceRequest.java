// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class DescribeGtmInstanceRequest extends TeaModel {
    /**
     * <p>The ID of the GTM instance.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>instance1</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The language.</p>
     * 
     * <strong>example:</strong>
     * <p>en</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>Specifies whether to return additional information. The default value is <strong>false</strong>. If you set this parameter to <strong>true</strong>, the response includes AccessStrategyNum (the number of access policies) and AddressPoolNum (the number of address pools).</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("NeedDetailAttributes")
    public Boolean needDetailAttributes;

    public static DescribeGtmInstanceRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeGtmInstanceRequest self = new DescribeGtmInstanceRequest();
        return TeaModel.build(map, self);
    }

    public DescribeGtmInstanceRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public DescribeGtmInstanceRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public DescribeGtmInstanceRequest setNeedDetailAttributes(Boolean needDetailAttributes) {
        this.needDetailAttributes = needDetailAttributes;
        return this;
    }
    public Boolean getNeedDetailAttributes() {
        return this.needDetailAttributes;
    }

}
