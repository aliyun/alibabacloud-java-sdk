// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class PushingTarget extends TeaModel {
    @NameInMap("Arn")
    public String arn;

    @NameInMap("CreateTime")
    public String createTime;

    @NameInMap("Description")
    public String description;

    @NameInMap("HttpRequestTarget")
    public PushingTargetHttpRequestTarget httpRequestTarget;

    @NameInMap("Name")
    public String name;

    @NameInMap("Range")
    public String range;

    @NameInMap("TemplateUuid")
    public String templateUuid;

    @NameInMap("Type")
    public String type;

    @NameInMap("UpdateTime")
    public String updateTime;

    @NameInMap("UserId")
    public String userId;

    @NameInMap("Uuid")
    public String uuid;

    public static PushingTarget build(java.util.Map<String, ?> map) throws Exception {
        PushingTarget self = new PushingTarget();
        return TeaModel.build(map, self);
    }

    public PushingTarget setArn(String arn) {
        this.arn = arn;
        return this;
    }
    public String getArn() {
        return this.arn;
    }

    public PushingTarget setCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }
    public String getCreateTime() {
        return this.createTime;
    }

    public PushingTarget setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public PushingTarget setHttpRequestTarget(PushingTargetHttpRequestTarget httpRequestTarget) {
        this.httpRequestTarget = httpRequestTarget;
        return this;
    }
    public PushingTargetHttpRequestTarget getHttpRequestTarget() {
        return this.httpRequestTarget;
    }

    public PushingTarget setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public PushingTarget setRange(String range) {
        this.range = range;
        return this;
    }
    public String getRange() {
        return this.range;
    }

    public PushingTarget setTemplateUuid(String templateUuid) {
        this.templateUuid = templateUuid;
        return this;
    }
    public String getTemplateUuid() {
        return this.templateUuid;
    }

    public PushingTarget setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public PushingTarget setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
        return this;
    }
    public String getUpdateTime() {
        return this.updateTime;
    }

    public PushingTarget setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

    public PushingTarget setUuid(String uuid) {
        this.uuid = uuid;
        return this;
    }
    public String getUuid() {
        return this.uuid;
    }

    public static class PushingTargetHttpRequestTargetHeaders extends TeaModel {
        @NameInMap("Key")
        public String key;

        @NameInMap("Value")
        public String value;

        public static PushingTargetHttpRequestTargetHeaders build(java.util.Map<String, ?> map) throws Exception {
            PushingTargetHttpRequestTargetHeaders self = new PushingTargetHttpRequestTargetHeaders();
            return TeaModel.build(map, self);
        }

        public PushingTargetHttpRequestTargetHeaders setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public PushingTargetHttpRequestTargetHeaders setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class PushingTargetHttpRequestTarget extends TeaModel {
        @NameInMap("ContentType")
        public String contentType;

        @NameInMap("EncryptString")
        public String encryptString;

        @NameInMap("Headers")
        public java.util.List<PushingTargetHttpRequestTargetHeaders> headers;

        @NameInMap("Method")
        public String method;

        @NameInMap("Url")
        public String url;

        public static PushingTargetHttpRequestTarget build(java.util.Map<String, ?> map) throws Exception {
            PushingTargetHttpRequestTarget self = new PushingTargetHttpRequestTarget();
            return TeaModel.build(map, self);
        }

        public PushingTargetHttpRequestTarget setContentType(String contentType) {
            this.contentType = contentType;
            return this;
        }
        public String getContentType() {
            return this.contentType;
        }

        public PushingTargetHttpRequestTarget setEncryptString(String encryptString) {
            this.encryptString = encryptString;
            return this;
        }
        public String getEncryptString() {
            return this.encryptString;
        }

        public PushingTargetHttpRequestTarget setHeaders(java.util.List<PushingTargetHttpRequestTargetHeaders> headers) {
            this.headers = headers;
            return this;
        }
        public java.util.List<PushingTargetHttpRequestTargetHeaders> getHeaders() {
            return this.headers;
        }

        public PushingTargetHttpRequestTarget setMethod(String method) {
            this.method = method;
            return this;
        }
        public String getMethod() {
            return this.method;
        }

        public PushingTargetHttpRequestTarget setUrl(String url) {
            this.url = url;
            return this;
        }
        public String getUrl() {
            return this.url;
        }

    }

}
