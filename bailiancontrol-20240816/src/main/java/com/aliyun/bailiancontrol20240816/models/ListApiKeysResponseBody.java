// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bailiancontrol20240816.models;

import com.aliyun.tea.*;

public class ListApiKeysResponseBody extends TeaModel {
    /**
     * <p>apiKey</p>
     */
    @NameInMap("apiKeys")
    public java.util.List<ListApiKeysResponseBodyApiKeys> apiKeys;

    @NameInMap("code")
    public String code;

    @NameInMap("httpStatusCode")
    public Integer httpStatusCode;

    @NameInMap("maxResults")
    public Integer maxResults;

    @NameInMap("message")
    public String message;

    @NameInMap("nextToken")
    public String nextToken;

    /**
     * <p>Id of the request</p>
     */
    @NameInMap("requestId")
    public String requestId;

    @NameInMap("success")
    public Boolean success;

    @NameInMap("totalCount")
    public Integer totalCount;

    public static ListApiKeysResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListApiKeysResponseBody self = new ListApiKeysResponseBody();
        return TeaModel.build(map, self);
    }

    public ListApiKeysResponseBody setApiKeys(java.util.List<ListApiKeysResponseBodyApiKeys> apiKeys) {
        this.apiKeys = apiKeys;
        return this;
    }
    public java.util.List<ListApiKeysResponseBodyApiKeys> getApiKeys() {
        return this.apiKeys;
    }

    public ListApiKeysResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListApiKeysResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public ListApiKeysResponseBody setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListApiKeysResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListApiKeysResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListApiKeysResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListApiKeysResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public ListApiKeysResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class ListApiKeysResponseBodyApiKeysAuthSetModel extends TeaModel {
        @NameInMap("authSetMode")
        public String authSetMode;

        public static ListApiKeysResponseBodyApiKeysAuthSetModel build(java.util.Map<String, ?> map) throws Exception {
            ListApiKeysResponseBodyApiKeysAuthSetModel self = new ListApiKeysResponseBodyApiKeysAuthSetModel();
            return TeaModel.build(map, self);
        }

        public ListApiKeysResponseBodyApiKeysAuthSetModel setAuthSetMode(String authSetMode) {
            this.authSetMode = authSetMode;
            return this;
        }
        public String getAuthSetMode() {
            return this.authSetMode;
        }

    }

    public static class ListApiKeysResponseBodyApiKeys extends TeaModel {
        @NameInMap("apiKeyValue")
        public String apiKeyValue;

        @NameInMap("apikeyId")
        public String apikeyId;

        @NameInMap("authSetModel")
        public ListApiKeysResponseBodyApiKeysAuthSetModel authSetModel;

        @NameInMap("blocked")
        public Integer blocked;

        @NameInMap("createTime")
        public Long createTime;

        @NameInMap("creator")
        public String creator;

        @NameInMap("description")
        public String description;

        @NameInMap("expireTime")
        public Long expireTime;

        @NameInMap("extData")
        public String extData;

        @NameInMap("parentUid")
        public String parentUid;

        @NameInMap("type")
        public Integer type;

        @NameInMap("uid")
        public String uid;

        @NameInMap("workspaceId")
        public String workspaceId;

        public static ListApiKeysResponseBodyApiKeys build(java.util.Map<String, ?> map) throws Exception {
            ListApiKeysResponseBodyApiKeys self = new ListApiKeysResponseBodyApiKeys();
            return TeaModel.build(map, self);
        }

        public ListApiKeysResponseBodyApiKeys setApiKeyValue(String apiKeyValue) {
            this.apiKeyValue = apiKeyValue;
            return this;
        }
        public String getApiKeyValue() {
            return this.apiKeyValue;
        }

        public ListApiKeysResponseBodyApiKeys setApikeyId(String apikeyId) {
            this.apikeyId = apikeyId;
            return this;
        }
        public String getApikeyId() {
            return this.apikeyId;
        }

        public ListApiKeysResponseBodyApiKeys setAuthSetModel(ListApiKeysResponseBodyApiKeysAuthSetModel authSetModel) {
            this.authSetModel = authSetModel;
            return this;
        }
        public ListApiKeysResponseBodyApiKeysAuthSetModel getAuthSetModel() {
            return this.authSetModel;
        }

        public ListApiKeysResponseBodyApiKeys setBlocked(Integer blocked) {
            this.blocked = blocked;
            return this;
        }
        public Integer getBlocked() {
            return this.blocked;
        }

        public ListApiKeysResponseBodyApiKeys setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public ListApiKeysResponseBodyApiKeys setCreator(String creator) {
            this.creator = creator;
            return this;
        }
        public String getCreator() {
            return this.creator;
        }

        public ListApiKeysResponseBodyApiKeys setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListApiKeysResponseBodyApiKeys setExpireTime(Long expireTime) {
            this.expireTime = expireTime;
            return this;
        }
        public Long getExpireTime() {
            return this.expireTime;
        }

        public ListApiKeysResponseBodyApiKeys setExtData(String extData) {
            this.extData = extData;
            return this;
        }
        public String getExtData() {
            return this.extData;
        }

        public ListApiKeysResponseBodyApiKeys setParentUid(String parentUid) {
            this.parentUid = parentUid;
            return this;
        }
        public String getParentUid() {
            return this.parentUid;
        }

        public ListApiKeysResponseBodyApiKeys setType(Integer type) {
            this.type = type;
            return this;
        }
        public Integer getType() {
            return this.type;
        }

        public ListApiKeysResponseBodyApiKeys setUid(String uid) {
            this.uid = uid;
            return this;
        }
        public String getUid() {
            return this.uid;
        }

        public ListApiKeysResponseBodyApiKeys setWorkspaceId(String workspaceId) {
            this.workspaceId = workspaceId;
            return this;
        }
        public String getWorkspaceId() {
            return this.workspaceId;
        }

    }

}
