// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gpdb20160503.models;

import com.aliyun.tea.*;

public class ModifySupabaseProjectSecurityIpsRequest extends TeaModel {
    /**
     * <p>The Supabase project ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>sbp-407****</p>
     */
    @NameInMap("ProjectId")
    public String projectId;

    /**
     * <p>The region ID of the cluster.</p>
     * <blockquote>
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/86912.html">DescribeRegions</a> operation to query the most recent region list.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>A comma-separated list of IP addresses and CIDR blocks to set as the whitelist. You can specify up to 1,000 entries. Supported formats:</p>
     * <ul>
     * <li>Single IP: 10.23.12.24</li>
     * <li>CIDR Block: 10.23.12.0/24 (the prefix<code>/24</code> indicates the length must be between 1 and 32)``</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>127.0.0.1</p>
     */
    @NameInMap("SecurityIPList")
    public String securityIPList;

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

}
