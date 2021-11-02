// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20180116.models;

import com.aliyun.tea.*;

public class GetGuidePageResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Message")
    public String message;

    @NameInMap("MiniShopInfo")
    public java.util.List<GetGuidePageResponseBodyMiniShopInfo> miniShopInfo;

    @NameInMap("RequestId")
    public String requestId;

    public static GetGuidePageResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetGuidePageResponseBody self = new GetGuidePageResponseBody();
        return TeaModel.build(map, self);
    }

    public GetGuidePageResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetGuidePageResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetGuidePageResponseBody setMiniShopInfo(java.util.List<GetGuidePageResponseBodyMiniShopInfo> miniShopInfo) {
        this.miniShopInfo = miniShopInfo;
        return this;
    }
    public java.util.List<GetGuidePageResponseBodyMiniShopInfo> getMiniShopInfo() {
        return this.miniShopInfo;
    }

    public GetGuidePageResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetGuidePageResponseBodyMiniShopInfo extends TeaModel {
        @NameInMap("BizId")
        public String bizId;

        @NameInMap("LiteShopId")
        public String liteShopId;

        @NameInMap("Name")
        public String name;

        @NameInMap("Src")
        public String src;

        public static GetGuidePageResponseBodyMiniShopInfo build(java.util.Map<String, ?> map) throws Exception {
            GetGuidePageResponseBodyMiniShopInfo self = new GetGuidePageResponseBodyMiniShopInfo();
            return TeaModel.build(map, self);
        }

        public GetGuidePageResponseBodyMiniShopInfo setBizId(String bizId) {
            this.bizId = bizId;
            return this;
        }
        public String getBizId() {
            return this.bizId;
        }

        public GetGuidePageResponseBodyMiniShopInfo setLiteShopId(String liteShopId) {
            this.liteShopId = liteShopId;
            return this;
        }
        public String getLiteShopId() {
            return this.liteShopId;
        }

        public GetGuidePageResponseBodyMiniShopInfo setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetGuidePageResponseBodyMiniShopInfo setSrc(String src) {
            this.src = src;
            return this;
        }
        public String getSrc() {
            return this.src;
        }

    }

}
