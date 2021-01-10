// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iovcc20180501.models;

import com.aliyun.tea.*;

public class CreateProjectAppRequest extends TeaModel {
    @NameInMap("ProjectId")
    public String projectId;

    @NameInMap("AppName")
    public String appName;

    @NameInMap("AppPkgName")
    public String appPkgName;

    @NameInMap("OsType")
    public Integer osType;

    public static CreateProjectAppRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateProjectAppRequest self = new CreateProjectAppRequest();
        return TeaModel.build(map, self);
    }

    public CreateProjectAppRequest setProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }
    public String getProjectId() {
        return this.projectId;
    }

    public CreateProjectAppRequest setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public CreateProjectAppRequest setAppPkgName(String appPkgName) {
        this.appPkgName = appPkgName;
        return this;
    }
    public String getAppPkgName() {
        return this.appPkgName;
    }

    public CreateProjectAppRequest setOsType(Integer osType) {
        this.osType = osType;
        return this;
    }
    public Integer getOsType() {
        return this.osType;
    }

}
