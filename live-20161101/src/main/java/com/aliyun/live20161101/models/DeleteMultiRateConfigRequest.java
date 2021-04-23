// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class DeleteMultiRateConfigRequest extends TeaModel {
    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("DomainName")
    public String domainName;

    @NameInMap("App")
    public String app;

    @NameInMap("GroupId")
    public String groupId;

    @NameInMap("DeleteAll")
    public String deleteAll;

    @NameInMap("Templates")
    public String templates;

    public static DeleteMultiRateConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteMultiRateConfigRequest self = new DeleteMultiRateConfigRequest();
        return TeaModel.build(map, self);
    }

    public DeleteMultiRateConfigRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public DeleteMultiRateConfigRequest setDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }
    public String getDomainName() {
        return this.domainName;
    }

    public DeleteMultiRateConfigRequest setApp(String app) {
        this.app = app;
        return this;
    }
    public String getApp() {
        return this.app;
    }

    public DeleteMultiRateConfigRequest setGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }
    public String getGroupId() {
        return this.groupId;
    }

    public DeleteMultiRateConfigRequest setDeleteAll(String deleteAll) {
        this.deleteAll = deleteAll;
        return this;
    }
    public String getDeleteAll() {
        return this.deleteAll;
    }

    public DeleteMultiRateConfigRequest setTemplates(String templates) {
        this.templates = templates;
        return this;
    }
    public String getTemplates() {
        return this.templates;
    }

}
