// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class CreateMonitorGroupRequest extends TeaModel {
    @NameInMap("Type")
    public String type;

    @NameInMap("GroupName")
    public String groupName;

    @NameInMap("ServiceId")
    public Long serviceId;

    @NameInMap("BindUrl")
    public String bindUrl;

    @NameInMap("ContactGroups")
    public String contactGroups;

    @NameInMap("Options")
    public String options;

    public static CreateMonitorGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateMonitorGroupRequest self = new CreateMonitorGroupRequest();
        return TeaModel.build(map, self);
    }

    public CreateMonitorGroupRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public CreateMonitorGroupRequest setGroupName(String groupName) {
        this.groupName = groupName;
        return this;
    }
    public String getGroupName() {
        return this.groupName;
    }

    public CreateMonitorGroupRequest setServiceId(Long serviceId) {
        this.serviceId = serviceId;
        return this;
    }
    public Long getServiceId() {
        return this.serviceId;
    }

    public CreateMonitorGroupRequest setBindUrl(String bindUrl) {
        this.bindUrl = bindUrl;
        return this;
    }
    public String getBindUrl() {
        return this.bindUrl;
    }

    public CreateMonitorGroupRequest setContactGroups(String contactGroups) {
        this.contactGroups = contactGroups;
        return this;
    }
    public String getContactGroups() {
        return this.contactGroups;
    }

    public CreateMonitorGroupRequest setOptions(String options) {
        this.options = options;
        return this;
    }
    public String getOptions() {
        return this.options;
    }

}
