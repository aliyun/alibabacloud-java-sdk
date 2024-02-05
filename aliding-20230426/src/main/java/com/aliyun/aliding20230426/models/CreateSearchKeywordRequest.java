// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class CreateSearchKeywordRequest extends TeaModel {
    @NameInMap("Content")
    public String content;

    @NameInMap("EndTime")
    public Long endTime;

    @NameInMap("ResId")
    public String resId;

    @NameInMap("StartTime")
    public Long startTime;

    @NameInMap("TenantContext")
    public CreateSearchKeywordRequestTenantContext tenantContext;

    @NameInMap("UserIdList")
    public java.util.List<String> userIdList;

    public static CreateSearchKeywordRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateSearchKeywordRequest self = new CreateSearchKeywordRequest();
        return TeaModel.build(map, self);
    }

    public CreateSearchKeywordRequest setContent(String content) {
        this.content = content;
        return this;
    }
    public String getContent() {
        return this.content;
    }

    public CreateSearchKeywordRequest setEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }
    public Long getEndTime() {
        return this.endTime;
    }

    public CreateSearchKeywordRequest setResId(String resId) {
        this.resId = resId;
        return this;
    }
    public String getResId() {
        return this.resId;
    }

    public CreateSearchKeywordRequest setStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }
    public Long getStartTime() {
        return this.startTime;
    }

    public CreateSearchKeywordRequest setTenantContext(CreateSearchKeywordRequestTenantContext tenantContext) {
        this.tenantContext = tenantContext;
        return this;
    }
    public CreateSearchKeywordRequestTenantContext getTenantContext() {
        return this.tenantContext;
    }

    public CreateSearchKeywordRequest setUserIdList(java.util.List<String> userIdList) {
        this.userIdList = userIdList;
        return this;
    }
    public java.util.List<String> getUserIdList() {
        return this.userIdList;
    }

    public static class CreateSearchKeywordRequestTenantContext extends TeaModel {
        @NameInMap("tenantId")
        public String tenantId;

        public static CreateSearchKeywordRequestTenantContext build(java.util.Map<String, ?> map) throws Exception {
            CreateSearchKeywordRequestTenantContext self = new CreateSearchKeywordRequestTenantContext();
            return TeaModel.build(map, self);
        }

        public CreateSearchKeywordRequestTenantContext setTenantId(String tenantId) {
            this.tenantId = tenantId;
            return this;
        }
        public String getTenantId() {
            return this.tenantId;
        }

    }

}
