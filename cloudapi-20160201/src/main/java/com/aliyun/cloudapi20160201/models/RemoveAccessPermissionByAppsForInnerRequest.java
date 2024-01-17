// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160201.models;

import com.aliyun.tea.*;

public class RemoveAccessPermissionByAppsForInnerRequest extends TeaModel {
    @NameInMap("AliUid")
    public Long aliUid;

    @NameInMap("ApiId")
    public String apiId;

    @NameInMap("AppIds")
    public String appIds;

    @NameInMap("GroupId")
    public String groupId;

    @NameInMap("Source")
    public String source;

    @NameInMap("StageName")
    public String stageName;

    public static RemoveAccessPermissionByAppsForInnerRequest build(java.util.Map<String, ?> map) throws Exception {
        RemoveAccessPermissionByAppsForInnerRequest self = new RemoveAccessPermissionByAppsForInnerRequest();
        return TeaModel.build(map, self);
    }

    public RemoveAccessPermissionByAppsForInnerRequest setAliUid(Long aliUid) {
        this.aliUid = aliUid;
        return this;
    }
    public Long getAliUid() {
        return this.aliUid;
    }

    public RemoveAccessPermissionByAppsForInnerRequest setApiId(String apiId) {
        this.apiId = apiId;
        return this;
    }
    public String getApiId() {
        return this.apiId;
    }

    public RemoveAccessPermissionByAppsForInnerRequest setAppIds(String appIds) {
        this.appIds = appIds;
        return this;
    }
    public String getAppIds() {
        return this.appIds;
    }

    public RemoveAccessPermissionByAppsForInnerRequest setGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }
    public String getGroupId() {
        return this.groupId;
    }

    public RemoveAccessPermissionByAppsForInnerRequest setSource(String source) {
        this.source = source;
        return this;
    }
    public String getSource() {
        return this.source;
    }

    public RemoveAccessPermissionByAppsForInnerRequest setStageName(String stageName) {
        this.stageName = stageName;
        return this;
    }
    public String getStageName() {
        return this.stageName;
    }

}
