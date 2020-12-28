// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpc20180412.models;

import com.aliyun.tea.*;

public class ModifyImageGatewayConfigRequest extends TeaModel {
    @NameInMap("ClusterId")
    public String clusterId;

    @NameInMap("DBType")
    public String DBType;

    @NameInMap("DBUsername")
    public String DBUsername;

    @NameInMap("DBPassword")
    public String DBPassword;

    @NameInMap("DBServerInfo")
    public String DBServerInfo;

    @NameInMap("DefaultRepoLocation")
    public String defaultRepoLocation;

    @NameInMap("PullUpdateTimeout")
    public Integer pullUpdateTimeout;

    @NameInMap("ImageExpirationTimeout")
    public String imageExpirationTimeout;

    @NameInMap("Repo")
    public java.util.List<ModifyImageGatewayConfigRequestRepo> repo;

    public static ModifyImageGatewayConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyImageGatewayConfigRequest self = new ModifyImageGatewayConfigRequest();
        return TeaModel.build(map, self);
    }

    public ModifyImageGatewayConfigRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public ModifyImageGatewayConfigRequest setDBType(String DBType) {
        this.DBType = DBType;
        return this;
    }
    public String getDBType() {
        return this.DBType;
    }

    public ModifyImageGatewayConfigRequest setDBUsername(String DBUsername) {
        this.DBUsername = DBUsername;
        return this;
    }
    public String getDBUsername() {
        return this.DBUsername;
    }

    public ModifyImageGatewayConfigRequest setDBPassword(String DBPassword) {
        this.DBPassword = DBPassword;
        return this;
    }
    public String getDBPassword() {
        return this.DBPassword;
    }

    public ModifyImageGatewayConfigRequest setDBServerInfo(String DBServerInfo) {
        this.DBServerInfo = DBServerInfo;
        return this;
    }
    public String getDBServerInfo() {
        return this.DBServerInfo;
    }

    public ModifyImageGatewayConfigRequest setDefaultRepoLocation(String defaultRepoLocation) {
        this.defaultRepoLocation = defaultRepoLocation;
        return this;
    }
    public String getDefaultRepoLocation() {
        return this.defaultRepoLocation;
    }

    public ModifyImageGatewayConfigRequest setPullUpdateTimeout(Integer pullUpdateTimeout) {
        this.pullUpdateTimeout = pullUpdateTimeout;
        return this;
    }
    public Integer getPullUpdateTimeout() {
        return this.pullUpdateTimeout;
    }

    public ModifyImageGatewayConfigRequest setImageExpirationTimeout(String imageExpirationTimeout) {
        this.imageExpirationTimeout = imageExpirationTimeout;
        return this;
    }
    public String getImageExpirationTimeout() {
        return this.imageExpirationTimeout;
    }

    public ModifyImageGatewayConfigRequest setRepo(java.util.List<ModifyImageGatewayConfigRequestRepo> repo) {
        this.repo = repo;
        return this;
    }
    public java.util.List<ModifyImageGatewayConfigRequestRepo> getRepo() {
        return this.repo;
    }

    public static class ModifyImageGatewayConfigRequestRepo extends TeaModel {
        @NameInMap("Auth")
        public String auth;

        @NameInMap("URL")
        public String URL;

        @NameInMap("Location")
        public String location;

        public static ModifyImageGatewayConfigRequestRepo build(java.util.Map<String, ?> map) throws Exception {
            ModifyImageGatewayConfigRequestRepo self = new ModifyImageGatewayConfigRequestRepo();
            return TeaModel.build(map, self);
        }

        public ModifyImageGatewayConfigRequestRepo setAuth(String auth) {
            this.auth = auth;
            return this;
        }
        public String getAuth() {
            return this.auth;
        }

        public ModifyImageGatewayConfigRequestRepo setURL(String URL) {
            this.URL = URL;
            return this;
        }
        public String getURL() {
            return this.URL;
        }

        public ModifyImageGatewayConfigRequestRepo setLocation(String location) {
            this.location = location;
            return this;
        }
        public String getLocation() {
            return this.location;
        }

    }

}
