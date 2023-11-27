// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live_interaction20201214.models;

import com.aliyun.tea.*;

public class GetMediaUploadUrlRequest extends TeaModel {
    @NameInMap("AppId")
    public String appId;

    @NameInMap("RequestParams")
    public GetMediaUploadUrlRequestRequestParams requestParams;

    public static GetMediaUploadUrlRequest build(java.util.Map<String, ?> map) throws Exception {
        GetMediaUploadUrlRequest self = new GetMediaUploadUrlRequest();
        return TeaModel.build(map, self);
    }

    public GetMediaUploadUrlRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public GetMediaUploadUrlRequest setRequestParams(GetMediaUploadUrlRequestRequestParams requestParams) {
        this.requestParams = requestParams;
        return this;
    }
    public GetMediaUploadUrlRequestRequestParams getRequestParams() {
        return this.requestParams;
    }

    public static class GetMediaUploadUrlRequestRequestParams extends TeaModel {
        @NameInMap("MimeType")
        public String mimeType;

        public static GetMediaUploadUrlRequestRequestParams build(java.util.Map<String, ?> map) throws Exception {
            GetMediaUploadUrlRequestRequestParams self = new GetMediaUploadUrlRequestRequestParams();
            return TeaModel.build(map, self);
        }

        public GetMediaUploadUrlRequestRequestParams setMimeType(String mimeType) {
            this.mimeType = mimeType;
            return this;
        }
        public String getMimeType() {
            return this.mimeType;
        }

    }

}
