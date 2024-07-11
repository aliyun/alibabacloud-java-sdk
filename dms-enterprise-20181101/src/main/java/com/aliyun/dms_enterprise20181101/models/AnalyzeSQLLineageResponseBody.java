// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class AnalyzeSQLLineageResponseBody extends TeaModel {
    /**
     * <p>The error code returned.</p>
     * 
     * <strong>example:</strong>
     * <p>UnknownError</p>
     */
    @NameInMap("ErrorCode")
    public String errorCode;

    /**
     * <p>The error message returned if the request failed.</p>
     * 
     * <strong>example:</strong>
     * <p>UnknownError</p>
     */
    @NameInMap("ErrorMessage")
    public String errorMessage;

    /**
     * <p>Returned data set of SQL lineage.</p>
     */
    @NameInMap("LineageResult")
    public AnalyzeSQLLineageResponseBodyLineageResult lineageResult;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>B4B07137-F6AE-4756-8474-7F92BB6C4E04</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful. Valid values:</p>
     * <ul>
     * <li><strong>true</strong></li>
     * <li><strong>false</strong></li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static AnalyzeSQLLineageResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AnalyzeSQLLineageResponseBody self = new AnalyzeSQLLineageResponseBody();
        return TeaModel.build(map, self);
    }

    public AnalyzeSQLLineageResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public AnalyzeSQLLineageResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public AnalyzeSQLLineageResponseBody setLineageResult(AnalyzeSQLLineageResponseBodyLineageResult lineageResult) {
        this.lineageResult = lineageResult;
        return this;
    }
    public AnalyzeSQLLineageResponseBodyLineageResult getLineageResult() {
        return this.lineageResult;
    }

    public AnalyzeSQLLineageResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public AnalyzeSQLLineageResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class AnalyzeSQLLineageResponseBodyLineageResultLineagesProcessDetail extends TeaModel {
        /**
         * <p>The calculating method. Valid values:</p>
         * <ul>
         * <li><strong>DIRECT</strong>: No function or expression is used.</li>
         * <li><strong>EXPR</strong>: A function or expression is used.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>DIRECT</p>
         */
        @NameInMap("CalWay")
        public String calWay;

        /**
         * <p>The SQL code snippet for field processing.</p>
         * 
         * <strong>example:</strong>
         * <p>dmstest.b.id</p>
         */
        @NameInMap("Code")
        public String code;

        public static AnalyzeSQLLineageResponseBodyLineageResultLineagesProcessDetail build(java.util.Map<String, ?> map) throws Exception {
            AnalyzeSQLLineageResponseBodyLineageResultLineagesProcessDetail self = new AnalyzeSQLLineageResponseBodyLineageResultLineagesProcessDetail();
            return TeaModel.build(map, self);
        }

        public AnalyzeSQLLineageResponseBodyLineageResultLineagesProcessDetail setCalWay(String calWay) {
            this.calWay = calWay;
            return this;
        }
        public String getCalWay() {
            return this.calWay;
        }

        public AnalyzeSQLLineageResponseBodyLineageResultLineagesProcessDetail setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

    }

    public static class AnalyzeSQLLineageResponseBodyLineageResultLineages extends TeaModel {
        /**
         * <p>The target.</p>
         * 
         * <strong>example:</strong>
         * <p>dmstest.a.id</p>
         */
        @NameInMap("Dst")
        public String dst;

        /**
         * <p>The type of the lineage. Valid values:</p>
         * <ul>
         * <li><strong>FIELD_DEPEND_FIELD</strong>: Fields depend on fields.</li>
         * <li><strong>TABLE_DEPEND_TABLE</strong>: Tables depend on tables.</li>
         * <li><strong>FIELD_INFLU_TABLE</strong>: Fields influence tables.</li>
         * <li><strong>FIELD_INFLU_FIELD</strong>: Fields influence fields.</li>
         * <li><strong>FIELD_INFLU_TABLE</strong>: Tables influence fields.</li>
         * <li><strong>FIELD_JOIN_FIELD</strong>: Fields are associated with fields.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>FIELD_DEPEND_FIELD</p>
         */
        @NameInMap("LineageType")
        public String lineageType;

        /**
         * <p>The operation type of the SQL statement in which the data lineage is generated. For example, if the operation type is SELECT, the data lineage is generated from a SELECT statement.</p>
         * <blockquote>
         * <p> This field is an extended field which has no practical use.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>SELECT</p>
         */
        @NameInMap("OperType")
        public String operType;

        /**
         * <p>The handling details. This parameter is returned only when LineageType is FIELD_DEPEND_FIELD.</p>
         */
        @NameInMap("ProcessDetail")
        public AnalyzeSQLLineageResponseBodyLineageResultLineagesProcessDetail processDetail;

        /**
         * <p>The source.</p>
         * 
         * <strong>example:</strong>
         * <p>dmstest.b.id</p>
         */
        @NameInMap("Src")
        public String src;

        public static AnalyzeSQLLineageResponseBodyLineageResultLineages build(java.util.Map<String, ?> map) throws Exception {
            AnalyzeSQLLineageResponseBodyLineageResultLineages self = new AnalyzeSQLLineageResponseBodyLineageResultLineages();
            return TeaModel.build(map, self);
        }

        public AnalyzeSQLLineageResponseBodyLineageResultLineages setDst(String dst) {
            this.dst = dst;
            return this;
        }
        public String getDst() {
            return this.dst;
        }

        public AnalyzeSQLLineageResponseBodyLineageResultLineages setLineageType(String lineageType) {
            this.lineageType = lineageType;
            return this;
        }
        public String getLineageType() {
            return this.lineageType;
        }

        public AnalyzeSQLLineageResponseBodyLineageResultLineages setOperType(String operType) {
            this.operType = operType;
            return this;
        }
        public String getOperType() {
            return this.operType;
        }

        public AnalyzeSQLLineageResponseBodyLineageResultLineages setProcessDetail(AnalyzeSQLLineageResponseBodyLineageResultLineagesProcessDetail processDetail) {
            this.processDetail = processDetail;
            return this;
        }
        public AnalyzeSQLLineageResponseBodyLineageResultLineagesProcessDetail getProcessDetail() {
            return this.processDetail;
        }

        public AnalyzeSQLLineageResponseBodyLineageResultLineages setSrc(String src) {
            this.src = src;
            return this;
        }
        public String getSrc() {
            return this.src;
        }

    }

    public static class AnalyzeSQLLineageResponseBodyLineageResultObjectMetadataFields extends TeaModel {
        /**
         * <p>The name of the field.</p>
         * 
         * <strong>example:</strong>
         * <p>dmstest.a.id</p>
         */
        @NameInMap("Name")
        public String name;

        public static AnalyzeSQLLineageResponseBodyLineageResultObjectMetadataFields build(java.util.Map<String, ?> map) throws Exception {
            AnalyzeSQLLineageResponseBodyLineageResultObjectMetadataFields self = new AnalyzeSQLLineageResponseBodyLineageResultObjectMetadataFields();
            return TeaModel.build(map, self);
        }

        public AnalyzeSQLLineageResponseBodyLineageResultObjectMetadataFields setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class AnalyzeSQLLineageResponseBodyLineageResultObjectMetadata extends TeaModel {
        /**
         * <p>The fields in the metatable.</p>
         */
        @NameInMap("Fields")
        public java.util.List<AnalyzeSQLLineageResponseBodyLineageResultObjectMetadataFields> fields;

        /**
         * <p>The object name.</p>
         * 
         * <strong>example:</strong>
         * <p>a</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The source of metadata. Valid values:</p>
         * <ul>
         * <li><strong>DDL</strong>: The metadata comes from parsed SQL statements or definition of databases and tables collected by DMS.</li>
         * <li><strong>LINEAGE</strong>: The metadata comes from lineage analysis results.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>DDL</p>
         */
        @NameInMap("Source")
        public String source;

        /**
         * <p>The object type. Valid values:</p>
         * <ul>
         * <li><strong>TABLE</strong></li>
         * <li><strong>VIEW</strong></li>
         * <li><strong>TMP_TABLE</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>TABLE</p>
         */
        @NameInMap("Type")
        public String type;

        public static AnalyzeSQLLineageResponseBodyLineageResultObjectMetadata build(java.util.Map<String, ?> map) throws Exception {
            AnalyzeSQLLineageResponseBodyLineageResultObjectMetadata self = new AnalyzeSQLLineageResponseBodyLineageResultObjectMetadata();
            return TeaModel.build(map, self);
        }

        public AnalyzeSQLLineageResponseBodyLineageResultObjectMetadata setFields(java.util.List<AnalyzeSQLLineageResponseBodyLineageResultObjectMetadataFields> fields) {
            this.fields = fields;
            return this;
        }
        public java.util.List<AnalyzeSQLLineageResponseBodyLineageResultObjectMetadataFields> getFields() {
            return this.fields;
        }

        public AnalyzeSQLLineageResponseBodyLineageResultObjectMetadata setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public AnalyzeSQLLineageResponseBodyLineageResultObjectMetadata setSource(String source) {
            this.source = source;
            return this;
        }
        public String getSource() {
            return this.source;
        }

        public AnalyzeSQLLineageResponseBodyLineageResultObjectMetadata setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class AnalyzeSQLLineageResponseBodyLineageResult extends TeaModel {
        /**
         * <p>The details about the lineage.</p>
         */
        @NameInMap("Lineages")
        public java.util.List<AnalyzeSQLLineageResponseBodyLineageResultLineages> lineages;

        /**
         * <p>The table and field metadata information.</p>
         */
        @NameInMap("ObjectMetadata")
        public java.util.List<AnalyzeSQLLineageResponseBodyLineageResultObjectMetadata> objectMetadata;

        public static AnalyzeSQLLineageResponseBodyLineageResult build(java.util.Map<String, ?> map) throws Exception {
            AnalyzeSQLLineageResponseBodyLineageResult self = new AnalyzeSQLLineageResponseBodyLineageResult();
            return TeaModel.build(map, self);
        }

        public AnalyzeSQLLineageResponseBodyLineageResult setLineages(java.util.List<AnalyzeSQLLineageResponseBodyLineageResultLineages> lineages) {
            this.lineages = lineages;
            return this;
        }
        public java.util.List<AnalyzeSQLLineageResponseBodyLineageResultLineages> getLineages() {
            return this.lineages;
        }

        public AnalyzeSQLLineageResponseBodyLineageResult setObjectMetadata(java.util.List<AnalyzeSQLLineageResponseBodyLineageResultObjectMetadata> objectMetadata) {
            this.objectMetadata = objectMetadata;
            return this;
        }
        public java.util.List<AnalyzeSQLLineageResponseBodyLineageResultObjectMetadata> getObjectMetadata() {
            return this.objectMetadata;
        }

    }

}
