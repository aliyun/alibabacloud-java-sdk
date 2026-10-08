// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.domain20180129.models;

import com.aliyun.tea.*;

public class CheckMaxYearOfServerLockRequest extends TeaModel {
    /**
     * <p>Type of purchase operation. Valid values:</p>
     * <ul>
     * <li>activate: new registration</li>
     * <li>renew: renewal</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>activate</p>
     */
    @NameInMap("CheckAction")
    public String checkAction;

    /**
     * <p>The domain name to be checked.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>example.com</p>
     */
    @NameInMap("DomainName")
    public String domainName;

    /**
     * <p>Language of error messages returned by the API. Valid values:</p>
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
     * <p>User IP address.</p>
     * 
     * <strong>example:</strong>
     * <p>127.0.0.1</p>
     */
    @NameInMap("UserClientIp")
    public String userClientIp;

    public static CheckMaxYearOfServerLockRequest build(java.util.Map<String, ?> map) throws Exception {
        CheckMaxYearOfServerLockRequest self = new CheckMaxYearOfServerLockRequest();
        return TeaModel.build(map, self);
    }

    public CheckMaxYearOfServerLockRequest setCheckAction(String checkAction) {
        this.checkAction = checkAction;
        return this;
    }
    public String getCheckAction() {
        return this.checkAction;
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

}
