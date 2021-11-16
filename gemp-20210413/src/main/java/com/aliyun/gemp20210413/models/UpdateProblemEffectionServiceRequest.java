// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gemp20210413.models;

import com.aliyun.tea.*;

public class UpdateProblemEffectionServiceRequest extends TeaModel {
    // clientToken
    @NameInMap("clientToken")
    public String clientToken;

    // 影响描述
    @NameInMap("description")
    public String description;

    // 影响服务id
    @NameInMap("effectionServiceId")
    public Long effectionServiceId;

    // 影响等级
    @NameInMap("level")
    public String level;

    // 图片地址
    @NameInMap("picUrl")
    public java.util.List<String> picUrl;

    // 故障id
    @NameInMap("problemId")
    public Long problemId;

    // 关联服务id
    @NameInMap("serviceId")
    public Long serviceId;

    // 影响状态 UN_RECOVERED 未恢复 RECOVERED已恢复
    @NameInMap("status")
    public String status;

    public static UpdateProblemEffectionServiceRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateProblemEffectionServiceRequest self = new UpdateProblemEffectionServiceRequest();
        return TeaModel.build(map, self);
    }

    public UpdateProblemEffectionServiceRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public UpdateProblemEffectionServiceRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public UpdateProblemEffectionServiceRequest setEffectionServiceId(Long effectionServiceId) {
        this.effectionServiceId = effectionServiceId;
        return this;
    }
    public Long getEffectionServiceId() {
        return this.effectionServiceId;
    }

    public UpdateProblemEffectionServiceRequest setLevel(String level) {
        this.level = level;
        return this;
    }
    public String getLevel() {
        return this.level;
    }

    public UpdateProblemEffectionServiceRequest setPicUrl(java.util.List<String> picUrl) {
        this.picUrl = picUrl;
        return this;
    }
    public java.util.List<String> getPicUrl() {
        return this.picUrl;
    }

    public UpdateProblemEffectionServiceRequest setProblemId(Long problemId) {
        this.problemId = problemId;
        return this;
    }
    public Long getProblemId() {
        return this.problemId;
    }

    public UpdateProblemEffectionServiceRequest setServiceId(Long serviceId) {
        this.serviceId = serviceId;
        return this;
    }
    public Long getServiceId() {
        return this.serviceId;
    }

    public UpdateProblemEffectionServiceRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

}
