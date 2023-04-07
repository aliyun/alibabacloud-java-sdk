// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dashscope20230320.models;

import com.aliyun.tea.*;

public class CreateApiKeyResponseBody extends TeaModel {
    @NameInMap("AccessDeniedDetail")
    public String accessDeniedDetail;

    @NameInMap("Data")
    public CreateApiKeyResponseBodyData data;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static CreateApiKeyResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateApiKeyResponseBody self = new CreateApiKeyResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateApiKeyResponseBody setAccessDeniedDetail(String accessDeniedDetail) {
        this.accessDeniedDetail = accessDeniedDetail;
        return this;
    }
    public String getAccessDeniedDetail() {
        return this.accessDeniedDetail;
    }

    public CreateApiKeyResponseBody setData(CreateApiKeyResponseBodyData data) {
        this.data = data;
        return this;
    }
    public CreateApiKeyResponseBodyData getData() {
        return this.data;
    }

    public CreateApiKeyResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateApiKeyResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class CreateApiKeyResponseBodyData extends TeaModel {
        @NameInMap("ApiKey")
        public String apiKey;

        @NameInMap("GmtCreate")
        public String gmtCreate;

        @NameInMap("GmtExpire")
        public String gmtExpire;

        /**
         * <p>ApiKey ID</p>
         */
        @NameInMap("Id")
        public Long id;

        @NameInMap("LatestActiveTime")
        public String latestActiveTime;

        @NameInMap("UserId")
        public String userId;

        public static CreateApiKeyResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            CreateApiKeyResponseBodyData self = new CreateApiKeyResponseBodyData();
            return TeaModel.build(map, self);
        }

        public CreateApiKeyResponseBodyData setApiKey(String apiKey) {
            this.apiKey = apiKey;
            return this;
        }
        public String getApiKey() {
            return this.apiKey;
        }

        public CreateApiKeyResponseBodyData setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public CreateApiKeyResponseBodyData setGmtExpire(String gmtExpire) {
            this.gmtExpire = gmtExpire;
            return this;
        }
        public String getGmtExpire() {
            return this.gmtExpire;
        }

        public CreateApiKeyResponseBodyData setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public CreateApiKeyResponseBodyData setLatestActiveTime(String latestActiveTime) {
            this.latestActiveTime = latestActiveTime;
            return this;
        }
        public String getLatestActiveTime() {
            return this.latestActiveTime;
        }

        public CreateApiKeyResponseBodyData setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

    }

}
