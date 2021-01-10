// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.idrsservice20200630.models;

import com.aliyun.tea.*;

public class GetModelSignedUrlResponseBody extends TeaModel {
    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Data")
    public java.util.List<GetModelSignedUrlResponseBodyData> data;

    @NameInMap("Code")
    public String code;

    public static GetModelSignedUrlResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetModelSignedUrlResponseBody self = new GetModelSignedUrlResponseBody();
        return TeaModel.build(map, self);
    }

    public GetModelSignedUrlResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetModelSignedUrlResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetModelSignedUrlResponseBody setData(java.util.List<GetModelSignedUrlResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<GetModelSignedUrlResponseBodyData> getData() {
        return this.data;
    }

    public GetModelSignedUrlResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public static class GetModelSignedUrlResponseBodyData extends TeaModel {
        @NameInMap("PublicUrl")
        public String publicUrl;

        @NameInMap("Md5")
        public String md5;

        @NameInMap("ModelPath")
        public String modelPath;

        public static GetModelSignedUrlResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetModelSignedUrlResponseBodyData self = new GetModelSignedUrlResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetModelSignedUrlResponseBodyData setPublicUrl(String publicUrl) {
            this.publicUrl = publicUrl;
            return this;
        }
        public String getPublicUrl() {
            return this.publicUrl;
        }

        public GetModelSignedUrlResponseBodyData setMd5(String md5) {
            this.md5 = md5;
            return this;
        }
        public String getMd5() {
            return this.md5;
        }

        public GetModelSignedUrlResponseBodyData setModelPath(String modelPath) {
            this.modelPath = modelPath;
            return this;
        }
        public String getModelPath() {
            return this.modelPath;
        }

    }

}
