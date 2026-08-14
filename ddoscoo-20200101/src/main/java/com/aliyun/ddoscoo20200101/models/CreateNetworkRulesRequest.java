// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20200101.models;

import com.aliyun.tea.*;

public class CreateNetworkRulesRequest extends TeaModel {
    @NameInMap("IpMode")
    public String ipMode;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("NetworkRules")
    public String networkRules;

    public static CreateNetworkRulesRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateNetworkRulesRequest self = new CreateNetworkRulesRequest();
        return TeaModel.build(map, self);
    }

    public CreateNetworkRulesRequest setIpMode(String ipMode) {
        this.ipMode = ipMode;
        return this;
    }
    public String getIpMode() {
        return this.ipMode;
    }

    public CreateNetworkRulesRequest setNetworkRules(String networkRules) {
        this.networkRules = networkRules;
        return this;
    }
    public String getNetworkRules() {
        return this.networkRules;
    }

}
