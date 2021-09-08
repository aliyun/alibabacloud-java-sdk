// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class QueryStudioAppPageListOpenRequest extends TeaModel {
    @NameInMap("AppId")
    @Validation(required = true)
    public String appId;

    @NameInMap("IotInstanceId")
    public String iotInstanceId;

    @NameInMap("IsRelease")
    public Boolean isRelease;

    @NameInMap("PageNo")
    public Integer pageNo;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("ProjectId")
    @Validation(required = true)
    public String projectId;

    public static QueryStudioAppPageListOpenRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryStudioAppPageListOpenRequest self = new QueryStudioAppPageListOpenRequest();
        return TeaModel.build(map, self);
    }

    public QueryStudioAppPageListOpenRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public QueryStudioAppPageListOpenRequest setIotInstanceId(String iotInstanceId) {
        this.iotInstanceId = iotInstanceId;
        return this;
    }
    public String getIotInstanceId() {
        return this.iotInstanceId;
    }

    public QueryStudioAppPageListOpenRequest setIsRelease(Boolean isRelease) {
        this.isRelease = isRelease;
        return this;
    }
    public Boolean getIsRelease() {
        return this.isRelease;
    }

    public QueryStudioAppPageListOpenRequest setPageNo(Integer pageNo) {
        this.pageNo = pageNo;
        return this;
    }
    public Integer getPageNo() {
        return this.pageNo;
    }

    public QueryStudioAppPageListOpenRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public QueryStudioAppPageListOpenRequest setProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }
    public String getProjectId() {
        return this.projectId;
    }

}
