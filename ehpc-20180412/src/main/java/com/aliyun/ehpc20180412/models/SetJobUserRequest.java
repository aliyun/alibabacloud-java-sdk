// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpc20180412.models;

import com.aliyun.tea.*;

public class SetJobUserRequest extends TeaModel {
    @NameInMap("ClusterId")
    public String clusterId;

    @NameInMap("RunasUser")
    public String runasUser;

    @NameInMap("RunasUserPassword")
    public String runasUserPassword;

    public static SetJobUserRequest build(java.util.Map<String, ?> map) throws Exception {
        SetJobUserRequest self = new SetJobUserRequest();
        return TeaModel.build(map, self);
    }

    public SetJobUserRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public SetJobUserRequest setRunasUser(String runasUser) {
        this.runasUser = runasUser;
        return this;
    }
    public String getRunasUser() {
        return this.runasUser;
    }

    public SetJobUserRequest setRunasUserPassword(String runasUserPassword) {
        this.runasUserPassword = runasUserPassword;
        return this;
    }
    public String getRunasUserPassword() {
        return this.runasUserPassword;
    }

}
