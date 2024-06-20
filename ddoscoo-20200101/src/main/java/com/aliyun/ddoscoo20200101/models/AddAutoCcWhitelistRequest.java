// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20200101.models;

import com.aliyun.tea.*;

public class AddAutoCcWhitelistRequest extends TeaModel {
    /**
     * <p>This parameter is deprecated.</p>
     * <blockquote>
     * <p>This parameter indicates the validity period of the IP address blacklist. By default, the traffic from the IP addresses that you add to the whitelist is always allowed. You do not need to set this parameter.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("ExpireTime")
    public Integer expireTime;

    /**
     * <p>The ID of the instance.</p>
     * <blockquote>
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/157459.html">DescribeInstanceIds</a> operation to query the IDs of all instances.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ddoscoo-cn-mp91j1ao****</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The configuration of the IP addresses that you want to add to the whitelist. The value is a string that consists of JSON arrays. Each element in a JSON array is a JSON struct that contains the following fields:</p>
     * <ul>
     * <li><strong>src</strong>: the IP address that you want to add. This parameter is required. Data type: string.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>[{&quot;src&quot;:&quot;192.XX.XX.1&quot;},{&quot;src&quot;:&quot;192.XX.XX.2&quot;}]</p>
     */
    @NameInMap("Whitelist")
    public String whitelist;

    public static AddAutoCcWhitelistRequest build(java.util.Map<String, ?> map) throws Exception {
        AddAutoCcWhitelistRequest self = new AddAutoCcWhitelistRequest();
        return TeaModel.build(map, self);
    }

    public AddAutoCcWhitelistRequest setExpireTime(Integer expireTime) {
        this.expireTime = expireTime;
        return this;
    }
    public Integer getExpireTime() {
        return this.expireTime;
    }

    public AddAutoCcWhitelistRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public AddAutoCcWhitelistRequest setWhitelist(String whitelist) {
        this.whitelist = whitelist;
        return this;
    }
    public String getWhitelist() {
        return this.whitelist;
    }

}
