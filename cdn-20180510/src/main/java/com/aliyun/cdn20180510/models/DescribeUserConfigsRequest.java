// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class DescribeUserConfigsRequest extends TeaModel {
    /**
     * <p>The feature whose configurations you want to query. You can specify only one feature in each request. Valid values: oss, green_manager, waf, cc_rule, ddos_dispatch, edge_safe, blocked_regions, http_acl_policy, bot_manager, and ip_reputation.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("Config")
    public String config;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("SecurityToken")
    public String securityToken;

    public static DescribeUserConfigsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeUserConfigsRequest self = new DescribeUserConfigsRequest();
        return TeaModel.build(map, self);
    }

    public DescribeUserConfigsRequest setConfig(String config) {
        this.config = config;
        return this;
    }
    public String getConfig() {
        return this.config;
    }

    public DescribeUserConfigsRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public DescribeUserConfigsRequest setSecurityToken(String securityToken) {
        this.securityToken = securityToken;
        return this;
    }
    public String getSecurityToken() {
        return this.securityToken;
    }

}
