// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpaas20201028.models;

import com.aliyun.tea.*;

public class QueryMiniGameInfoByAppResponseBody extends TeaModel {
    @NameInMap("AccessDeniedDetail")
    public String accessDeniedDetail;

    @NameInMap("Content")
    public java.util.List<QueryMiniGameInfoByAppResponseBodyContent> content;

    @NameInMap("ErrorCode")
    public String errorCode;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultMsg")
    public String resultMsg;

    @NameInMap("Success")
    public Boolean success;

    public static QueryMiniGameInfoByAppResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryMiniGameInfoByAppResponseBody self = new QueryMiniGameInfoByAppResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryMiniGameInfoByAppResponseBody setAccessDeniedDetail(String accessDeniedDetail) {
        this.accessDeniedDetail = accessDeniedDetail;
        return this;
    }
    public String getAccessDeniedDetail() {
        return this.accessDeniedDetail;
    }

    public QueryMiniGameInfoByAppResponseBody setContent(java.util.List<QueryMiniGameInfoByAppResponseBodyContent> content) {
        this.content = content;
        return this;
    }
    public java.util.List<QueryMiniGameInfoByAppResponseBodyContent> getContent() {
        return this.content;
    }

    public QueryMiniGameInfoByAppResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public QueryMiniGameInfoByAppResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryMiniGameInfoByAppResponseBody setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryMiniGameInfoByAppResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class QueryMiniGameInfoByAppResponseBodyContent extends TeaModel {
        @NameInMap("GameEngine")
        public String gameEngine;

        @NameInMap("GameMaker")
        public String gameMaker;

        @NameInMap("GameTypeLevel1")
        public String gameTypeLevel1;

        @NameInMap("GameTypeLevel2")
        public String gameTypeLevel2;

        @NameInMap("GameTypeLevel3")
        public String gameTypeLevel3;

        @NameInMap("GameVersionId")
        public String gameVersionId;

        @NameInMap("GmtModified")
        public Long gmtModified;

        @NameInMap("Icon")
        public String icon;

        @NameInMap("Introduction")
        public String introduction;

        @NameInMap("MiniProgramCode")
        public String miniProgramCode;

        @NameInMap("MiniProgramId")
        public Long miniProgramId;

        @NameInMap("MiniProgramName")
        public String miniProgramName;

        @NameInMap("Slogan")
        public String slogan;

        @NameInMap("Version")
        public String version;

        public static QueryMiniGameInfoByAppResponseBodyContent build(java.util.Map<String, ?> map) throws Exception {
            QueryMiniGameInfoByAppResponseBodyContent self = new QueryMiniGameInfoByAppResponseBodyContent();
            return TeaModel.build(map, self);
        }

        public QueryMiniGameInfoByAppResponseBodyContent setGameEngine(String gameEngine) {
            this.gameEngine = gameEngine;
            return this;
        }
        public String getGameEngine() {
            return this.gameEngine;
        }

        public QueryMiniGameInfoByAppResponseBodyContent setGameMaker(String gameMaker) {
            this.gameMaker = gameMaker;
            return this;
        }
        public String getGameMaker() {
            return this.gameMaker;
        }

        public QueryMiniGameInfoByAppResponseBodyContent setGameTypeLevel1(String gameTypeLevel1) {
            this.gameTypeLevel1 = gameTypeLevel1;
            return this;
        }
        public String getGameTypeLevel1() {
            return this.gameTypeLevel1;
        }

        public QueryMiniGameInfoByAppResponseBodyContent setGameTypeLevel2(String gameTypeLevel2) {
            this.gameTypeLevel2 = gameTypeLevel2;
            return this;
        }
        public String getGameTypeLevel2() {
            return this.gameTypeLevel2;
        }

        public QueryMiniGameInfoByAppResponseBodyContent setGameTypeLevel3(String gameTypeLevel3) {
            this.gameTypeLevel3 = gameTypeLevel3;
            return this;
        }
        public String getGameTypeLevel3() {
            return this.gameTypeLevel3;
        }

        public QueryMiniGameInfoByAppResponseBodyContent setGameVersionId(String gameVersionId) {
            this.gameVersionId = gameVersionId;
            return this;
        }
        public String getGameVersionId() {
            return this.gameVersionId;
        }

        public QueryMiniGameInfoByAppResponseBodyContent setGmtModified(Long gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public Long getGmtModified() {
            return this.gmtModified;
        }

        public QueryMiniGameInfoByAppResponseBodyContent setIcon(String icon) {
            this.icon = icon;
            return this;
        }
        public String getIcon() {
            return this.icon;
        }

        public QueryMiniGameInfoByAppResponseBodyContent setIntroduction(String introduction) {
            this.introduction = introduction;
            return this;
        }
        public String getIntroduction() {
            return this.introduction;
        }

        public QueryMiniGameInfoByAppResponseBodyContent setMiniProgramCode(String miniProgramCode) {
            this.miniProgramCode = miniProgramCode;
            return this;
        }
        public String getMiniProgramCode() {
            return this.miniProgramCode;
        }

        public QueryMiniGameInfoByAppResponseBodyContent setMiniProgramId(Long miniProgramId) {
            this.miniProgramId = miniProgramId;
            return this;
        }
        public Long getMiniProgramId() {
            return this.miniProgramId;
        }

        public QueryMiniGameInfoByAppResponseBodyContent setMiniProgramName(String miniProgramName) {
            this.miniProgramName = miniProgramName;
            return this;
        }
        public String getMiniProgramName() {
            return this.miniProgramName;
        }

        public QueryMiniGameInfoByAppResponseBodyContent setSlogan(String slogan) {
            this.slogan = slogan;
            return this;
        }
        public String getSlogan() {
            return this.slogan;
        }

        public QueryMiniGameInfoByAppResponseBodyContent setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

    }

}
