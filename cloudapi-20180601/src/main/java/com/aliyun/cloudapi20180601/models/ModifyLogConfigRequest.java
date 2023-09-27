// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20180601.models;

import com.aliyun.tea.*;

public class ModifyLogConfigRequest extends TeaModel {
    @NameInMap("LogType")
    public String logType;

    @NameInMap("SecurityToken")
    public String securityToken;

    @NameInMap("SlsLogStore")
    public String slsLogStore;

    @NameInMap("SlsProject")
    public String slsProject;

    public static ModifyLogConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyLogConfigRequest self = new ModifyLogConfigRequest();
        return TeaModel.build(map, self);
    }

    public ModifyLogConfigRequest setLogType(String logType) {
        this.logType = logType;
        return this;
    }
    public String getLogType() {
        return this.logType;
    }

    public ModifyLogConfigRequest setSecurityToken(String securityToken) {
        this.securityToken = securityToken;
        return this;
    }
    public String getSecurityToken() {
        return this.securityToken;
    }

    public ModifyLogConfigRequest setSlsLogStore(String slsLogStore) {
        this.slsLogStore = slsLogStore;
        return this;
    }
    public String getSlsLogStore() {
        return this.slsLogStore;
    }

    public ModifyLogConfigRequest setSlsProject(String slsProject) {
        this.slsProject = slsProject;
        return this;
    }
    public String getSlsProject() {
        return this.slsProject;
    }

}
