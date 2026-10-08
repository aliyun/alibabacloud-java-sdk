// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.domain20180129.models;

import com.aliyun.tea.*;

public class SaveDomainGroupRequest extends TeaModel {
    /**
     * <p>Domain group ID. If this parameter is not provided, a new group is created. If it is provided, the domain group name is updated.</p>
     * 
     * <strong>example:</strong>
     * <p>123456</p>
     */
    @NameInMap("DomainGroupId")
    public Long domainGroupId;

    /**
     * <p>Domain Name Group Name.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>测试分组</p>
     */
    @NameInMap("DomainGroupName")
    public String domainGroupName;

    /**
     * <p>Language for error messages returned by the API. Valid values:  </p>
     * <ul>
     * <li><strong>zh</strong>: Chinese;  </li>
     * <li><strong>en</strong>: English.</li>
     * </ul>
     * <p>Default value is <strong>en</strong>.</p>
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

    public static SaveDomainGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        SaveDomainGroupRequest self = new SaveDomainGroupRequest();
        return TeaModel.build(map, self);
    }

    public SaveDomainGroupRequest setDomainGroupId(Long domainGroupId) {
        this.domainGroupId = domainGroupId;
        return this;
    }
    public Long getDomainGroupId() {
        return this.domainGroupId;
    }

    public SaveDomainGroupRequest setDomainGroupName(String domainGroupName) {
        this.domainGroupName = domainGroupName;
        return this;
    }
    public String getDomainGroupName() {
        return this.domainGroupName;
    }

    public SaveDomainGroupRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public SaveDomainGroupRequest setUserClientIp(String userClientIp) {
        this.userClientIp = userClientIp;
        return this;
    }
    public String getUserClientIp() {
        return this.userClientIp;
    }

}
