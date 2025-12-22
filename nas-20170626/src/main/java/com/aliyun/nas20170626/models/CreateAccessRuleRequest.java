// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nas20170626.models;

import com.aliyun.tea.*;

public class CreateAccessRuleRequest extends TeaModel {
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
     * <p>The type of the file system.</p>
     * <p>Valid values:</p>
     * <ul>
     * <li>standard (default): General-purpose NAS file system.</li>
     * <li>extreme: Extreme NAS file system.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>standard</p>
     */
    @NameInMap("FileSystemType")
    public String fileSystemType;

    /**
     * <p>The IPv6 address or CIDR block of the authorized object.</p>
     * <p>You must set this parameter to an IPv6 address or CIDR block.</p>
     * <blockquote>
     * <ul>
     * <li>Only Extreme NAS file systems that reside in the Chinese mainland support IPv6. If you specify this parameter, you must enable IPv6 for the file system.</li>
     * <li>Only permission groups that reside in virtual private clouds (VPCs) support IPv6.</li>
     * <li>You cannot specify an IPv4 address and an IPv6 address at the same time.</li>
     * </ul>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>2001:250:6000::***</p>
     */
    @NameInMap("Ipv6SourceCidrIp")
    public String ipv6SourceCidrIp;

    /**
     * <p>The priority of the rule.</p>
     * <p>The rule with the highest priority takes effect if multiple rules are attached to the authorized object.</p>
     * <p>Valid values: 1 to 100. The value 1 indicates the highest priority.</p>
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
     * <li>RDWR (default): the read and write permissions.</li>
     * <li>RDONLY: the read-only permissions.</li>
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
     * <blockquote>
     * <p>If the permission group resides in the classic network, you must set this parameter to an IP address.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>192.0.2.0/16</p>
     */
    @NameInMap("SourceCidrIp")
    public String sourceCidrIp;

    /**
     * <p>The access permissions for different types of users in the authorized object.</p>
     * <p>Valid values:</p>
     * <ul>
     * <li>no_squash (default): grants root users the permissions to access the file system.</li>
     * <li>root_squash: grants root users the least permissions as the nobody user.</li>
     * <li>all_squash: grants all users the least permissions as the nobody user.</li>
     * </ul>
     * <p>The nobody user has the least permissions in Linux and can access only the public content of the file system. This ensures the security of the file system.</p>
     * 
     * <strong>example:</strong>
     * <p>no_squash</p>
     */
    @NameInMap("UserAccessType")
    public String userAccessType;

    public static CreateAccessRuleRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateAccessRuleRequest self = new CreateAccessRuleRequest();
        return TeaModel.build(map, self);
    }

    public CreateAccessRuleRequest setAccessGroupName(String accessGroupName) {
        this.accessGroupName = accessGroupName;
        return this;
    }
    public String getAccessGroupName() {
        return this.accessGroupName;
    }

    public CreateAccessRuleRequest setFileSystemType(String fileSystemType) {
        this.fileSystemType = fileSystemType;
        return this;
    }
    public String getFileSystemType() {
        return this.fileSystemType;
    }

    public CreateAccessRuleRequest setIpv6SourceCidrIp(String ipv6SourceCidrIp) {
        this.ipv6SourceCidrIp = ipv6SourceCidrIp;
        return this;
    }
    public String getIpv6SourceCidrIp() {
        return this.ipv6SourceCidrIp;
    }

    public CreateAccessRuleRequest setPriority(Integer priority) {
        this.priority = priority;
        return this;
    }
    public Integer getPriority() {
        return this.priority;
    }

    public CreateAccessRuleRequest setRWAccessType(String RWAccessType) {
        this.RWAccessType = RWAccessType;
        return this;
    }
    public String getRWAccessType() {
        return this.RWAccessType;
    }

    public CreateAccessRuleRequest setSourceCidrIp(String sourceCidrIp) {
        this.sourceCidrIp = sourceCidrIp;
        return this;
    }
    public String getSourceCidrIp() {
        return this.sourceCidrIp;
    }

    public CreateAccessRuleRequest setUserAccessType(String userAccessType) {
        this.userAccessType = userAccessType;
        return this;
    }
    public String getUserAccessType() {
        return this.userAccessType;
    }

}
