// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.datahub20240620.models;

import com.aliyun.tea.*;

public class ListTopicsResponseBody extends TeaModel {
    @NameInMap("List")
    public ListTopicsResponseBodyList list;

    /**
     * <strong>example:</strong>
     * <p>1</p>
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

    public static ListTopicsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListTopicsResponseBody self = new ListTopicsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListTopicsResponseBody setList(ListTopicsResponseBodyList list) {
        this.list = list;
        return this;
    }
    public ListTopicsResponseBodyList getList() {
        return this.list;
    }

    public ListTopicsResponseBody setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListTopicsResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListTopicsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListTopicsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public ListTopicsResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class ListTopicsResponseBodyListTopic extends TeaModel {
        @NameInMap("Comment")
        public String comment;

        /**
         * <strong>example:</strong>
         * <p>1753346106000</p>
         */
        @NameInMap("CreateTime")
        public Long createTime;

        /**
         * <strong>example:</strong>
         * <p>276887103073464052</p>
         */
        @NameInMap("Creator")
        public String creator;

        /**
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("EnableSchemaRegistry")
        public String enableSchemaRegistry;

        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("ExpandMode")
        public String expandMode;

        /**
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("Lifecycle")
        public Integer lifecycle;

        /**
         * <strong>example:</strong>
         * <p>poc_test</p>
         */
        @NameInMap("ProjectName")
        public String projectName;

        /**
         * <strong>example:</strong>
         * <p>[{\&quot;Type\&quot;:\&quot;STRING\&quot;,\&quot;AllowNull\&quot;:true,\&quot;Name\&quot;:\&quot;str\&quot;},{\&quot;Type\&quot;:\&quot;STRING\&quot;,\&quot;AllowNull\&quot;:true,\&quot;Name\&quot;:\&quot;dt\&quot;}]</p>
         */
        @NameInMap("RecordSchema")
        public String recordSchema;

        /**
         * <strong>example:</strong>
         * <p>TUPLE</p>
         */
        @NameInMap("RecordType")
        public String recordType;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("ShardCount")
        public Integer shardCount;

        /**
         * <strong>example:</strong>
         * <p>10000</p>
         */
        @NameInMap("Storage")
        public Long storage;

        /**
         * <strong>example:</strong>
         * <p>ods_bio_safety_env_disinfection</p>
         */
        @NameInMap("TopicName")
        public String topicName;

        /**
         * <strong>example:</strong>
         * <p>1753346106000</p>
         */
        @NameInMap("UpdateTime")
        public Long updateTime;

        public static ListTopicsResponseBodyListTopic build(java.util.Map<String, ?> map) throws Exception {
            ListTopicsResponseBodyListTopic self = new ListTopicsResponseBodyListTopic();
            return TeaModel.build(map, self);
        }

        public ListTopicsResponseBodyListTopic setComment(String comment) {
            this.comment = comment;
            return this;
        }
        public String getComment() {
            return this.comment;
        }

        public ListTopicsResponseBodyListTopic setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public ListTopicsResponseBodyListTopic setCreator(String creator) {
            this.creator = creator;
            return this;
        }
        public String getCreator() {
            return this.creator;
        }

        public ListTopicsResponseBodyListTopic setEnableSchemaRegistry(String enableSchemaRegistry) {
            this.enableSchemaRegistry = enableSchemaRegistry;
            return this;
        }
        public String getEnableSchemaRegistry() {
            return this.enableSchemaRegistry;
        }

        public ListTopicsResponseBodyListTopic setExpandMode(String expandMode) {
            this.expandMode = expandMode;
            return this;
        }
        public String getExpandMode() {
            return this.expandMode;
        }

        public ListTopicsResponseBodyListTopic setLifecycle(Integer lifecycle) {
            this.lifecycle = lifecycle;
            return this;
        }
        public Integer getLifecycle() {
            return this.lifecycle;
        }

        public ListTopicsResponseBodyListTopic setProjectName(String projectName) {
            this.projectName = projectName;
            return this;
        }
        public String getProjectName() {
            return this.projectName;
        }

        public ListTopicsResponseBodyListTopic setRecordSchema(String recordSchema) {
            this.recordSchema = recordSchema;
            return this;
        }
        public String getRecordSchema() {
            return this.recordSchema;
        }

        public ListTopicsResponseBodyListTopic setRecordType(String recordType) {
            this.recordType = recordType;
            return this;
        }
        public String getRecordType() {
            return this.recordType;
        }

        public ListTopicsResponseBodyListTopic setShardCount(Integer shardCount) {
            this.shardCount = shardCount;
            return this;
        }
        public Integer getShardCount() {
            return this.shardCount;
        }

        public ListTopicsResponseBodyListTopic setStorage(Long storage) {
            this.storage = storage;
            return this;
        }
        public Long getStorage() {
            return this.storage;
        }

        public ListTopicsResponseBodyListTopic setTopicName(String topicName) {
            this.topicName = topicName;
            return this;
        }
        public String getTopicName() {
            return this.topicName;
        }

        public ListTopicsResponseBodyListTopic setUpdateTime(Long updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public Long getUpdateTime() {
            return this.updateTime;
        }

    }

    public static class ListTopicsResponseBodyList extends TeaModel {
        @NameInMap("Topic")
        public java.util.List<ListTopicsResponseBodyListTopic> topic;

        public static ListTopicsResponseBodyList build(java.util.Map<String, ?> map) throws Exception {
            ListTopicsResponseBodyList self = new ListTopicsResponseBodyList();
            return TeaModel.build(map, self);
        }

        public ListTopicsResponseBodyList setTopic(java.util.List<ListTopicsResponseBodyListTopic> topic) {
            this.topic = topic;
            return this;
        }
        public java.util.List<ListTopicsResponseBodyListTopic> getTopic() {
            return this.topic;
        }

    }

}
