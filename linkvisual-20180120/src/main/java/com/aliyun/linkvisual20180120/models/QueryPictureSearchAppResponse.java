// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkvisual20180120.models;

import com.aliyun.tea.*;

public class QueryPictureSearchAppResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Success")
    @Validation(required = true)
    public Boolean success;

    @NameInMap("Code")
    @Validation(required = true)
    public String code;

    @NameInMap("ErrorMessage")
    @Validation(required = true)
    public String errorMessage;

    @NameInMap("Data")
    @Validation(required = true)
    public QueryPictureSearchAppResponseData data;

    public static QueryPictureSearchAppResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryPictureSearchAppResponse self = new QueryPictureSearchAppResponse();
        return TeaModel.build(map, self);
    }

    public QueryPictureSearchAppResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryPictureSearchAppResponse setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public QueryPictureSearchAppResponse setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryPictureSearchAppResponse setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public QueryPictureSearchAppResponse setData(QueryPictureSearchAppResponseData data) {
        this.data = data;
        return this;
    }
    public QueryPictureSearchAppResponseData getData() {
        return this.data;
    }

    public static class QueryPictureSearchAppResponseDataData extends TeaModel {
        @NameInMap("AppInstanceId")
        @Validation(required = true)
        public String appInstanceId;

        @NameInMap("AppTemplateId")
        @Validation(required = true)
        public String appTemplateId;

        @NameInMap("Version")
        @Validation(required = true)
        public String version;

        @NameInMap("Level")
        @Validation(required = true)
        public String level;

        @NameInMap("Name")
        @Validation(required = true)
        public String name;

        @NameInMap("CreateTime")
        @Validation(required = true)
        public Long createTime;

        @NameInMap("ModifiedTime")
        @Validation(required = true)
        public Long modifiedTime;

        public static QueryPictureSearchAppResponseDataData build(java.util.Map<String, ?> map) throws Exception {
            QueryPictureSearchAppResponseDataData self = new QueryPictureSearchAppResponseDataData();
            return TeaModel.build(map, self);
        }

        public QueryPictureSearchAppResponseDataData setAppInstanceId(String appInstanceId) {
            this.appInstanceId = appInstanceId;
            return this;
        }
        public String getAppInstanceId() {
            return this.appInstanceId;
        }

        public QueryPictureSearchAppResponseDataData setAppTemplateId(String appTemplateId) {
            this.appTemplateId = appTemplateId;
            return this;
        }
        public String getAppTemplateId() {
            return this.appTemplateId;
        }

        public QueryPictureSearchAppResponseDataData setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

        public QueryPictureSearchAppResponseDataData setLevel(String level) {
            this.level = level;
            return this;
        }
        public String getLevel() {
            return this.level;
        }

        public QueryPictureSearchAppResponseDataData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public QueryPictureSearchAppResponseDataData setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public QueryPictureSearchAppResponseDataData setModifiedTime(Long modifiedTime) {
            this.modifiedTime = modifiedTime;
            return this;
        }
        public Long getModifiedTime() {
            return this.modifiedTime;
        }

    }

    public static class QueryPictureSearchAppResponseData extends TeaModel {
        @NameInMap("data")
        @Validation(required = true)
        public java.util.List<QueryPictureSearchAppResponseDataData> data;

        public static QueryPictureSearchAppResponseData build(java.util.Map<String, ?> map) throws Exception {
            QueryPictureSearchAppResponseData self = new QueryPictureSearchAppResponseData();
            return TeaModel.build(map, self);
        }

        public QueryPictureSearchAppResponseData setData(java.util.List<QueryPictureSearchAppResponseDataData> data) {
            this.data = data;
            return this;
        }
        public java.util.List<QueryPictureSearchAppResponseDataData> getData() {
            return this.data;
        }

    }

}
