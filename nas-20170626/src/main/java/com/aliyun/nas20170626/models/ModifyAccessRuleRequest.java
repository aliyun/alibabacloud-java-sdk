// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nas20170626.models;

import com.aliyun.tea.*;

public class ModifyAccessRuleRequest extends TeaModel {
    /**
     * <p>The name of the permission group.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>vpc-test</p>
     */
    @NameInMap("AccessGroupName")
    public String accessGroupName;

    /**
     * <p>The ID of the permission rule.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("AccessRuleId")
    public String accessRuleId;

    /**
     * <p>The type of the file system.</p>
     * <p>Valid values:</p>
     * <ul>
     * <li>standard (default): General-purpose NAS.</li>
     * <li>extreme: Extreme NAS.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>standard</p>
     */
    @NameInMap("FileSystemType")
    public String fileSystemType;

    /**
     * <p>The source IPv6 CIDR block.</p>
     * <p>IPv6 addresses and CIDR blocks are supported.</p>
     * <blockquote>
     * <ul>
     * <li>Only Extreme NAS file systems in the China (Hohhot) region support IPv6 CIDR blocks.</li>
     * <li>Only VPCs are supported.</li>
     * <li>IPv4 and IPv6 are mutually exclusive. You cannot convert between the two types.</li>
     * <li>You must specify either SourceCidrIp or Ipv6SourceCidrIp. You cannot leave both parameters empty, and you cannot specify both parameters at the same time.</li>
     * </ul>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>fe80::3d4a:80fd:f05d:****</p>
     */
    @NameInMap("Ipv6SourceCidrIp")
    public String ipv6SourceCidrIp;

    /**
     * <p>The priority of the permission rule.</p>
     * <p>Valid values: 1 to 100.</p>
     * <p>Default value: 1 (highest priority).</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Priority")
    public Integer priority;

    /**
     * <p>The read and write permission that the authorized object has on the file system.</p>
     * <p>Valid values:</p>
     * <ul>
     * <li>RDWR (default): read and write.</li>
     * <li>RDONLY: read-only.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>RDWR</p>
     */
    @NameInMap("RWAccessType")
    public String RWAccessType;

    /**
     * <p>The IP address or CIDR block.</p>
     * <p>The value must be a single IP address or a CIDR block.</p>
     * <blockquote>
     * <p>You must specify either SourceCidrIp or Ipv6SourceCidrIp. You cannot leave both parameters empty, and you cannot specify both parameters at the same time.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p><code>192.0.**.**</code></p>
     */
    @NameInMap("SourceCidrIp")
    public String sourceCidrIp;

    /**
     * <p>The access permissions that the system user of the authorization object has on the file system.</p>
     * <p>Valid values:</p>
     * <ul>
     * <li>no_squash: allows access to the file system as the root user.</li>
     * <li>root_squash: maps the root user to the nobody user when the root user accesses the file system.</li>
     * <li>all_squash: maps all users to the nobody user regardless of the user identity used to access the file system.</li>
     * </ul>
     * <p>The nobody user is a default user in Linux. This user can access only public content on the server and has low privileges and high security.</p>
     * 
     * <strong>example:</strong>
     * <p>all_squash</p>
     */
    @NameInMap("UserAccessType")
    public String userAccessType;

    public static ModifyAccessRuleRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyAccessRuleRequest self = new ModifyAccessRuleRequest();
        return TeaModel.build(map, self);
    }

    public ModifyAccessRuleRequest setAccessGroupName(String accessGroupName) {
        this.accessGroupName = accessGroupName;
        return this;
    }
    public String getAccessGroupName() {
        return this.accessGroupName;
    }

    public ModifyAccessRuleRequest setAccessRuleId(String accessRuleId) {
        this.accessRuleId = accessRuleId;
        return this;
    }
    public String getAccessRuleId() {
        return this.accessRuleId;
    }

    public ModifyAccessRuleRequest setFileSystemType(String fileSystemType) {
        this.fileSystemType = fileSystemType;
        return this;
    }
    public String getFileSystemType() {
        return this.fileSystemType;
    }

    public ModifyAccessRuleRequest setIpv6SourceCidrIp(String ipv6SourceCidrIp) {
        this.ipv6SourceCidrIp = ipv6SourceCidrIp;
        return this;
    }
    public String getIpv6SourceCidrIp() {
        return this.ipv6SourceCidrIp;
    }

    public ModifyAccessRuleRequest setPriority(Integer priority) {
        this.priority = priority;
        return this;
    }
    public Integer getPriority() {
        return this.priority;
    }

    public ModifyAccessRuleRequest setRWAccessType(String RWAccessType) {
        this.RWAccessType = RWAccessType;
        return this;
    }
    public String getRWAccessType() {
        return this.RWAccessType;
    }

    public ModifyAccessRuleRequest setSourceCidrIp(String sourceCidrIp) {
        this.sourceCidrIp = sourceCidrIp;
        return this;
    }
    public String getSourceCidrIp() {
        return this.sourceCidrIp;
    }

    public ModifyAccessRuleRequest setUserAccessType(String userAccessType) {
        this.userAccessType = userAccessType;
        return this;
    }
    public String getUserAccessType() {
        return this.userAccessType;
    }

}
