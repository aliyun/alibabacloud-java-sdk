// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class DeleteAclBackupDataRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1743683400</p>
     */
    @NameInMap("BackUpTime")
    public String backUpTime;

    /**
     * <strong>example:</strong>
     * <p>zh</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <strong>example:</strong>
     * <p>192.0.XX.XX</p>
     */
    @NameInMap("SourceIp")
    public String sourceIp;

    public static DeleteAclBackupDataRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteAclBackupDataRequest self = new DeleteAclBackupDataRequest();
        return TeaModel.build(map, self);
    }

    public DeleteAclBackupDataRequest setBackUpTime(String backUpTime) {
        this.backUpTime = backUpTime;
        return this;
    }
    public String getBackUpTime() {
        return this.backUpTime;
    }

    public DeleteAclBackupDataRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public DeleteAclBackupDataRequest setSourceIp(String sourceIp) {
        this.sourceIp = sourceIp;
        return this;
    }
    public String getSourceIp() {
        return this.sourceIp;
    }

}
