// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20200101.models;

import com.aliyun.tea.*;

public class AddAutoCcBlacklistRequest extends TeaModel {
    /**
     * <p>The IP addresses to add to the blacklist. This is a JSON array. Each object in the array contains the following field:</p>
     * <ul>
     * <li><strong>src</strong>: String. Required. The IP address to add.</li>
     * </ul>
     * <blockquote>
     * <p>You can add up to 2,000 IP addresses per request.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>[{&quot;src&quot;:&quot;198.51.XX.XX&quot;},{&quot;src&quot;:&quot;198.52.XX.XX&quot;}]</p>
     */
    @NameInMap("Blacklist")
    public String blacklist;

    /**
     * <p>The expiration time for the blacklist entries, in seconds. Valid values: <strong>300</strong> to <strong>604800</strong>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>300</p>
     */
    @NameInMap("ExpireTime")
    public Integer expireTime;

    /**
     * <p>The ID of the Anti-DDoS Pro instance.</p>
     * <blockquote>
     * <p>Call the <strong>DescribeInstanceIds</strong> operation to query the IDs of all Anti-DDoS Pro instances.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ddoscoo-cn-mp91j1ao****</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    public static AddAutoCcBlacklistRequest build(java.util.Map<String, ?> map) throws Exception {
        AddAutoCcBlacklistRequest self = new AddAutoCcBlacklistRequest();
        return TeaModel.build(map, self);
    }

    public AddAutoCcBlacklistRequest setBlacklist(String blacklist) {
        this.blacklist = blacklist;
        return this;
    }
    public String getBlacklist() {
        return this.blacklist;
    }

    public AddAutoCcBlacklistRequest setExpireTime(Integer expireTime) {
        this.expireTime = expireTime;
        return this;
    }
    public Integer getExpireTime() {
        return this.expireTime;
    }

    public AddAutoCcBlacklistRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}
