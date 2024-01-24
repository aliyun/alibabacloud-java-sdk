// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nas20170626.models;

import com.aliyun.tea.*;

public class CreateAccessRuleRequest extends TeaModel {
    /**
     * <p>The name of the permission group.</p>
     */
    @NameInMap("AccessGroupName")
    public String accessGroupName;

    /**
     * <p>The type of the file system.</p>
     * <br>
     * <p>Valid values:</p>
     * <br>
     * <p>*   standard (default): General-purpose NAS file system</p>
     * <p>*   extreme: Extreme NAS file system</p>
     */
    @NameInMap("FileSystemType")
    public String fileSystemType;

    /**
     * <p>The IPv6 address or CIDR block of the authorized object.</p>
     * <br>
     * <p>You must set this parameter to an IPv6 address or CIDR block.</p>
     * <br>
     * <p>> *   Only Extreme NAS file systems that reside in the Chinese mainland support IPv6. If you specify this parameter, you must enable IPv6 for the file system.</p>
     * <p>>*   Only permission groups that reside in virtual private clouds (VPCs) support IPv6.</p>
     * <p>>*   You cannot specify an IPv4 address and an IPv6 address at the same time.</p>
     */
    @NameInMap("Ipv6SourceCidrIp")
    public String ipv6SourceCidrIp;

    /**
     * <p>The priority of the rule.</p>
     * <br>
     * <p>The rule with the highest priority takes effect if multiple rules are attached to the authorized object.</p>
     * <br>
     * <p>Valid values: 1 to 100. The value 1 indicates the highest priority.</p>
     */
    @NameInMap("Priority")
    public Integer priority;

    /**
     * <p>The access permissions of the authorized object on the file system.</p>
     * <br>
     * <p>Valid values:</p>
     * <br>
     * <p>*   RDWR (default): the read and write permissions</p>
     * <p>*   RDONLY: the read-only permissions</p>
     */
    @NameInMap("RWAccessType")
    public String RWAccessType;

    /**
     * <p>The IP address or CIDR block of the authorized object.</p>
     * <br>
     * <p>You must set this parameter to an IP address or CIDR block.</p>
     * <br>
     * <p>> If the permission group resides in the classic network, you must set this parameter to an IP address.</p>
     */
    @NameInMap("SourceCidrIp")
    public String sourceCidrIp;

    /**
     * <p>The access permissions for different types of users in the authorized object.</p>
     * <br>
     * <p>Valid values:</p>
     * <br>
     * <p>*   no_squash (default): grants root users the permissions to access the file system.</p>
     * <p>*   root_squash: grants root users the least permissions as the nobody user.</p>
     * <p>*   all_squash: grants all users the least permissions as the nobody user.</p>
     * <br>
     * <p>The nobody user has the least permissions in Linux and can access only the public content of the file system. This ensures the security of the file system.</p>
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
