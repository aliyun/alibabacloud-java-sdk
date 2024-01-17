// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aimiaobi20230801.models;

import com.aliyun.tea.*;

public class ListBuildConfigsResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public java.util.List<ListBuildConfigsResponseBodyData> data;

    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static ListBuildConfigsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListBuildConfigsResponseBody self = new ListBuildConfigsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListBuildConfigsResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListBuildConfigsResponseBody setData(java.util.List<ListBuildConfigsResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<ListBuildConfigsResponseBodyData> getData() {
        return this.data;
    }

    public ListBuildConfigsResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public ListBuildConfigsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListBuildConfigsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListBuildConfigsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListBuildConfigsResponseBodyDataKeywords extends TeaModel {
        @NameInMap("Description")
        public String description;

        @NameInMap("Key")
        public String key;

        public static ListBuildConfigsResponseBodyDataKeywords build(java.util.Map<String, ?> map) throws Exception {
            ListBuildConfigsResponseBodyDataKeywords self = new ListBuildConfigsResponseBodyDataKeywords();
            return TeaModel.build(map, self);
        }

        public ListBuildConfigsResponseBodyDataKeywords setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListBuildConfigsResponseBodyDataKeywords setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

    }

    public static class ListBuildConfigsResponseBodyData extends TeaModel {
        @NameInMap("BuildIn")
        public Boolean buildIn;

        @NameInMap("CreateTime")
        public String createTime;

        @NameInMap("CreateUser")
        public String createUser;

        @NameInMap("Id")
        public Long id;

        @NameInMap("Keywords")
        public java.util.List<ListBuildConfigsResponseBodyDataKeywords> keywords;

        @NameInMap("Tag")
        public String tag;

        @NameInMap("TagDescription")
        public String tagDescription;

        @NameInMap("Type")
        public String type;

        @NameInMap("UpdateTime")
        public String updateTime;

        @NameInMap("UpdateUser")
        public String updateUser;

        public static ListBuildConfigsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListBuildConfigsResponseBodyData self = new ListBuildConfigsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListBuildConfigsResponseBodyData setBuildIn(Boolean buildIn) {
            this.buildIn = buildIn;
            return this;
        }
        public Boolean getBuildIn() {
            return this.buildIn;
        }

        public ListBuildConfigsResponseBodyData setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public ListBuildConfigsResponseBodyData setCreateUser(String createUser) {
            this.createUser = createUser;
            return this;
        }
        public String getCreateUser() {
            return this.createUser;
        }

        public ListBuildConfigsResponseBodyData setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public ListBuildConfigsResponseBodyData setKeywords(java.util.List<ListBuildConfigsResponseBodyDataKeywords> keywords) {
            this.keywords = keywords;
            return this;
        }
        public java.util.List<ListBuildConfigsResponseBodyDataKeywords> getKeywords() {
            return this.keywords;
        }

        public ListBuildConfigsResponseBodyData setTag(String tag) {
            this.tag = tag;
            return this;
        }
        public String getTag() {
            return this.tag;
        }

        public ListBuildConfigsResponseBodyData setTagDescription(String tagDescription) {
            this.tagDescription = tagDescription;
            return this;
        }
        public String getTagDescription() {
            return this.tagDescription;
        }

        public ListBuildConfigsResponseBodyData setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public ListBuildConfigsResponseBodyData setUpdateTime(String updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public String getUpdateTime() {
            return this.updateTime;
        }

        public ListBuildConfigsResponseBodyData setUpdateUser(String updateUser) {
            this.updateUser = updateUser;
            return this;
        }
        public String getUpdateUser() {
            return this.updateUser;
        }

    }

}
