// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataanalysisgbi20240823.models;

import com.aliyun.tea.*;

public class CreateDatasourceAuthorizationRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>password</p>
     */
    @NameInMap("password")
    public String password;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("type")
    public Integer type;

    /**
     * <strong>example:</strong>
     * <p>jdbc:mysql://rm-2zedvv990c8d8rj8ejo.mysql.rds.aliyuncs.com:3306/gbi_good_case</p>
     */
    @NameInMap("url")
    public String url;

    /**
     * <strong>example:</strong>
     * <p>root</p>
     */
    @NameInMap("userName")
    public String userName;

    /**
     * <strong>example:</strong>
     * <p>vdb-E0F693C8-9F72-5830-B81A-696C9D8EBBD1</p>
     */
    @NameInMap("vdbId")
    public String vdbId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>llm-2v3934xtp49esw64</p>
     */
    @NameInMap("workspaceId")
    public String workspaceId;

    public static CreateDatasourceAuthorizationRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateDatasourceAuthorizationRequest self = new CreateDatasourceAuthorizationRequest();
        return TeaModel.build(map, self);
    }

    public CreateDatasourceAuthorizationRequest setPassword(String password) {
        this.password = password;
        return this;
    }
    public String getPassword() {
        return this.password;
    }

    public CreateDatasourceAuthorizationRequest setType(Integer type) {
        this.type = type;
        return this;
    }
    public Integer getType() {
        return this.type;
    }

    public CreateDatasourceAuthorizationRequest setUrl(String url) {
        this.url = url;
        return this;
    }
    public String getUrl() {
        return this.url;
    }

    public CreateDatasourceAuthorizationRequest setUserName(String userName) {
        this.userName = userName;
        return this;
    }
    public String getUserName() {
        return this.userName;
    }

    public CreateDatasourceAuthorizationRequest setVdbId(String vdbId) {
        this.vdbId = vdbId;
        return this;
    }
    public String getVdbId() {
        return this.vdbId;
    }

    public CreateDatasourceAuthorizationRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

}
