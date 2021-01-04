// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gameshield20180305.models;

import com.aliyun.tea.*;

public class UpdateFlexBackupGroupsRequest extends TeaModel {
    @NameInMap("SourceIp")
    public String sourceIp;

    @NameInMap("Lang")
    public String lang;

    @NameInMap("EsnBizId")
    public Long esnBizId;

    @NameInMap("GroupId")
    public String groupId;

    @NameInMap("BackupGroupPolicy")
    public Integer backupGroupPolicy;

    @NameInMap("Backups")
    public String backups;

    @NameInMap("SharedBackups")
    public String sharedBackups;

    public static UpdateFlexBackupGroupsRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateFlexBackupGroupsRequest self = new UpdateFlexBackupGroupsRequest();
        return TeaModel.build(map, self);
    }

    public UpdateFlexBackupGroupsRequest setSourceIp(String sourceIp) {
        this.sourceIp = sourceIp;
        return this;
    }
    public String getSourceIp() {
        return this.sourceIp;
    }

    public UpdateFlexBackupGroupsRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public UpdateFlexBackupGroupsRequest setEsnBizId(Long esnBizId) {
        this.esnBizId = esnBizId;
        return this;
    }
    public Long getEsnBizId() {
        return this.esnBizId;
    }

    public UpdateFlexBackupGroupsRequest setGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }
    public String getGroupId() {
        return this.groupId;
    }

    public UpdateFlexBackupGroupsRequest setBackupGroupPolicy(Integer backupGroupPolicy) {
        this.backupGroupPolicy = backupGroupPolicy;
        return this;
    }
    public Integer getBackupGroupPolicy() {
        return this.backupGroupPolicy;
    }

    public UpdateFlexBackupGroupsRequest setBackups(String backups) {
        this.backups = backups;
        return this;
    }
    public String getBackups() {
        return this.backups;
    }

    public UpdateFlexBackupGroupsRequest setSharedBackups(String sharedBackups) {
        this.sharedBackups = sharedBackups;
        return this;
    }
    public String getSharedBackups() {
        return this.sharedBackups;
    }

}
