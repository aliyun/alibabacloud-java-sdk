// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.foasconsole20211028.models;

import com.aliyun.tea.*;

public class GetFlinkAiServiceResponseBody extends TeaModel {
    /**
     * <p>The Flink AI service data transfer object.</p>
     */
    @NameInMap("FlinkAiServiceDTO")
    public GetFlinkAiServiceResponseBodyFlinkAiServiceDTO flinkAiServiceDTO;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>B21DC47E-8928-199A-9F32-36D45E4693B4</p>
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

    public static GetFlinkAiServiceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetFlinkAiServiceResponseBody self = new GetFlinkAiServiceResponseBody();
        return TeaModel.build(map, self);
    }

    public GetFlinkAiServiceResponseBody setFlinkAiServiceDTO(GetFlinkAiServiceResponseBodyFlinkAiServiceDTO flinkAiServiceDTO) {
        this.flinkAiServiceDTO = flinkAiServiceDTO;
        return this;
    }
    public GetFlinkAiServiceResponseBodyFlinkAiServiceDTO getFlinkAiServiceDTO() {
        return this.flinkAiServiceDTO;
    }

    public GetFlinkAiServiceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetFlinkAiServiceResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetFlinkAiServiceResponseBodyFlinkAiServiceDTO extends TeaModel {
        /**
         * <p>Indicates whether deletion protection is enabled.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("DeletionProtection")
        public Boolean deletionProtection;

        /**
         * <p>The status of the Flink AI instance. Valid values:</p>
         * <ul>
         * <li>CLOSED: closed or not activated.</li>
         * <li>WAITING: waiting to be activated after payment.</li>
         * <li>OPENING: being activated.</li>
         * <li>RUNNING: activated.</li>
         * <li>CLOSING: being closed.</li>
         * <li>DISABLE: overdue payment.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>CLOSED</p>
         */
        @NameInMap("FlinkAiInstanceStatus")
        public String flinkAiInstanceStatus;

        /**
         * <p>The AI service order instance ID.</p>
         * 
         * <strong>example:</strong>
         * <p>sc_flinkaifuncpost_public_cn-o3s4xabcdef</p>
         */
        @NameInMap("MainInstanceId")
        public String mainInstanceId;

        /**
         * <p>The region ID.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        @NameInMap("Region")
        public String region;

        /**
         * <p>The time when the AI service was activated, in timestamp format (milliseconds).</p>
         * 
         * <strong>example:</strong>
         * <p>1786934292</p>
         */
        @NameInMap("ResourceCreateTime")
        public Long resourceCreateTime;

        public static GetFlinkAiServiceResponseBodyFlinkAiServiceDTO build(java.util.Map<String, ?> map) throws Exception {
            GetFlinkAiServiceResponseBodyFlinkAiServiceDTO self = new GetFlinkAiServiceResponseBodyFlinkAiServiceDTO();
            return TeaModel.build(map, self);
        }

        public GetFlinkAiServiceResponseBodyFlinkAiServiceDTO setDeletionProtection(Boolean deletionProtection) {
            this.deletionProtection = deletionProtection;
            return this;
        }
        public Boolean getDeletionProtection() {
            return this.deletionProtection;
        }

        public GetFlinkAiServiceResponseBodyFlinkAiServiceDTO setFlinkAiInstanceStatus(String flinkAiInstanceStatus) {
            this.flinkAiInstanceStatus = flinkAiInstanceStatus;
            return this;
        }
        public String getFlinkAiInstanceStatus() {
            return this.flinkAiInstanceStatus;
        }

        public GetFlinkAiServiceResponseBodyFlinkAiServiceDTO setMainInstanceId(String mainInstanceId) {
            this.mainInstanceId = mainInstanceId;
            return this;
        }
        public String getMainInstanceId() {
            return this.mainInstanceId;
        }

        public GetFlinkAiServiceResponseBodyFlinkAiServiceDTO setRegion(String region) {
            this.region = region;
            return this;
        }
        public String getRegion() {
            return this.region;
        }

        public GetFlinkAiServiceResponseBodyFlinkAiServiceDTO setResourceCreateTime(Long resourceCreateTime) {
            this.resourceCreateTime = resourceCreateTime;
            return this;
        }
        public Long getResourceCreateTime() {
            return this.resourceCreateTime;
        }

    }

}
