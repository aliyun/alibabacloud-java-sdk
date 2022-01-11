// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ft20210101.models;

import com.aliyun.tea.*;

public class RpcUploadDemoRequest extends TeaModel {
    @NameInMap("cardData")
    public RpcUploadDemoRequestCardData cardData;

    @NameInMap("outTrackId")
    public String outTrackId;

    @NameInMap("privateData")
    public java.util.Map<String, String> privateData;

    public static RpcUploadDemoRequest build(java.util.Map<String, ?> map) throws Exception {
        RpcUploadDemoRequest self = new RpcUploadDemoRequest();
        return TeaModel.build(map, self);
    }

    public RpcUploadDemoRequest setCardData(RpcUploadDemoRequestCardData cardData) {
        this.cardData = cardData;
        return this;
    }
    public RpcUploadDemoRequestCardData getCardData() {
        return this.cardData;
    }

    public RpcUploadDemoRequest setOutTrackId(String outTrackId) {
        this.outTrackId = outTrackId;
        return this;
    }
    public String getOutTrackId() {
        return this.outTrackId;
    }

    public RpcUploadDemoRequest setPrivateData(java.util.Map<String, String> privateData) {
        this.privateData = privateData;
        return this;
    }
    public java.util.Map<String, String> getPrivateData() {
        return this.privateData;
    }

    public static class RpcUploadDemoRequestCardData extends TeaModel {
        @NameInMap("cardMediaIdParamMap")
        public java.util.Map<String, String> cardMediaIdParamMap;

        @NameInMap("cardParamMap")
        public java.util.Map<String, String> cardParamMap;

        public static RpcUploadDemoRequestCardData build(java.util.Map<String, ?> map) throws Exception {
            RpcUploadDemoRequestCardData self = new RpcUploadDemoRequestCardData();
            return TeaModel.build(map, self);
        }

        public RpcUploadDemoRequestCardData setCardMediaIdParamMap(java.util.Map<String, String> cardMediaIdParamMap) {
            this.cardMediaIdParamMap = cardMediaIdParamMap;
            return this;
        }
        public java.util.Map<String, String> getCardMediaIdParamMap() {
            return this.cardMediaIdParamMap;
        }

        public RpcUploadDemoRequestCardData setCardParamMap(java.util.Map<String, String> cardParamMap) {
            this.cardParamMap = cardParamMap;
            return this;
        }
        public java.util.Map<String, String> getCardParamMap() {
            return this.cardParamMap;
        }

    }

}
