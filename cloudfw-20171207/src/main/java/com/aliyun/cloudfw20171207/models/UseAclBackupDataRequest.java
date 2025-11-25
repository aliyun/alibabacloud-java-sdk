// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class UseAclBackupDataRequest extends TeaModel {
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
     * <p>123.113.99.XXX</p>
     */
    @NameInMap("SourceIp")
    public String sourceIp;

    public static UseAclBackupDataRequest build(java.util.Map<String, ?> map) throws Exception {
        UseAclBackupDataRequest self = new UseAclBackupDataRequest();
        return TeaModel.build(map, self);
    }

    public UseAclBackupDataRequest setBackUpTime(String backUpTime) {
        this.backUpTime = backUpTime;
        return this;
    }
    public String getBackUpTime() {
        return this.backUpTime;
    }

    public UseAclBackupDataRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public UseAclBackupDataRequest setSourceIp(String sourceIp) {
        this.sourceIp = sourceIp;
        return this;
    }
    public String getSourceIp() {
        return this.sourceIp;
    }

}
