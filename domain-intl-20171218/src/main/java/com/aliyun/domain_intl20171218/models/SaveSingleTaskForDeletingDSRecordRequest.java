// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.domain_intl20171218.models;

import com.aliyun.tea.*;

public class SaveSingleTaskForDeletingDSRecordRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("DomainName")
    public String domainName;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("KeyTag")
    public Integer keyTag;

    @NameInMap("Lang")
    public String lang;

    @NameInMap("UserClientIp")
    public String userClientIp;

    public static SaveSingleTaskForDeletingDSRecordRequest build(java.util.Map<String, ?> map) throws Exception {
        SaveSingleTaskForDeletingDSRecordRequest self = new SaveSingleTaskForDeletingDSRecordRequest();
        return TeaModel.build(map, self);
    }

    public SaveSingleTaskForDeletingDSRecordRequest setDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }
    public String getDomainName() {
        return this.domainName;
    }

    public SaveSingleTaskForDeletingDSRecordRequest setKeyTag(Integer keyTag) {
        this.keyTag = keyTag;
        return this;
    }
    public Integer getKeyTag() {
        return this.keyTag;
    }

    public SaveSingleTaskForDeletingDSRecordRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public SaveSingleTaskForDeletingDSRecordRequest setUserClientIp(String userClientIp) {
        this.userClientIp = userClientIp;
        return this;
    }
    public String getUserClientIp() {
        return this.userClientIp;
    }

}
