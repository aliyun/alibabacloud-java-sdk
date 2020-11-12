// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20180116.models;

import com.aliyun.tea.*;

public class GetGuidePageResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Code")
    @Validation(required = true)
    public String code;

    @NameInMap("Message")
    @Validation(required = true)
    public String message;

    @NameInMap("MiniShopInfo")
    @Validation(required = true)
    public java.util.List<GetGuidePageResponseMiniShopInfo> miniShopInfo;

    public static GetGuidePageResponse build(java.util.Map<String, ?> map) throws Exception {
        GetGuidePageResponse self = new GetGuidePageResponse();
        return TeaModel.build(map, self);
    }

    public GetGuidePageResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetGuidePageResponse setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetGuidePageResponse setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetGuidePageResponse setMiniShopInfo(java.util.List<GetGuidePageResponseMiniShopInfo> miniShopInfo) {
        this.miniShopInfo = miniShopInfo;
        return this;
    }
    public java.util.List<GetGuidePageResponseMiniShopInfo> getMiniShopInfo() {
        return this.miniShopInfo;
    }

    public static class GetGuidePageResponseMiniShopInfo extends TeaModel {
        @NameInMap("BizId")
        @Validation(required = true)
        public String bizId;

        @NameInMap("Name")
        @Validation(required = true)
        public String name;

        @NameInMap("Src")
        @Validation(required = true)
        public String src;

        public static GetGuidePageResponseMiniShopInfo build(java.util.Map<String, ?> map) throws Exception {
            GetGuidePageResponseMiniShopInfo self = new GetGuidePageResponseMiniShopInfo();
            return TeaModel.build(map, self);
        }

        public GetGuidePageResponseMiniShopInfo setBizId(String bizId) {
            this.bizId = bizId;
            return this;
        }
        public String getBizId() {
            return this.bizId;
        }

        public GetGuidePageResponseMiniShopInfo setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetGuidePageResponseMiniShopInfo setSrc(String src) {
            this.src = src;
            return this;
        }
        public String getSrc() {
            return this.src;
        }

    }

}
