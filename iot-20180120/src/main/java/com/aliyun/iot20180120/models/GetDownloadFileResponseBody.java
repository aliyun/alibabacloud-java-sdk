// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class GetDownloadFileResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public GetDownloadFileResponseBodyData data;

    @NameInMap("ErrorMessage")
    public String errorMessage;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static GetDownloadFileResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetDownloadFileResponseBody self = new GetDownloadFileResponseBody();
        return TeaModel.build(map, self);
    }

    public GetDownloadFileResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetDownloadFileResponseBody setData(GetDownloadFileResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetDownloadFileResponseBodyData getData() {
        return this.data;
    }

    public GetDownloadFileResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public GetDownloadFileResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetDownloadFileResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetDownloadFileResponseBodyDataHeader extends TeaModel {
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

        @NameInMap("TypeClass")
        public String typeClass;

        public static GetDownloadFileResponseBodyDataHeader build(java.util.Map<String, ?> map) throws Exception {
            GetDownloadFileResponseBodyDataHeader self = new GetDownloadFileResponseBodyDataHeader();
            return TeaModel.build(map, self);
        }

        public GetDownloadFileResponseBodyDataHeader setAlias(String alias) {
            this.alias = alias;
            return this;
        }
        public String getAlias() {
            return this.alias;
        }

        public GetDownloadFileResponseBodyDataHeader setDimDateClass(String dimDateClass) {
            this.dimDateClass = dimDateClass;
            return this;
        }
        public String getDimDateClass() {
            return this.dimDateClass;
        }

        public GetDownloadFileResponseBodyDataHeader setFieldName(String fieldName) {
            this.fieldName = fieldName;
            return this;
        }
        public String getFieldName() {
            return this.fieldName;
        }

        public GetDownloadFileResponseBodyDataHeader setFieldType(String fieldType) {
            this.fieldType = fieldType;
            return this;
        }
        public String getFieldType() {
            return this.fieldType;
        }

        public GetDownloadFileResponseBodyDataHeader setGeoClass(String geoClass) {
            this.geoClass = geoClass;
            return this;
        }
        public String getGeoClass() {
            return this.geoClass;
        }

        public GetDownloadFileResponseBodyDataHeader setTimeClass(String timeClass) {
            this.timeClass = timeClass;
            return this;
        }
        public String getTimeClass() {
            return this.timeClass;
        }

        public GetDownloadFileResponseBodyDataHeader setTypeClass(String typeClass) {
            this.typeClass = typeClass;
            return this;
        }
        public String getTypeClass() {
            return this.typeClass;
        }

    }

    public static class GetDownloadFileResponseBodyDataQuerySettingAstExpr extends TeaModel {
        @NameInMap("Expr")
        public String expr;

        @NameInMap("ExprType")
        public String exprType;

        public static GetDownloadFileResponseBodyDataQuerySettingAstExpr build(java.util.Map<String, ?> map) throws Exception {
            GetDownloadFileResponseBodyDataQuerySettingAstExpr self = new GetDownloadFileResponseBodyDataQuerySettingAstExpr();
            return TeaModel.build(map, self);
        }

        public GetDownloadFileResponseBodyDataQuerySettingAstExpr setExpr(String expr) {
            this.expr = expr;
            return this;
        }
        public String getExpr() {
            return this.expr;
        }

        public GetDownloadFileResponseBodyDataQuerySettingAstExpr setExprType(String exprType) {
            this.exprType = exprType;
            return this;
        }
        public String getExprType() {
            return this.exprType;
        }

    }

    public static class GetDownloadFileResponseBodyDataQuerySettingSelectedHeaders extends TeaModel {
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

        public static GetDownloadFileResponseBodyDataQuerySettingSelectedHeaders build(java.util.Map<String, ?> map) throws Exception {
            GetDownloadFileResponseBodyDataQuerySettingSelectedHeaders self = new GetDownloadFileResponseBodyDataQuerySettingSelectedHeaders();
            return TeaModel.build(map, self);
        }

        public GetDownloadFileResponseBodyDataQuerySettingSelectedHeaders setAlias(String alias) {
            this.alias = alias;
            return this;
        }
        public String getAlias() {
            return this.alias;
        }

        public GetDownloadFileResponseBodyDataQuerySettingSelectedHeaders setDimDateClass(String dimDateClass) {
            this.dimDateClass = dimDateClass;
            return this;
        }
        public String getDimDateClass() {
            return this.dimDateClass;
        }

        public GetDownloadFileResponseBodyDataQuerySettingSelectedHeaders setFieldName(String fieldName) {
            this.fieldName = fieldName;
            return this;
        }
        public String getFieldName() {
            return this.fieldName;
        }

        public GetDownloadFileResponseBodyDataQuerySettingSelectedHeaders setFieldType(String fieldType) {
            this.fieldType = fieldType;
            return this;
        }
        public String getFieldType() {
            return this.fieldType;
        }

        public GetDownloadFileResponseBodyDataQuerySettingSelectedHeaders setGeoClass(String geoClass) {
            this.geoClass = geoClass;
            return this;
        }
        public String getGeoClass() {
            return this.geoClass;
        }

        public GetDownloadFileResponseBodyDataQuerySettingSelectedHeaders setTimeClass(String timeClass) {
            this.timeClass = timeClass;
            return this;
        }
        public String getTimeClass() {
            return this.timeClass;
        }

    }

    public static class GetDownloadFileResponseBodyDataQuerySetting extends TeaModel {
        @NameInMap("AstExpr")
        public java.util.List<GetDownloadFileResponseBodyDataQuerySettingAstExpr> astExpr;

        @NameInMap("SelectedHeaders")
        public java.util.List<GetDownloadFileResponseBodyDataQuerySettingSelectedHeaders> selectedHeaders;

        public static GetDownloadFileResponseBodyDataQuerySetting build(java.util.Map<String, ?> map) throws Exception {
            GetDownloadFileResponseBodyDataQuerySetting self = new GetDownloadFileResponseBodyDataQuerySetting();
            return TeaModel.build(map, self);
        }

        public GetDownloadFileResponseBodyDataQuerySetting setAstExpr(java.util.List<GetDownloadFileResponseBodyDataQuerySettingAstExpr> astExpr) {
            this.astExpr = astExpr;
            return this;
        }
        public java.util.List<GetDownloadFileResponseBodyDataQuerySettingAstExpr> getAstExpr() {
            return this.astExpr;
        }

        public GetDownloadFileResponseBodyDataQuerySetting setSelectedHeaders(java.util.List<GetDownloadFileResponseBodyDataQuerySettingSelectedHeaders> selectedHeaders) {
            this.selectedHeaders = selectedHeaders;
            return this;
        }
        public java.util.List<GetDownloadFileResponseBodyDataQuerySettingSelectedHeaders> getSelectedHeaders() {
            return this.selectedHeaders;
        }

    }

    public static class GetDownloadFileResponseBodyData extends TeaModel {
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
        public java.util.List<GetDownloadFileResponseBodyDataHeader> header;

        @NameInMap("LongJobId")
        public String longJobId;

        @NameInMap("PageNo")
        public Integer pageNo;

        @NameInMap("PageSize")
        public Integer pageSize;

        @NameInMap("PreviewSize")
        public Integer previewSize;

        @NameInMap("QuerySetting")
        public GetDownloadFileResponseBodyDataQuerySetting querySetting;

        @NameInMap("Result")
        public java.util.List<java.util.Map<String, ?>> result;

        @NameInMap("ResultDataInString")
        public String resultDataInString;

        @NameInMap("Status")
        public Integer status;

        @NameInMap("TotalCount")
        public Long totalCount;

        public static GetDownloadFileResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetDownloadFileResponseBodyData self = new GetDownloadFileResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetDownloadFileResponseBodyData setAsyncExecute(Boolean asyncExecute) {
            this.asyncExecute = asyncExecute;
            return this;
        }
        public Boolean getAsyncExecute() {
            return this.asyncExecute;
        }

        public GetDownloadFileResponseBodyData setBeginTime(Long beginTime) {
            this.beginTime = beginTime;
            return this;
        }
        public Long getBeginTime() {
            return this.beginTime;
        }

        public GetDownloadFileResponseBodyData setCsvFileName(String csvFileName) {
            this.csvFileName = csvFileName;
            return this;
        }
        public String getCsvFileName() {
            return this.csvFileName;
        }

        public GetDownloadFileResponseBodyData setCsvUrl(String csvUrl) {
            this.csvUrl = csvUrl;
            return this;
        }
        public String getCsvUrl() {
            return this.csvUrl;
        }

        public GetDownloadFileResponseBodyData setDatasetId(String datasetId) {
            this.datasetId = datasetId;
            return this;
        }
        public String getDatasetId() {
            return this.datasetId;
        }

        public GetDownloadFileResponseBodyData setEndTime(Long endTime) {
            this.endTime = endTime;
            return this;
        }
        public Long getEndTime() {
            return this.endTime;
        }

        public GetDownloadFileResponseBodyData setHeader(java.util.List<GetDownloadFileResponseBodyDataHeader> header) {
            this.header = header;
            return this;
        }
        public java.util.List<GetDownloadFileResponseBodyDataHeader> getHeader() {
            return this.header;
        }

        public GetDownloadFileResponseBodyData setLongJobId(String longJobId) {
            this.longJobId = longJobId;
            return this;
        }
        public String getLongJobId() {
            return this.longJobId;
        }

        public GetDownloadFileResponseBodyData setPageNo(Integer pageNo) {
            this.pageNo = pageNo;
            return this;
        }
        public Integer getPageNo() {
            return this.pageNo;
        }

        public GetDownloadFileResponseBodyData setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public GetDownloadFileResponseBodyData setPreviewSize(Integer previewSize) {
            this.previewSize = previewSize;
            return this;
        }
        public Integer getPreviewSize() {
            return this.previewSize;
        }

        public GetDownloadFileResponseBodyData setQuerySetting(GetDownloadFileResponseBodyDataQuerySetting querySetting) {
            this.querySetting = querySetting;
            return this;
        }
        public GetDownloadFileResponseBodyDataQuerySetting getQuerySetting() {
            return this.querySetting;
        }

        public GetDownloadFileResponseBodyData setResult(java.util.List<java.util.Map<String, ?>> result) {
            this.result = result;
            return this;
        }
        public java.util.List<java.util.Map<String, ?>> getResult() {
            return this.result;
        }

        public GetDownloadFileResponseBodyData setResultDataInString(String resultDataInString) {
            this.resultDataInString = resultDataInString;
            return this;
        }
        public String getResultDataInString() {
            return this.resultDataInString;
        }

        public GetDownloadFileResponseBodyData setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

        public GetDownloadFileResponseBodyData setTotalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Long getTotalCount() {
            return this.totalCount;
        }

    }

}
