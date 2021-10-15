// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20180116.models;

import com.aliyun.tea.*;

public class GetActivityGameInfoResponse extends TeaModel {
    @NameInMap("Code")
    @Validation(required = true)
    public String code;

    @NameInMap("Message")
    @Validation(required = true)
    public String message;

    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Model")
    @Validation(required = true)
    public GetActivityGameInfoResponseModel model;

    public static GetActivityGameInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        GetActivityGameInfoResponse self = new GetActivityGameInfoResponse();
        return TeaModel.build(map, self);
    }

    public GetActivityGameInfoResponse setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetActivityGameInfoResponse setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetActivityGameInfoResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetActivityGameInfoResponse setModel(GetActivityGameInfoResponseModel model) {
        this.model = model;
        return this;
    }
    public GetActivityGameInfoResponseModel getModel() {
        return this.model;
    }

    public static class GetActivityGameInfoResponseModel extends TeaModel {
        @NameInMap("UserProcessDTO")
        @Validation(required = true)
        public String userProcessDTO;

        @NameInMap("GameDTO")
        @Validation(required = true)
        public String gameDTO;

        @NameInMap("UserGameCoinInfos")
        @Validation(required = true)
        public String userGameCoinInfos;

        @NameInMap("ExtInfo")
        @Validation(required = true)
        public String extInfo;

        public static GetActivityGameInfoResponseModel build(java.util.Map<String, ?> map) throws Exception {
            GetActivityGameInfoResponseModel self = new GetActivityGameInfoResponseModel();
            return TeaModel.build(map, self);
        }

        public GetActivityGameInfoResponseModel setUserProcessDTO(String userProcessDTO) {
            this.userProcessDTO = userProcessDTO;
            return this;
        }
        public String getUserProcessDTO() {
            return this.userProcessDTO;
        }

        public GetActivityGameInfoResponseModel setGameDTO(String gameDTO) {
            this.gameDTO = gameDTO;
            return this;
        }
        public String getGameDTO() {
            return this.gameDTO;
        }

        public GetActivityGameInfoResponseModel setUserGameCoinInfos(String userGameCoinInfos) {
            this.userGameCoinInfos = userGameCoinInfos;
            return this;
        }
        public String getUserGameCoinInfos() {
            return this.userGameCoinInfos;
        }

        public GetActivityGameInfoResponseModel setExtInfo(String extInfo) {
            this.extInfo = extInfo;
            return this;
        }
        public String getExtInfo() {
            return this.extInfo;
        }

    }

}
