// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class GetDownloadFileResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public GetDownloadFileResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>no authorization.</p>
     */
    @NameInMap("ErrorMessage")
    public String errorMessage;

    /**
     * <strong>example:</strong>
     * <p>BB71E443-4447-4024-A000-EDE09934****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
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
        /**
         * <strong>example:</strong>
         * <p>user_name_alias</p>
         */
        @NameInMap("Alias")
        public String alias;

        /**
         * <strong>example:</strong>
         * <p>DAY</p>
         */
        @NameInMap("DimDateClass")
        public String dimDateClass;

        /**
         * <strong>example:</strong>
         * <p>user_name</p>
         */
        @NameInMap("FieldName")
        public String fieldName;

        /**
         * <strong>example:</strong>
         * <p>INTEGER</p>
         */
        @NameInMap("FieldType")
        public String fieldType;

        /**
         * <strong>example:</strong>
         * <p>{xxx:xxxx}</p>
         */
        @NameInMap("GeoClass")
        public String geoClass;

        /**
         * <strong>example:</strong>
         * <p>HOUR/DAY/MONTH</p>
         */
        @NameInMap("TimeClass")
        public String timeClass;

        /**
         * <strong>example:</strong>
         * <p>date</p>
         */
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
        /**
         * <strong>example:</strong>
         * <p>{&quot;header&quot;:{&quot;fieldName&quot;:&quot;xxx&quot;},&quot;operator&quot;:&quot;GreaterThanOrEqual&quot;,&quot;value&quot;:12345}</p>
         */
        @NameInMap("Expr")
        public String expr;

        /**
         * <strong>example:</strong>
         * <p>binaryOp</p>
         */
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
        /**
         * <strong>example:</strong>
         * <p>user_name_alias</p>
         */
        @NameInMap("Alias")
        public String alias;

        /**
         * <strong>example:</strong>
         * <p>DAY</p>
         */
        @NameInMap("DimDateClass")
        public String dimDateClass;

        /**
         * <strong>example:</strong>
         * <p>user_name</p>
         */
        @NameInMap("FieldName")
        public String fieldName;

        /**
         * <strong>example:</strong>
         * <p>INTEGER</p>
         */
        @NameInMap("FieldType")
        public String fieldType;

        /**
         * <strong>example:</strong>
         * <p>{xxx:xxx}</p>
         */
        @NameInMap("GeoClass")
        public String geoClass;

        /**
         * <strong>example:</strong>
         * <p>HOUR/DAY/MONTH</p>
         */
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
        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("AsyncExecute")
        public Boolean asyncExecute;

        /**
         * <strong>example:</strong>
         * <p>1658406464534</p>
         */
        @NameInMap("BeginTime")
        public Long beginTime;

        /**
         * <strong>example:</strong>
         * <p>test_download_flie</p>
         */
        @NameInMap("CsvFileName")
        public String csvFileName;

        /**
         * <strong>example:</strong>
         * <p><a href="https://xxxxx-data-download-sh.oss-cn-shanghai.aliyuncs.com/data/download/6B761BxxxxxxxxAAA0BF03D32C80E/62da39b9xxxxxx5a7b953376/download_file_name.csv?Expires=1658469132&amp;OSSAccessKeyId=xxxxxxxxx&amp;Signature=rRL%xxxxxxx%3D">https://xxxxx-data-download-sh.oss-cn-shanghai.aliyuncs.com/data/download/6B761BxxxxxxxxAAA0BF03D32C80E/62da39b9xxxxxx5a7b953376/download_file_name.csv?Expires=1658469132&amp;OSSAccessKeyId=xxxxxxxxx&amp;Signature=rRL%xxxxxxx%3D</a></p>
         */
        @NameInMap("CsvUrl")
        public String csvUrl;

        /**
         * <strong>example:</strong>
         * <p>xxxxxx</p>
         */
        @NameInMap("DatasetId")
        public String datasetId;

        /**
         * <strong>example:</strong>
         * <p>1658406465000</p>
         */
        @NameInMap("EndTime")
        public Long endTime;

        @NameInMap("Header")
        public java.util.List<GetDownloadFileResponseBodyDataHeader> header;

        /**
         * <strong>example:</strong>
         * <p>62d949808bc742187xxxxxx</p>
         */
        @NameInMap("LongJobId")
        public String longJobId;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("PageNo")
        public Integer pageNo;

        /**
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("PageSize")
        public Integer pageSize;

        /**
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("PreviewSize")
        public Integer previewSize;

        @NameInMap("QuerySetting")
        public GetDownloadFileResponseBodyDataQuerySetting querySetting;

        @NameInMap("Result")
        public java.util.List<java.util.Map<String, ?>> result;

        /**
         * <strong>example:</strong>
         * <p>{&quot;a&quot;:123}</p>
         */
        @NameInMap("ResultDataInString")
        public String resultDataInString;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Status")
        public Integer status;

        /**
         * <strong>example:</strong>
         * <p>100</p>
         */
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
