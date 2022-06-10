// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fc_open20210406.models;

import com.aliyun.tea.*;

public class MeteringConfig extends TeaModel {
    // 日志仓库
    @NameInMap("logConfig")
    public LogConfig logConfig;

    // 支付用户
    @NameInMap("payerId")
    public String payerId;

    // 权限
    @NameInMap("role")
    public String role;

    public static MeteringConfig build(java.util.Map<String, ?> map) throws Exception {
        MeteringConfig self = new MeteringConfig();
        return TeaModel.build(map, self);
    }

    public MeteringConfig setLogConfig(LogConfig logConfig) {
        this.logConfig = logConfig;
        return this;
    }
    public LogConfig getLogConfig() {
        return this.logConfig;
    }

    public MeteringConfig setPayerId(String payerId) {
        this.payerId = payerId;
        return this;
    }
    public String getPayerId() {
        return this.payerId;
    }

    public MeteringConfig setRole(String role) {
        this.role = role;
        return this;
    }
    public String getRole() {
        return this.role;
    }

}
