// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class SentinelFavoriteListFavoriteResourcesResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public java.util.List<SentinelFavoriteListFavoriteResourcesResponseBodyData> data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static SentinelFavoriteListFavoriteResourcesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SentinelFavoriteListFavoriteResourcesResponseBody self = new SentinelFavoriteListFavoriteResourcesResponseBody();
        return TeaModel.build(map, self);
    }

    public SentinelFavoriteListFavoriteResourcesResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public SentinelFavoriteListFavoriteResourcesResponseBody setData(java.util.List<SentinelFavoriteListFavoriteResourcesResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<SentinelFavoriteListFavoriteResourcesResponseBodyData> getData() {
        return this.data;
    }

    public SentinelFavoriteListFavoriteResourcesResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public SentinelFavoriteListFavoriteResourcesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public SentinelFavoriteListFavoriteResourcesResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class SentinelFavoriteListFavoriteResourcesResponseBodyData extends TeaModel {
        @NameInMap("appName")
        public String appName;

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

        public static SentinelFavoriteListFavoriteResourcesResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            SentinelFavoriteListFavoriteResourcesResponseBodyData self = new SentinelFavoriteListFavoriteResourcesResponseBodyData();
            return TeaModel.build(map, self);
        }

        public SentinelFavoriteListFavoriteResourcesResponseBodyData setAppName(String appName) {
            this.appName = appName;
            return this;
        }
        public String getAppName() {
            return this.appName;
        }

        public SentinelFavoriteListFavoriteResourcesResponseBodyData setCreateTimestamp(Long createTimestamp) {
            this.createTimestamp = createTimestamp;
            return this;
        }
        public Long getCreateTimestamp() {
            return this.createTimestamp;
        }

        public SentinelFavoriteListFavoriteResourcesResponseBodyData setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public SentinelFavoriteListFavoriteResourcesResponseBodyData setModifiedTimestamp(Long modifiedTimestamp) {
            this.modifiedTimestamp = modifiedTimestamp;
            return this;
        }
        public Long getModifiedTimestamp() {
            return this.modifiedTimestamp;
        }

        public SentinelFavoriteListFavoriteResourcesResponseBodyData setNamespace(String namespace) {
            this.namespace = namespace;
            return this;
        }
        public String getNamespace() {
            return this.namespace;
        }

        public SentinelFavoriteListFavoriteResourcesResponseBodyData setResource(String resource) {
            this.resource = resource;
            return this;
        }
        public String getResource() {
            return this.resource;
        }

        public SentinelFavoriteListFavoriteResourcesResponseBodyData setType(Integer type) {
            this.type = type;
            return this;
        }
        public Integer getType() {
            return this.type;
        }

        public SentinelFavoriteListFavoriteResourcesResponseBodyData setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

        public SentinelFavoriteListFavoriteResourcesResponseBodyData setVpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public String getVpcId() {
            return this.vpcId;
        }

    }

}
