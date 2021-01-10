// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkvisual20180120.models;

import com.aliyun.tea.*;

public class GetAIJobResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("ErrorMessage")
    public String errorMessage;

    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public GetAIJobResponseBodyData data;

    public static GetAIJobResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetAIJobResponseBody self = new GetAIJobResponseBody();
        return TeaModel.build(map, self);
    }

    public GetAIJobResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetAIJobResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public GetAIJobResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public GetAIJobResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetAIJobResponseBody setData(GetAIJobResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetAIJobResponseBodyData getData() {
        return this.data;
    }

    public static class GetAIJobResponseBodyDataDataDTOList extends TeaModel {
        @NameInMap("DataId")
        public String dataId;

        @NameInMap("DataType")
        public String dataType;

        @NameInMap("DataSource")
        public String dataSource;

        @NameInMap("AlgoData")
        public String algoData;

        @NameInMap("JobId")
        public String jobId;

        @NameInMap("IotId")
        public String iotId;

        public static GetAIJobResponseBodyDataDataDTOList build(java.util.Map<String, ?> map) throws Exception {
            GetAIJobResponseBodyDataDataDTOList self = new GetAIJobResponseBodyDataDataDTOList();
            return TeaModel.build(map, self);
        }

        public GetAIJobResponseBodyDataDataDTOList setDataId(String dataId) {
            this.dataId = dataId;
            return this;
        }
        public String getDataId() {
            return this.dataId;
        }

        public GetAIJobResponseBodyDataDataDTOList setDataType(String dataType) {
            this.dataType = dataType;
            return this;
        }
        public String getDataType() {
            return this.dataType;
        }

        public GetAIJobResponseBodyDataDataDTOList setDataSource(String dataSource) {
            this.dataSource = dataSource;
            return this;
        }
        public String getDataSource() {
            return this.dataSource;
        }

        public GetAIJobResponseBodyDataDataDTOList setAlgoData(String algoData) {
            this.algoData = algoData;
            return this;
        }
        public String getAlgoData() {
            return this.algoData;
        }

        public GetAIJobResponseBodyDataDataDTOList setJobId(String jobId) {
            this.jobId = jobId;
            return this;
        }
        public String getJobId() {
            return this.jobId;
        }

        public GetAIJobResponseBodyDataDataDTOList setIotId(String iotId) {
            this.iotId = iotId;
            return this;
        }
        public String getIotId() {
            return this.iotId;
        }

    }

    public static class GetAIJobResponseBodyDataActionJobDTO extends TeaModel {
        @NameInMap("JobId")
        public String jobId;

        @NameInMap("ActionId")
        public String actionId;

        @NameInMap("Status")
        public Integer status;

        @NameInMap("IotId")
        public String iotId;

        public static GetAIJobResponseBodyDataActionJobDTO build(java.util.Map<String, ?> map) throws Exception {
            GetAIJobResponseBodyDataActionJobDTO self = new GetAIJobResponseBodyDataActionJobDTO();
            return TeaModel.build(map, self);
        }

        public GetAIJobResponseBodyDataActionJobDTO setJobId(String jobId) {
            this.jobId = jobId;
            return this;
        }
        public String getJobId() {
            return this.jobId;
        }

        public GetAIJobResponseBodyDataActionJobDTO setActionId(String actionId) {
            this.actionId = actionId;
            return this;
        }
        public String getActionId() {
            return this.actionId;
        }

        public GetAIJobResponseBodyDataActionJobDTO setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

        public GetAIJobResponseBodyDataActionJobDTO setIotId(String iotId) {
            this.iotId = iotId;
            return this;
        }
        public String getIotId() {
            return this.iotId;
        }

    }

    public static class GetAIJobResponseBodyData extends TeaModel {
        @NameInMap("DataDTOList")
        public java.util.List<GetAIJobResponseBodyDataDataDTOList> dataDTOList;

        @NameInMap("ActionJobDTO")
        public GetAIJobResponseBodyDataActionJobDTO actionJobDTO;

        public static GetAIJobResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetAIJobResponseBodyData self = new GetAIJobResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetAIJobResponseBodyData setDataDTOList(java.util.List<GetAIJobResponseBodyDataDataDTOList> dataDTOList) {
            this.dataDTOList = dataDTOList;
            return this;
        }
        public java.util.List<GetAIJobResponseBodyDataDataDTOList> getDataDTOList() {
            return this.dataDTOList;
        }

        public GetAIJobResponseBodyData setActionJobDTO(GetAIJobResponseBodyDataActionJobDTO actionJobDTO) {
            this.actionJobDTO = actionJobDTO;
            return this;
        }
        public GetAIJobResponseBodyDataActionJobDTO getActionJobDTO() {
            return this.actionJobDTO;
        }

    }

}
