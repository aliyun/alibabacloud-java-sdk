// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cccxspaceinner20191227.models;

import com.aliyun.tea.*;

public class QueryRobotListResponseBody extends TeaModel {
    // errorMsg
    @NameInMap("ErrorMsg")
    public String errorMsg;

    // dingOpenErrcode
    @NameInMap("DingOpenErrcode")
    public Integer dingOpenErrcode;

    // success
    @NameInMap("Success")
    public Boolean success;

    // result
    @NameInMap("Result")
    public java.util.List<QueryRobotListResponseBodyResult> result;

    public static QueryRobotListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryRobotListResponseBody self = new QueryRobotListResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryRobotListResponseBody setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
        return this;
    }
    public String getErrorMsg() {
        return this.errorMsg;
    }

    public QueryRobotListResponseBody setDingOpenErrcode(Integer dingOpenErrcode) {
        this.dingOpenErrcode = dingOpenErrcode;
        return this;
    }
    public Integer getDingOpenErrcode() {
        return this.dingOpenErrcode;
    }

    public QueryRobotListResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public QueryRobotListResponseBody setResult(java.util.List<QueryRobotListResponseBodyResult> result) {
        this.result = result;
        return this;
    }
    public java.util.List<QueryRobotListResponseBodyResult> getResult() {
        return this.result;
    }

    public static class QueryRobotListResponseBodyResult extends TeaModel {
        // id
        @NameInMap("id")
        public Long id;

        // name
        @NameInMap("name")
        public String name;

        // appKey
        @NameInMap("appKey")
        public String appKey;

        // secret
        @NameInMap("secret")
        public String secret;

        // config
        @NameInMap("config")
        public String config;

        // accountId
        @NameInMap("accountId")
        public Integer accountId;

        // accountType
        @NameInMap("accountType")
        public Integer accountType;

        // source
        @NameInMap("source")
        public String source;

        // appType
        @NameInMap("appType")
        public Integer appType;

        // status
        @NameInMap("status")
        public Integer status;

        // corpId
        @NameInMap("corpId")
        public String corpId;

        public static QueryRobotListResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            QueryRobotListResponseBodyResult self = new QueryRobotListResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public QueryRobotListResponseBodyResult setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public QueryRobotListResponseBodyResult setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public QueryRobotListResponseBodyResult setAppKey(String appKey) {
            this.appKey = appKey;
            return this;
        }
        public String getAppKey() {
            return this.appKey;
        }

        public QueryRobotListResponseBodyResult setSecret(String secret) {
            this.secret = secret;
            return this;
        }
        public String getSecret() {
            return this.secret;
        }

        public QueryRobotListResponseBodyResult setConfig(String config) {
            this.config = config;
            return this;
        }
        public String getConfig() {
            return this.config;
        }

        public QueryRobotListResponseBodyResult setAccountId(Integer accountId) {
            this.accountId = accountId;
            return this;
        }
        public Integer getAccountId() {
            return this.accountId;
        }

        public QueryRobotListResponseBodyResult setAccountType(Integer accountType) {
            this.accountType = accountType;
            return this;
        }
        public Integer getAccountType() {
            return this.accountType;
        }

        public QueryRobotListResponseBodyResult setSource(String source) {
            this.source = source;
            return this;
        }
        public String getSource() {
            return this.source;
        }

        public QueryRobotListResponseBodyResult setAppType(Integer appType) {
            this.appType = appType;
            return this;
        }
        public Integer getAppType() {
            return this.appType;
        }

        public QueryRobotListResponseBodyResult setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

        public QueryRobotListResponseBodyResult setCorpId(String corpId) {
            this.corpId = corpId;
            return this;
        }
        public String getCorpId() {
            return this.corpId;
        }

    }

}
