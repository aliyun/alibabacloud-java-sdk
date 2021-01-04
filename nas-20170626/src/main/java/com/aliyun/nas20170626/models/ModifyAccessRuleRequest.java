// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nas20170626.models;

import com.aliyun.tea.*;

public class ModifyAccessRuleRequest extends TeaModel {
    @NameInMap("AccessGroupName")
    public String accessGroupName;

    @NameInMap("AccessRuleId")
    public String accessRuleId;

    @NameInMap("SourceCidrIp")
    public String sourceCidrIp;

    @NameInMap("RWAccessType")
    public String RWAccessType;

    @NameInMap("UserAccessType")
    public String userAccessType;

    @NameInMap("Priority")
    public Integer priority;

    @NameInMap("FileSystemType")
    public String fileSystemType;

    @NameInMap("Ipv6SourceCidrIp")
    public String ipv6SourceCidrIp;

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

    public ModifyAccessRuleRequest setSourceCidrIp(String sourceCidrIp) {
        this.sourceCidrIp = sourceCidrIp;
        return this;
    }
    public String getSourceCidrIp() {
        return this.sourceCidrIp;
    }

    public ModifyAccessRuleRequest setRWAccessType(String RWAccessType) {
        this.RWAccessType = RWAccessType;
        return this;
    }
    public String getRWAccessType() {
        return this.RWAccessType;
    }

    public ModifyAccessRuleRequest setUserAccessType(String userAccessType) {
        this.userAccessType = userAccessType;
        return this;
    }
    public String getUserAccessType() {
        return this.userAccessType;
    }

    public ModifyAccessRuleRequest setPriority(Integer priority) {
        this.priority = priority;
        return this;
    }
    public Integer getPriority() {
        return this.priority;
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

}
