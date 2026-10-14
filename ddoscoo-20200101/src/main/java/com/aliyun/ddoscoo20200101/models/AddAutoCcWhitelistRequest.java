// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20200101.models;

import com.aliyun.tea.*;

public class AddAutoCcWhitelistRequest extends TeaModel {
    /**
     * <p><strong>[Deprecated]</strong> This parameter is deprecated.</p>
     * <blockquote>
     * <p>This parameter specifies the validity period of blacklist IP addresses. Whitelist IP addresses are permanently valid by default. You do not need to set this parameter.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("ExpireTime")
    public Integer expireTime;

    /**
     * <p>The ID of the Anti-DDoS Pro or Anti-DDoS Premium instance for which you want to add whitelist IP addresses.</p>
     * <blockquote>
     * <p>You can invoke <a href="https://help.aliyun.com/document_detail/157459.html">DescribeInstanceIds</a> to query the IDs of all Anti-DDoS Pro or Anti-DDoS Premium instances.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ddoscoo-cn-mp91j1ao****</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The configuration of the whitelist IP addresses to add. This parameter is a string that is converted from a JSON array. Each element in the JSON array is a whitelist IP struct that contains the following field:</p>
     * <ul>
     * <li><strong>src</strong>: String | Required | The IP address to add to the whitelist.</li>
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
