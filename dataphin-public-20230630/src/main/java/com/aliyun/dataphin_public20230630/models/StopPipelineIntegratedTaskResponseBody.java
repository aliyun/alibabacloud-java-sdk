// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class StopPipelineIntegratedTaskResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public StopPipelineIntegratedTaskResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <strong>example:</strong>
     * <p>internal error</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>75DD06F8-1661-5A6E-B0A6-7E23133BDC60</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static StopPipelineIntegratedTaskResponseBody build(java.util.Map<String, ?> map) throws Exception {
        StopPipelineIntegratedTaskResponseBody self = new StopPipelineIntegratedTaskResponseBody();
        return TeaModel.build(map, self);
    }

    public StopPipelineIntegratedTaskResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public StopPipelineIntegratedTaskResponseBody setData(StopPipelineIntegratedTaskResponseBodyData data) {
        this.data = data;
        return this;
    }
    public StopPipelineIntegratedTaskResponseBodyData getData() {
        return this.data;
    }

    public StopPipelineIntegratedTaskResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public StopPipelineIntegratedTaskResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public StopPipelineIntegratedTaskResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public StopPipelineIntegratedTaskResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class StopPipelineIntegratedTaskResponseBodyDataDevOpsActionResDTOList extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>eedsauto</p>
         */
        @NameInMap("JobName")
        public String jobName;

        /**
         * <strong>example:</strong>
         * <p>1692173406264688</p>
         */
        @NameInMap("Owner")
        public String owner;

        /**
         * <strong>example:</strong>
         * <p>FAIED</p>
         */
        @NameInMap("Status")
        public String status;

        public static StopPipelineIntegratedTaskResponseBodyDataDevOpsActionResDTOList build(java.util.Map<String, ?> map) throws Exception {
            StopPipelineIntegratedTaskResponseBodyDataDevOpsActionResDTOList self = new StopPipelineIntegratedTaskResponseBodyDataDevOpsActionResDTOList();
            return TeaModel.build(map, self);
        }

        public StopPipelineIntegratedTaskResponseBodyDataDevOpsActionResDTOList setJobName(String jobName) {
            this.jobName = jobName;
            return this;
        }
        public String getJobName() {
            return this.jobName;
        }

        public StopPipelineIntegratedTaskResponseBodyDataDevOpsActionResDTOList setOwner(String owner) {
            this.owner = owner;
            return this;
        }
        public String getOwner() {
            return this.owner;
        }

        public StopPipelineIntegratedTaskResponseBodyDataDevOpsActionResDTOList setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

    public static class StopPipelineIntegratedTaskResponseBodyData extends TeaModel {
        @NameInMap("DevOpsActionResDTOList")
        public java.util.List<StopPipelineIntegratedTaskResponseBodyDataDevOpsActionResDTOList> devOpsActionResDTOList;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("Fail")
        public Long fail;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Success")
        public Long success;

        public static StopPipelineIntegratedTaskResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            StopPipelineIntegratedTaskResponseBodyData self = new StopPipelineIntegratedTaskResponseBodyData();
            return TeaModel.build(map, self);
        }

        public StopPipelineIntegratedTaskResponseBodyData setDevOpsActionResDTOList(java.util.List<StopPipelineIntegratedTaskResponseBodyDataDevOpsActionResDTOList> devOpsActionResDTOList) {
            this.devOpsActionResDTOList = devOpsActionResDTOList;
            return this;
        }
        public java.util.List<StopPipelineIntegratedTaskResponseBodyDataDevOpsActionResDTOList> getDevOpsActionResDTOList() {
            return this.devOpsActionResDTOList;
        }

        public StopPipelineIntegratedTaskResponseBodyData setFail(Long fail) {
            this.fail = fail;
            return this;
        }
        public Long getFail() {
            return this.fail;
        }

        public StopPipelineIntegratedTaskResponseBodyData setSuccess(Long success) {
            this.success = success;
            return this;
        }
        public Long getSuccess() {
            return this.success;
        }

    }

}
