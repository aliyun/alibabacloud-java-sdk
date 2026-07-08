// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aimiaobi20230801.models;

import com.aliyun.tea.*;

public class GetPptArtifactResponseBody extends TeaModel {
    /**
     * <p>The error code.</p>
     * 
     * <strong>example:</strong>
     * <p>DataNotExists</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The task response object.</p>
     */
    @NameInMap("Data")
    public GetPptArtifactResponseBodyData data;

    /**
     * <p>The HTTP status code.</p>
     * 
     * <strong>example:</strong>
     * <p>400</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <p>The error message.</p>
     * 
     * <strong>example:</strong>
     * <p>错误消息</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>xxxxx</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static GetPptArtifactResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetPptArtifactResponseBody self = new GetPptArtifactResponseBody();
        return TeaModel.build(map, self);
    }

    public GetPptArtifactResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetPptArtifactResponseBody setData(GetPptArtifactResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetPptArtifactResponseBodyData getData() {
        return this.data;
    }

    public GetPptArtifactResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public GetPptArtifactResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetPptArtifactResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetPptArtifactResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetPptArtifactResponseBodyDataFileAttr extends TeaModel {
        /**
         * <p>The file name.</p>
         * 
         * <strong>example:</strong>
         * <p>xxx.pptx</p>
         */
        @NameInMap("FileName")
        public String fileName;

        /**
         * <p>The height.</p>
         * 
         * <strong>example:</strong>
         * <p>600</p>
         */
        @NameInMap("Height")
        public Integer height;

        /**
         * <p>The temporary access URL for the file. The URL expires in one hour.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="http://www.example.com/xxx.pptx">http://www.example.com/xxx.pptx</a></p>
         */
        @NameInMap("TmpUrl")
        public String tmpUrl;

        /**
         * <p>The width.</p>
         * 
         * <strong>example:</strong>
         * <p>800</p>
         */
        @NameInMap("Width")
        public Integer width;

        public static GetPptArtifactResponseBodyDataFileAttr build(java.util.Map<String, ?> map) throws Exception {
            GetPptArtifactResponseBodyDataFileAttr self = new GetPptArtifactResponseBodyDataFileAttr();
            return TeaModel.build(map, self);
        }

        public GetPptArtifactResponseBodyDataFileAttr setFileName(String fileName) {
            this.fileName = fileName;
            return this;
        }
        public String getFileName() {
            return this.fileName;
        }

        public GetPptArtifactResponseBodyDataFileAttr setHeight(Integer height) {
            this.height = height;
            return this;
        }
        public Integer getHeight() {
            return this.height;
        }

        public GetPptArtifactResponseBodyDataFileAttr setTmpUrl(String tmpUrl) {
            this.tmpUrl = tmpUrl;
            return this;
        }
        public String getTmpUrl() {
            return this.tmpUrl;
        }

        public GetPptArtifactResponseBodyDataFileAttr setWidth(Integer width) {
            this.width = width;
            return this;
        }
        public Integer getWidth() {
            return this.width;
        }

    }

    public static class GetPptArtifactResponseBodyData extends TeaModel {
        /**
         * <p>The time when the resource was last updated.</p>
         * 
         * <strong>example:</strong>
         * <p>2024-11-25 11:40:50</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <p>The file properties.</p>
         */
        @NameInMap("FileAttr")
        public GetPptArtifactResponseBodyDataFileAttr fileAttr;

        /**
         * <p>The storage path of the file in the backend.</p>
         * 
         * <strong>example:</strong>
         * <p>oss://default/oss-bucket-name/aimiaobi/2021/07/01/1625126400000/1.docx</p>
         */
        @NameInMap("FileKey")
        public String fileKey;

        /**
         * <p>The unique ID of the artifact.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("Id")
        public Long id;

        /**
         * <p>The title.</p>
         * 
         * <strong>example:</strong>
         * <p>内容标题</p>
         */
        @NameInMap("Title")
        public String title;

        /**
         * <p>The time when the artifact was last updated.</p>
         * 
         * <strong>example:</strong>
         * <p>2024-11-25 11:40:50</p>
         */
        @NameInMap("UpdateTime")
        public String updateTime;

        public static GetPptArtifactResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetPptArtifactResponseBodyData self = new GetPptArtifactResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetPptArtifactResponseBodyData setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public GetPptArtifactResponseBodyData setFileAttr(GetPptArtifactResponseBodyDataFileAttr fileAttr) {
            this.fileAttr = fileAttr;
            return this;
        }
        public GetPptArtifactResponseBodyDataFileAttr getFileAttr() {
            return this.fileAttr;
        }

        public GetPptArtifactResponseBodyData setFileKey(String fileKey) {
            this.fileKey = fileKey;
            return this;
        }
        public String getFileKey() {
            return this.fileKey;
        }

        public GetPptArtifactResponseBodyData setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public GetPptArtifactResponseBodyData setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

        public GetPptArtifactResponseBodyData setUpdateTime(String updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public String getUpdateTime() {
            return this.updateTime;
        }

    }

}
