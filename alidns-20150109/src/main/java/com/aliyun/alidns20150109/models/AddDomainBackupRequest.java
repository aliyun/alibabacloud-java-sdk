// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class AddDomainBackupRequest extends TeaModel {
    /**
     * <p>The domain name.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>test.aliyun.com</p>
     */
    @NameInMap("DomainName")
    public String domainName;

    /**
     * <p>The language of the response. Valid values:</p>
     * <ul>
     * <li>zh: Chinese</li>
     * <li>en: English</li>
     * </ul>
     * <p>Default value: en.</p>
     * 
     * <strong>example:</strong>
     * <p>en</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>The backup cycle. Valid values:</p>
     * <ul>
     * <li>DAY: backs up data on a daily basis.</li>
     * <li>HOUR: backs up data on an hourly basis.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>HOUR</p>
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
