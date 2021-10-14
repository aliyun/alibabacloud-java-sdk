// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudwifi_pop20191118.models;

import com.aliyun.tea.*;

public class ListApgroupDescendantRequest extends TeaModel {
    // apgroupId
    @NameInMap("ApgroupId")
    public Long apgroupId;

    // apgroupUuid
    @NameInMap("ApgroupUuid")
    public String apgroupUuid;

    // appSecret
    @NameInMap("AppCode")
    public String appCode;

    // appKey
    @NameInMap("AppName")
    public String appName;

    // cursor
    @NameInMap("Cursor")
    public Long cursor;

    // level
    @NameInMap("Level")
    public Long level;

    // pageSize
    @NameInMap("PageSize")
    public Integer pageSize;

    public static ListApgroupDescendantRequest build(java.util.Map<String, ?> map) throws Exception {
        ListApgroupDescendantRequest self = new ListApgroupDescendantRequest();
        return TeaModel.build(map, self);
    }

    public ListApgroupDescendantRequest setApgroupId(Long apgroupId) {
        this.apgroupId = apgroupId;
        return this;
    }
    public Long getApgroupId() {
        return this.apgroupId;
    }

    public ListApgroupDescendantRequest setApgroupUuid(String apgroupUuid) {
        this.apgroupUuid = apgroupUuid;
        return this;
    }
    public String getApgroupUuid() {
        return this.apgroupUuid;
    }

    public ListApgroupDescendantRequest setAppCode(String appCode) {
        this.appCode = appCode;
        return this;
    }
    public String getAppCode() {
        return this.appCode;
    }

    public ListApgroupDescendantRequest setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public ListApgroupDescendantRequest setCursor(Long cursor) {
        this.cursor = cursor;
        return this;
    }
    public Long getCursor() {
        return this.cursor;
    }

    public ListApgroupDescendantRequest setLevel(Long level) {
        this.level = level;
        return this;
    }
    public Long getLevel() {
        return this.level;
    }

    public ListApgroupDescendantRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

}
