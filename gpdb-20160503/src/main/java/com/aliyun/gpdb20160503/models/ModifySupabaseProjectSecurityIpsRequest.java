// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gpdb20160503.models;

import com.aliyun.tea.*;

public class ModifySupabaseProjectSecurityIpsRequest extends TeaModel {
    /**
     * <p>The Supabase instance ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>sbp-407****</p>
     */
    @NameInMap("ProjectId")
    public String projectId;

    /**
     * <p>The region ID.</p>
     * <blockquote>
     * <p>For more information, see <a href="https://help.aliyun.com/document_detail/86912.html">DescribeRegions</a> to view available region IDs.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The list of IP addresses for the whitelist. Up to 1,000 IP addresses are supported. Separate multiple IP addresses with commas. The following formats are supported:</p>
     * <ul>
     * <li><p>10.23.12.24 (IP address)</p>
     * </li>
     * <li><p>10.23.12.24/24 (A CIDR block, where <code>/24</code> indicates the prefix length. The prefix length must be an integer in the range <code>[1,32]</code>.)</p>
     * </li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>127.0.0.1</p>
     */
    @NameInMap("SecurityIPList")
    public String securityIPList;

    /**
     * <p>Specifies whether to modify the whitelist for database port 5432. The default value is true.</p>
     */
    @NameInMap("UpdateDb")
    public Boolean updateDb;

    /**
     * <p>Specifies whether to modify the whitelist for HTTP port 80 and HTTPS port 443. The default value is true.</p>
     */
    @NameInMap("UpdateWeb")
    public Boolean updateWeb;

    public static ModifySupabaseProjectSecurityIpsRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifySupabaseProjectSecurityIpsRequest self = new ModifySupabaseProjectSecurityIpsRequest();
        return TeaModel.build(map, self);
    }

    public ModifySupabaseProjectSecurityIpsRequest setProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }
    public String getProjectId() {
        return this.projectId;
    }

    public ModifySupabaseProjectSecurityIpsRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ModifySupabaseProjectSecurityIpsRequest setSecurityIPList(String securityIPList) {
        this.securityIPList = securityIPList;
        return this;
    }
    public String getSecurityIPList() {
        return this.securityIPList;
    }

    public ModifySupabaseProjectSecurityIpsRequest setUpdateDb(Boolean updateDb) {
        this.updateDb = updateDb;
        return this;
    }
    public Boolean getUpdateDb() {
        return this.updateDb;
    }

    public ModifySupabaseProjectSecurityIpsRequest setUpdateWeb(Boolean updateWeb) {
        this.updateWeb = updateWeb;
        return this;
    }
    public Boolean getUpdateWeb() {
        return this.updateWeb;
    }

}
