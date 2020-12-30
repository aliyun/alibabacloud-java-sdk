// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.domain20180129.models;

import com.aliyun.tea.*;

public class CheckMaxYearOfServerLockRequest extends TeaModel {
    @NameInMap("DomainName")
    public String domainName;

    @NameInMap("Lang")
    public String lang;

    @NameInMap("UserClientIp")
    public String userClientIp;

    @NameInMap("CheckAction")
    public String checkAction;

    public static CheckMaxYearOfServerLockRequest build(java.util.Map<String, ?> map) throws Exception {
        CheckMaxYearOfServerLockRequest self = new CheckMaxYearOfServerLockRequest();
        return TeaModel.build(map, self);
    }

    public CheckMaxYearOfServerLockRequest setDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }
    public String getDomainName() {
        return this.domainName;
    }

    public CheckMaxYearOfServerLockRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public CheckMaxYearOfServerLockRequest setUserClientIp(String userClientIp) {
        this.userClientIp = userClientIp;
        return this;
    }
    public String getUserClientIp() {
        return this.userClientIp;
    }

    public CheckMaxYearOfServerLockRequest setCheckAction(String checkAction) {
        this.checkAction = checkAction;
        return this;
    }
    public String getCheckAction() {
        return this.checkAction;
    }

}
