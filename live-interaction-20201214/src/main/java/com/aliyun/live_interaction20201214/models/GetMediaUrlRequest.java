// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live_interaction20201214.models;

import com.aliyun.tea.*;

public class GetMediaUrlRequest extends TeaModel {
    @NameInMap("AppId")
    public String appId;

    @NameInMap("RequestParams")
    public GetMediaUrlRequestRequestParams requestParams;

    public static GetMediaUrlRequest build(java.util.Map<String, ?> map) throws Exception {
        GetMediaUrlRequest self = new GetMediaUrlRequest();
        return TeaModel.build(map, self);
    }

    public GetMediaUrlRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public GetMediaUrlRequest setRequestParams(GetMediaUrlRequestRequestParams requestParams) {
        this.requestParams = requestParams;
        return this;
    }
    public GetMediaUrlRequestRequestParams getRequestParams() {
        return this.requestParams;
    }

    public static class GetMediaUrlRequestRequestParams extends TeaModel {
        @NameInMap("MediaId")
        public String mediaId;

        @NameInMap("UrlExpireTime")
        public Long urlExpireTime;

        public static GetMediaUrlRequestRequestParams build(java.util.Map<String, ?> map) throws Exception {
            GetMediaUrlRequestRequestParams self = new GetMediaUrlRequestRequestParams();
            return TeaModel.build(map, self);
        }

        public GetMediaUrlRequestRequestParams setMediaId(String mediaId) {
            this.mediaId = mediaId;
            return this;
        }
        public String getMediaId() {
            return this.mediaId;
        }

        public GetMediaUrlRequestRequestParams setUrlExpireTime(Long urlExpireTime) {
            this.urlExpireTime = urlExpireTime;
            return this;
        }
        public Long getUrlExpireTime() {
            return this.urlExpireTime;
        }

    }

}
