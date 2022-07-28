// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devops20210625.models;

import com.aliyun.tea.*;

public class CreatePipelineGroupResponseBody extends TeaModel {
    @NameInMap("errorCode")
    public String errorCode;

    @NameInMap("errorMessage")
    public String errorMessage;

    @NameInMap("pipelineGroup")
    public CreatePipelineGroupResponseBodyPipelineGroup pipelineGroup;

    @NameInMap("requestId")
    public String requestId;

    @NameInMap("success")
    public Boolean success;

    public static CreatePipelineGroupResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreatePipelineGroupResponseBody self = new CreatePipelineGroupResponseBody();
        return TeaModel.build(map, self);
    }

    public CreatePipelineGroupResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public CreatePipelineGroupResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public CreatePipelineGroupResponseBody setPipelineGroup(CreatePipelineGroupResponseBodyPipelineGroup pipelineGroup) {
        this.pipelineGroup = pipelineGroup;
        return this;
    }
    public CreatePipelineGroupResponseBodyPipelineGroup getPipelineGroup() {
        return this.pipelineGroup;
    }

    public CreatePipelineGroupResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreatePipelineGroupResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class CreatePipelineGroupResponseBodyPipelineGroup extends TeaModel {
        @NameInMap("id")
        public Long id;

        @NameInMap("name")
        public String name;

        public static CreatePipelineGroupResponseBodyPipelineGroup build(java.util.Map<String, ?> map) throws Exception {
            CreatePipelineGroupResponseBodyPipelineGroup self = new CreatePipelineGroupResponseBodyPipelineGroup();
            return TeaModel.build(map, self);
        }

        public CreatePipelineGroupResponseBodyPipelineGroup setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public CreatePipelineGroupResponseBodyPipelineGroup setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

}
