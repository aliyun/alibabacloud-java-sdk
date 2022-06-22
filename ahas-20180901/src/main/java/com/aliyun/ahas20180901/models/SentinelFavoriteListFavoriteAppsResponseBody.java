// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class SentinelFavoriteListFavoriteAppsResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public java.util.List<SentinelFavoriteListFavoriteAppsResponseBodyData> data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static SentinelFavoriteListFavoriteAppsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SentinelFavoriteListFavoriteAppsResponseBody self = new SentinelFavoriteListFavoriteAppsResponseBody();
        return TeaModel.build(map, self);
    }

    public SentinelFavoriteListFavoriteAppsResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public SentinelFavoriteListFavoriteAppsResponseBody setData(java.util.List<SentinelFavoriteListFavoriteAppsResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<SentinelFavoriteListFavoriteAppsResponseBodyData> getData() {
        return this.data;
    }

    public SentinelFavoriteListFavoriteAppsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public SentinelFavoriteListFavoriteAppsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public SentinelFavoriteListFavoriteAppsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class SentinelFavoriteListFavoriteAppsResponseBodyData extends TeaModel {
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

        public static SentinelFavoriteListFavoriteAppsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            SentinelFavoriteListFavoriteAppsResponseBodyData self = new SentinelFavoriteListFavoriteAppsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public SentinelFavoriteListFavoriteAppsResponseBodyData setAppName(String appName) {
            this.appName = appName;
            return this;
        }
        public String getAppName() {
            return this.appName;
        }

        public SentinelFavoriteListFavoriteAppsResponseBodyData setAppType(Integer appType) {
            this.appType = appType;
            return this;
        }
        public Integer getAppType() {
            return this.appType;
        }

        public SentinelFavoriteListFavoriteAppsResponseBodyData setCreateTimestamp(Long createTimestamp) {
            this.createTimestamp = createTimestamp;
            return this;
        }
        public Long getCreateTimestamp() {
            return this.createTimestamp;
        }

        public SentinelFavoriteListFavoriteAppsResponseBodyData setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public SentinelFavoriteListFavoriteAppsResponseBodyData setModifiedTimestamp(Long modifiedTimestamp) {
            this.modifiedTimestamp = modifiedTimestamp;
            return this;
        }
        public Long getModifiedTimestamp() {
            return this.modifiedTimestamp;
        }

        public SentinelFavoriteListFavoriteAppsResponseBodyData setNamespace(String namespace) {
            this.namespace = namespace;
            return this;
        }
        public String getNamespace() {
            return this.namespace;
        }

        public SentinelFavoriteListFavoriteAppsResponseBodyData setResource(String resource) {
            this.resource = resource;
            return this;
        }
        public String getResource() {
            return this.resource;
        }

        public SentinelFavoriteListFavoriteAppsResponseBodyData setType(Integer type) {
            this.type = type;
            return this;
        }
        public Integer getType() {
            return this.type;
        }

        public SentinelFavoriteListFavoriteAppsResponseBodyData setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

        public SentinelFavoriteListFavoriteAppsResponseBodyData setVpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public String getVpcId() {
            return this.vpcId;
        }

    }

}
