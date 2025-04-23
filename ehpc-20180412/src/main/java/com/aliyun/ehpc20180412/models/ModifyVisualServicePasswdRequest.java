// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpc20180412.models;

import com.aliyun.tea.*;

public class ModifyVisualServicePasswdRequest extends TeaModel {
    /**
     * <p>The cluster ID.</p>
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/87116.html">ListClusters</a> operation to query the cluster ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ehpc-hz-jeJki6****</p>
     */
    @NameInMap("ClusterId")
    public String clusterId;

    /**
     * <p>The password that you can use to remotely connect to the visualization service over the VNC. The password must be 6 characters in length and must contain letters and digits.</p>
     * <blockquote>
     * <p> You must call the API operation over HTTPS to ensure that the password remains confidential.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1254****</p>
     */
    @NameInMap("Passwd")
    public String passwd;

    /**
     * <p>The username of the cluster. Set the value to root.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>root</p>
     */
    @NameInMap("RunasUser")
    public String runasUser;

    /**
     * <p>The password that corresponds to the username specified by RunasUser.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2145****</p>
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
