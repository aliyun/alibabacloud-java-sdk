// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.datahub20240620.models;

import com.aliyun.tea.*;

public class ListSubscriptionsResponseBody extends TeaModel {
    @NameInMap("List")
    public ListSubscriptionsResponseBodyList list;

    /**
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <strong>example:</strong>
     * <p>9892074a2a89600ae4b0d5a34fb99a3f</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <strong>example:</strong>
     * <p>A20A7093-8FE0-058C-BE0C-3C8057D5F1A1</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>True</p>
     */
    @NameInMap("Success")
    public Boolean success;

    /**
     * <strong>example:</strong>
     * <p>50</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static ListSubscriptionsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListSubscriptionsResponseBody self = new ListSubscriptionsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListSubscriptionsResponseBody setList(ListSubscriptionsResponseBodyList list) {
        this.list = list;
        return this;
    }
    public ListSubscriptionsResponseBodyList getList() {
        return this.list;
    }

    public ListSubscriptionsResponseBody setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListSubscriptionsResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListSubscriptionsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListSubscriptionsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public ListSubscriptionsResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class ListSubscriptionsResponseBodyListSubscription extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>test_application_name</p>
         */
        @NameInMap("Application")
        public String application;

        /**
         * <strong>example:</strong>
         * <p>test_comment</p>
         */
        @NameInMap("Comment")
        public String comment;

        /**
         * <strong>example:</strong>
         * <p>1708171905000</p>
         */
        @NameInMap("CreateTime")
        public Long createTime;

        /**
         * <strong>example:</strong>
         * <p>1048133943212399</p>
         */
        @NameInMap("Creator")
        public String creator;

        /**
         * <strong>example:</strong>
         * <p>test_project</p>
         */
        @NameInMap("ProjectName")
        public String projectName;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("State")
        public Integer state;

        /**
         * <strong>example:</strong>
         * <p>1745824636429WZ2EE</p>
         */
        @NameInMap("SubscriptionId")
        public String subscriptionId;

        /**
         * <strong>example:</strong>
         * <p>test_topic</p>
         */
        @NameInMap("TopicName")
        public String topicName;

        /**
         * <strong>example:</strong>
         * <p>USER</p>
         */
        @NameInMap("Type")
        public String type;

        /**
         * <strong>example:</strong>
         * <p>1708171905000</p>
         */
        @NameInMap("UpdateTime")
        public Long updateTime;

        public static ListSubscriptionsResponseBodyListSubscription build(java.util.Map<String, ?> map) throws Exception {
            ListSubscriptionsResponseBodyListSubscription self = new ListSubscriptionsResponseBodyListSubscription();
            return TeaModel.build(map, self);
        }

        public ListSubscriptionsResponseBodyListSubscription setApplication(String application) {
            this.application = application;
            return this;
        }
        public String getApplication() {
            return this.application;
        }

        public ListSubscriptionsResponseBodyListSubscription setComment(String comment) {
            this.comment = comment;
            return this;
        }
        public String getComment() {
            return this.comment;
        }

        public ListSubscriptionsResponseBodyListSubscription setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public ListSubscriptionsResponseBodyListSubscription setCreator(String creator) {
            this.creator = creator;
            return this;
        }
        public String getCreator() {
            return this.creator;
        }

        public ListSubscriptionsResponseBodyListSubscription setProjectName(String projectName) {
            this.projectName = projectName;
            return this;
        }
        public String getProjectName() {
            return this.projectName;
        }

        public ListSubscriptionsResponseBodyListSubscription setState(Integer state) {
            this.state = state;
            return this;
        }
        public Integer getState() {
            return this.state;
        }

        public ListSubscriptionsResponseBodyListSubscription setSubscriptionId(String subscriptionId) {
            this.subscriptionId = subscriptionId;
            return this;
        }
        public String getSubscriptionId() {
            return this.subscriptionId;
        }

        public ListSubscriptionsResponseBodyListSubscription setTopicName(String topicName) {
            this.topicName = topicName;
            return this;
        }
        public String getTopicName() {
            return this.topicName;
        }

        public ListSubscriptionsResponseBodyListSubscription setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public ListSubscriptionsResponseBodyListSubscription setUpdateTime(Long updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public Long getUpdateTime() {
            return this.updateTime;
        }

    }

    public static class ListSubscriptionsResponseBodyList extends TeaModel {
        @NameInMap("Subscription")
        public java.util.List<ListSubscriptionsResponseBodyListSubscription> subscription;

        public static ListSubscriptionsResponseBodyList build(java.util.Map<String, ?> map) throws Exception {
            ListSubscriptionsResponseBodyList self = new ListSubscriptionsResponseBodyList();
            return TeaModel.build(map, self);
        }

        public ListSubscriptionsResponseBodyList setSubscription(java.util.List<ListSubscriptionsResponseBodyListSubscription> subscription) {
            this.subscription = subscription;
            return this;
        }
        public java.util.List<ListSubscriptionsResponseBodyListSubscription> getSubscription() {
            return this.subscription;
        }

    }

}
