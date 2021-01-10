// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkvisual20180120.models;

import com.aliyun.tea.*;

public class QueryPictureSearchAppResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Data")
    public QueryPictureSearchAppResponseBodyData data;

    @NameInMap("ErrorMessage")
    public String errorMessage;

    @NameInMap("Code")
    public String code;

    @NameInMap("Success")
    public Boolean success;

    public static QueryPictureSearchAppResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryPictureSearchAppResponseBody self = new QueryPictureSearchAppResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryPictureSearchAppResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryPictureSearchAppResponseBody setData(QueryPictureSearchAppResponseBodyData data) {
        this.data = data;
        return this;
    }
    public QueryPictureSearchAppResponseBodyData getData() {
        return this.data;
    }

    public QueryPictureSearchAppResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public QueryPictureSearchAppResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryPictureSearchAppResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class QueryPictureSearchAppResponseBodyDataData extends TeaModel {
        @NameInMap("AppInstanceId")
        public String appInstanceId;

        @NameInMap("ModifiedTime")
        public Long modifiedTime;

        @NameInMap("Version")
        public String version;

        @NameInMap("CreateTime")
        public Long createTime;

        @NameInMap("AppTemplateId")
        public String appTemplateId;

        @NameInMap("Name")
        public String name;

        @NameInMap("Level")
        public String level;

        public static QueryPictureSearchAppResponseBodyDataData build(java.util.Map<String, ?> map) throws Exception {
            QueryPictureSearchAppResponseBodyDataData self = new QueryPictureSearchAppResponseBodyDataData();
            return TeaModel.build(map, self);
        }

        public QueryPictureSearchAppResponseBodyDataData setAppInstanceId(String appInstanceId) {
            this.appInstanceId = appInstanceId;
            return this;
        }
        public String getAppInstanceId() {
            return this.appInstanceId;
        }

        public QueryPictureSearchAppResponseBodyDataData setModifiedTime(Long modifiedTime) {
            this.modifiedTime = modifiedTime;
            return this;
        }
        public Long getModifiedTime() {
            return this.modifiedTime;
        }

        public QueryPictureSearchAppResponseBodyDataData setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

        public QueryPictureSearchAppResponseBodyDataData setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public QueryPictureSearchAppResponseBodyDataData setAppTemplateId(String appTemplateId) {
            this.appTemplateId = appTemplateId;
            return this;
        }
        public String getAppTemplateId() {
            return this.appTemplateId;
        }

        public QueryPictureSearchAppResponseBodyDataData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public QueryPictureSearchAppResponseBodyDataData setLevel(String level) {
            this.level = level;
            return this;
        }
        public String getLevel() {
            return this.level;
        }

    }

    public static class QueryPictureSearchAppResponseBodyData extends TeaModel {
        @NameInMap("data")
        public java.util.List<QueryPictureSearchAppResponseBodyDataData> data;

        public static QueryPictureSearchAppResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QueryPictureSearchAppResponseBodyData self = new QueryPictureSearchAppResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QueryPictureSearchAppResponseBodyData setData(java.util.List<QueryPictureSearchAppResponseBodyDataData> data) {
            this.data = data;
            return this;
        }
        public java.util.List<QueryPictureSearchAppResponseBodyDataData> getData() {
            return this.data;
        }

    }

}
