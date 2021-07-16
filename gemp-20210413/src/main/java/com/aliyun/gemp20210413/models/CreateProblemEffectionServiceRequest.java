// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gemp20210413.models;

import com.aliyun.tea.*;

public class CreateProblemEffectionServiceRequest extends TeaModel {
    // 影响服务id
    @NameInMap("serviceId")
    public Long serviceId;

    // 影响等级
    @NameInMap("level")
    public String level;

    // 影响状态 0 未恢复 1已恢复
    @NameInMap("status")
    public String status;

    // 影响描述
    @NameInMap("description")
    public String description;

    // 图片地址
    @NameInMap("pictureUrl")
    public java.util.List<String> pictureUrl;

    // 故障id
    @NameInMap("problemId")
    public Long problemId;

    // clientToken
    @NameInMap("clientToken")
    public String clientToken;

    public static CreateProblemEffectionServiceRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateProblemEffectionServiceRequest self = new CreateProblemEffectionServiceRequest();
        return TeaModel.build(map, self);
    }

    public CreateProblemEffectionServiceRequest setServiceId(Long serviceId) {
        this.serviceId = serviceId;
        return this;
    }
    public Long getServiceId() {
        return this.serviceId;
    }

    public CreateProblemEffectionServiceRequest setLevel(String level) {
        this.level = level;
        return this;
    }
    public String getLevel() {
        return this.level;
    }

    public CreateProblemEffectionServiceRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public CreateProblemEffectionServiceRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateProblemEffectionServiceRequest setPictureUrl(java.util.List<String> pictureUrl) {
        this.pictureUrl = pictureUrl;
        return this;
    }
    public java.util.List<String> getPictureUrl() {
        return this.pictureUrl;
    }

    public CreateProblemEffectionServiceRequest setProblemId(Long problemId) {
        this.problemId = problemId;
        return this;
    }
    public Long getProblemId() {
        return this.problemId;
    }

    public CreateProblemEffectionServiceRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

}
