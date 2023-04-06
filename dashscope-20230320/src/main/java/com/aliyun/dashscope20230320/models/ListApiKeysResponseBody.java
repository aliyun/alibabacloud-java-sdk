// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dashscope20230320.models;

import com.aliyun.tea.*;

public class ListApiKeysResponseBody extends TeaModel {
    @NameInMap("AccessDeniedDetail")
    public String accessDeniedDetail;

    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public ListApiKeysResponseBodyData data;

    @NameInMap("ErrorCode")
    public String errorCode;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    public static ListApiKeysResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListApiKeysResponseBody self = new ListApiKeysResponseBody();
        return TeaModel.build(map, self);
    }

    public ListApiKeysResponseBody setAccessDeniedDetail(String accessDeniedDetail) {
        this.accessDeniedDetail = accessDeniedDetail;
        return this;
    }
    public String getAccessDeniedDetail() {
        return this.accessDeniedDetail;
    }

    public ListApiKeysResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListApiKeysResponseBody setData(ListApiKeysResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ListApiKeysResponseBodyData getData() {
        return this.data;
    }

    public ListApiKeysResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public ListApiKeysResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListApiKeysResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListApiKeysResponseBodyDataApiKeys extends TeaModel {
        /**
         * <p>Api Key</p>
         */
        @NameInMap("ApiKey")
        public String apiKey;

        @NameInMap("Deleted")
        public Boolean deleted;

        @NameInMap("GmtCreate")
        public String gmtCreate;

        @NameInMap("GmtExpire")
        public String gmtExpire;

        /**
         * <p>Api Key Id</p>
         */
        @NameInMap("Id")
        public Long id;

        @NameInMap("LatestActiveTime")
        public String latestActiveTime;

        @NameInMap("UserId")
        public String userId;

        public static ListApiKeysResponseBodyDataApiKeys build(java.util.Map<String, ?> map) throws Exception {
            ListApiKeysResponseBodyDataApiKeys self = new ListApiKeysResponseBodyDataApiKeys();
            return TeaModel.build(map, self);
        }

        public ListApiKeysResponseBodyDataApiKeys setApiKey(String apiKey) {
            this.apiKey = apiKey;
            return this;
        }
        public String getApiKey() {
            return this.apiKey;
        }

        public ListApiKeysResponseBodyDataApiKeys setDeleted(Boolean deleted) {
            this.deleted = deleted;
            return this;
        }
        public Boolean getDeleted() {
            return this.deleted;
        }

        public ListApiKeysResponseBodyDataApiKeys setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public ListApiKeysResponseBodyDataApiKeys setGmtExpire(String gmtExpire) {
            this.gmtExpire = gmtExpire;
            return this;
        }
        public String getGmtExpire() {
            return this.gmtExpire;
        }

        public ListApiKeysResponseBodyDataApiKeys setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public ListApiKeysResponseBodyDataApiKeys setLatestActiveTime(String latestActiveTime) {
            this.latestActiveTime = latestActiveTime;
            return this;
        }
        public String getLatestActiveTime() {
            return this.latestActiveTime;
        }

        public ListApiKeysResponseBodyDataApiKeys setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

    }

    public static class ListApiKeysResponseBodyData extends TeaModel {
        @NameInMap("ApiKeys")
        public java.util.List<ListApiKeysResponseBodyDataApiKeys> apiKeys;

        @NameInMap("PageNo")
        public Long pageNo;

        @NameInMap("PageSize")
        public Long pageSize;

        @NameInMap("Total")
        public Long total;

        public static ListApiKeysResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListApiKeysResponseBodyData self = new ListApiKeysResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListApiKeysResponseBodyData setApiKeys(java.util.List<ListApiKeysResponseBodyDataApiKeys> apiKeys) {
            this.apiKeys = apiKeys;
            return this;
        }
        public java.util.List<ListApiKeysResponseBodyDataApiKeys> getApiKeys() {
            return this.apiKeys;
        }

        public ListApiKeysResponseBodyData setPageNo(Long pageNo) {
            this.pageNo = pageNo;
            return this;
        }
        public Long getPageNo() {
            return this.pageNo;
        }

        public ListApiKeysResponseBodyData setPageSize(Long pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Long getPageSize() {
            return this.pageSize;
        }

        public ListApiKeysResponseBodyData setTotal(Long total) {
            this.total = total;
            return this;
        }
        public Long getTotal() {
            return this.total;
        }

    }

}
