// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class ImportMasterKeyVO extends TeaModel {
    @NameInMap("EncryptMekDataBase64")
    public String encryptMekDataBase64;

    @NameInMap("MekId")
    public Long mekId;

    @NameInMap("ProjectId")
    public java.util.List<Long> projectId;

    public static ImportMasterKeyVO build(java.util.Map<String, ?> map) throws Exception {
        ImportMasterKeyVO self = new ImportMasterKeyVO();
        return TeaModel.build(map, self);
    }

    public ImportMasterKeyVO setEncryptMekDataBase64(String encryptMekDataBase64) {
        this.encryptMekDataBase64 = encryptMekDataBase64;
        return this;
    }
    public String getEncryptMekDataBase64() {
        return this.encryptMekDataBase64;
    }

    public ImportMasterKeyVO setMekId(Long mekId) {
        this.mekId = mekId;
        return this;
    }
    public Long getMekId() {
        return this.mekId;
    }

    public ImportMasterKeyVO setProjectId(java.util.List<Long> projectId) {
        this.projectId = projectId;
        return this;
    }
    public java.util.List<Long> getProjectId() {
        return this.projectId;
    }

}
