// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emrstudio20240430.models;

import com.aliyun.tea.*;

public class ListAlertGroupsResponseBody extends TeaModel {
    @NameInMap("data")
    public java.util.List<ListAlertGroupsResponseBodyData> data;

    /**
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("maxResults")
    public Integer maxResults;

    /**
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("nextToken")
    public String nextToken;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>DD6B1B2A-5837-5237-ABE4-FF0C8944****</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("totalCount")
    public Integer totalCount;

    public static ListAlertGroupsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListAlertGroupsResponseBody self = new ListAlertGroupsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListAlertGroupsResponseBody setData(java.util.List<ListAlertGroupsResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<ListAlertGroupsResponseBodyData> getData() {
        return this.data;
    }

    public ListAlertGroupsResponseBody setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListAlertGroupsResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListAlertGroupsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListAlertGroupsResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class ListAlertGroupsResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>ag-8mklwpevk74****</p>
         */
        @NameInMap("alertGroupId")
        public String alertGroupId;

        /**
         * <strong>example:</strong>
         * <p>50</p>
         */
        @NameInMap("alertInstanceIds")
        public String alertInstanceIds;

        /**
         * <strong>example:</strong>
         * <p>1726834240000</p>
         */
        @NameInMap("createTime")
        public Long createTime;

        /**
         * <strong>example:</strong>
         * <p>description</p>
         */
        @NameInMap("description")
        public String description;

        /**
         * <strong>example:</strong>
         * <p>name</p>
         */
        @NameInMap("groupName")
        public String groupName;

        /**
         * <strong>example:</strong>
         * <p>1726834240000</p>
         */
        @NameInMap("updateTime")
        public Long updateTime;

        public static ListAlertGroupsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListAlertGroupsResponseBodyData self = new ListAlertGroupsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListAlertGroupsResponseBodyData setAlertGroupId(String alertGroupId) {
            this.alertGroupId = alertGroupId;
            return this;
        }
        public String getAlertGroupId() {
            return this.alertGroupId;
        }

        public ListAlertGroupsResponseBodyData setAlertInstanceIds(String alertInstanceIds) {
            this.alertInstanceIds = alertInstanceIds;
            return this;
        }
        public String getAlertInstanceIds() {
            return this.alertInstanceIds;
        }

        public ListAlertGroupsResponseBodyData setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public ListAlertGroupsResponseBodyData setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListAlertGroupsResponseBodyData setGroupName(String groupName) {
            this.groupName = groupName;
            return this;
        }
        public String getGroupName() {
            return this.groupName;
        }

        public ListAlertGroupsResponseBodyData setUpdateTime(Long updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public Long getUpdateTime() {
            return this.updateTime;
        }

    }

}
