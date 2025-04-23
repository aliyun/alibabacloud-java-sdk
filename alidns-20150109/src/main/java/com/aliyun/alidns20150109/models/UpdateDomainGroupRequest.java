// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class UpdateDomainGroupRequest extends TeaModel {
    /**
     * <p>The ID of the domain name group whose name you want to modify. You can call the <a href="https://www.alibabacloud.com/help/zh/dns/api-alidns-2015-01-09-describedomaingroups?spm=a2c63.p38356.help-menu-search-29697.d_0">DescribeDomainGroups </a>operation to obtain the ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2223</p>
     */
    @NameInMap("GroupId")
    public String groupId;

    /**
     * <p>The new name of the domain name group.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>NewName</p>
     */
    @NameInMap("GroupName")
    public String groupName;

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

    public static UpdateDomainGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateDomainGroupRequest self = new UpdateDomainGroupRequest();
        return TeaModel.build(map, self);
    }

    public UpdateDomainGroupRequest setGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }
    public String getGroupId() {
        return this.groupId;
    }

    public UpdateDomainGroupRequest setGroupName(String groupName) {
        this.groupName = groupName;
        return this;
    }
    public String getGroupName() {
        return this.groupName;
    }

    public UpdateDomainGroupRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

}
