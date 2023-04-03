// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class AddDomainBackupRequest extends TeaModel {
    /**
     * <p>The domain name for which you want to create a backup task.</p>
     */
    @NameInMap("DomainName")
    public String domainName;

    /**
     * <p>The language in which you want the values of some response parameters to be returned. These response parameters support multiple languages.</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>The backup cycle. Valid values:</p>
     * <br>
     * <p>*   **DAY**: Backs up data once every day.</p>
     * <p>*   **HOUR**: Backs up data once every hour.</p>
     */
    @NameInMap("PeriodType")
    public String periodType;

    public static AddDomainBackupRequest build(java.util.Map<String, ?> map) throws Exception {
        AddDomainBackupRequest self = new AddDomainBackupRequest();
        return TeaModel.build(map, self);
    }

    public AddDomainBackupRequest setDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }
    public String getDomainName() {
        return this.domainName;
    }

    public AddDomainBackupRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public AddDomainBackupRequest setPeriodType(String periodType) {
        this.periodType = periodType;
        return this;
    }
    public String getPeriodType() {
        return this.periodType;
    }

}
