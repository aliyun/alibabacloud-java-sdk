// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aimiaobi20230801.models;

import com.aliyun.tea.*;

public class ListPptArtifactsResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>NoData</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Current")
    public Integer current;

    @NameInMap("Data")
    public java.util.List<ListPptArtifactsResponseBodyData> data;

    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>cEoBWREAXdxaOyjq/cqAbg==</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <strong>example:</strong>
     * <p>1813ceee-7fe5-41b4-87e5-982a4d18cca5</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("Size")
    public Integer size;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    /**
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("Total")
    public Integer total;

    public static ListPptArtifactsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListPptArtifactsResponseBody self = new ListPptArtifactsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListPptArtifactsResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListPptArtifactsResponseBody setCurrent(Integer current) {
        this.current = current;
        return this;
    }
    public Integer getCurrent() {
        return this.current;
    }

    public ListPptArtifactsResponseBody setData(java.util.List<ListPptArtifactsResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<ListPptArtifactsResponseBodyData> getData() {
        return this.data;
    }

    public ListPptArtifactsResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public ListPptArtifactsResponseBody setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListPptArtifactsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListPptArtifactsResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListPptArtifactsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListPptArtifactsResponseBody setSize(Integer size) {
        this.size = size;
        return this;
    }
    public Integer getSize() {
        return this.size;
    }

    public ListPptArtifactsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public ListPptArtifactsResponseBody setTotal(Integer total) {
        this.total = total;
        return this;
    }
    public Integer getTotal() {
        return this.total;
    }

    public static class ListPptArtifactsResponseBodyDataFileAttr extends TeaModel {
        @NameInMap("FileName")
        public String fileName;

        /**
         * <strong>example:</strong>
         * <p>500</p>
         */
        @NameInMap("Height")
        public Integer height;

        /**
         * <strong>example:</strong>
         * <p><a href="http://www.example.com/xxx.jpg">http://www.example.com/xxx.jpg</a></p>
         */
        @NameInMap("TmpUrl")
        public String tmpUrl;

        /**
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("Width")
        public Integer width;

        public static ListPptArtifactsResponseBodyDataFileAttr build(java.util.Map<String, ?> map) throws Exception {
            ListPptArtifactsResponseBodyDataFileAttr self = new ListPptArtifactsResponseBodyDataFileAttr();
            return TeaModel.build(map, self);
        }

        public ListPptArtifactsResponseBodyDataFileAttr setFileName(String fileName) {
            this.fileName = fileName;
            return this;
        }
        public String getFileName() {
            return this.fileName;
        }

        public ListPptArtifactsResponseBodyDataFileAttr setHeight(Integer height) {
            this.height = height;
            return this;
        }
        public Integer getHeight() {
            return this.height;
        }

        public ListPptArtifactsResponseBodyDataFileAttr setTmpUrl(String tmpUrl) {
            this.tmpUrl = tmpUrl;
            return this;
        }
        public String getTmpUrl() {
            return this.tmpUrl;
        }

        public ListPptArtifactsResponseBodyDataFileAttr setWidth(Integer width) {
            this.width = width;
            return this;
        }
        public Integer getWidth() {
            return this.width;
        }

    }

    public static class ListPptArtifactsResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>2024-01-04 11:46:07</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        @NameInMap("FileAttr")
        public ListPptArtifactsResponseBodyDataFileAttr fileAttr;

        /**
         * <strong>example:</strong>
         * <p><a href="http://www.example.com/xxx.jpg">http://www.example.com/xxx.jpg</a></p>
         */
        @NameInMap("FileKey")
        public String fileKey;

        /**
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("Id")
        public Long id;

        @NameInMap("Title")
        public String title;

        /**
         * <strong>example:</strong>
         * <p>2025-04-14 19:59:53</p>
         */
        @NameInMap("UpdateTime")
        public String updateTime;

        public static ListPptArtifactsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListPptArtifactsResponseBodyData self = new ListPptArtifactsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListPptArtifactsResponseBodyData setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public ListPptArtifactsResponseBodyData setFileAttr(ListPptArtifactsResponseBodyDataFileAttr fileAttr) {
            this.fileAttr = fileAttr;
            return this;
        }
        public ListPptArtifactsResponseBodyDataFileAttr getFileAttr() {
            return this.fileAttr;
        }

        public ListPptArtifactsResponseBodyData setFileKey(String fileKey) {
            this.fileKey = fileKey;
            return this;
        }
        public String getFileKey() {
            return this.fileKey;
        }

        public ListPptArtifactsResponseBodyData setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public ListPptArtifactsResponseBodyData setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

        public ListPptArtifactsResponseBodyData setUpdateTime(String updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public String getUpdateTime() {
            return this.updateTime;
        }

    }

}
