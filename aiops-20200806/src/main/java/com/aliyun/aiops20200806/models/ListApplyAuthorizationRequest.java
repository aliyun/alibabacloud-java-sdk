// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiops20200806.models;

import com.aliyun.tea.*;

public class ListApplyAuthorizationRequest extends TeaModel {
    @NameInMap("CurrentPage")
    public Integer currentPage;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("PermissionType")
    public Integer permissionType;

    @NameInMap("SwitchFrontOperaUid")
    public String switchFrontOperaUid;

    @NameInMap("Type")
    public String type;

    @NameInMap("Uid")
    public Long uid;

    public static ListApplyAuthorizationRequest build(java.util.Map<String, ?> map) throws Exception {
        ListApplyAuthorizationRequest self = new ListApplyAuthorizationRequest();
        return TeaModel.build(map, self);
    }

    public ListApplyAuthorizationRequest setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public ListApplyAuthorizationRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListApplyAuthorizationRequest setPermissionType(Integer permissionType) {
        this.permissionType = permissionType;
        return this;
    }
    public Integer getPermissionType() {
        return this.permissionType;
    }

    public ListApplyAuthorizationRequest setSwitchFrontOperaUid(String switchFrontOperaUid) {
        this.switchFrontOperaUid = switchFrontOperaUid;
        return this;
    }
    public String getSwitchFrontOperaUid() {
        return this.switchFrontOperaUid;
    }

    public ListApplyAuthorizationRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public ListApplyAuthorizationRequest setUid(Long uid) {
        this.uid = uid;
        return this;
    }
    public Long getUid() {
        return this.uid;
    }

}
