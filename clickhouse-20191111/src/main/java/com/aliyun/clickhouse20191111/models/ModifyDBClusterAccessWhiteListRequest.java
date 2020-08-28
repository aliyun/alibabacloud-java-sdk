// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.clickhouse20191111.models;

import com.aliyun.tea.*;

public class ModifyDBClusterAccessWhiteListRequest extends TeaModel {
    @NameInMap("DBClusterId")
    @Validation(required = true)
    public String DBClusterId;

    @NameInMap("SecurityIps")
    @Validation(required = true)
    public String securityIps;

    @NameInMap("DBClusterIPArrayName")
    public String DBClusterIPArrayName;

    @NameInMap("DBClusterIPArrayAttribute")
    public String DBClusterIPArrayAttribute;

    @NameInMap("ModifyMode")
    public String modifyMode;

    public static ModifyDBClusterAccessWhiteListRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyDBClusterAccessWhiteListRequest self = new ModifyDBClusterAccessWhiteListRequest();
        return TeaModel.build(map, self);
    }

    public ModifyDBClusterAccessWhiteListRequest setDBClusterId(String DBClusterId) {
        this.DBClusterId = DBClusterId;
        return this;
    }
    public String getDBClusterId() {
        return this.DBClusterId;
    }

    public ModifyDBClusterAccessWhiteListRequest setSecurityIps(String securityIps) {
        this.securityIps = securityIps;
        return this;
    }
    public String getSecurityIps() {
        return this.securityIps;
    }

    public ModifyDBClusterAccessWhiteListRequest setDBClusterIPArrayName(String DBClusterIPArrayName) {
        this.DBClusterIPArrayName = DBClusterIPArrayName;
        return this;
    }
    public String getDBClusterIPArrayName() {
        return this.DBClusterIPArrayName;
    }

    public ModifyDBClusterAccessWhiteListRequest setDBClusterIPArrayAttribute(String DBClusterIPArrayAttribute) {
        this.DBClusterIPArrayAttribute = DBClusterIPArrayAttribute;
        return this;
    }
    public String getDBClusterIPArrayAttribute() {
        return this.DBClusterIPArrayAttribute;
    }

    public ModifyDBClusterAccessWhiteListRequest setModifyMode(String modifyMode) {
        this.modifyMode = modifyMode;
        return this;
    }
    public String getModifyMode() {
        return this.modifyMode;
    }

}
