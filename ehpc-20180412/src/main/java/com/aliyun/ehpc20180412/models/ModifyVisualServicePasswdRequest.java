// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpc20180412.models;

import com.aliyun.tea.*;

public class ModifyVisualServicePasswdRequest extends TeaModel {
    @NameInMap("ClusterId")
    public String clusterId;

    @NameInMap("Passwd")
    public String passwd;

    @NameInMap("RunasUser")
    public String runasUser;

    @NameInMap("RunasUserPassword")
    public String runasUserPassword;

    public static ModifyVisualServicePasswdRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyVisualServicePasswdRequest self = new ModifyVisualServicePasswdRequest();
        return TeaModel.build(map, self);
    }

    public ModifyVisualServicePasswdRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public ModifyVisualServicePasswdRequest setPasswd(String passwd) {
        this.passwd = passwd;
        return this;
    }
    public String getPasswd() {
        return this.passwd;
    }

    public ModifyVisualServicePasswdRequest setRunasUser(String runasUser) {
        this.runasUser = runasUser;
        return this;
    }
    public String getRunasUser() {
        return this.runasUser;
    }

    public ModifyVisualServicePasswdRequest setRunasUserPassword(String runasUserPassword) {
        this.runasUserPassword = runasUserPassword;
        return this;
    }
    public String getRunasUserPassword() {
        return this.runasUserPassword;
    }

}
