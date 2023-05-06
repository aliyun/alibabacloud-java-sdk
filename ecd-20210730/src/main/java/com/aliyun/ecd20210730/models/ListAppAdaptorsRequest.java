// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20210730.models;

import com.aliyun.tea.*;

public class ListAppAdaptorsRequest extends TeaModel {
    @NameInMap("AppName")
    public String appName;

    @NameInMap("PageNumber")
    public Long pageNumber;

    @NameInMap("PageSize")
    public Long pageSize;

    @NameInMap("Status")
    public Integer status;

    @NameInMap("Type")
    public Integer type;

    @NameInMap("Uid")
    public String uid;

    @NameInMap("VersionUid")
    public String versionUid;

    public static ListAppAdaptorsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListAppAdaptorsRequest self = new ListAppAdaptorsRequest();
        return TeaModel.build(map, self);
    }

    public ListAppAdaptorsRequest setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public ListAppAdaptorsRequest setPageNumber(Long pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Long getPageNumber() {
        return this.pageNumber;
    }

    public ListAppAdaptorsRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public ListAppAdaptorsRequest setStatus(Integer status) {
        this.status = status;
        return this;
    }
    public Integer getStatus() {
        return this.status;
    }

    public ListAppAdaptorsRequest setType(Integer type) {
        this.type = type;
        return this;
    }
    public Integer getType() {
        return this.type;
    }

    public ListAppAdaptorsRequest setUid(String uid) {
        this.uid = uid;
        return this;
    }
    public String getUid() {
        return this.uid;
    }

    public ListAppAdaptorsRequest setVersionUid(String versionUid) {
        this.versionUid = versionUid;
        return this;
    }
    public String getVersionUid() {
        return this.versionUid;
    }

}
