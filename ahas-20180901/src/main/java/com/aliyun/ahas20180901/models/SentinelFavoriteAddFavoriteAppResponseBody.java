// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class SentinelFavoriteAddFavoriteAppResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public SentinelFavoriteAddFavoriteAppResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static SentinelFavoriteAddFavoriteAppResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SentinelFavoriteAddFavoriteAppResponseBody self = new SentinelFavoriteAddFavoriteAppResponseBody();
        return TeaModel.build(map, self);
    }

    public SentinelFavoriteAddFavoriteAppResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public SentinelFavoriteAddFavoriteAppResponseBody setData(SentinelFavoriteAddFavoriteAppResponseBodyData data) {
        this.data = data;
        return this;
    }
    public SentinelFavoriteAddFavoriteAppResponseBodyData getData() {
        return this.data;
    }

    public SentinelFavoriteAddFavoriteAppResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public SentinelFavoriteAddFavoriteAppResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public SentinelFavoriteAddFavoriteAppResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class SentinelFavoriteAddFavoriteAppResponseBodyData extends TeaModel {
        @NameInMap("appName")
        public String appName;

        @NameInMap("appType")
        public Integer appType;

        @NameInMap("createTimestamp")
        public Long createTimestamp;

        @NameInMap("id")
        public Long id;

        @NameInMap("modifiedTimestamp")
        public Long modifiedTimestamp;

        @NameInMap("namespace")
        public String namespace;

        @NameInMap("resource")
        public String resource;

        @NameInMap("type")
        public Integer type;

        @NameInMap("userId")
        public String userId;

        @NameInMap("vpcId")
        public String vpcId;

        public static SentinelFavoriteAddFavoriteAppResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            SentinelFavoriteAddFavoriteAppResponseBodyData self = new SentinelFavoriteAddFavoriteAppResponseBodyData();
            return TeaModel.build(map, self);
        }

        public SentinelFavoriteAddFavoriteAppResponseBodyData setAppName(String appName) {
            this.appName = appName;
            return this;
        }
        public String getAppName() {
            return this.appName;
        }

        public SentinelFavoriteAddFavoriteAppResponseBodyData setAppType(Integer appType) {
            this.appType = appType;
            return this;
        }
        public Integer getAppType() {
            return this.appType;
        }

        public SentinelFavoriteAddFavoriteAppResponseBodyData setCreateTimestamp(Long createTimestamp) {
            this.createTimestamp = createTimestamp;
            return this;
        }
        public Long getCreateTimestamp() {
            return this.createTimestamp;
        }

        public SentinelFavoriteAddFavoriteAppResponseBodyData setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public SentinelFavoriteAddFavoriteAppResponseBodyData setModifiedTimestamp(Long modifiedTimestamp) {
            this.modifiedTimestamp = modifiedTimestamp;
            return this;
        }
        public Long getModifiedTimestamp() {
            return this.modifiedTimestamp;
        }

        public SentinelFavoriteAddFavoriteAppResponseBodyData setNamespace(String namespace) {
            this.namespace = namespace;
            return this;
        }
        public String getNamespace() {
            return this.namespace;
        }

        public SentinelFavoriteAddFavoriteAppResponseBodyData setResource(String resource) {
            this.resource = resource;
            return this;
        }
        public String getResource() {
            return this.resource;
        }

        public SentinelFavoriteAddFavoriteAppResponseBodyData setType(Integer type) {
            this.type = type;
            return this;
        }
        public Integer getType() {
            return this.type;
        }

        public SentinelFavoriteAddFavoriteAppResponseBodyData setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

        public SentinelFavoriteAddFavoriteAppResponseBodyData setVpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public String getVpcId() {
            return this.vpcId;
        }

    }

}
