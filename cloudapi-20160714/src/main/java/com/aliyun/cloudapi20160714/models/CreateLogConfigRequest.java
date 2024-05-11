// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160714.models;

import com.aliyun.tea.*;

public class CreateLogConfigRequest extends TeaModel {
    @NameInMap("LogType")
    public String logType;

    @NameInMap("SecurityToken")
    public String securityToken;

    /**
     * <p>slslogstore</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("SlsLogStore")
    public String slsLogStore;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("SlsProject")
    public String slsProject;

    public static CreateLogConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateLogConfigRequest self = new CreateLogConfigRequest();
        return TeaModel.build(map, self);
    }

    public CreateLogConfigRequest setLogType(String logType) {
        this.logType = logType;
        return this;
    }
    public String getLogType() {
        return this.logType;
    }

    public CreateLogConfigRequest setSecurityToken(String securityToken) {
        this.securityToken = securityToken;
        return this;
    }
    public String getSecurityToken() {
        return this.securityToken;
    }

    public CreateLogConfigRequest setSlsLogStore(String slsLogStore) {
        this.slsLogStore = slsLogStore;
        return this;
    }
    public String getSlsLogStore() {
        return this.slsLogStore;
    }

    public CreateLogConfigRequest setSlsProject(String slsProject) {
        this.slsProject = slsProject;
        return this;
    }
    public String getSlsProject() {
        return this.slsProject;
    }

}
