// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class AddAclBackupDataRequest extends TeaModel {
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
     * <p>bj-001</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <strong>example:</strong>
     * <p>zh</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <strong>example:</strong>
     * <p>115.194.124.XXX</p>
     */
    @NameInMap("SourceIp")
    public String sourceIp;

    public static AddAclBackupDataRequest build(java.util.Map<String, ?> map) throws Exception {
        AddAclBackupDataRequest self = new AddAclBackupDataRequest();
        return TeaModel.build(map, self);
    }

    public AddAclBackupDataRequest setBackUpTime(String backUpTime) {
        this.backUpTime = backUpTime;
        return this;
    }
    public String getBackUpTime() {
        return this.backUpTime;
    }

    public AddAclBackupDataRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public AddAclBackupDataRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public AddAclBackupDataRequest setSourceIp(String sourceIp) {
        this.sourceIp = sourceIp;
        return this;
    }
    public String getSourceIp() {
        return this.sourceIp;
    }

}
