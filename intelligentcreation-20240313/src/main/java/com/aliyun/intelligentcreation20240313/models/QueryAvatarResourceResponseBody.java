// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.intelligentcreation20240313.models;

import com.aliyun.tea.*;

public class QueryAvatarResourceResponseBody extends TeaModel {
    @NameInMap("queryResourceInfoList")
    public java.util.List<QueryAvatarResourceResponseBodyQueryResourceInfoList> queryResourceInfoList;

    @NameInMap("requestId")
    public String requestId;

    public static QueryAvatarResourceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryAvatarResourceResponseBody self = new QueryAvatarResourceResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryAvatarResourceResponseBody setQueryResourceInfoList(java.util.List<QueryAvatarResourceResponseBodyQueryResourceInfoList> queryResourceInfoList) {
        this.queryResourceInfoList = queryResourceInfoList;
        return this;
    }
    public java.util.List<QueryAvatarResourceResponseBodyQueryResourceInfoList> getQueryResourceInfoList() {
        return this.queryResourceInfoList;
    }

    public QueryAvatarResourceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class QueryAvatarResourceResponseBodyQueryResourceInfoList extends TeaModel {
        @NameInMap("resourceId")
        public String resourceId;

        @NameInMap("type")
        public String type;

        @NameInMap("validPeriodTime")
        public String validPeriodTime;

        public static QueryAvatarResourceResponseBodyQueryResourceInfoList build(java.util.Map<String, ?> map) throws Exception {
            QueryAvatarResourceResponseBodyQueryResourceInfoList self = new QueryAvatarResourceResponseBodyQueryResourceInfoList();
            return TeaModel.build(map, self);
        }

        public QueryAvatarResourceResponseBodyQueryResourceInfoList setResourceId(String resourceId) {
            this.resourceId = resourceId;
            return this;
        }
        public String getResourceId() {
            return this.resourceId;
        }

        public QueryAvatarResourceResponseBodyQueryResourceInfoList setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public QueryAvatarResourceResponseBodyQueryResourceInfoList setValidPeriodTime(String validPeriodTime) {
            this.validPeriodTime = validPeriodTime;
            return this;
        }
        public String getValidPeriodTime() {
            return this.validPeriodTime;
        }

    }

}
