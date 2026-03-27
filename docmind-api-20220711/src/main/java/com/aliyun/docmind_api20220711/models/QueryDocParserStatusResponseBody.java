// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.docmind_api20220711.models;

import com.aliyun.tea.*;

public class QueryDocParserStatusResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>noPermission</p>
     */
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public QueryDocParserStatusResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>You are not authorized to perform this operation.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>43A29C77-405E-4CC0-BC55-EE694AD00655</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static QueryDocParserStatusResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryDocParserStatusResponseBody self = new QueryDocParserStatusResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryDocParserStatusResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryDocParserStatusResponseBody setData(QueryDocParserStatusResponseBodyData data) {
        this.data = data;
        return this;
    }
    public QueryDocParserStatusResponseBodyData getData() {
        return this.data;
    }

    public QueryDocParserStatusResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public QueryDocParserStatusResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class QueryDocParserStatusResponseBodyDataOutputFormatResultPages extends TeaModel {
        @NameInMap("ImageHeight")
        public Integer imageHeight;

        @NameInMap("ImageUrl")
        public String imageUrl;

        @NameInMap("ImageWidth")
        public Integer imageWidth;

        @NameInMap("PageIdAllDocs")
        public Integer pageIdAllDocs;

        @NameInMap("PageIdCurDoc")
        public Integer pageIdCurDoc;

        public static QueryDocParserStatusResponseBodyDataOutputFormatResultPages build(java.util.Map<String, ?> map) throws Exception {
            QueryDocParserStatusResponseBodyDataOutputFormatResultPages self = new QueryDocParserStatusResponseBodyDataOutputFormatResultPages();
            return TeaModel.build(map, self);
        }

        public QueryDocParserStatusResponseBodyDataOutputFormatResultPages setImageHeight(Integer imageHeight) {
            this.imageHeight = imageHeight;
            return this;
        }
        public Integer getImageHeight() {
            return this.imageHeight;
        }

        public QueryDocParserStatusResponseBodyDataOutputFormatResultPages setImageUrl(String imageUrl) {
            this.imageUrl = imageUrl;
            return this;
        }
        public String getImageUrl() {
            return this.imageUrl;
        }

        public QueryDocParserStatusResponseBodyDataOutputFormatResultPages setImageWidth(Integer imageWidth) {
            this.imageWidth = imageWidth;
            return this;
        }
        public Integer getImageWidth() {
            return this.imageWidth;
        }

        public QueryDocParserStatusResponseBodyDataOutputFormatResultPages setPageIdAllDocs(Integer pageIdAllDocs) {
            this.pageIdAllDocs = pageIdAllDocs;
            return this;
        }
        public Integer getPageIdAllDocs() {
            return this.pageIdAllDocs;
        }

        public QueryDocParserStatusResponseBodyDataOutputFormatResultPages setPageIdCurDoc(Integer pageIdCurDoc) {
            this.pageIdCurDoc = pageIdCurDoc;
            return this;
        }
        public Integer getPageIdCurDoc() {
            return this.pageIdCurDoc;
        }

    }

    public static class QueryDocParserStatusResponseBodyDataOutputFormatResult extends TeaModel {
        @NameInMap("OutputFileUrl")
        public String outputFileUrl;

        @NameInMap("OutputType")
        public String outputType;

        @NameInMap("Pages")
        public java.util.List<QueryDocParserStatusResponseBodyDataOutputFormatResultPages> pages;

        public static QueryDocParserStatusResponseBodyDataOutputFormatResult build(java.util.Map<String, ?> map) throws Exception {
            QueryDocParserStatusResponseBodyDataOutputFormatResult self = new QueryDocParserStatusResponseBodyDataOutputFormatResult();
            return TeaModel.build(map, self);
        }

        public QueryDocParserStatusResponseBodyDataOutputFormatResult setOutputFileUrl(String outputFileUrl) {
            this.outputFileUrl = outputFileUrl;
            return this;
        }
        public String getOutputFileUrl() {
            return this.outputFileUrl;
        }

        public QueryDocParserStatusResponseBodyDataOutputFormatResult setOutputType(String outputType) {
            this.outputType = outputType;
            return this;
        }
        public String getOutputType() {
            return this.outputType;
        }

        public QueryDocParserStatusResponseBodyDataOutputFormatResult setPages(java.util.List<QueryDocParserStatusResponseBodyDataOutputFormatResultPages> pages) {
            this.pages = pages;
            return this;
        }
        public java.util.List<QueryDocParserStatusResponseBodyDataOutputFormatResultPages> getPages() {
            return this.pages;
        }

    }

    public static class QueryDocParserStatusResponseBodyData extends TeaModel {
        @NameInMap("ImageCount")
        public Integer imageCount;

        @NameInMap("NumberOfSuccessfulParsing")
        public Integer numberOfSuccessfulParsing;

        @NameInMap("OutputFormatResult")
        public java.util.List<QueryDocParserStatusResponseBodyDataOutputFormatResult> outputFormatResult;

        @NameInMap("PageCountEstimate")
        public Integer pageCountEstimate;

        @NameInMap("ParagraphCount")
        public Integer paragraphCount;

        @NameInMap("Processing")
        public Float processing;

        @NameInMap("Status")
        public String status;

        @NameInMap("TableCount")
        public Integer tableCount;

        @NameInMap("Tokens")
        public Long tokens;

        public static QueryDocParserStatusResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QueryDocParserStatusResponseBodyData self = new QueryDocParserStatusResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QueryDocParserStatusResponseBodyData setImageCount(Integer imageCount) {
            this.imageCount = imageCount;
            return this;
        }
        public Integer getImageCount() {
            return this.imageCount;
        }

        public QueryDocParserStatusResponseBodyData setNumberOfSuccessfulParsing(Integer numberOfSuccessfulParsing) {
            this.numberOfSuccessfulParsing = numberOfSuccessfulParsing;
            return this;
        }
        public Integer getNumberOfSuccessfulParsing() {
            return this.numberOfSuccessfulParsing;
        }

        public QueryDocParserStatusResponseBodyData setOutputFormatResult(java.util.List<QueryDocParserStatusResponseBodyDataOutputFormatResult> outputFormatResult) {
            this.outputFormatResult = outputFormatResult;
            return this;
        }
        public java.util.List<QueryDocParserStatusResponseBodyDataOutputFormatResult> getOutputFormatResult() {
            return this.outputFormatResult;
        }

        public QueryDocParserStatusResponseBodyData setPageCountEstimate(Integer pageCountEstimate) {
            this.pageCountEstimate = pageCountEstimate;
            return this;
        }
        public Integer getPageCountEstimate() {
            return this.pageCountEstimate;
        }

        public QueryDocParserStatusResponseBodyData setParagraphCount(Integer paragraphCount) {
            this.paragraphCount = paragraphCount;
            return this;
        }
        public Integer getParagraphCount() {
            return this.paragraphCount;
        }

        public QueryDocParserStatusResponseBodyData setProcessing(Float processing) {
            this.processing = processing;
            return this;
        }
        public Float getProcessing() {
            return this.processing;
        }

        public QueryDocParserStatusResponseBodyData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public QueryDocParserStatusResponseBodyData setTableCount(Integer tableCount) {
            this.tableCount = tableCount;
            return this;
        }
        public Integer getTableCount() {
            return this.tableCount;
        }

        public QueryDocParserStatusResponseBodyData setTokens(Long tokens) {
            this.tokens = tokens;
            return this;
        }
        public Long getTokens() {
            return this.tokens;
        }

    }

}
