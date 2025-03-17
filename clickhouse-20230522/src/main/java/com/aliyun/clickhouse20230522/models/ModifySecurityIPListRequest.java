// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.clickhouse20230522.models;

import com.aliyun.tea.*;

public class ModifySecurityIPListRequest extends TeaModel {
    /**
     * <p>The cluster ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cc-xxxxx</p>
     */
    @NameInMap("DBInstanceId")
    public String DBInstanceId;

    /**
     * <p>The name of the whitelist whose settings you want to modify.</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("GroupName")
    public String groupName;

    /**
     * <p>The modification mode.</p>
     * <ul>
     * <li>0: overwrites the original IP addresses and CIDR blocks in the whitelist.</li>
     * <li>1: adds the IP addresses and CIDR blocks to the whitelist.</li>
     * <li>2: removes the IP addresses and CIDR blocks from the whitelist.</li>
     * </ul>
     * <blockquote>
     * <p> We recommend that you set the value to 0.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("ModifyMode")
    public String modifyMode;

    /**
     * <p>The region ID.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-beijing</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The IP addresses and CIDR blocks in the whitelist.</p>
     * 
     * <strong>example:</strong>
     * <p>192.168.0.0/24,172.16.0.0/24</p>
     */
    @NameInMap("SecurityIPList")
    public String securityIPList;

    public static ModifySecurityIPListRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifySecurityIPListRequest self = new ModifySecurityIPListRequest();
        return TeaModel.build(map, self);
    }

    public ModifySecurityIPListRequest setDBInstanceId(String DBInstanceId) {
        this.DBInstanceId = DBInstanceId;
        return this;
    }
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    public ModifySecurityIPListRequest setGroupName(String groupName) {
        this.groupName = groupName;
        return this;
    }
    public String getGroupName() {
        return this.groupName;
    }

    public ModifySecurityIPListRequest setModifyMode(String modifyMode) {
        this.modifyMode = modifyMode;
        return this;
    }
    public String getModifyMode() {
        return this.modifyMode;
    }

    public ModifySecurityIPListRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ModifySecurityIPListRequest setSecurityIPList(String securityIPList) {
        this.securityIPList = securityIPList;
        return this;
    }
    public String getSecurityIPList() {
        return this.securityIPList;
    }

}
