// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentteams20260605.models;

import com.aliyun.tea.*;

public class GetCredentialResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public GetCredentialResponseBodyData data;

    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static GetCredentialResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetCredentialResponseBody self = new GetCredentialResponseBody();
        return TeaModel.build(map, self);
    }

    public GetCredentialResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetCredentialResponseBody setData(GetCredentialResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetCredentialResponseBodyData getData() {
        return this.data;
    }

    public GetCredentialResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public GetCredentialResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetCredentialResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetCredentialResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetCredentialResponseBodyDataBoundWorkers extends TeaModel {
        @NameInMap("Name")
        public String name;

        @NameInMap("Status")
        public String status;

        @NameInMap("UpdateTime")
        public String updateTime;

        public static GetCredentialResponseBodyDataBoundWorkers build(java.util.Map<String, ?> map) throws Exception {
            GetCredentialResponseBodyDataBoundWorkers self = new GetCredentialResponseBodyDataBoundWorkers();
            return TeaModel.build(map, self);
        }

        public GetCredentialResponseBodyDataBoundWorkers setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetCredentialResponseBodyDataBoundWorkers setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public GetCredentialResponseBodyDataBoundWorkers setUpdateTime(String updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public String getUpdateTime() {
            return this.updateTime;
        }

    }

    public static class GetCredentialResponseBodyData extends TeaModel {
        @NameInMap("BoundWorkers")
        public java.util.List<GetCredentialResponseBodyDataBoundWorkers> boundWorkers;

        @NameInMap("CreateTime")
        public String createTime;

        @NameInMap("Description")
        public String description;

        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("Name")
        public String name;

        @NameInMap("RegionId")
        public String regionId;

        @NameInMap("Status")
        public String status;

        @NameInMap("UpdateTime")
        public String updateTime;

        public static GetCredentialResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetCredentialResponseBodyData self = new GetCredentialResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetCredentialResponseBodyData setBoundWorkers(java.util.List<GetCredentialResponseBodyDataBoundWorkers> boundWorkers) {
            this.boundWorkers = boundWorkers;
            return this;
        }
        public java.util.List<GetCredentialResponseBodyDataBoundWorkers> getBoundWorkers() {
            return this.boundWorkers;
        }

        public GetCredentialResponseBodyData setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public GetCredentialResponseBodyData setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public GetCredentialResponseBodyData setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public GetCredentialResponseBodyData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetCredentialResponseBodyData setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public GetCredentialResponseBodyData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public GetCredentialResponseBodyData setUpdateTime(String updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public String getUpdateTime() {
            return this.updateTime;
        }

    }

}
