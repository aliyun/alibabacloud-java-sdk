// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20200101.models;

import com.aliyun.tea.*;

public class AddAutoCcBlacklistRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>[{&quot;src&quot;:&quot;198.51.XX.XX&quot;},{&quot;src&quot;:&quot;198.52.XX.XX&quot;}]</p>
     */
    @NameInMap("Blacklist")
    public String blacklist;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>300</p>
     */
    @NameInMap("ExpireTime")
    public Integer expireTime;

    /**
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
