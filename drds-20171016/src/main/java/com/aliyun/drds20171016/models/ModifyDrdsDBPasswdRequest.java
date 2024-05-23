// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.drds20171016.models;

import com.aliyun.tea.*;

public class ModifyDrdsDBPasswdRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("DbName")
    public String dbName;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("DrdsInstanceId")
    public String drdsInstanceId;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("NewPasswd")
    public String newPasswd;

    public static ModifyDrdsDBPasswdRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyDrdsDBPasswdRequest self = new ModifyDrdsDBPasswdRequest();
        return TeaModel.build(map, self);
    }

    public ModifyDrdsDBPasswdRequest setDbName(String dbName) {
        this.dbName = dbName;
        return this;
    }
    public String getDbName() {
        return this.dbName;
    }

    public ModifyDrdsDBPasswdRequest setDrdsInstanceId(String drdsInstanceId) {
        this.drdsInstanceId = drdsInstanceId;
        return this;
    }
    public String getDrdsInstanceId() {
        return this.drdsInstanceId;
    }

    public ModifyDrdsDBPasswdRequest setNewPasswd(String newPasswd) {
        this.newPasswd = newPasswd;
        return this;
    }
    public String getNewPasswd() {
        return this.newPasswd;
    }

}
