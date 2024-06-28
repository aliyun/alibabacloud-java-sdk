// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.docmind_api20220711.models;

import com.aliyun.tea.*;

public class GetDocumentConvertResultResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>noPermission</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("Completed")
    public Boolean completed;

    @NameInMap("Data")
    public java.util.List<GetDocumentConvertResultResponseBodyData> data;

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

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Success</p>
     */
    @NameInMap("Status")
    public String status;

    public static GetDocumentConvertResultResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetDocumentConvertResultResponseBody self = new GetDocumentConvertResultResponseBody();
        return TeaModel.build(map, self);
    }

    public GetDocumentConvertResultResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetDocumentConvertResultResponseBody setCompleted(Boolean completed) {
        this.completed = completed;
        return this;
    }
    public Boolean getCompleted() {
        return this.completed;
    }

    public GetDocumentConvertResultResponseBody setData(java.util.List<GetDocumentConvertResultResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<GetDocumentConvertResultResponseBodyData> getData() {
        return this.data;
    }

    public GetDocumentConvertResultResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetDocumentConvertResultResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetDocumentConvertResultResponseBody setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public static class GetDocumentConvertResultResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>e6d83e55df218650b9a296bfbc300076</p>
         */
        @NameInMap("Md5")
        public String md5;

        /**
         * <strong>example:</strong>
         * <p>2355965</p>
         */
        @NameInMap("Size")
        public Long size;

        /**
         * <strong>example:</strong>
         * <p>pdf</p>
         */
        @NameInMap("Type")
        public String type;

        /**
         * <strong>example:</strong>
         * <p><a href="http://docmind-api-cn-hangzhou.oss-cn-hangzhou.aliyuncs.com/convert/docmind-20220816-15bc7965/0.pdf?Expires=1660722412&OSSAccessKeyId=LTAI5tFEK2uEApeeYzxNMEci&Signature=f%2FKluINWMuuVyA5w22Z1wkoRjEg%3D">http://docmind-api-cn-hangzhou.oss-cn-hangzhou.aliyuncs.com/convert/docmind-20220816-15bc7965/0.pdf?Expires=1660722412&amp;OSSAccessKeyId=LTAI5tFEK2uEApeeYzxNMEci&amp;Signature=f%2FKluINWMuuVyA5w22Z1wkoRjEg%3D</a></p>
         */
        @NameInMap("Url")
        public String url;

        public static GetDocumentConvertResultResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetDocumentConvertResultResponseBodyData self = new GetDocumentConvertResultResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetDocumentConvertResultResponseBodyData setMd5(String md5) {
            this.md5 = md5;
            return this;
        }
        public String getMd5() {
            return this.md5;
        }

        public GetDocumentConvertResultResponseBodyData setSize(Long size) {
            this.size = size;
            return this;
        }
        public Long getSize() {
            return this.size;
        }

        public GetDocumentConvertResultResponseBodyData setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public GetDocumentConvertResultResponseBodyData setUrl(String url) {
            this.url = url;
            return this;
        }
        public String getUrl() {
            return this.url;
        }

    }

}
