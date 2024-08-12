// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dianjin20240628.models;

import com.aliyun.tea.*;

public class GetDocumentChunkListResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>null</p>
     */
    @NameInMap("cost")
    public Long cost;

    @NameInMap("data")
    public GetDocumentChunkListResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>null</p>
     */
    @NameInMap("dataType")
    public String dataType;

    /**
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("errCode")
    public String errCode;

    /**
     * <strong>example:</strong>
     * <p>ok</p>
     */
    @NameInMap("message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>2B8F6DC9-6FAF-576F-9095-CCD90FB2BDDF</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("success")
    public Boolean success;

    /**
     * <strong>example:</strong>
     * <p>2024-04-24 11:54:34</p>
     */
    @NameInMap("time")
    public String time;

    public static GetDocumentChunkListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetDocumentChunkListResponseBody self = new GetDocumentChunkListResponseBody();
        return TeaModel.build(map, self);
    }

    public GetDocumentChunkListResponseBody setCost(Long cost) {
        this.cost = cost;
        return this;
    }
    public Long getCost() {
        return this.cost;
    }

    public GetDocumentChunkListResponseBody setData(GetDocumentChunkListResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetDocumentChunkListResponseBodyData getData() {
        return this.data;
    }

    public GetDocumentChunkListResponseBody setDataType(String dataType) {
        this.dataType = dataType;
        return this;
    }
    public String getDataType() {
        return this.dataType;
    }

    public GetDocumentChunkListResponseBody setErrCode(String errCode) {
        this.errCode = errCode;
        return this;
    }
    public String getErrCode() {
        return this.errCode;
    }

    public GetDocumentChunkListResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetDocumentChunkListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetDocumentChunkListResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public GetDocumentChunkListResponseBody setTime(String time) {
        this.time = time;
        return this;
    }
    public String getTime() {
        return this.time;
    }

    public static class GetDocumentChunkListResponseBodyDataRecordsPos extends TeaModel {
        @NameInMap("axisArray")
        public java.util.List<Double> axisArray;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("page")
        public Integer page;

        @NameInMap("textHighlightArea")
        public java.util.List<Integer> textHighlightArea;

        public static GetDocumentChunkListResponseBodyDataRecordsPos build(java.util.Map<String, ?> map) throws Exception {
            GetDocumentChunkListResponseBodyDataRecordsPos self = new GetDocumentChunkListResponseBodyDataRecordsPos();
            return TeaModel.build(map, self);
        }

        public GetDocumentChunkListResponseBodyDataRecordsPos setAxisArray(java.util.List<Double> axisArray) {
            this.axisArray = axisArray;
            return this;
        }
        public java.util.List<Double> getAxisArray() {
            return this.axisArray;
        }

        public GetDocumentChunkListResponseBodyDataRecordsPos setPage(Integer page) {
            this.page = page;
            return this;
        }
        public Integer getPage() {
            return this.page;
        }

        public GetDocumentChunkListResponseBodyDataRecordsPos setTextHighlightArea(java.util.List<Integer> textHighlightArea) {
            this.textHighlightArea = textHighlightArea;
            return this;
        }
        public java.util.List<Integer> getTextHighlightArea() {
            return this.textHighlightArea;
        }

    }

    public static class GetDocumentChunkListResponseBodyDataRecords extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>28377468263482764</p>
         */
        @NameInMap("chunkId")
        public String chunkId;

        /**
         * <strong>example:</strong>
         * <p>{&quot;a&quot;:&quot;1&quot;}</p>
         */
        @NameInMap("chunkMeta")
        public java.util.Map<String, ?> chunkMeta;

        /**
         * <strong>example:</strong>
         * <p>oss-xxxx-hangzhou.com/test.pdf</p>
         */
        @NameInMap("chunkOssUrl")
        public String chunkOssUrl;

        @NameInMap("chunkText")
        public String chunkText;

        /**
         * <strong>example:</strong>
         * <p>text</p>
         */
        @NameInMap("chunkType")
        public String chunkType;

        /**
         * <strong>example:</strong>
         * <p>8947387648356</p>
         */
        @NameInMap("docId")
        public String docId;

        /**
         * <strong>example:</strong>
         * <p>pdf</p>
         */
        @NameInMap("fileType")
        public String fileType;

        /**
         * <strong>example:</strong>
         * <p>jhsdvne</p>
         */
        @NameInMap("libraryId")
        public String libraryId;

        @NameInMap("libraryName")
        public String libraryName;

        /**
         * <strong>example:</strong>
         * <p>947538465</p>
         */
        @NameInMap("nextChunkId")
        public String nextChunkId;

        @NameInMap("pos")
        public java.util.List<GetDocumentChunkListResponseBodyDataRecordsPos> pos;

        /**
         * <strong>example:</strong>
         * <p>9848346548365</p>
         */
        @NameInMap("preChunkId")
        public String preChunkId;

        /**
         * <strong>example:</strong>
         * <p>0.5</p>
         */
        @NameInMap("score")
        public Float score;

        /**
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("title")
        public String title;

        public static GetDocumentChunkListResponseBodyDataRecords build(java.util.Map<String, ?> map) throws Exception {
            GetDocumentChunkListResponseBodyDataRecords self = new GetDocumentChunkListResponseBodyDataRecords();
            return TeaModel.build(map, self);
        }

        public GetDocumentChunkListResponseBodyDataRecords setChunkId(String chunkId) {
            this.chunkId = chunkId;
            return this;
        }
        public String getChunkId() {
            return this.chunkId;
        }

        public GetDocumentChunkListResponseBodyDataRecords setChunkMeta(java.util.Map<String, ?> chunkMeta) {
            this.chunkMeta = chunkMeta;
            return this;
        }
        public java.util.Map<String, ?> getChunkMeta() {
            return this.chunkMeta;
        }

        public GetDocumentChunkListResponseBodyDataRecords setChunkOssUrl(String chunkOssUrl) {
            this.chunkOssUrl = chunkOssUrl;
            return this;
        }
        public String getChunkOssUrl() {
            return this.chunkOssUrl;
        }

        public GetDocumentChunkListResponseBodyDataRecords setChunkText(String chunkText) {
            this.chunkText = chunkText;
            return this;
        }
        public String getChunkText() {
            return this.chunkText;
        }

        public GetDocumentChunkListResponseBodyDataRecords setChunkType(String chunkType) {
            this.chunkType = chunkType;
            return this;
        }
        public String getChunkType() {
            return this.chunkType;
        }

        public GetDocumentChunkListResponseBodyDataRecords setDocId(String docId) {
            this.docId = docId;
            return this;
        }
        public String getDocId() {
            return this.docId;
        }

        public GetDocumentChunkListResponseBodyDataRecords setFileType(String fileType) {
            this.fileType = fileType;
            return this;
        }
        public String getFileType() {
            return this.fileType;
        }

        public GetDocumentChunkListResponseBodyDataRecords setLibraryId(String libraryId) {
            this.libraryId = libraryId;
            return this;
        }
        public String getLibraryId() {
            return this.libraryId;
        }

        public GetDocumentChunkListResponseBodyDataRecords setLibraryName(String libraryName) {
            this.libraryName = libraryName;
            return this;
        }
        public String getLibraryName() {
            return this.libraryName;
        }

        public GetDocumentChunkListResponseBodyDataRecords setNextChunkId(String nextChunkId) {
            this.nextChunkId = nextChunkId;
            return this;
        }
        public String getNextChunkId() {
            return this.nextChunkId;
        }

        public GetDocumentChunkListResponseBodyDataRecords setPos(java.util.List<GetDocumentChunkListResponseBodyDataRecordsPos> pos) {
            this.pos = pos;
            return this;
        }
        public java.util.List<GetDocumentChunkListResponseBodyDataRecordsPos> getPos() {
            return this.pos;
        }

        public GetDocumentChunkListResponseBodyDataRecords setPreChunkId(String preChunkId) {
            this.preChunkId = preChunkId;
            return this;
        }
        public String getPreChunkId() {
            return this.preChunkId;
        }

        public GetDocumentChunkListResponseBodyDataRecords setScore(Float score) {
            this.score = score;
            return this;
        }
        public Float getScore() {
            return this.score;
        }

        public GetDocumentChunkListResponseBodyDataRecords setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

    }

    public static class GetDocumentChunkListResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("currentPage")
        public Long currentPage;

        /**
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("pageSize")
        public Long pageSize;

        @NameInMap("records")
        public java.util.List<GetDocumentChunkListResponseBodyDataRecords> records;

        /**
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("totalPages")
        public Long totalPages;

        /**
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("totalRecords")
        public Long totalRecords;

        public static GetDocumentChunkListResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetDocumentChunkListResponseBodyData self = new GetDocumentChunkListResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetDocumentChunkListResponseBodyData setCurrentPage(Long currentPage) {
            this.currentPage = currentPage;
            return this;
        }
        public Long getCurrentPage() {
            return this.currentPage;
        }

        public GetDocumentChunkListResponseBodyData setPageSize(Long pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Long getPageSize() {
            return this.pageSize;
        }

        public GetDocumentChunkListResponseBodyData setRecords(java.util.List<GetDocumentChunkListResponseBodyDataRecords> records) {
            this.records = records;
            return this;
        }
        public java.util.List<GetDocumentChunkListResponseBodyDataRecords> getRecords() {
            return this.records;
        }

        public GetDocumentChunkListResponseBodyData setTotalPages(Long totalPages) {
            this.totalPages = totalPages;
            return this;
        }
        public Long getTotalPages() {
            return this.totalPages;
        }

        public GetDocumentChunkListResponseBodyData setTotalRecords(Long totalRecords) {
            this.totalRecords = totalRecords;
            return this;
        }
        public Long getTotalRecords() {
            return this.totalRecords;
        }

    }

}
