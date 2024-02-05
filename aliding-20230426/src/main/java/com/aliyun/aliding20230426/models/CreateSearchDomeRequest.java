// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class CreateSearchDomeRequest extends TeaModel {
    @NameInMap("Content")
    public String content;

    @NameInMap("EndTime")
    public Long endTime;

    @NameInMap("ResId")
    public String resId;

    @NameInMap("StartTime")
    public Long startTime;

    @NameInMap("TenantContext")
    public CreateSearchDomeRequestTenantContext tenantContext;

    @NameInMap("UserIdList")
    public java.util.List<String> userIdList;

    public static CreateSearchDomeRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateSearchDomeRequest self = new CreateSearchDomeRequest();
        return TeaModel.build(map, self);
    }

    public CreateSearchDomeRequest setContent(String content) {
        this.content = content;
        return this;
    }
    public String getContent() {
        return this.content;
    }

    public CreateSearchDomeRequest setEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }
    public Long getEndTime() {
        return this.endTime;
    }

    public CreateSearchDomeRequest setResId(String resId) {
        this.resId = resId;
        return this;
    }
    public String getResId() {
        return this.resId;
    }

    public CreateSearchDomeRequest setStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }
    public Long getStartTime() {
        return this.startTime;
    }

    public CreateSearchDomeRequest setTenantContext(CreateSearchDomeRequestTenantContext tenantContext) {
        this.tenantContext = tenantContext;
        return this;
    }
    public CreateSearchDomeRequestTenantContext getTenantContext() {
        return this.tenantContext;
    }

    public CreateSearchDomeRequest setUserIdList(java.util.List<String> userIdList) {
        this.userIdList = userIdList;
        return this;
    }
    public java.util.List<String> getUserIdList() {
        return this.userIdList;
    }

    public static class CreateSearchDomeRequestTenantContext extends TeaModel {
        @NameInMap("tenantId")
        public String tenantId;

        public static CreateSearchDomeRequestTenantContext build(java.util.Map<String, ?> map) throws Exception {
            CreateSearchDomeRequestTenantContext self = new CreateSearchDomeRequestTenantContext();
            return TeaModel.build(map, self);
        }

        public CreateSearchDomeRequestTenantContext setTenantId(String tenantId) {
            this.tenantId = tenantId;
            return this;
        }
        public String getTenantId() {
            return this.tenantId;
        }

    }

}
