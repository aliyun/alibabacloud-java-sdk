// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20200101.models;

import com.aliyun.tea.*;

public class AddAutoCcBlacklistRequest extends TeaModel {
    /**
     * <p>The IP addresses that you want to manage. This parameter is a JSON string. The string contains the following field:</p>
     * <br>
     * <p>*   **src**: the IP address. This field is required and must be of the STRING type.</p>
     */
    @NameInMap("Blacklist")
    public String blacklist;

    /**
     * <p>The expiration time. You can specify a custom expiration time. Valid values: **300** to **604800**. Unit: seconds.</p>
     */
    @NameInMap("ExpireTime")
    public Integer expireTime;

    /**
     * <p>The ID of the instance.</p>
     * <br>
     * <p>> You can call the **DescribeInstanceIds** operation to query the IDs of all instances.</p>
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
