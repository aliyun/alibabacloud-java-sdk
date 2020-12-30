// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.domain20180129.models;

import com.aliyun.tea.*;

public class CheckProcessingServerLockApplyRequest extends TeaModel {
    @NameInMap("FeePeriod")
    public Integer feePeriod;

    @NameInMap("DomainName")
    public String domainName;

    @NameInMap("Lang")
    public String lang;

    @NameInMap("UserClientIp")
    public String userClientIp;

    public static CheckProcessingServerLockApplyRequest build(java.util.Map<String, ?> map) throws Exception {
        CheckProcessingServerLockApplyRequest self = new CheckProcessingServerLockApplyRequest();
        return TeaModel.build(map, self);
    }

    public CheckProcessingServerLockApplyRequest setFeePeriod(Integer feePeriod) {
        this.feePeriod = feePeriod;
        return this;
    }
    public Integer getFeePeriod() {
        return this.feePeriod;
    }

    public CheckProcessingServerLockApplyRequest setDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }
    public String getDomainName() {
        return this.domainName;
    }

    public CheckProcessingServerLockApplyRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public CheckProcessingServerLockApplyRequest setUserClientIp(String userClientIp) {
        this.userClientIp = userClientIp;
        return this;
    }
    public String getUserClientIp() {
        return this.userClientIp;
    }

}
