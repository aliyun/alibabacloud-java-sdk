// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.drds20190123.models;

import com.aliyun.tea.*;

public class ModifyDrdsIpWhiteListRequest extends TeaModel {
    /**
     * <p>The name of the DRDS database.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("DbName")
    public String dbName;

    /**
     * <p>The ID of the Message Queue for Apache Kafka instance.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>drds****c6vxxyzd</p>
     */
    @NameInMap("DrdsInstanceId")
    public String drdsInstanceId;

    /**
     * <p>The attribute of the IP address whitelist group.</p>
     */
    @NameInMap("GroupAttribute")
    public String groupAttribute;

    /**
     * <p>The name of the IP address whitelist group.</p>
     * 
     * <strong>example:</strong>
     * <p>drds_******</p>
     */
    @NameInMap("GroupName")
    public String groupName;

    /**
     * <p>The modified whitelist. Separate multiple IP addresses with commas (,).</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>127.<em><strong>.</strong></em>.<em><strong>,10.</strong></em>.<em><strong>.</strong></em></p>
     */
    @NameInMap("IpWhiteList")
    public String ipWhiteList;

    /**
     * <p>Specifies the mode. Valid values:</p>
     * <ul>
     * <li><code>True</code>: append modifications</li>
     * <li><code>False</code>: overwrite modification</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
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
