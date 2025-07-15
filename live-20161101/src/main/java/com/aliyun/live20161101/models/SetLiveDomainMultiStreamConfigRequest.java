// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class SetLiveDomainMultiStreamConfigRequest extends TeaModel {
    /**
     * <p>The main streaming domain.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>example.com</p>
     */
    @NameInMap("Domain")
    public String domain;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>Specifies whether to enable the dual-stream disaster recovery feature. Valid values:</p>
     * <ul>
     * <li><strong>on</strong>: enables the feature.</li>
     * <li><strong>off</strong>: disables the feature.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>on</p>
     */
    @NameInMap("Switch")
    public String _switch;

    public static SetLiveDomainMultiStreamConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        SetLiveDomainMultiStreamConfigRequest self = new SetLiveDomainMultiStreamConfigRequest();
        return TeaModel.build(map, self);
    }

    public SetLiveDomainMultiStreamConfigRequest setDomain(String domain) {
        this.domain = domain;
        return this;
    }
    public String getDomain() {
        return this.domain;
    }

    public SetLiveDomainMultiStreamConfigRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public SetLiveDomainMultiStreamConfigRequest set_switch(String _switch) {
        this._switch = _switch;
        return this;
    }
    public String get_switch() {
        return this._switch;
    }

}
