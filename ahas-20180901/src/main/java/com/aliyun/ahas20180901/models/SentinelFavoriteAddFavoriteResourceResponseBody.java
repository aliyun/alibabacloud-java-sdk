// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class SentinelFavoriteAddFavoriteResourceResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public SentinelFavoriteAddFavoriteResourceResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static SentinelFavoriteAddFavoriteResourceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SentinelFavoriteAddFavoriteResourceResponseBody self = new SentinelFavoriteAddFavoriteResourceResponseBody();
        return TeaModel.build(map, self);
    }

    public SentinelFavoriteAddFavoriteResourceResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public SentinelFavoriteAddFavoriteResourceResponseBody setData(SentinelFavoriteAddFavoriteResourceResponseBodyData data) {
        this.data = data;
        return this;
    }
    public SentinelFavoriteAddFavoriteResourceResponseBodyData getData() {
        return this.data;
    }

    public SentinelFavoriteAddFavoriteResourceResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public SentinelFavoriteAddFavoriteResourceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public SentinelFavoriteAddFavoriteResourceResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class SentinelFavoriteAddFavoriteResourceResponseBodyData extends TeaModel {
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

        public static SentinelFavoriteAddFavoriteResourceResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            SentinelFavoriteAddFavoriteResourceResponseBodyData self = new SentinelFavoriteAddFavoriteResourceResponseBodyData();
            return TeaModel.build(map, self);
        }

        public SentinelFavoriteAddFavoriteResourceResponseBodyData setAppName(String appName) {
            this.appName = appName;
            return this;
        }
        public String getAppName() {
            return this.appName;
        }

        public SentinelFavoriteAddFavoriteResourceResponseBodyData setCreateTimestamp(Long createTimestamp) {
            this.createTimestamp = createTimestamp;
            return this;
        }
        public Long getCreateTimestamp() {
            return this.createTimestamp;
        }

        public SentinelFavoriteAddFavoriteResourceResponseBodyData setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public SentinelFavoriteAddFavoriteResourceResponseBodyData setModifiedTimestamp(Long modifiedTimestamp) {
            this.modifiedTimestamp = modifiedTimestamp;
            return this;
        }
        public Long getModifiedTimestamp() {
            return this.modifiedTimestamp;
        }

        public SentinelFavoriteAddFavoriteResourceResponseBodyData setNamespace(String namespace) {
            this.namespace = namespace;
            return this;
        }
        public String getNamespace() {
            return this.namespace;
        }

        public SentinelFavoriteAddFavoriteResourceResponseBodyData setResource(String resource) {
            this.resource = resource;
            return this;
        }
        public String getResource() {
            return this.resource;
        }

        public SentinelFavoriteAddFavoriteResourceResponseBodyData setType(Integer type) {
            this.type = type;
            return this;
        }
        public Integer getType() {
            return this.type;
        }

        public SentinelFavoriteAddFavoriteResourceResponseBodyData setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

        public SentinelFavoriteAddFavoriteResourceResponseBodyData setVpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public String getVpcId() {
            return this.vpcId;
        }

    }

}
