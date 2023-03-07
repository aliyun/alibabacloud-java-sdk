// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpc20180412.models;

import com.aliyun.tea.*;

public class ModifyVisualServicePasswdRequest extends TeaModel {
    /**
     * <p>The ID of the cluster.</p>
     */
    @NameInMap("ClusterId")
    public String clusterId;

    /**
     * <p>The connection password of the VNC remote visualization service. The password must be 8 to 30 characters in length and include at least three of the following character types: uppercase letters, lowercase letters, digits, and special characters. Special characters include:</p>
     * <br>
     * <p>`()~! @#$%^&*-_+=|{}[]:;\"/<>,.? /`</p>
     * <br>
     * <p>>  You must use HTTPS to call the API to ensure that the password remains confidential.</p>
     */
    @NameInMap("Passwd")
    public String passwd;

    /**
     * <p>The username of the cluster. Default value: root user. You can call the [ListUsers](~~188572~~) operation to query all users in a cluster.</p>
     */
    @NameInMap("RunasUser")
    public String runasUser;

    /**
     * <p>The user password of the cluster.</p>
     */
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
