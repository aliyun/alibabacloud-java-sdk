// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class ModifyClusterAccessWhiteListRequest extends TeaModel {
    @NameInMap("DBClusterIPArrayAttribute")
    public String DBClusterIPArrayAttribute;

    @NameInMap("DBClusterIPArrayName")
    public String DBClusterIPArrayName;

    @NameInMap("DBClusterId")
    public String DBClusterId;

    @NameInMap("ModifyMode")
    public String modifyMode;

    @NameInMap("SecurityIps")
    public String securityIps;

    public static ModifyClusterAccessWhiteListRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyClusterAccessWhiteListRequest self = new ModifyClusterAccessWhiteListRequest();
        return TeaModel.build(map, self);
    }

    public ModifyClusterAccessWhiteListRequest setDBClusterIPArrayAttribute(String DBClusterIPArrayAttribute) {
        this.DBClusterIPArrayAttribute = DBClusterIPArrayAttribute;
        return this;
    }
    public String getDBClusterIPArrayAttribute() {
        return this.DBClusterIPArrayAttribute;
    }

    public ModifyClusterAccessWhiteListRequest setDBClusterIPArrayName(String DBClusterIPArrayName) {
        this.DBClusterIPArrayName = DBClusterIPArrayName;
        return this;
    }
    public String getDBClusterIPArrayName() {
        return this.DBClusterIPArrayName;
    }

    public ModifyClusterAccessWhiteListRequest setDBClusterId(String DBClusterId) {
        this.DBClusterId = DBClusterId;
        return this;
    }
    public String getDBClusterId() {
        return this.DBClusterId;
    }

    public ModifyClusterAccessWhiteListRequest setModifyMode(String modifyMode) {
        this.modifyMode = modifyMode;
        return this;
    }
    public String getModifyMode() {
        return this.modifyMode;
    }

    public ModifyClusterAccessWhiteListRequest setSecurityIps(String securityIps) {
        this.securityIps = securityIps;
        return this;
    }
    public String getSecurityIps() {
        return this.securityIps;
    }

}
