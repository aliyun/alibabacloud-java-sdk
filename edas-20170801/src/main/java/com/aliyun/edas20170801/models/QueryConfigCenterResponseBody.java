// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.edas20170801.models;

import com.aliyun.tea.*;

public class QueryConfigCenterResponseBody extends TeaModel {
    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("configCenterInfo")
    public QueryConfigCenterResponseBodyConfigCenterInfo configCenterInfo;

    @NameInMap("Code")
    public Integer code;

    public static QueryConfigCenterResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryConfigCenterResponseBody self = new QueryConfigCenterResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryConfigCenterResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public QueryConfigCenterResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryConfigCenterResponseBody setConfigCenterInfo(QueryConfigCenterResponseBodyConfigCenterInfo configCenterInfo) {
        this.configCenterInfo = configCenterInfo;
        return this;
    }
    public QueryConfigCenterResponseBodyConfigCenterInfo getConfigCenterInfo() {
        return this.configCenterInfo;
    }

    public QueryConfigCenterResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public static class QueryConfigCenterResponseBodyConfigCenterInfo extends TeaModel {
        @NameInMap("AppName")
        public String appName;

        @NameInMap("DataId")
        public String dataId;

        @NameInMap("Content")
        public String content;

        @NameInMap("Id")
        public String id;

        @NameInMap("Group")
        public String group;

        public static QueryConfigCenterResponseBodyConfigCenterInfo build(java.util.Map<String, ?> map) throws Exception {
            QueryConfigCenterResponseBodyConfigCenterInfo self = new QueryConfigCenterResponseBodyConfigCenterInfo();
            return TeaModel.build(map, self);
        }

        public QueryConfigCenterResponseBodyConfigCenterInfo setAppName(String appName) {
            this.appName = appName;
            return this;
        }
        public String getAppName() {
            return this.appName;
        }

        public QueryConfigCenterResponseBodyConfigCenterInfo setDataId(String dataId) {
            this.dataId = dataId;
            return this;
        }
        public String getDataId() {
            return this.dataId;
        }

        public QueryConfigCenterResponseBodyConfigCenterInfo setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

        public QueryConfigCenterResponseBodyConfigCenterInfo setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public QueryConfigCenterResponseBodyConfigCenterInfo setGroup(String group) {
            this.group = group;
            return this;
        }
        public String getGroup() {
            return this.group;
        }

    }

}
