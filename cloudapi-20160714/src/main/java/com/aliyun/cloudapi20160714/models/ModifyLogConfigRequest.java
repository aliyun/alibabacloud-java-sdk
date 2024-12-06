// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160714.models;

import com.aliyun.tea.*;

public class ModifyLogConfigRequest extends TeaModel {
    /**
     * <p>The log type. Valid values:</p>
     * <ul>
     * <li><strong>log</strong>: other logs</li>
     * <li><strong>survey</strong>: inspection logs</li>
     * </ul>
     * <p>Enumeration value:</p>
     * <ul>
     * <li>PROVIDER</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>PROVIDER</p>
     */
    @NameInMap("LogType")
    public String logType;

    @NameInMap("SecurityToken")
    public String securityToken;

    /**
     * <p>The name of the Logstore.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>logs-gateway</p>
     */
    @NameInMap("SlsLogStore")
    public String slsLogStore;

    /**
     * <p>The name of the Log Service project.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ford-api-gateway-log</p>
     */
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
