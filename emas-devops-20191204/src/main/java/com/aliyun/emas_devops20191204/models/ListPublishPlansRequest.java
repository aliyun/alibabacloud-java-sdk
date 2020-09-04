// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emas_devops20191204.models;

import com.aliyun.tea.*;

public class ListPublishPlansRequest extends TeaModel {
    @NameInMap("AppKey")
    public String appKey;

    @NameInMap("PublishVersion")
    public String publishVersion;

    @NameInMap("PlanStatus")
    public String planStatus;

    @NameInMap("PageNum")
    @Validation(required = true)
    public Integer pageNum;

    @NameInMap("PageSize")
    @Validation(required = true)
    public Integer pageSize;

    @NameInMap("AppPlatform")
    public Integer appPlatform;

    public static ListPublishPlansRequest build(java.util.Map<String, ?> map) throws Exception {
        ListPublishPlansRequest self = new ListPublishPlansRequest();
        return TeaModel.build(map, self);
    }

    public ListPublishPlansRequest setAppKey(String appKey) {
        this.appKey = appKey;
        return this;
    }
    public String getAppKey() {
        return this.appKey;
    }

    public ListPublishPlansRequest setPublishVersion(String publishVersion) {
        this.publishVersion = publishVersion;
        return this;
    }
    public String getPublishVersion() {
        return this.publishVersion;
    }

    public ListPublishPlansRequest setPlanStatus(String planStatus) {
        this.planStatus = planStatus;
        return this;
    }
    public String getPlanStatus() {
        return this.planStatus;
    }

    public ListPublishPlansRequest setPageNum(Integer pageNum) {
        this.pageNum = pageNum;
        return this;
    }
    public Integer getPageNum() {
        return this.pageNum;
    }

    public ListPublishPlansRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListPublishPlansRequest setAppPlatform(Integer appPlatform) {
        this.appPlatform = appPlatform;
        return this;
    }
    public Integer getAppPlatform() {
        return this.appPlatform;
    }

}
