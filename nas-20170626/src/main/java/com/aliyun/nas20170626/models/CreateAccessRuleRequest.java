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
     * <p>The value supports CIDR format and IPv6 format address range.</p>
     * <blockquote>
     * <ul>
     * <li>The IPv6 feature is supported only by Extreme NAS file systems in regions in the Chinese mainland, and IPv6 must be enabled for the file system.</li>
     * <li>Only VPC networks are supported.</li>
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
     * <p>The priority of the permission rule.</p>
     * <p>If an authorized address matches multiple rules, the rule with the highest priority takes effect.</p>
     * <p>Valid values: 1 to 100. The value 1 indicates the highest priority.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Priority")
    public Integer priority;

    /**
     * <p>The read and write permissions of the authorized address on the file system.</p>
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
     * <p>The IP address or CIDR block of the authorized address.</p>
     * <p>The value must be a single IP address or a CIDR block.</p>
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
     * <p>The access permissions of the system user of the authorized address on the file system.</p>
     * <p>Valid values:</p>
     * <ul>
     * <li>no_squash (default): allows access to the file system as the root user.</li>
     * <li>root_squash: maps the root user to the nobody user when the root user accesses the file system.</li>
     * <li>all_squash: maps all users to the nobody user regardless of the user identity.</li>
     * </ul>
     * <p>The nobody user is a default user in Linux. The nobody user can access only public content on the server and has low privileges and high security. Authorization is required for the system user to access the file system.</p>
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
