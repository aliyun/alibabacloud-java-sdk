// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudwifi_pop20191118.models;

import com.aliyun.tea.*;

public class GetApStatusByGroupIdRequest extends TeaModel {
    @NameInMap("AppName")
    public String appName;

    @NameInMap("AppCode")
    public String appCode;

    @NameInMap("Cursor")
    public Long cursor;

    @NameInMap("ApgroupId")
    public String apgroupId;

    @NameInMap("PageSize")
    public Integer pageSize;

    public static GetApStatusByGroupIdRequest build(java.util.Map<String, ?> map) throws Exception {
        GetApStatusByGroupIdRequest self = new GetApStatusByGroupIdRequest();
        return TeaModel.build(map, self);
    }

    public GetApStatusByGroupIdRequest setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public GetApStatusByGroupIdRequest setAppCode(String appCode) {
        this.appCode = appCode;
        return this;
    }
    public String getAppCode() {
        return this.appCode;
    }

    public GetApStatusByGroupIdRequest setCursor(Long cursor) {
        this.cursor = cursor;
        return this;
    }
    public Long getCursor() {
        return this.cursor;
    }

    public GetApStatusByGroupIdRequest setApgroupId(String apgroupId) {
        this.apgroupId = apgroupId;
        return this;
    }
    public String getApgroupId() {
        return this.apgroupId;
    }

    public GetApStatusByGroupIdRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

}
