// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dianjin20240628.models;

import com.aliyun.tea.*;

public class RecallDocumentResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("cost")
    public Long cost;

    @NameInMap("data")
    public RecallDocumentResponseBodyData data;

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
     * <p>0bc13a9517168617617186457e401f</p>
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

    public static RecallDocumentResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RecallDocumentResponseBody self = new RecallDocumentResponseBody();
        return TeaModel.build(map, self);
    }

    public RecallDocumentResponseBody setCost(Long cost) {
        this.cost = cost;
        return this;
    }
    public Long getCost() {
        return this.cost;
    }

    public RecallDocumentResponseBody setData(RecallDocumentResponseBodyData data) {
        this.data = data;
        return this;
    }
    public RecallDocumentResponseBodyData getData() {
        return this.data;
    }

    public RecallDocumentResponseBody setDataType(String dataType) {
        this.dataType = dataType;
        return this;
    }
    public String getDataType() {
        return this.dataType;
    }

    public RecallDocumentResponseBody setErrCode(String errCode) {
        this.errCode = errCode;
        return this;
    }
    public String getErrCode() {
        return this.errCode;
    }

    public RecallDocumentResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public RecallDocumentResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public RecallDocumentResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public RecallDocumentResponseBody setTime(String time) {
        this.time = time;
        return this;
    }
    public String getTime() {
        return this.time;
    }

    public static class RecallDocumentResponseBodyDataChunkListPos extends TeaModel {
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

        public static RecallDocumentResponseBodyDataChunkListPos build(java.util.Map<String, ?> map) throws Exception {
            RecallDocumentResponseBodyDataChunkListPos self = new RecallDocumentResponseBodyDataChunkListPos();
            return TeaModel.build(map, self);
        }

        public RecallDocumentResponseBodyDataChunkListPos setAxisArray(java.util.List<Double> axisArray) {
            this.axisArray = axisArray;
            return this;
        }
        public java.util.List<Double> getAxisArray() {
            return this.axisArray;
        }

        public RecallDocumentResponseBodyDataChunkListPos setPage(Integer page) {
            this.page = page;
            return this;
        }
        public Integer getPage() {
            return this.page;
        }

        public RecallDocumentResponseBodyDataChunkListPos setTextHighlightArea(java.util.List<Integer> textHighlightArea) {
            this.textHighlightArea = textHighlightArea;
            return this;
        }
        public java.util.List<Integer> getTextHighlightArea() {
            return this.textHighlightArea;
        }

    }

    public static class RecallDocumentResponseBodyDataChunkList extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>823746762354</p>
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
         * <p><a href="http://oss-xxx-hangzhou.com/xxx">http://oss-xxx-hangzhou.com/xxx</a></p>
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
         * <p>839468263472</p>
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
         * <p>dscsbdsk</p>
         */
        @NameInMap("libraryId")
        public String libraryId;

        @NameInMap("libraryName")
        public String libraryName;

        /**
         * <strong>example:</strong>
         * <p>982374872364</p>
         */
        @NameInMap("nextChunkId")
        public String nextChunkId;

        @NameInMap("pos")
        public java.util.List<RecallDocumentResponseBodyDataChunkListPos> pos;

        /**
         * <strong>example:</strong>
         * <p>827364827364832</p>
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

        public static RecallDocumentResponseBodyDataChunkList build(java.util.Map<String, ?> map) throws Exception {
            RecallDocumentResponseBodyDataChunkList self = new RecallDocumentResponseBodyDataChunkList();
            return TeaModel.build(map, self);
        }

        public RecallDocumentResponseBodyDataChunkList setChunkId(String chunkId) {
            this.chunkId = chunkId;
            return this;
        }
        public String getChunkId() {
            return this.chunkId;
        }

        public RecallDocumentResponseBodyDataChunkList setChunkMeta(java.util.Map<String, ?> chunkMeta) {
            this.chunkMeta = chunkMeta;
            return this;
        }
        public java.util.Map<String, ?> getChunkMeta() {
            return this.chunkMeta;
        }

        public RecallDocumentResponseBodyDataChunkList setChunkOssUrl(String chunkOssUrl) {
            this.chunkOssUrl = chunkOssUrl;
            return this;
        }
        public String getChunkOssUrl() {
            return this.chunkOssUrl;
        }

        public RecallDocumentResponseBodyDataChunkList setChunkText(String chunkText) {
            this.chunkText = chunkText;
            return this;
        }
        public String getChunkText() {
            return this.chunkText;
        }

        public RecallDocumentResponseBodyDataChunkList setChunkType(String chunkType) {
            this.chunkType = chunkType;
            return this;
        }
        public String getChunkType() {
            return this.chunkType;
        }

        public RecallDocumentResponseBodyDataChunkList setDocId(String docId) {
            this.docId = docId;
            return this;
        }
        public String getDocId() {
            return this.docId;
        }

        public RecallDocumentResponseBodyDataChunkList setFileType(String fileType) {
            this.fileType = fileType;
            return this;
        }
        public String getFileType() {
            return this.fileType;
        }

        public RecallDocumentResponseBodyDataChunkList setLibraryId(String libraryId) {
            this.libraryId = libraryId;
            return this;
        }
        public String getLibraryId() {
            return this.libraryId;
        }

        public RecallDocumentResponseBodyDataChunkList setLibraryName(String libraryName) {
            this.libraryName = libraryName;
            return this;
        }
        public String getLibraryName() {
            return this.libraryName;
        }

        public RecallDocumentResponseBodyDataChunkList setNextChunkId(String nextChunkId) {
            this.nextChunkId = nextChunkId;
            return this;
        }
        public String getNextChunkId() {
            return this.nextChunkId;
        }

        public RecallDocumentResponseBodyDataChunkList setPos(java.util.List<RecallDocumentResponseBodyDataChunkListPos> pos) {
            this.pos = pos;
            return this;
        }
        public java.util.List<RecallDocumentResponseBodyDataChunkListPos> getPos() {
            return this.pos;
        }

        public RecallDocumentResponseBodyDataChunkList setPreChunkId(String preChunkId) {
            this.preChunkId = preChunkId;
            return this;
        }
        public String getPreChunkId() {
            return this.preChunkId;
        }

        public RecallDocumentResponseBodyDataChunkList setScore(Float score) {
            this.score = score;
            return this;
        }
        public Float getScore() {
            return this.score;
        }

        public RecallDocumentResponseBodyDataChunkList setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

    }

    public static class RecallDocumentResponseBodyDataChunkPartListPos extends TeaModel {
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

        public static RecallDocumentResponseBodyDataChunkPartListPos build(java.util.Map<String, ?> map) throws Exception {
            RecallDocumentResponseBodyDataChunkPartListPos self = new RecallDocumentResponseBodyDataChunkPartListPos();
            return TeaModel.build(map, self);
        }

        public RecallDocumentResponseBodyDataChunkPartListPos setAxisArray(java.util.List<Double> axisArray) {
            this.axisArray = axisArray;
            return this;
        }
        public java.util.List<Double> getAxisArray() {
            return this.axisArray;
        }

        public RecallDocumentResponseBodyDataChunkPartListPos setPage(Integer page) {
            this.page = page;
            return this;
        }
        public Integer getPage() {
            return this.page;
        }

        public RecallDocumentResponseBodyDataChunkPartListPos setTextHighlightArea(java.util.List<Integer> textHighlightArea) {
            this.textHighlightArea = textHighlightArea;
            return this;
        }
        public java.util.List<Integer> getTextHighlightArea() {
            return this.textHighlightArea;
        }

    }

    public static class RecallDocumentResponseBodyDataChunkPartList extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>98327482364</p>
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
         * <p><a href="http://oss-xxx-hangzhou.com/xxx">http://oss-xxx-hangzhou.com/xxx</a></p>
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
         * <p>92837482364</p>
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
         * <p>sjdhgjsd</p>
         */
        @NameInMap("libraryId")
        public String libraryId;

        @NameInMap("libraryName")
        public String libraryName;

        /**
         * <strong>example:</strong>
         * <p>2387648263542</p>
         */
        @NameInMap("nextChunkId")
        public String nextChunkId;

        @NameInMap("pos")
        public java.util.List<RecallDocumentResponseBodyDataChunkPartListPos> pos;

        /**
         * <strong>example:</strong>
         * <p>32874682764</p>
         */
        @NameInMap("preChunkId")
        public String preChunkId;

        /**
         * <strong>example:</strong>
         * <p>0.5</p>
         */
        @NameInMap("score")
        public Float score;

        @NameInMap("title")
        public String title;

        public static RecallDocumentResponseBodyDataChunkPartList build(java.util.Map<String, ?> map) throws Exception {
            RecallDocumentResponseBodyDataChunkPartList self = new RecallDocumentResponseBodyDataChunkPartList();
            return TeaModel.build(map, self);
        }

        public RecallDocumentResponseBodyDataChunkPartList setChunkId(String chunkId) {
            this.chunkId = chunkId;
            return this;
        }
        public String getChunkId() {
            return this.chunkId;
        }

        public RecallDocumentResponseBodyDataChunkPartList setChunkMeta(java.util.Map<String, ?> chunkMeta) {
            this.chunkMeta = chunkMeta;
            return this;
        }
        public java.util.Map<String, ?> getChunkMeta() {
            return this.chunkMeta;
        }

        public RecallDocumentResponseBodyDataChunkPartList setChunkOssUrl(String chunkOssUrl) {
            this.chunkOssUrl = chunkOssUrl;
            return this;
        }
        public String getChunkOssUrl() {
            return this.chunkOssUrl;
        }

        public RecallDocumentResponseBodyDataChunkPartList setChunkText(String chunkText) {
            this.chunkText = chunkText;
            return this;
        }
        public String getChunkText() {
            return this.chunkText;
        }

        public RecallDocumentResponseBodyDataChunkPartList setChunkType(String chunkType) {
            this.chunkType = chunkType;
            return this;
        }
        public String getChunkType() {
            return this.chunkType;
        }

        public RecallDocumentResponseBodyDataChunkPartList setDocId(String docId) {
            this.docId = docId;
            return this;
        }
        public String getDocId() {
            return this.docId;
        }

        public RecallDocumentResponseBodyDataChunkPartList setFileType(String fileType) {
            this.fileType = fileType;
            return this;
        }
        public String getFileType() {
            return this.fileType;
        }

        public RecallDocumentResponseBodyDataChunkPartList setLibraryId(String libraryId) {
            this.libraryId = libraryId;
            return this;
        }
        public String getLibraryId() {
            return this.libraryId;
        }

        public RecallDocumentResponseBodyDataChunkPartList setLibraryName(String libraryName) {
            this.libraryName = libraryName;
            return this;
        }
        public String getLibraryName() {
            return this.libraryName;
        }

        public RecallDocumentResponseBodyDataChunkPartList setNextChunkId(String nextChunkId) {
            this.nextChunkId = nextChunkId;
            return this;
        }
        public String getNextChunkId() {
            return this.nextChunkId;
        }

        public RecallDocumentResponseBodyDataChunkPartList setPos(java.util.List<RecallDocumentResponseBodyDataChunkPartListPos> pos) {
            this.pos = pos;
            return this;
        }
        public java.util.List<RecallDocumentResponseBodyDataChunkPartListPos> getPos() {
            return this.pos;
        }

        public RecallDocumentResponseBodyDataChunkPartList setPreChunkId(String preChunkId) {
            this.preChunkId = preChunkId;
            return this;
        }
        public String getPreChunkId() {
            return this.preChunkId;
        }

        public RecallDocumentResponseBodyDataChunkPartList setScore(Float score) {
            this.score = score;
            return this;
        }
        public Float getScore() {
            return this.score;
        }

        public RecallDocumentResponseBodyDataChunkPartList setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

    }

    public static class RecallDocumentResponseBodyDataDocuments extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>92837482364</p>
         */
        @NameInMap("docId")
        public String docId;

        /**
         * <strong>example:</strong>
         * <p>{&quot;a&quot;:&quot;1&quot;}</p>
         */
        @NameInMap("documentMeta")
        public java.util.Map<String, ?> documentMeta;

        /**
         * <strong>example:</strong>
         * <p>pdf</p>
         */
        @NameInMap("fileType")
        public String fileType;

        /**
         * <strong>example:</strong>
         * <p>2024-01-01 00:00:00</p>
         */
        @NameInMap("gmtCreate")
        public String gmtCreate;

        /**
         * <strong>example:</strong>
         * <p>sjdhgjsd</p>
         */
        @NameInMap("libraryId")
        public String libraryId;

        /**
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("title")
        public String title;

        /**
         * <strong>example:</strong>
         * <p><a href="http://oss-xxx-hangzhou.com/test.pdf">http://oss-xxx-hangzhou.com/test.pdf</a></p>
         */
        @NameInMap("url")
        public String url;

        public static RecallDocumentResponseBodyDataDocuments build(java.util.Map<String, ?> map) throws Exception {
            RecallDocumentResponseBodyDataDocuments self = new RecallDocumentResponseBodyDataDocuments();
            return TeaModel.build(map, self);
        }

        public RecallDocumentResponseBodyDataDocuments setDocId(String docId) {
            this.docId = docId;
            return this;
        }
        public String getDocId() {
            return this.docId;
        }

        public RecallDocumentResponseBodyDataDocuments setDocumentMeta(java.util.Map<String, ?> documentMeta) {
            this.documentMeta = documentMeta;
            return this;
        }
        public java.util.Map<String, ?> getDocumentMeta() {
            return this.documentMeta;
        }

        public RecallDocumentResponseBodyDataDocuments setFileType(String fileType) {
            this.fileType = fileType;
            return this;
        }
        public String getFileType() {
            return this.fileType;
        }

        public RecallDocumentResponseBodyDataDocuments setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public RecallDocumentResponseBodyDataDocuments setLibraryId(String libraryId) {
            this.libraryId = libraryId;
            return this;
        }
        public String getLibraryId() {
            return this.libraryId;
        }

        public RecallDocumentResponseBodyDataDocuments setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

        public RecallDocumentResponseBodyDataDocuments setUrl(String url) {
            this.url = url;
            return this;
        }
        public String getUrl() {
            return this.url;
        }

    }

    public static class RecallDocumentResponseBodyDataTextChunkListPos extends TeaModel {
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

        public static RecallDocumentResponseBodyDataTextChunkListPos build(java.util.Map<String, ?> map) throws Exception {
            RecallDocumentResponseBodyDataTextChunkListPos self = new RecallDocumentResponseBodyDataTextChunkListPos();
            return TeaModel.build(map, self);
        }

        public RecallDocumentResponseBodyDataTextChunkListPos setAxisArray(java.util.List<Double> axisArray) {
            this.axisArray = axisArray;
            return this;
        }
        public java.util.List<Double> getAxisArray() {
            return this.axisArray;
        }

        public RecallDocumentResponseBodyDataTextChunkListPos setPage(Integer page) {
            this.page = page;
            return this;
        }
        public Integer getPage() {
            return this.page;
        }

        public RecallDocumentResponseBodyDataTextChunkListPos setTextHighlightArea(java.util.List<Integer> textHighlightArea) {
            this.textHighlightArea = textHighlightArea;
            return this;
        }
        public java.util.List<Integer> getTextHighlightArea() {
            return this.textHighlightArea;
        }

    }

    public static class RecallDocumentResponseBodyDataTextChunkList extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>32874682364</p>
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
         * <p><a href="http://oss-xxx-hangzhou.com/xxx">http://oss-xxx-hangzhou.com/xxx</a></p>
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
         * <p>8372467263542</p>
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
         * <p>djsgfsjd</p>
         */
        @NameInMap("libraryId")
        public String libraryId;

        @NameInMap("libraryName")
        public String libraryName;

        /**
         * <strong>example:</strong>
         * <p>23874682432</p>
         */
        @NameInMap("nextChunkId")
        public String nextChunkId;

        @NameInMap("pos")
        public java.util.List<RecallDocumentResponseBodyDataTextChunkListPos> pos;

        /**
         * <strong>example:</strong>
         * <p>89473868346</p>
         */
        @NameInMap("preChunkId")
        public String preChunkId;

        /**
         * <strong>example:</strong>
         * <p>0.5</p>
         */
        @NameInMap("score")
        public Float score;

        @NameInMap("title")
        public String title;

        public static RecallDocumentResponseBodyDataTextChunkList build(java.util.Map<String, ?> map) throws Exception {
            RecallDocumentResponseBodyDataTextChunkList self = new RecallDocumentResponseBodyDataTextChunkList();
            return TeaModel.build(map, self);
        }

        public RecallDocumentResponseBodyDataTextChunkList setChunkId(String chunkId) {
            this.chunkId = chunkId;
            return this;
        }
        public String getChunkId() {
            return this.chunkId;
        }

        public RecallDocumentResponseBodyDataTextChunkList setChunkMeta(java.util.Map<String, ?> chunkMeta) {
            this.chunkMeta = chunkMeta;
            return this;
        }
        public java.util.Map<String, ?> getChunkMeta() {
            return this.chunkMeta;
        }

        public RecallDocumentResponseBodyDataTextChunkList setChunkOssUrl(String chunkOssUrl) {
            this.chunkOssUrl = chunkOssUrl;
            return this;
        }
        public String getChunkOssUrl() {
            return this.chunkOssUrl;
        }

        public RecallDocumentResponseBodyDataTextChunkList setChunkText(String chunkText) {
            this.chunkText = chunkText;
            return this;
        }
        public String getChunkText() {
            return this.chunkText;
        }

        public RecallDocumentResponseBodyDataTextChunkList setChunkType(String chunkType) {
            this.chunkType = chunkType;
            return this;
        }
        public String getChunkType() {
            return this.chunkType;
        }

        public RecallDocumentResponseBodyDataTextChunkList setDocId(String docId) {
            this.docId = docId;
            return this;
        }
        public String getDocId() {
            return this.docId;
        }

        public RecallDocumentResponseBodyDataTextChunkList setFileType(String fileType) {
            this.fileType = fileType;
            return this;
        }
        public String getFileType() {
            return this.fileType;
        }

        public RecallDocumentResponseBodyDataTextChunkList setLibraryId(String libraryId) {
            this.libraryId = libraryId;
            return this;
        }
        public String getLibraryId() {
            return this.libraryId;
        }

        public RecallDocumentResponseBodyDataTextChunkList setLibraryName(String libraryName) {
            this.libraryName = libraryName;
            return this;
        }
        public String getLibraryName() {
            return this.libraryName;
        }

        public RecallDocumentResponseBodyDataTextChunkList setNextChunkId(String nextChunkId) {
            this.nextChunkId = nextChunkId;
            return this;
        }
        public String getNextChunkId() {
            return this.nextChunkId;
        }

        public RecallDocumentResponseBodyDataTextChunkList setPos(java.util.List<RecallDocumentResponseBodyDataTextChunkListPos> pos) {
            this.pos = pos;
            return this;
        }
        public java.util.List<RecallDocumentResponseBodyDataTextChunkListPos> getPos() {
            return this.pos;
        }

        public RecallDocumentResponseBodyDataTextChunkList setPreChunkId(String preChunkId) {
            this.preChunkId = preChunkId;
            return this;
        }
        public String getPreChunkId() {
            return this.preChunkId;
        }

        public RecallDocumentResponseBodyDataTextChunkList setScore(Float score) {
            this.score = score;
            return this;
        }
        public Float getScore() {
            return this.score;
        }

        public RecallDocumentResponseBodyDataTextChunkList setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

    }

    public static class RecallDocumentResponseBodyDataVectorChunkListPos extends TeaModel {
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

        public static RecallDocumentResponseBodyDataVectorChunkListPos build(java.util.Map<String, ?> map) throws Exception {
            RecallDocumentResponseBodyDataVectorChunkListPos self = new RecallDocumentResponseBodyDataVectorChunkListPos();
            return TeaModel.build(map, self);
        }

        public RecallDocumentResponseBodyDataVectorChunkListPos setAxisArray(java.util.List<Double> axisArray) {
            this.axisArray = axisArray;
            return this;
        }
        public java.util.List<Double> getAxisArray() {
            return this.axisArray;
        }

        public RecallDocumentResponseBodyDataVectorChunkListPos setPage(Integer page) {
            this.page = page;
            return this;
        }
        public Integer getPage() {
            return this.page;
        }

        public RecallDocumentResponseBodyDataVectorChunkListPos setTextHighlightArea(java.util.List<Integer> textHighlightArea) {
            this.textHighlightArea = textHighlightArea;
            return this;
        }
        public java.util.List<Integer> getTextHighlightArea() {
            return this.textHighlightArea;
        }

    }

    public static class RecallDocumentResponseBodyDataVectorChunkList extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>8723642345276</p>
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
         * <p><a href="https://oss-xxxx-hangzhou.com/test.pdf">https://oss-xxxx-hangzhou.com/test.pdf</a></p>
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
         * <p>78326476235675372</p>
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
         * <p>djsgfsjd</p>
         */
        @NameInMap("libraryId")
        public String libraryId;

        @NameInMap("libraryName")
        public String libraryName;

        /**
         * <strong>example:</strong>
         * <p>293846872343</p>
         */
        @NameInMap("nextChunkId")
        public String nextChunkId;

        @NameInMap("pos")
        public java.util.List<RecallDocumentResponseBodyDataVectorChunkListPos> pos;

        /**
         * <strong>example:</strong>
         * <p>873647326542</p>
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

        public static RecallDocumentResponseBodyDataVectorChunkList build(java.util.Map<String, ?> map) throws Exception {
            RecallDocumentResponseBodyDataVectorChunkList self = new RecallDocumentResponseBodyDataVectorChunkList();
            return TeaModel.build(map, self);
        }

        public RecallDocumentResponseBodyDataVectorChunkList setChunkId(String chunkId) {
            this.chunkId = chunkId;
            return this;
        }
        public String getChunkId() {
            return this.chunkId;
        }

        public RecallDocumentResponseBodyDataVectorChunkList setChunkMeta(java.util.Map<String, ?> chunkMeta) {
            this.chunkMeta = chunkMeta;
            return this;
        }
        public java.util.Map<String, ?> getChunkMeta() {
            return this.chunkMeta;
        }

        public RecallDocumentResponseBodyDataVectorChunkList setChunkOssUrl(String chunkOssUrl) {
            this.chunkOssUrl = chunkOssUrl;
            return this;
        }
        public String getChunkOssUrl() {
            return this.chunkOssUrl;
        }

        public RecallDocumentResponseBodyDataVectorChunkList setChunkText(String chunkText) {
            this.chunkText = chunkText;
            return this;
        }
        public String getChunkText() {
            return this.chunkText;
        }

        public RecallDocumentResponseBodyDataVectorChunkList setChunkType(String chunkType) {
            this.chunkType = chunkType;
            return this;
        }
        public String getChunkType() {
            return this.chunkType;
        }

        public RecallDocumentResponseBodyDataVectorChunkList setDocId(String docId) {
            this.docId = docId;
            return this;
        }
        public String getDocId() {
            return this.docId;
        }

        public RecallDocumentResponseBodyDataVectorChunkList setFileType(String fileType) {
            this.fileType = fileType;
            return this;
        }
        public String getFileType() {
            return this.fileType;
        }

        public RecallDocumentResponseBodyDataVectorChunkList setLibraryId(String libraryId) {
            this.libraryId = libraryId;
            return this;
        }
        public String getLibraryId() {
            return this.libraryId;
        }

        public RecallDocumentResponseBodyDataVectorChunkList setLibraryName(String libraryName) {
            this.libraryName = libraryName;
            return this;
        }
        public String getLibraryName() {
            return this.libraryName;
        }

        public RecallDocumentResponseBodyDataVectorChunkList setNextChunkId(String nextChunkId) {
            this.nextChunkId = nextChunkId;
            return this;
        }
        public String getNextChunkId() {
            return this.nextChunkId;
        }

        public RecallDocumentResponseBodyDataVectorChunkList setPos(java.util.List<RecallDocumentResponseBodyDataVectorChunkListPos> pos) {
            this.pos = pos;
            return this;
        }
        public java.util.List<RecallDocumentResponseBodyDataVectorChunkListPos> getPos() {
            return this.pos;
        }

        public RecallDocumentResponseBodyDataVectorChunkList setPreChunkId(String preChunkId) {
            this.preChunkId = preChunkId;
            return this;
        }
        public String getPreChunkId() {
            return this.preChunkId;
        }

        public RecallDocumentResponseBodyDataVectorChunkList setScore(Float score) {
            this.score = score;
            return this;
        }
        public Float getScore() {
            return this.score;
        }

        public RecallDocumentResponseBodyDataVectorChunkList setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

    }

    public static class RecallDocumentResponseBodyData extends TeaModel {
        @NameInMap("chunkList")
        public java.util.List<RecallDocumentResponseBodyDataChunkList> chunkList;

        @NameInMap("chunkPartList")
        public java.util.List<RecallDocumentResponseBodyDataChunkPartList> chunkPartList;

        @NameInMap("chunkTextList")
        public java.util.List<String> chunkTextList;

        @NameInMap("documents")
        public java.util.List<RecallDocumentResponseBodyDataDocuments> documents;

        /**
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("embeddingElapsedMs")
        public Long embeddingElapsedMs;

        @NameInMap("textChunkList")
        public java.util.List<RecallDocumentResponseBodyDataTextChunkList> textChunkList;

        /**
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("textSearchElapsedMs")
        public Long textSearchElapsedMs;

        /**
         * <strong>example:</strong>
         * <p>400</p>
         */
        @NameInMap("totalElapsedMs")
        public Long totalElapsedMs;

        @NameInMap("vectorChunkList")
        public java.util.List<RecallDocumentResponseBodyDataVectorChunkList> vectorChunkList;

        /**
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("vectorSearchElapsedMs")
        public Long vectorSearchElapsedMs;

        public static RecallDocumentResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            RecallDocumentResponseBodyData self = new RecallDocumentResponseBodyData();
            return TeaModel.build(map, self);
        }

        public RecallDocumentResponseBodyData setChunkList(java.util.List<RecallDocumentResponseBodyDataChunkList> chunkList) {
            this.chunkList = chunkList;
            return this;
        }
        public java.util.List<RecallDocumentResponseBodyDataChunkList> getChunkList() {
            return this.chunkList;
        }

        public RecallDocumentResponseBodyData setChunkPartList(java.util.List<RecallDocumentResponseBodyDataChunkPartList> chunkPartList) {
            this.chunkPartList = chunkPartList;
            return this;
        }
        public java.util.List<RecallDocumentResponseBodyDataChunkPartList> getChunkPartList() {
            return this.chunkPartList;
        }

        public RecallDocumentResponseBodyData setChunkTextList(java.util.List<String> chunkTextList) {
            this.chunkTextList = chunkTextList;
            return this;
        }
        public java.util.List<String> getChunkTextList() {
            return this.chunkTextList;
        }

        public RecallDocumentResponseBodyData setDocuments(java.util.List<RecallDocumentResponseBodyDataDocuments> documents) {
            this.documents = documents;
            return this;
        }
        public java.util.List<RecallDocumentResponseBodyDataDocuments> getDocuments() {
            return this.documents;
        }

        public RecallDocumentResponseBodyData setEmbeddingElapsedMs(Long embeddingElapsedMs) {
            this.embeddingElapsedMs = embeddingElapsedMs;
            return this;
        }
        public Long getEmbeddingElapsedMs() {
            return this.embeddingElapsedMs;
        }

        public RecallDocumentResponseBodyData setTextChunkList(java.util.List<RecallDocumentResponseBodyDataTextChunkList> textChunkList) {
            this.textChunkList = textChunkList;
            return this;
        }
        public java.util.List<RecallDocumentResponseBodyDataTextChunkList> getTextChunkList() {
            return this.textChunkList;
        }

        public RecallDocumentResponseBodyData setTextSearchElapsedMs(Long textSearchElapsedMs) {
            this.textSearchElapsedMs = textSearchElapsedMs;
            return this;
        }
        public Long getTextSearchElapsedMs() {
            return this.textSearchElapsedMs;
        }

        public RecallDocumentResponseBodyData setTotalElapsedMs(Long totalElapsedMs) {
            this.totalElapsedMs = totalElapsedMs;
            return this;
        }
        public Long getTotalElapsedMs() {
            return this.totalElapsedMs;
        }

        public RecallDocumentResponseBodyData setVectorChunkList(java.util.List<RecallDocumentResponseBodyDataVectorChunkList> vectorChunkList) {
            this.vectorChunkList = vectorChunkList;
            return this;
        }
        public java.util.List<RecallDocumentResponseBodyDataVectorChunkList> getVectorChunkList() {
            return this.vectorChunkList;
        }

        public RecallDocumentResponseBodyData setVectorSearchElapsedMs(Long vectorSearchElapsedMs) {
            this.vectorSearchElapsedMs = vectorSearchElapsedMs;
            return this;
        }
        public Long getVectorSearchElapsedMs() {
            return this.vectorSearchElapsedMs;
        }

    }

}
