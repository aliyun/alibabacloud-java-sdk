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
     * <p>The rule ID.</p>
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
     * <li>standard (default): General-purpose NAS file system</li>
     * <li>extreme: Extreme NAS file system</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>standard</p>
     */
    @NameInMap("FileSystemType")
    public String fileSystemType;

    /**
     * <p>The IPv6 address or CIDR block of the authorized object.</p>
     * <p>You must set this parameter to an IPv6 IP address or CIDR block.</p>
     * <blockquote>
     * <ul>
     * <li>Only Extreme NAS file systems that reside in the China (Hohhot) region support IPv6.</li>
     * <li>Only permission groups that reside in virtual private clouds (VPCs) support IPv6.</li>
     * <li>This parameter is unavailable if you specify the SourceCidrIp parameter.</li>
     * </ul>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>fe80::3d4a:80fd:f05d:****</p>
     */
    @NameInMap("Ipv6SourceCidrIp")
    public String ipv6SourceCidrIp;

    /**
     * <p>The priority of the rule.</p>
     * <p>Valid values: 1 to 100.</p>
     * <p>Default value: 1, which indicates the highest priority.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Priority")
    public Integer priority;

    /**
     * <p>The access permissions of the authorized object on the file system.</p>
     * <p>Valid values:</p>
     * <ul>
     * <li>RDWR (default): the read and write permissions</li>
     * <li>RDONLY: the read-only permissions</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>RDWR</p>
     */
    @NameInMap("RWAccessType")
    public String RWAccessType;

    /**
     * <p>The IP address or CIDR block of the authorized object.</p>
     * <p>You must set this parameter to an IP address or CIDR block.</p>
     * 
     * <strong>example:</strong>
     * <p><code>192.0.**.**</code></p>
     */
    @NameInMap("SourceCidrIp")
    public String sourceCidrIp;

    /**
     * <p>The access permissions for different types of users in the authorized object.</p>
     * <p>Valid values:</p>
     * <ul>
     * <li>no_squash: allows access from root users to the file system.</li>
     * <li>root_squash: grants root users the least permissions as the nobody user.</li>
     * <li>all_squash: grants all users the least permissions as the nobody user.</li>
     * </ul>
     * <p>The nobody user has the least permissions in Linux and can access only the public content of the file system. This ensures the security of the file system.</p>
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
