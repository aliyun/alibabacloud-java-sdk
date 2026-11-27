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
     * <li>standard: General-purpose NAS. This is the default value.</li>
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
     * <p>CIDR blocks and IPv6 address ranges are supported.</p>
     * <blockquote>
     * <ul>
     * <li>Only Extreme NAS file systems in regions in the Chinese mainland support IPv6, and the IPv6 feature must be enabled for the file system.</li>
     * <li>Only VPCs are supported.</li>
     * <li>IPv4 and IPv6 are mutually exclusive.</li>
     * </ul>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>2001:250:6000::***</p>
     */
    @NameInMap("Ipv6SourceCidrIp")
    public String ipv6SourceCidrIp;

    /**
     * <p>The priority of the permission group rule.</p>
     * <p>If an authorized object matches multiple rules, the rule with the highest priority takes effect.</p>
     * <p>Valid values: 1 to 100. The value 1 indicates the highest priority.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Priority")
    public Integer priority;

    /**
     * <p>The read and write permissions of the authorized object on the file system.</p>
     * <p>Valid values:</p>
     * <ul>
     * <li>RDWR: read and write. This is the default value.</li>
     * <li>RDONLY: read-only.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>RDWR</p>
     */
    @NameInMap("RWAccessType")
    public String RWAccessType;

    /**
     * <p>The IP address or CIDR block of the authorized object.</p>
     * <p>The format must be a single IP address or a CIDR block.</p>
     * <blockquote>
     * <p>Permission groups of the classic network type support only IP addresses.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>192.0.2.0/16</p>
     */
    @NameInMap("SourceCidrIp")
    public String sourceCidrIp;

    /**
     * <p>The access permissions of system users of the authorization object on the file system.</p>
     * <p>Valid values:</p>
     * <ul>
     * <li>no_squash: allows access to the file system by using the root user. This is the default value.</li>
     * <li>root_squash: maps the root user to the nobody user when the file system is accessed as the root user.</li>
     * <li>all_squash: maps all users to the nobody user regardless of the user identity used to access the file system.</li>
     * </ul>
     * <p>The nobody user is the default user in Linux systems. This user can only access public content on the server and features low permissions and high security.</p>
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
