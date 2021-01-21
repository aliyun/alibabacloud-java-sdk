// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkvisual20180120.models;

import com.aliyun.tea.*;

public class GetAIJobResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Success")
    @Validation(required = true)
    public Boolean success;

    @NameInMap("ErrorMessage")
    @Validation(required = true)
    public String errorMessage;

    @NameInMap("Code")
    @Validation(required = true)
    public String code;

    @NameInMap("Data")
    @Validation(required = true)
    public GetAIJobResponseData data;

    public static GetAIJobResponse build(java.util.Map<String, ?> map) throws Exception {
        GetAIJobResponse self = new GetAIJobResponse();
        return TeaModel.build(map, self);
    }

    public GetAIJobResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetAIJobResponse setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public GetAIJobResponse setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public GetAIJobResponse setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetAIJobResponse setData(GetAIJobResponseData data) {
        this.data = data;
        return this;
    }
    public GetAIJobResponseData getData() {
        return this.data;
    }

    public static class GetAIJobResponseDataDataDTOList extends TeaModel {
        @NameInMap("DataId")
        @Validation(required = true)
        public String dataId;

        @NameInMap("DataType")
        @Validation(required = true)
        public String dataType;

        @NameInMap("DataSource")
        @Validation(required = true)
        public String dataSource;

        @NameInMap("AlgoData")
        @Validation(required = true)
        public String algoData;

        @NameInMap("JobId")
        @Validation(required = true)
        public String jobId;

        @NameInMap("IotId")
        @Validation(required = true)
        public String iotId;

        public static GetAIJobResponseDataDataDTOList build(java.util.Map<String, ?> map) throws Exception {
            GetAIJobResponseDataDataDTOList self = new GetAIJobResponseDataDataDTOList();
            return TeaModel.build(map, self);
        }

        public GetAIJobResponseDataDataDTOList setDataId(String dataId) {
            this.dataId = dataId;
            return this;
        }
        public String getDataId() {
            return this.dataId;
        }

        public GetAIJobResponseDataDataDTOList setDataType(String dataType) {
            this.dataType = dataType;
            return this;
        }
        public String getDataType() {
            return this.dataType;
        }

        public GetAIJobResponseDataDataDTOList setDataSource(String dataSource) {
            this.dataSource = dataSource;
            return this;
        }
        public String getDataSource() {
            return this.dataSource;
        }

        public GetAIJobResponseDataDataDTOList setAlgoData(String algoData) {
            this.algoData = algoData;
            return this;
        }
        public String getAlgoData() {
            return this.algoData;
        }

        public GetAIJobResponseDataDataDTOList setJobId(String jobId) {
            this.jobId = jobId;
            return this;
        }
        public String getJobId() {
            return this.jobId;
        }

        public GetAIJobResponseDataDataDTOList setIotId(String iotId) {
            this.iotId = iotId;
            return this;
        }
        public String getIotId() {
            return this.iotId;
        }

    }

    public static class GetAIJobResponseDataActionJobDTO extends TeaModel {
        @NameInMap("JobId")
        @Validation(required = true)
        public String jobId;

        @NameInMap("ActionId")
        @Validation(required = true)
        public String actionId;

        @NameInMap("Status")
        @Validation(required = true)
        public Integer status;

        @NameInMap("IotId")
        @Validation(required = true)
        public String iotId;

        public static GetAIJobResponseDataActionJobDTO build(java.util.Map<String, ?> map) throws Exception {
            GetAIJobResponseDataActionJobDTO self = new GetAIJobResponseDataActionJobDTO();
            return TeaModel.build(map, self);
        }

        public GetAIJobResponseDataActionJobDTO setJobId(String jobId) {
            this.jobId = jobId;
            return this;
        }
        public String getJobId() {
            return this.jobId;
        }

        public GetAIJobResponseDataActionJobDTO setActionId(String actionId) {
            this.actionId = actionId;
            return this;
        }
        public String getActionId() {
            return this.actionId;
        }

        public GetAIJobResponseDataActionJobDTO setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

        public GetAIJobResponseDataActionJobDTO setIotId(String iotId) {
            this.iotId = iotId;
            return this;
        }
        public String getIotId() {
            return this.iotId;
        }

    }

    public static class GetAIJobResponseData extends TeaModel {
        @NameInMap("DataDTOList")
        @Validation(required = true)
        public java.util.List<GetAIJobResponseDataDataDTOList> dataDTOList;

        @NameInMap("ActionJobDTO")
        @Validation(required = true)
        public GetAIJobResponseDataActionJobDTO actionJobDTO;

        public static GetAIJobResponseData build(java.util.Map<String, ?> map) throws Exception {
            GetAIJobResponseData self = new GetAIJobResponseData();
            return TeaModel.build(map, self);
        }

        public GetAIJobResponseData setDataDTOList(java.util.List<GetAIJobResponseDataDataDTOList> dataDTOList) {
            this.dataDTOList = dataDTOList;
            return this;
        }
        public java.util.List<GetAIJobResponseDataDataDTOList> getDataDTOList() {
            return this.dataDTOList;
        }

        public GetAIJobResponseData setActionJobDTO(GetAIJobResponseDataActionJobDTO actionJobDTO) {
            this.actionJobDTO = actionJobDTO;
            return this;
        }
        public GetAIJobResponseDataActionJobDTO getActionJobDTO() {
            return this.actionJobDTO;
        }

    }

}
