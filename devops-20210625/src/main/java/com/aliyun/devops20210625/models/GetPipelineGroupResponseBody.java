// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devops20210625.models;

import com.aliyun.tea.*;

public class GetPipelineGroupResponseBody extends TeaModel {
    @NameInMap("errorCode")
    public String errorCode;

    @NameInMap("errorMessage")
    public String errorMessage;

    @NameInMap("pipelineGroup")
    public GetPipelineGroupResponseBodyPipelineGroup pipelineGroup;

    @NameInMap("requestId")
    public String requestId;

    @NameInMap("success")
    public Boolean success;

    public static GetPipelineGroupResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetPipelineGroupResponseBody self = new GetPipelineGroupResponseBody();
        return TeaModel.build(map, self);
    }

    public GetPipelineGroupResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public GetPipelineGroupResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public GetPipelineGroupResponseBody setPipelineGroup(GetPipelineGroupResponseBodyPipelineGroup pipelineGroup) {
        this.pipelineGroup = pipelineGroup;
        return this;
    }
    public GetPipelineGroupResponseBodyPipelineGroup getPipelineGroup() {
        return this.pipelineGroup;
    }

    public GetPipelineGroupResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetPipelineGroupResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetPipelineGroupResponseBodyPipelineGroup extends TeaModel {
        @NameInMap("createTime")
        public Long createTime;

        @NameInMap("id")
        public Long id;

        @NameInMap("name")
        public String name;

        public static GetPipelineGroupResponseBodyPipelineGroup build(java.util.Map<String, ?> map) throws Exception {
            GetPipelineGroupResponseBodyPipelineGroup self = new GetPipelineGroupResponseBodyPipelineGroup();
            return TeaModel.build(map, self);
        }

        public GetPipelineGroupResponseBodyPipelineGroup setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public GetPipelineGroupResponseBodyPipelineGroup setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public GetPipelineGroupResponseBodyPipelineGroup setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

}
