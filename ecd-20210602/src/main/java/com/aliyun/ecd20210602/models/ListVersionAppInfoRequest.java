// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20210602.models;

import com.aliyun.tea.*;

public class ListVersionAppInfoRequest extends TeaModel {
    @NameInMap("AppTag")
    public String appTag;

    @NameInMap("AppUid")
    public String appUid;

    @NameInMap("Name")
    public String name;

    @NameInMap("Os")
    public String os;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("Status")
    public Integer status;

    public static ListVersionAppInfoRequest build(java.util.Map<String, ?> map) throws Exception {
        ListVersionAppInfoRequest self = new ListVersionAppInfoRequest();
        return TeaModel.build(map, self);
    }

    public ListVersionAppInfoRequest setAppTag(String appTag) {
        this.appTag = appTag;
        return this;
    }
    public String getAppTag() {
        return this.appTag;
    }

    public ListVersionAppInfoRequest setAppUid(String appUid) {
        this.appUid = appUid;
        return this;
    }
    public String getAppUid() {
        return this.appUid;
    }

    public ListVersionAppInfoRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public ListVersionAppInfoRequest setOs(String os) {
        this.os = os;
        return this;
    }
    public String getOs() {
        return this.os;
    }

    public ListVersionAppInfoRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListVersionAppInfoRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListVersionAppInfoRequest setStatus(Integer status) {
        this.status = status;
        return this;
    }
    public Integer getStatus() {
        return this.status;
    }

}
