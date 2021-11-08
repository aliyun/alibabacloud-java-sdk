// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.chatbot20171011.models;

import com.aliyun.tea.*;

public class QueryBotsResponseBody extends TeaModel {
    @NameInMap("Bots")
    public java.util.List<QueryBotsResponseBodyBots> bots;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TotalCount")
    public Integer totalCount;

    public static QueryBotsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryBotsResponseBody self = new QueryBotsResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryBotsResponseBody setBots(java.util.List<QueryBotsResponseBodyBots> bots) {
        this.bots = bots;
        return this;
    }
    public java.util.List<QueryBotsResponseBodyBots> getBots() {
        return this.bots;
    }

    public QueryBotsResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public QueryBotsResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public QueryBotsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryBotsResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class QueryBotsResponseBodyBots extends TeaModel {
        @NameInMap("Avatar")
        public String avatar;

        @NameInMap("CreateTime")
        public String createTime;

        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("Introduction")
        public String introduction;

        @NameInMap("LanguageCode")
        public String languageCode;

        @NameInMap("Name")
        public String name;

        @NameInMap("TimeZone")
        public String timeZone;

        public static QueryBotsResponseBodyBots build(java.util.Map<String, ?> map) throws Exception {
            QueryBotsResponseBodyBots self = new QueryBotsResponseBodyBots();
            return TeaModel.build(map, self);
        }

        public QueryBotsResponseBodyBots setAvatar(String avatar) {
            this.avatar = avatar;
            return this;
        }
        public String getAvatar() {
            return this.avatar;
        }

        public QueryBotsResponseBodyBots setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public QueryBotsResponseBodyBots setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public QueryBotsResponseBodyBots setIntroduction(String introduction) {
            this.introduction = introduction;
            return this;
        }
        public String getIntroduction() {
            return this.introduction;
        }

        public QueryBotsResponseBodyBots setLanguageCode(String languageCode) {
            this.languageCode = languageCode;
            return this;
        }
        public String getLanguageCode() {
            return this.languageCode;
        }

        public QueryBotsResponseBodyBots setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public QueryBotsResponseBodyBots setTimeZone(String timeZone) {
            this.timeZone = timeZone;
            return this;
        }
        public String getTimeZone() {
            return this.timeZone;
        }

    }

}
