// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class CreateDownloadDataJobResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public CreateDownloadDataJobResponseBodyData data;

    @NameInMap("ErrorMessage")
    public String errorMessage;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static CreateDownloadDataJobResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateDownloadDataJobResponseBody self = new CreateDownloadDataJobResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateDownloadDataJobResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public CreateDownloadDataJobResponseBody setData(CreateDownloadDataJobResponseBodyData data) {
        this.data = data;
        return this;
    }
    public CreateDownloadDataJobResponseBodyData getData() {
        return this.data;
    }

    public CreateDownloadDataJobResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public CreateDownloadDataJobResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateDownloadDataJobResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class CreateDownloadDataJobResponseBodyDataHeader extends TeaModel {
        @NameInMap("Alias")
        public String alias;

        @NameInMap("DataPrecision")
        public String dataPrecision;

        @NameInMap("DimDateClass")
        public String dimDateClass;

        @NameInMap("FieldName")
        public String fieldName;

        @NameInMap("FieldType")
        public String fieldType;

        @NameInMap("GeoClass")
        public String geoClass;

        @NameInMap("TimeClass")
        public String timeClass;

        @NameInMap("TypeClass")
        public String typeClass;

        public static CreateDownloadDataJobResponseBodyDataHeader build(java.util.Map<String, ?> map) throws Exception {
            CreateDownloadDataJobResponseBodyDataHeader self = new CreateDownloadDataJobResponseBodyDataHeader();
            return TeaModel.build(map, self);
        }

        public CreateDownloadDataJobResponseBodyDataHeader setAlias(String alias) {
            this.alias = alias;
            return this;
        }
        public String getAlias() {
            return this.alias;
        }

        public CreateDownloadDataJobResponseBodyDataHeader setDataPrecision(String dataPrecision) {
            this.dataPrecision = dataPrecision;
            return this;
        }
        public String getDataPrecision() {
            return this.dataPrecision;
        }

        public CreateDownloadDataJobResponseBodyDataHeader setDimDateClass(String dimDateClass) {
            this.dimDateClass = dimDateClass;
            return this;
        }
        public String getDimDateClass() {
            return this.dimDateClass;
        }

        public CreateDownloadDataJobResponseBodyDataHeader setFieldName(String fieldName) {
            this.fieldName = fieldName;
            return this;
        }
        public String getFieldName() {
            return this.fieldName;
        }

        public CreateDownloadDataJobResponseBodyDataHeader setFieldType(String fieldType) {
            this.fieldType = fieldType;
            return this;
        }
        public String getFieldType() {
            return this.fieldType;
        }

        public CreateDownloadDataJobResponseBodyDataHeader setGeoClass(String geoClass) {
            this.geoClass = geoClass;
            return this;
        }
        public String getGeoClass() {
            return this.geoClass;
        }

        public CreateDownloadDataJobResponseBodyDataHeader setTimeClass(String timeClass) {
            this.timeClass = timeClass;
            return this;
        }
        public String getTimeClass() {
            return this.timeClass;
        }

        public CreateDownloadDataJobResponseBodyDataHeader setTypeClass(String typeClass) {
            this.typeClass = typeClass;
            return this;
        }
        public String getTypeClass() {
            return this.typeClass;
        }

    }

    public static class CreateDownloadDataJobResponseBodyDataQuerySettingAstExpr extends TeaModel {
        @NameInMap("Expr")
        public String expr;

        @NameInMap("ExprType")
        public String exprType;

        public static CreateDownloadDataJobResponseBodyDataQuerySettingAstExpr build(java.util.Map<String, ?> map) throws Exception {
            CreateDownloadDataJobResponseBodyDataQuerySettingAstExpr self = new CreateDownloadDataJobResponseBodyDataQuerySettingAstExpr();
            return TeaModel.build(map, self);
        }

        public CreateDownloadDataJobResponseBodyDataQuerySettingAstExpr setExpr(String expr) {
            this.expr = expr;
            return this;
        }
        public String getExpr() {
            return this.expr;
        }

        public CreateDownloadDataJobResponseBodyDataQuerySettingAstExpr setExprType(String exprType) {
            this.exprType = exprType;
            return this;
        }
        public String getExprType() {
            return this.exprType;
        }

    }

    public static class CreateDownloadDataJobResponseBodyDataQuerySettingSelectedHeaders extends TeaModel {
        @NameInMap("Alias")
        public String alias;

        @NameInMap("DimDateClass")
        public String dimDateClass;

        @NameInMap("FieldName")
        public String fieldName;

        @NameInMap("FieldType")
        public String fieldType;

        @NameInMap("GeoClass")
        public String geoClass;

        @NameInMap("TimeClass")
        public String timeClass;

        public static CreateDownloadDataJobResponseBodyDataQuerySettingSelectedHeaders build(java.util.Map<String, ?> map) throws Exception {
            CreateDownloadDataJobResponseBodyDataQuerySettingSelectedHeaders self = new CreateDownloadDataJobResponseBodyDataQuerySettingSelectedHeaders();
            return TeaModel.build(map, self);
        }

        public CreateDownloadDataJobResponseBodyDataQuerySettingSelectedHeaders setAlias(String alias) {
            this.alias = alias;
            return this;
        }
        public String getAlias() {
            return this.alias;
        }

        public CreateDownloadDataJobResponseBodyDataQuerySettingSelectedHeaders setDimDateClass(String dimDateClass) {
            this.dimDateClass = dimDateClass;
            return this;
        }
        public String getDimDateClass() {
            return this.dimDateClass;
        }

        public CreateDownloadDataJobResponseBodyDataQuerySettingSelectedHeaders setFieldName(String fieldName) {
            this.fieldName = fieldName;
            return this;
        }
        public String getFieldName() {
            return this.fieldName;
        }

        public CreateDownloadDataJobResponseBodyDataQuerySettingSelectedHeaders setFieldType(String fieldType) {
            this.fieldType = fieldType;
            return this;
        }
        public String getFieldType() {
            return this.fieldType;
        }

        public CreateDownloadDataJobResponseBodyDataQuerySettingSelectedHeaders setGeoClass(String geoClass) {
            this.geoClass = geoClass;
            return this;
        }
        public String getGeoClass() {
            return this.geoClass;
        }

        public CreateDownloadDataJobResponseBodyDataQuerySettingSelectedHeaders setTimeClass(String timeClass) {
            this.timeClass = timeClass;
            return this;
        }
        public String getTimeClass() {
            return this.timeClass;
        }

    }

    public static class CreateDownloadDataJobResponseBodyDataQuerySetting extends TeaModel {
        @NameInMap("AstExpr")
        public java.util.List<CreateDownloadDataJobResponseBodyDataQuerySettingAstExpr> astExpr;

        @NameInMap("SelectedHeaders")
        public java.util.List<CreateDownloadDataJobResponseBodyDataQuerySettingSelectedHeaders> selectedHeaders;

        public static CreateDownloadDataJobResponseBodyDataQuerySetting build(java.util.Map<String, ?> map) throws Exception {
            CreateDownloadDataJobResponseBodyDataQuerySetting self = new CreateDownloadDataJobResponseBodyDataQuerySetting();
            return TeaModel.build(map, self);
        }

        public CreateDownloadDataJobResponseBodyDataQuerySetting setAstExpr(java.util.List<CreateDownloadDataJobResponseBodyDataQuerySettingAstExpr> astExpr) {
            this.astExpr = astExpr;
            return this;
        }
        public java.util.List<CreateDownloadDataJobResponseBodyDataQuerySettingAstExpr> getAstExpr() {
            return this.astExpr;
        }

        public CreateDownloadDataJobResponseBodyDataQuerySetting setSelectedHeaders(java.util.List<CreateDownloadDataJobResponseBodyDataQuerySettingSelectedHeaders> selectedHeaders) {
            this.selectedHeaders = selectedHeaders;
            return this;
        }
        public java.util.List<CreateDownloadDataJobResponseBodyDataQuerySettingSelectedHeaders> getSelectedHeaders() {
            return this.selectedHeaders;
        }

    }

    public static class CreateDownloadDataJobResponseBodyData extends TeaModel {
        @NameInMap("AsyncExecute")
        public Boolean asyncExecute;

        @NameInMap("BeginTime")
        public Long beginTime;

        @NameInMap("CsvFileName")
        public String csvFileName;

        @NameInMap("CsvUrl")
        public String csvUrl;

        @NameInMap("DatasetId")
        public String datasetId;

        @NameInMap("EndTime")
        public Long endTime;

        @NameInMap("Header")
        public java.util.List<CreateDownloadDataJobResponseBodyDataHeader> header;

        @NameInMap("LongJobId")
        public String longJobId;

        @NameInMap("PageNo")
        public Integer pageNo;

        @NameInMap("PageSize")
        public Integer pageSize;

        @NameInMap("PreviewSize")
        public Integer previewSize;

        @NameInMap("QuerySetting")
        public CreateDownloadDataJobResponseBodyDataQuerySetting querySetting;

        @NameInMap("ResultDataInString")
        public String resultDataInString;

        @NameInMap("Status")
        public Integer status;

        @NameInMap("TotalCount")
        public Long totalCount;

        public static CreateDownloadDataJobResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            CreateDownloadDataJobResponseBodyData self = new CreateDownloadDataJobResponseBodyData();
            return TeaModel.build(map, self);
        }

        public CreateDownloadDataJobResponseBodyData setAsyncExecute(Boolean asyncExecute) {
            this.asyncExecute = asyncExecute;
            return this;
        }
        public Boolean getAsyncExecute() {
            return this.asyncExecute;
        }

        public CreateDownloadDataJobResponseBodyData setBeginTime(Long beginTime) {
            this.beginTime = beginTime;
            return this;
        }
        public Long getBeginTime() {
            return this.beginTime;
        }

        public CreateDownloadDataJobResponseBodyData setCsvFileName(String csvFileName) {
            this.csvFileName = csvFileName;
            return this;
        }
        public String getCsvFileName() {
            return this.csvFileName;
        }

        public CreateDownloadDataJobResponseBodyData setCsvUrl(String csvUrl) {
            this.csvUrl = csvUrl;
            return this;
        }
        public String getCsvUrl() {
            return this.csvUrl;
        }

        public CreateDownloadDataJobResponseBodyData setDatasetId(String datasetId) {
            this.datasetId = datasetId;
            return this;
        }
        public String getDatasetId() {
            return this.datasetId;
        }

        public CreateDownloadDataJobResponseBodyData setEndTime(Long endTime) {
            this.endTime = endTime;
            return this;
        }
        public Long getEndTime() {
            return this.endTime;
        }

        public CreateDownloadDataJobResponseBodyData setHeader(java.util.List<CreateDownloadDataJobResponseBodyDataHeader> header) {
            this.header = header;
            return this;
        }
        public java.util.List<CreateDownloadDataJobResponseBodyDataHeader> getHeader() {
            return this.header;
        }

        public CreateDownloadDataJobResponseBodyData setLongJobId(String longJobId) {
            this.longJobId = longJobId;
            return this;
        }
        public String getLongJobId() {
            return this.longJobId;
        }

        public CreateDownloadDataJobResponseBodyData setPageNo(Integer pageNo) {
            this.pageNo = pageNo;
            return this;
        }
        public Integer getPageNo() {
            return this.pageNo;
        }

        public CreateDownloadDataJobResponseBodyData setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public CreateDownloadDataJobResponseBodyData setPreviewSize(Integer previewSize) {
            this.previewSize = previewSize;
            return this;
        }
        public Integer getPreviewSize() {
            return this.previewSize;
        }

        public CreateDownloadDataJobResponseBodyData setQuerySetting(CreateDownloadDataJobResponseBodyDataQuerySetting querySetting) {
            this.querySetting = querySetting;
            return this;
        }
        public CreateDownloadDataJobResponseBodyDataQuerySetting getQuerySetting() {
            return this.querySetting;
        }

        public CreateDownloadDataJobResponseBodyData setResultDataInString(String resultDataInString) {
            this.resultDataInString = resultDataInString;
            return this;
        }
        public String getResultDataInString() {
            return this.resultDataInString;
        }

        public CreateDownloadDataJobResponseBodyData setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

        public CreateDownloadDataJobResponseBodyData setTotalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Long getTotalCount() {
            return this.totalCount;
        }

    }

}
