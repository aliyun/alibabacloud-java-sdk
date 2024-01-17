// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160201.models;

import com.aliyun.tea.*;

public class SetAccessPermissionsForInnerRequest extends TeaModel {
    @NameInMap("AliUid")
    public Long aliUid;

    @NameInMap("ApiId")
    public String apiId;

    @NameInMap("AppIds")
    public String appIds;

    @NameInMap("Description")
    public String description;

    @NameInMap("GroupId")
    public String groupId;

    @NameInMap("Source")
    public String source;

    @NameInMap("StageName")
    public String stageName;

    public static SetAccessPermissionsForInnerRequest build(java.util.Map<String, ?> map) throws Exception {
        SetAccessPermissionsForInnerRequest self = new SetAccessPermissionsForInnerRequest();
        return TeaModel.build(map, self);
    }

    public SetAccessPermissionsForInnerRequest setAliUid(Long aliUid) {
        this.aliUid = aliUid;
        return this;
    }
    public Long getAliUid() {
        return this.aliUid;
    }

    public SetAccessPermissionsForInnerRequest setApiId(String apiId) {
        this.apiId = apiId;
        return this;
    }
    public String getApiId() {
        return this.apiId;
    }

    public SetAccessPermissionsForInnerRequest setAppIds(String appIds) {
        this.appIds = appIds;
        return this;
    }
    public String getAppIds() {
        return this.appIds;
    }

    public SetAccessPermissionsForInnerRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public SetAccessPermissionsForInnerRequest setGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }
    public String getGroupId() {
        return this.groupId;
    }

    public SetAccessPermissionsForInnerRequest setSource(String source) {
        this.source = source;
        return this;
    }
    public String getSource() {
        return this.source;
    }

    public SetAccessPermissionsForInnerRequest setStageName(String stageName) {
        this.stageName = stageName;
        return this;
    }
    public String getStageName() {
        return this.stageName;
    }

}
