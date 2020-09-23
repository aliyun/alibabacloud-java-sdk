// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class ListCalcEnginesResponse extends TeaModel {
    @NameInMap("HttpStatusCode")
    @Validation(required = true)
    public Integer httpStatusCode;

    @NameInMap("Success")
    @Validation(required = true)
    public Boolean success;

    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Data")
    @Validation(required = true)
    public ListCalcEnginesResponseData data;

    public static ListCalcEnginesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListCalcEnginesResponse self = new ListCalcEnginesResponse();
        return TeaModel.build(map, self);
    }

    public ListCalcEnginesResponse setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public ListCalcEnginesResponse setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public ListCalcEnginesResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListCalcEnginesResponse setData(ListCalcEnginesResponseData data) {
        this.data = data;
        return this;
    }
    public ListCalcEnginesResponseData getData() {
        return this.data;
    }

    public static class ListCalcEnginesResponseDataCalcEngines extends TeaModel {
        @NameInMap("CalcEngineType")
        @Validation(required = true)
        public String calcEngineType;

        @NameInMap("GmtCreate")
        @Validation(required = true)
        public String gmtCreate;

        @NameInMap("DwRegion")
        @Validation(required = true)
        public String dwRegion;

        @NameInMap("IsDefault")
        @Validation(required = true)
        public Boolean isDefault;

        @NameInMap("BindingProjectId")
        @Validation(required = true)
        public Integer bindingProjectId;

        @NameInMap("EnvType")
        @Validation(required = true)
        public String envType;

        @NameInMap("TenantId")
        @Validation(required = true)
        public Long tenantId;

        @NameInMap("Name")
        @Validation(required = true)
        public String name;

        @NameInMap("BindingProjectName")
        @Validation(required = true)
        public String bindingProjectName;

        @NameInMap("Region")
        @Validation(required = true)
        public String region;

        @NameInMap("EngineId")
        @Validation(required = true)
        public Integer engineId;

        @NameInMap("EngineInfo")
        @Validation(required = true)
        public java.util.Map<String, ?> engineInfo;

        @NameInMap("TaskAuthType")
        @Validation(required = true)
        public String taskAuthType;

        public static ListCalcEnginesResponseDataCalcEngines build(java.util.Map<String, ?> map) throws Exception {
            ListCalcEnginesResponseDataCalcEngines self = new ListCalcEnginesResponseDataCalcEngines();
            return TeaModel.build(map, self);
        }

        public ListCalcEnginesResponseDataCalcEngines setCalcEngineType(String calcEngineType) {
            this.calcEngineType = calcEngineType;
            return this;
        }
        public String getCalcEngineType() {
            return this.calcEngineType;
        }

        public ListCalcEnginesResponseDataCalcEngines setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public ListCalcEnginesResponseDataCalcEngines setDwRegion(String dwRegion) {
            this.dwRegion = dwRegion;
            return this;
        }
        public String getDwRegion() {
            return this.dwRegion;
        }

        public ListCalcEnginesResponseDataCalcEngines setIsDefault(Boolean isDefault) {
            this.isDefault = isDefault;
            return this;
        }
        public Boolean getIsDefault() {
            return this.isDefault;
        }

        public ListCalcEnginesResponseDataCalcEngines setBindingProjectId(Integer bindingProjectId) {
            this.bindingProjectId = bindingProjectId;
            return this;
        }
        public Integer getBindingProjectId() {
            return this.bindingProjectId;
        }

        public ListCalcEnginesResponseDataCalcEngines setEnvType(String envType) {
            this.envType = envType;
            return this;
        }
        public String getEnvType() {
            return this.envType;
        }

        public ListCalcEnginesResponseDataCalcEngines setTenantId(Long tenantId) {
            this.tenantId = tenantId;
            return this;
        }
        public Long getTenantId() {
            return this.tenantId;
        }

        public ListCalcEnginesResponseDataCalcEngines setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListCalcEnginesResponseDataCalcEngines setBindingProjectName(String bindingProjectName) {
            this.bindingProjectName = bindingProjectName;
            return this;
        }
        public String getBindingProjectName() {
            return this.bindingProjectName;
        }

        public ListCalcEnginesResponseDataCalcEngines setRegion(String region) {
            this.region = region;
            return this;
        }
        public String getRegion() {
            return this.region;
        }

        public ListCalcEnginesResponseDataCalcEngines setEngineId(Integer engineId) {
            this.engineId = engineId;
            return this;
        }
        public Integer getEngineId() {
            return this.engineId;
        }

        public ListCalcEnginesResponseDataCalcEngines setEngineInfo(java.util.Map<String, ?> engineInfo) {
            this.engineInfo = engineInfo;
            return this;
        }
        public java.util.Map<String, ?> getEngineInfo() {
            return this.engineInfo;
        }

        public ListCalcEnginesResponseDataCalcEngines setTaskAuthType(String taskAuthType) {
            this.taskAuthType = taskAuthType;
            return this;
        }
        public String getTaskAuthType() {
            return this.taskAuthType;
        }

    }

    public static class ListCalcEnginesResponseData extends TeaModel {
        @NameInMap("PageNumber")
        @Validation(required = true)
        public Integer pageNumber;

        @NameInMap("PageSize")
        @Validation(required = true)
        public Integer pageSize;

        @NameInMap("TotalCount")
        @Validation(required = true)
        public Integer totalCount;

        @NameInMap("CalcEngines")
        @Validation(required = true)
        public java.util.List<ListCalcEnginesResponseDataCalcEngines> calcEngines;

        public static ListCalcEnginesResponseData build(java.util.Map<String, ?> map) throws Exception {
            ListCalcEnginesResponseData self = new ListCalcEnginesResponseData();
            return TeaModel.build(map, self);
        }

        public ListCalcEnginesResponseData setPageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }
        public Integer getPageNumber() {
            return this.pageNumber;
        }

        public ListCalcEnginesResponseData setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public ListCalcEnginesResponseData setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

        public ListCalcEnginesResponseData setCalcEngines(java.util.List<ListCalcEnginesResponseDataCalcEngines> calcEngines) {
            this.calcEngines = calcEngines;
            return this;
        }
        public java.util.List<ListCalcEnginesResponseDataCalcEngines> getCalcEngines() {
            return this.calcEngines;
        }

    }

}
