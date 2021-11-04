// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20180116.models;

import com.aliyun.tea.*;

public class GetActivityGameInfoResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Message")
    public String message;

    @NameInMap("Model")
    public GetActivityGameInfoResponseBodyModel model;

    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    public static GetActivityGameInfoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetActivityGameInfoResponseBody self = new GetActivityGameInfoResponseBody();
        return TeaModel.build(map, self);
    }

    public GetActivityGameInfoResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetActivityGameInfoResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetActivityGameInfoResponseBody setModel(GetActivityGameInfoResponseBodyModel model) {
        this.model = model;
        return this;
    }
    public GetActivityGameInfoResponseBodyModel getModel() {
        return this.model;
    }

    public GetActivityGameInfoResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetActivityGameInfoResponseBodyModel extends TeaModel {
        // 扩展信息
        @NameInMap("ExtInfo")
        public String extInfo;

        // 玩法信息
        @NameInMap("GameDTO")
        public String gameDTO;

        // 玩法展示信息
        @NameInMap("GameShowInfo")
        public String gameShowInfo;

        // 玩法币信息
        @NameInMap("UserGameCoinInfos")
        public String userGameCoinInfos;

        // 用户进度
        @NameInMap("UserProcessDTO")
        public String userProcessDTO;

        public static GetActivityGameInfoResponseBodyModel build(java.util.Map<String, ?> map) throws Exception {
            GetActivityGameInfoResponseBodyModel self = new GetActivityGameInfoResponseBodyModel();
            return TeaModel.build(map, self);
        }

        public GetActivityGameInfoResponseBodyModel setExtInfo(String extInfo) {
            this.extInfo = extInfo;
            return this;
        }
        public String getExtInfo() {
            return this.extInfo;
        }

        public GetActivityGameInfoResponseBodyModel setGameDTO(String gameDTO) {
            this.gameDTO = gameDTO;
            return this;
        }
        public String getGameDTO() {
            return this.gameDTO;
        }

        public GetActivityGameInfoResponseBodyModel setGameShowInfo(String gameShowInfo) {
            this.gameShowInfo = gameShowInfo;
            return this;
        }
        public String getGameShowInfo() {
            return this.gameShowInfo;
        }

        public GetActivityGameInfoResponseBodyModel setUserGameCoinInfos(String userGameCoinInfos) {
            this.userGameCoinInfos = userGameCoinInfos;
            return this;
        }
        public String getUserGameCoinInfos() {
            return this.userGameCoinInfos;
        }

        public GetActivityGameInfoResponseBodyModel setUserProcessDTO(String userProcessDTO) {
            this.userProcessDTO = userProcessDTO;
            return this;
        }
        public String getUserProcessDTO() {
            return this.userProcessDTO;
        }

    }

}
