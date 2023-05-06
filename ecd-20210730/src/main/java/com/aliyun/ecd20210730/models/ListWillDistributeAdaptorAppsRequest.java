// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20210730.models;

import com.aliyun.tea.*;

public class ListWillDistributeAdaptorAppsRequest extends TeaModel {
    @NameInMap("AppId")
    public Long appId;

    @NameInMap("AppName")
    public String appName;

    @NameInMap("Os")
    public String os;

    @NameInMap("OsType")
    public String osType;

    @NameInMap("PageNumber")
    public String pageNumber;

    @NameInMap("PageSize")
    public String pageSize;

    @NameInMap("RuntimeEnv")
    public String runtimeEnv;

    @NameInMap("Type")
    public Integer type;

    public static ListWillDistributeAdaptorAppsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListWillDistributeAdaptorAppsRequest self = new ListWillDistributeAdaptorAppsRequest();
        return TeaModel.build(map, self);
    }

    public ListWillDistributeAdaptorAppsRequest setAppId(Long appId) {
        this.appId = appId;
        return this;
    }
    public Long getAppId() {
        return this.appId;
    }

    public ListWillDistributeAdaptorAppsRequest setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public ListWillDistributeAdaptorAppsRequest setOs(String os) {
        this.os = os;
        return this;
    }
    public String getOs() {
        return this.os;
    }

    public ListWillDistributeAdaptorAppsRequest setOsType(String osType) {
        this.osType = osType;
        return this;
    }
    public String getOsType() {
        return this.osType;
    }

    public ListWillDistributeAdaptorAppsRequest setPageNumber(String pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public String getPageNumber() {
        return this.pageNumber;
    }

    public ListWillDistributeAdaptorAppsRequest setPageSize(String pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public String getPageSize() {
        return this.pageSize;
    }

    public ListWillDistributeAdaptorAppsRequest setRuntimeEnv(String runtimeEnv) {
        this.runtimeEnv = runtimeEnv;
        return this;
    }
    public String getRuntimeEnv() {
        return this.runtimeEnv;
    }

    public ListWillDistributeAdaptorAppsRequest setType(Integer type) {
        this.type = type;
        return this;
    }
    public Integer getType() {
        return this.type;
    }

}
