// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudwifi_pop20191118.models;

import com.aliyun.tea.*;

public class GetStaStatusListByApRequest extends TeaModel {
    @NameInMap("ApMac")
    public String apMac;

    @NameInMap("AppCode")
    public String appCode;

    @NameInMap("AppName")
    public String appName;

    @NameInMap("Cursor")
    public Long cursor;

    @NameInMap("PageSize")
    public Integer pageSize;

    public static GetStaStatusListByApRequest build(java.util.Map<String, ?> map) throws Exception {
        GetStaStatusListByApRequest self = new GetStaStatusListByApRequest();
        return TeaModel.build(map, self);
    }

    public GetStaStatusListByApRequest setApMac(String apMac) {
        this.apMac = apMac;
        return this;
    }
    public String getApMac() {
        return this.apMac;
    }

    public GetStaStatusListByApRequest setAppCode(String appCode) {
        this.appCode = appCode;
        return this;
    }
    public String getAppCode() {
        return this.appCode;
    }

    public GetStaStatusListByApRequest setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public GetStaStatusListByApRequest setCursor(Long cursor) {
        this.cursor = cursor;
        return this;
    }
    public Long getCursor() {
        return this.cursor;
    }

    public GetStaStatusListByApRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

}
