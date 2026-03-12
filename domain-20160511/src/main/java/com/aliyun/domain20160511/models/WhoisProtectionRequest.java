// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.domain20160511.models;

import com.aliyun.tea.*;

public class WhoisProtectionRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("DataContent")
    public String dataContent;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("DataSource")
    public Integer dataSource;

    @NameInMap("Lang")
    public String lang;

    @NameInMap("UserClientIp")
    public String userClientIp;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("WhoisProtect")
    public Boolean whoisProtect;

    public static WhoisProtectionRequest build(java.util.Map<String, ?> map) throws Exception {
        WhoisProtectionRequest self = new WhoisProtectionRequest();
        return TeaModel.build(map, self);
    }

    public WhoisProtectionRequest setDataContent(String dataContent) {
        this.dataContent = dataContent;
        return this;
    }
    public String getDataContent() {
        return this.dataContent;
    }

    public WhoisProtectionRequest setDataSource(Integer dataSource) {
        this.dataSource = dataSource;
        return this;
    }
    public Integer getDataSource() {
        return this.dataSource;
    }

    public WhoisProtectionRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public WhoisProtectionRequest setUserClientIp(String userClientIp) {
        this.userClientIp = userClientIp;
        return this;
    }
    public String getUserClientIp() {
        return this.userClientIp;
    }

    public WhoisProtectionRequest setWhoisProtect(Boolean whoisProtect) {
        this.whoisProtect = whoisProtect;
        return this;
    }
    public Boolean getWhoisProtect() {
        return this.whoisProtect;
    }

}
