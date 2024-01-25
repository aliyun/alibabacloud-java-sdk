// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiops20200806.models;

import com.aliyun.tea.*;

public class ListConfirmAuthorizationRequest extends TeaModel {
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

    public static ListConfirmAuthorizationRequest build(java.util.Map<String, ?> map) throws Exception {
        ListConfirmAuthorizationRequest self = new ListConfirmAuthorizationRequest();
        return TeaModel.build(map, self);
    }

    public ListConfirmAuthorizationRequest setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public ListConfirmAuthorizationRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListConfirmAuthorizationRequest setPermissionType(Integer permissionType) {
        this.permissionType = permissionType;
        return this;
    }
    public Integer getPermissionType() {
        return this.permissionType;
    }

    public ListConfirmAuthorizationRequest setSwitchFrontOperaUid(String switchFrontOperaUid) {
        this.switchFrontOperaUid = switchFrontOperaUid;
        return this;
    }
    public String getSwitchFrontOperaUid() {
        return this.switchFrontOperaUid;
    }

    public ListConfirmAuthorizationRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public ListConfirmAuthorizationRequest setUid(Long uid) {
        this.uid = uid;
        return this;
    }
    public Long getUid() {
        return this.uid;
    }

}
