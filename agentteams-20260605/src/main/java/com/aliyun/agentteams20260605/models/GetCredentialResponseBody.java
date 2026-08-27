// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentteams20260605.models;

import com.aliyun.tea.*;

public class GetCredentialResponseBody extends TeaModel {
    /**
     * <p>The response code.</p>
     * 
     * <strong>example:</strong>
     * <p>SUCCESS</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The returned data.</p>
     * 
     * <strong>example:</strong>
     * <p>{}</p>
     */
    @NameInMap("Data")
    public GetCredentialResponseBodyData data;

    /**
     * <p>The HTTP status code.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <p>The response message.</p>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>req-xxx</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
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
        /**
         * <p>The Worker name.</p>
         * 
         * <strong>example:</strong>
         * <p>worker-xxx</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The Worker status.</p>
         * 
         * <strong>example:</strong>
         * <p>Running</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The binding update time in ISO 8601 format.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-07-13T12:00:00Z</p>
         */
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
        /**
         * <p>The list of bound Workers.</p>
         * 
         * <strong>example:</strong>
         * <p>[]</p>
         */
        @NameInMap("BoundWorkers")
        public java.util.List<GetCredentialResponseBodyDataBoundWorkers> boundWorkers;

        /**
         * <p>The creation time in ISO 8601 format.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-07-13T12:00:00Z</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <p>The credential description.</p>
         * 
         * <strong>example:</strong>
         * <p>OpenAI API key for the team</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The instance ID.</p>
         * 
         * <strong>example:</strong>
         * <p>ami-2ze8x9c6f</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>The credential key.</p>
         * 
         * <strong>example:</strong>
         * <p>OPENAI_API_KEY</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The region ID.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        /**
         * <p>The resource status.</p>
         * 
         * <strong>example:</strong>
         * <p>Active</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The update time in ISO 8601 format.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-07-13T12:00:00Z</p>
         */
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
