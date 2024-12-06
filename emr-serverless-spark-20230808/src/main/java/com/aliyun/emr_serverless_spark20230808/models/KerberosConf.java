// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr_serverless_spark20230808.models;

import com.aliyun.tea.*;

public class KerberosConf extends TeaModel {
    @NameInMap("creator")
    public String creator;

    @NameInMap("enabled")
    public Boolean enabled;

    @NameInMap("gmtCreated")
    public String gmtCreated;

    @NameInMap("gmtModified")
    public String gmtModified;

    @NameInMap("kerberosConfId")
    public String kerberosConfId;

    @NameInMap("keytabs")
    public java.util.List<String> keytabs;

    @NameInMap("krb5Conf")
    public String krb5Conf;

    @NameInMap("name")
    public String name;

    @NameInMap("networkServiceId")
    public String networkServiceId;

    @NameInMap("workspaceId")
    public String workspaceId;

    public static KerberosConf build(java.util.Map<String, ?> map) throws Exception {
        KerberosConf self = new KerberosConf();
        return TeaModel.build(map, self);
    }

    public KerberosConf setCreator(String creator) {
        this.creator = creator;
        return this;
    }
    public String getCreator() {
        return this.creator;
    }

    public KerberosConf setEnabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }
    public Boolean getEnabled() {
        return this.enabled;
    }

    public KerberosConf setGmtCreated(String gmtCreated) {
        this.gmtCreated = gmtCreated;
        return this;
    }
    public String getGmtCreated() {
        return this.gmtCreated;
    }

    public KerberosConf setGmtModified(String gmtModified) {
        this.gmtModified = gmtModified;
        return this;
    }
    public String getGmtModified() {
        return this.gmtModified;
    }

    public KerberosConf setKerberosConfId(String kerberosConfId) {
        this.kerberosConfId = kerberosConfId;
        return this;
    }
    public String getKerberosConfId() {
        return this.kerberosConfId;
    }

    public KerberosConf setKeytabs(java.util.List<String> keytabs) {
        this.keytabs = keytabs;
        return this;
    }
    public java.util.List<String> getKeytabs() {
        return this.keytabs;
    }

    public KerberosConf setKrb5Conf(String krb5Conf) {
        this.krb5Conf = krb5Conf;
        return this;
    }
    public String getKrb5Conf() {
        return this.krb5Conf;
    }

    public KerberosConf setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public KerberosConf setNetworkServiceId(String networkServiceId) {
        this.networkServiceId = networkServiceId;
        return this;
    }
    public String getNetworkServiceId() {
        return this.networkServiceId;
    }

    public KerberosConf setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

}
