// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.drds20171016.models;

import com.aliyun.tea.*;

public class ModifyDrdsIpWhiteListRequest extends TeaModel {
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

    @NameInMap("GroupAttribute")
    public String groupAttribute;

    @NameInMap("GroupName")
    public String groupName;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("IpWhiteList")
    public String ipWhiteList;

    @NameInMap("Mode")
    public Boolean mode;

    public static ModifyDrdsIpWhiteListRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyDrdsIpWhiteListRequest self = new ModifyDrdsIpWhiteListRequest();
        return TeaModel.build(map, self);
    }

    public ModifyDrdsIpWhiteListRequest setDbName(String dbName) {
        this.dbName = dbName;
        return this;
    }
    public String getDbName() {
        return this.dbName;
    }

    public ModifyDrdsIpWhiteListRequest setDrdsInstanceId(String drdsInstanceId) {
        this.drdsInstanceId = drdsInstanceId;
        return this;
    }
    public String getDrdsInstanceId() {
        return this.drdsInstanceId;
    }

    public ModifyDrdsIpWhiteListRequest setGroupAttribute(String groupAttribute) {
        this.groupAttribute = groupAttribute;
        return this;
    }
    public String getGroupAttribute() {
        return this.groupAttribute;
    }

    public ModifyDrdsIpWhiteListRequest setGroupName(String groupName) {
        this.groupName = groupName;
        return this;
    }
    public String getGroupName() {
        return this.groupName;
    }

    public ModifyDrdsIpWhiteListRequest setIpWhiteList(String ipWhiteList) {
        this.ipWhiteList = ipWhiteList;
        return this;
    }
    public String getIpWhiteList() {
        return this.ipWhiteList;
    }

    public ModifyDrdsIpWhiteListRequest setMode(Boolean mode) {
        this.mode = mode;
        return this;
    }
    public Boolean getMode() {
        return this.mode;
    }

}
