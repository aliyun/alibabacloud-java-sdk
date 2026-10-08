// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.domain20180129.models;

import com.aliyun.tea.*;

public class CheckProcessingServerLockApplyRequest extends TeaModel {
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
     * <p>Registration period in years. Unit: <strong>year(s)</strong>. Valid range: <strong>1 to 10</strong> years.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("FeePeriod")
    public Integer feePeriod;

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
     * <p>User IP address. You can set it to <strong>127.0.0.1</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>127.0.0.1</p>
     */
    @NameInMap("UserClientIp")
    public String userClientIp;

    public static CheckProcessingServerLockApplyRequest build(java.util.Map<String, ?> map) throws Exception {
        CheckProcessingServerLockApplyRequest self = new CheckProcessingServerLockApplyRequest();
        return TeaModel.build(map, self);
    }

    public CheckProcessingServerLockApplyRequest setDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }
    public String getDomainName() {
        return this.domainName;
    }

    public CheckProcessingServerLockApplyRequest setFeePeriod(Integer feePeriod) {
        this.feePeriod = feePeriod;
        return this;
    }
    public Integer getFeePeriod() {
        return this.feePeriod;
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
