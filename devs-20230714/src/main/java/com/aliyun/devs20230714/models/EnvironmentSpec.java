// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devs20230714.models;

import com.aliyun.tea.*;

public class EnvironmentSpec extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>acs:ram::*******:role/aliyundevsdefaultrole</p>
     */
    @NameInMap("roleArn")
    public String roleArn;

    @NameInMap("stagedConfigs")
    public EnvironmentStagedConfigs stagedConfigs;

    /**
     * <strong>example:</strong>
     * <p>Testing</p>
     */
    @NameInMap("type")
    public String type;

    public static EnvironmentSpec build(java.util.Map<String, ?> map) throws Exception {
        EnvironmentSpec self = new EnvironmentSpec();
        return TeaModel.build(map, self);
    }

    public EnvironmentSpec setRoleArn(String roleArn) {
        this.roleArn = roleArn;
        return this;
    }
    public String getRoleArn() {
        return this.roleArn;
    }

    public EnvironmentSpec setStagedConfigs(EnvironmentStagedConfigs stagedConfigs) {
        this.stagedConfigs = stagedConfigs;
        return this;
    }
    public EnvironmentStagedConfigs getStagedConfigs() {
        return this.stagedConfigs;
    }

    public EnvironmentSpec setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
