// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gemp20210413.models;

import com.aliyun.tea.*;

public class UpdateProblemEffectionServiceRequest extends TeaModel {
    /**
     * <p>clientToken</p>
     * 
     * <strong>example:</strong>
     * <p>c26f36de-1ec8-496a-a828-880676c5ef81</p>
     */
    @NameInMap("clientToken")
    public String clientToken;

    /**
     * <strong>example:</strong>
     * <p>乐嘉国际大厦</p>
     */
    @NameInMap("description")
    public String description;

    /**
     * <strong>example:</strong>
     * <p>103</p>
     */
    @NameInMap("effectionServiceId")
    public Long effectionServiceId;

    /**
     * <strong>example:</strong>
     * <p>P1</p>
     */
    @NameInMap("level")
    public String level;

    @NameInMap("picUrl")
    public java.util.List<String> picUrl;

    /**
     * <strong>example:</strong>
     * <p>190000000</p>
     */
    @NameInMap("problemId")
    public Long problemId;

    /**
     * <strong>example:</strong>
     * <p>33</p>
     */
    @NameInMap("serviceId")
    public Long serviceId;

    /**
     * <strong>example:</strong>
     * <p>UN_RECOVERED</p>
     */
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
