// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gemp20210413.models;

import com.aliyun.tea.*;

public class CreateProblemEffectionServiceRequest extends TeaModel {
    // clientToken
    @NameInMap("clientToken")
    public String clientToken;

    @NameInMap("description")
    public String description;

    @NameInMap("level")
    public String level;

    @NameInMap("pictureUrl")
    public java.util.List<String> pictureUrl;

    @NameInMap("problemId")
    public Long problemId;

    @NameInMap("serviceId")
    public Long serviceId;

    @NameInMap("status")
    public String status;

    public static CreateProblemEffectionServiceRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateProblemEffectionServiceRequest self = new CreateProblemEffectionServiceRequest();
        return TeaModel.build(map, self);
    }

    public CreateProblemEffectionServiceRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public CreateProblemEffectionServiceRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateProblemEffectionServiceRequest setLevel(String level) {
        this.level = level;
        return this;
    }
    public String getLevel() {
        return this.level;
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

    public CreateProblemEffectionServiceRequest setServiceId(Long serviceId) {
        this.serviceId = serviceId;
        return this;
    }
    public Long getServiceId() {
        return this.serviceId;
    }

    public CreateProblemEffectionServiceRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

}
