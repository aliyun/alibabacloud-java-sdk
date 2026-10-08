// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.domain20180129.models;

import com.aliyun.tea.*;

public class SaveBatchTaskForUpdateProhibitionLockRequest extends TeaModel {
    /**
     * <p>The domain names.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>aliyundoc.com</p>
     */
    @NameInMap("DomainName")
    public java.util.List<String> domainName;

    /**
     * <p>The language of the error message to be returned. Valid values:</p>
     * <ul>
     * <li><p><strong>zh</strong>: Chinese</p>
     * </li>
     * <li><p><strong>en</strong>: English</p>
     * </li>
     * </ul>
     * <p>Default value: <strong>en</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>en</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>Specifies whether to enable or disable the update prohibition lock. Valid values:</p>
     * <ul>
     * <li><p><strong>true</strong>: enables the lock.</p>
     * </li>
     * <li><p><strong>false</strong>: disables the lock.</p>
     * </li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("Status")
    public Boolean status;

    /**
     * <p>The user IP address.</p>
     * 
     * <strong>example:</strong>
     * <p>127.0.0.1</p>
     */
    @NameInMap("UserClientIp")
    public String userClientIp;

    public static SaveBatchTaskForUpdateProhibitionLockRequest build(java.util.Map<String, ?> map) throws Exception {
        SaveBatchTaskForUpdateProhibitionLockRequest self = new SaveBatchTaskForUpdateProhibitionLockRequest();
        return TeaModel.build(map, self);
    }

    public SaveBatchTaskForUpdateProhibitionLockRequest setDomainName(java.util.List<String> domainName) {
        this.domainName = domainName;
        return this;
    }
    public java.util.List<String> getDomainName() {
        return this.domainName;
    }

    public SaveBatchTaskForUpdateProhibitionLockRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public SaveBatchTaskForUpdateProhibitionLockRequest setStatus(Boolean status) {
        this.status = status;
        return this;
    }
    public Boolean getStatus() {
        return this.status;
    }

    public SaveBatchTaskForUpdateProhibitionLockRequest setUserClientIp(String userClientIp) {
        this.userClientIp = userClientIp;
        return this;
    }
    public String getUserClientIp() {
        return this.userClientIp;
    }

}
