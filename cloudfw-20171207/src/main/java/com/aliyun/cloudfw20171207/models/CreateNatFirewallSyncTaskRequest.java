// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class CreateNatFirewallSyncTaskRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>zh</p>
     */
    @NameInMap("Lang")
    public String lang;

    public static CreateNatFirewallSyncTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateNatFirewallSyncTaskRequest self = new CreateNatFirewallSyncTaskRequest();
        return TeaModel.build(map, self);
    }

    public CreateNatFirewallSyncTaskRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

}
