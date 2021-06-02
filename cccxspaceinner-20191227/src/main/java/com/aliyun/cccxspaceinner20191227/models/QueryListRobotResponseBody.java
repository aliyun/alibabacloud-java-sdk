// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cccxspaceinner20191227.models;

import com.aliyun.tea.*;

public class QueryListRobotResponseBody extends TeaModel {
    // message
    @NameInMap("Message")
    public String message;

    // data
    @NameInMap("Data")
    public QueryListRobotResponseBodyData data;

    // code
    @NameInMap("Code")
    public Integer code;

    // success
    @NameInMap("Success")
    public Boolean success;

    public static QueryListRobotResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryListRobotResponseBody self = new QueryListRobotResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryListRobotResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public QueryListRobotResponseBody setData(QueryListRobotResponseBodyData data) {
        this.data = data;
        return this;
    }
    public QueryListRobotResponseBodyData getData() {
        return this.data;
    }

    public QueryListRobotResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public QueryListRobotResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class QueryListRobotResponseBodyDataResult extends TeaModel {
        // name
        @NameInMap("Name")
        public String name;

        // introduction
        @NameInMap("Introduction")
        public String introduction;

        // secret
        @NameInMap("Secret")
        public String secret;

        // accountId
        @NameInMap("AccountId")
        public Long accountId;

        // accountType
        @NameInMap("AccountType")
        public Integer accountType;

        // source
        @NameInMap("Source")
        public String source;

        // appType
        @NameInMap("AppType")
        public Integer appType;

        // ext
        @NameInMap("Ext")
        public String ext;

        // status
        @NameInMap("Status")
        public Integer status;

        // appKey
        @NameInMap("AppKey")
        public String appKey;

        // buKey
        @NameInMap("BuKey")
        public String buKey;

        // buName
        @NameInMap("BuName")
        public String buName;

        // corpId
        @NameInMap("CorpId")
        public String corpId;

        public static QueryListRobotResponseBodyDataResult build(java.util.Map<String, ?> map) throws Exception {
            QueryListRobotResponseBodyDataResult self = new QueryListRobotResponseBodyDataResult();
            return TeaModel.build(map, self);
        }

        public QueryListRobotResponseBodyDataResult setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public QueryListRobotResponseBodyDataResult setIntroduction(String introduction) {
            this.introduction = introduction;
            return this;
        }
        public String getIntroduction() {
            return this.introduction;
        }

        public QueryListRobotResponseBodyDataResult setSecret(String secret) {
            this.secret = secret;
            return this;
        }
        public String getSecret() {
            return this.secret;
        }

        public QueryListRobotResponseBodyDataResult setAccountId(Long accountId) {
            this.accountId = accountId;
            return this;
        }
        public Long getAccountId() {
            return this.accountId;
        }

        public QueryListRobotResponseBodyDataResult setAccountType(Integer accountType) {
            this.accountType = accountType;
            return this;
        }
        public Integer getAccountType() {
            return this.accountType;
        }

        public QueryListRobotResponseBodyDataResult setSource(String source) {
            this.source = source;
            return this;
        }
        public String getSource() {
            return this.source;
        }

        public QueryListRobotResponseBodyDataResult setAppType(Integer appType) {
            this.appType = appType;
            return this;
        }
        public Integer getAppType() {
            return this.appType;
        }

        public QueryListRobotResponseBodyDataResult setExt(String ext) {
            this.ext = ext;
            return this;
        }
        public String getExt() {
            return this.ext;
        }

        public QueryListRobotResponseBodyDataResult setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

        public QueryListRobotResponseBodyDataResult setAppKey(String appKey) {
            this.appKey = appKey;
            return this;
        }
        public String getAppKey() {
            return this.appKey;
        }

        public QueryListRobotResponseBodyDataResult setBuKey(String buKey) {
            this.buKey = buKey;
            return this;
        }
        public String getBuKey() {
            return this.buKey;
        }

        public QueryListRobotResponseBodyDataResult setBuName(String buName) {
            this.buName = buName;
            return this;
        }
        public String getBuName() {
            return this.buName;
        }

        public QueryListRobotResponseBodyDataResult setCorpId(String corpId) {
            this.corpId = corpId;
            return this;
        }
        public String getCorpId() {
            return this.corpId;
        }

    }

    public static class QueryListRobotResponseBodyData extends TeaModel {
        // pageNo
        @NameInMap("PageNo")
        public Integer pageNo;

        // pageSize
        @NameInMap("PageSize")
        public Integer pageSize;

        // rowCount
        @NameInMap("RowCount")
        public Integer rowCount;

        // Result
        @NameInMap("Result")
        public java.util.List<QueryListRobotResponseBodyDataResult> result;

        public static QueryListRobotResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QueryListRobotResponseBodyData self = new QueryListRobotResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QueryListRobotResponseBodyData setPageNo(Integer pageNo) {
            this.pageNo = pageNo;
            return this;
        }
        public Integer getPageNo() {
            return this.pageNo;
        }

        public QueryListRobotResponseBodyData setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public QueryListRobotResponseBodyData setRowCount(Integer rowCount) {
            this.rowCount = rowCount;
            return this;
        }
        public Integer getRowCount() {
            return this.rowCount;
        }

        public QueryListRobotResponseBodyData setResult(java.util.List<QueryListRobotResponseBodyDataResult> result) {
            this.result = result;
            return this;
        }
        public java.util.List<QueryListRobotResponseBodyDataResult> getResult() {
            return this.result;
        }

    }

}
