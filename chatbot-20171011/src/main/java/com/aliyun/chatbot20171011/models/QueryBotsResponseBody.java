// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.chatbot20171011.models;

import com.aliyun.tea.*;

public class QueryBotsResponseBody extends TeaModel {
    @NameInMap("TotalCount")
    public Integer totalCount;

    @NameInMap("Bots")
    public java.util.List<QueryBotsResponseBodyBots> bots;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    public static QueryBotsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryBotsResponseBody self = new QueryBotsResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryBotsResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public QueryBotsResponseBody setBots(java.util.List<QueryBotsResponseBodyBots> bots) {
        this.bots = bots;
        return this;
    }
    public java.util.List<QueryBotsResponseBodyBots> getBots() {
        return this.bots;
    }

    public QueryBotsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryBotsResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public QueryBotsResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public static class QueryBotsResponseBodyBots extends TeaModel {
        @NameInMap("Introduction")
        public String introduction;

        @NameInMap("Avatar")
        public String avatar;

        @NameInMap("TimeZone")
        public String timeZone;

        @NameInMap("CreateTime")
        public String createTime;

        @NameInMap("LanguageCode")
        public String languageCode;

        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("Name")
        public String name;

        public static QueryBotsResponseBodyBots build(java.util.Map<String, ?> map) throws Exception {
            QueryBotsResponseBodyBots self = new QueryBotsResponseBodyBots();
            return TeaModel.build(map, self);
        }

        public QueryBotsResponseBodyBots setIntroduction(String introduction) {
            this.introduction = introduction;
            return this;
        }
        public String getIntroduction() {
            return this.introduction;
        }

        public QueryBotsResponseBodyBots setAvatar(String avatar) {
            this.avatar = avatar;
            return this;
        }
        public String getAvatar() {
            return this.avatar;
        }

        public QueryBotsResponseBodyBots setTimeZone(String timeZone) {
            this.timeZone = timeZone;
            return this;
        }
        public String getTimeZone() {
            return this.timeZone;
        }

        public QueryBotsResponseBodyBots setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public QueryBotsResponseBodyBots setLanguageCode(String languageCode) {
            this.languageCode = languageCode;
            return this;
        }
        public String getLanguageCode() {
            return this.languageCode;
        }

        public QueryBotsResponseBodyBots setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public QueryBotsResponseBodyBots setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

}
