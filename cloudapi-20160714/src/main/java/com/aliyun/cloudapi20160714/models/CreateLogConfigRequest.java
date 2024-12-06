// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160714.models;

import com.aliyun.tea.*;

public class CreateLogConfigRequest extends TeaModel {
    /**
     * <p>Specifies to create a service-linked role.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("CreateSlr")
    public Boolean createSlr;

    /**
     * <p>The log type.</p>
     * <p>Valid values:</p>
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
     * <p>slslogstore</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>api-gateway</p>
     */
    @NameInMap("SlsLogStore")
    public String slsLogStore;

    /**
     * <p>The name of the Log Service project.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>rec-lq-sls</p>
     */
    @NameInMap("SlsProject")
    public String slsProject;

    public static CreateLogConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateLogConfigRequest self = new CreateLogConfigRequest();
        return TeaModel.build(map, self);
    }

    public CreateLogConfigRequest setCreateSlr(Boolean createSlr) {
        this.createSlr = createSlr;
        return this;
    }
    public Boolean getCreateSlr() {
        return this.createSlr;
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
