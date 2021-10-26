// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160714.models;

import com.aliyun.tea.*;

public class ModifyLogConfigRequest extends TeaModel {
    @NameInMap("SecurityToken")
    public String securityToken;

    @NameInMap("SlsProject")
    public String slsProject;

    @NameInMap("SlsLogStore")
    public String slsLogStore;

    @NameInMap("LogType")
    public String logType;

    public static ModifyLogConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyLogConfigRequest self = new ModifyLogConfigRequest();
        return TeaModel.build(map, self);
    }

    public ModifyLogConfigRequest setSecurityToken(String securityToken) {
        this.securityToken = securityToken;
        return this;
    }
    public String getSecurityToken() {
        return this.securityToken;
    }

    public ModifyLogConfigRequest setSlsProject(String slsProject) {
        this.slsProject = slsProject;
        return this;
    }
    public String getSlsProject() {
        return this.slsProject;
    }

    public ModifyLogConfigRequest setSlsLogStore(String slsLogStore) {
        this.slsLogStore = slsLogStore;
        return this;
    }
    public String getSlsLogStore() {
        return this.slsLogStore;
    }

    public ModifyLogConfigRequest setLogType(String logType) {
        this.logType = logType;
        return this;
    }
    public String getLogType() {
        return this.logType;
    }

}
