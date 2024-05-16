// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alikafka20190916.models;

import com.aliyun.tea.*;

public class GetTopicListResponseBody extends TeaModel {
    /**
     * <p>The HTTP status code returned. The HTTP status code 200 indicates that the request is successful.</p>
     */
    @NameInMap("Code")
    public Integer code;

    /**
     * <p>The page number of the returned page.</p>
     */
    @NameInMap("CurrentPage")
    public Integer currentPage;

    /**
     * <p>The message returned.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The number of entries returned on each page.</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful.</p>
     */
    @NameInMap("Success")
    public Boolean success;

    /**
     * <p>The topics.</p>
     */
    @NameInMap("TopicList")
    public GetTopicListResponseBodyTopicList topicList;

    /**
     * <p>The number of topics.</p>
     */
    @NameInMap("Total")
    public Integer total;

    public static GetTopicListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetTopicListResponseBody self = new GetTopicListResponseBody();
        return TeaModel.build(map, self);
    }

    public GetTopicListResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public GetTopicListResponseBody setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public GetTopicListResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetTopicListResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public GetTopicListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetTopicListResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public GetTopicListResponseBody setTopicList(GetTopicListResponseBodyTopicList topicList) {
        this.topicList = topicList;
        return this;
    }
    public GetTopicListResponseBodyTopicList getTopicList() {
        return this.topicList;
    }

    public GetTopicListResponseBody setTotal(Integer total) {
        this.total = total;
        return this;
    }
    public Integer getTotal() {
        return this.total;
    }

    public static class GetTopicListResponseBodyTopicListTopicVOTagsTagVO extends TeaModel {
        /**
         * <p>The tag key.</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The tag value.</p>
         */
        @NameInMap("Value")
        public String value;

        public static GetTopicListResponseBodyTopicListTopicVOTagsTagVO build(java.util.Map<String, ?> map) throws Exception {
            GetTopicListResponseBodyTopicListTopicVOTagsTagVO self = new GetTopicListResponseBodyTopicListTopicVOTagsTagVO();
            return TeaModel.build(map, self);
        }

        public GetTopicListResponseBodyTopicListTopicVOTagsTagVO setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public GetTopicListResponseBodyTopicListTopicVOTagsTagVO setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class GetTopicListResponseBodyTopicListTopicVOTags extends TeaModel {
        @NameInMap("TagVO")
        public java.util.List<GetTopicListResponseBodyTopicListTopicVOTagsTagVO> tagVO;

        public static GetTopicListResponseBodyTopicListTopicVOTags build(java.util.Map<String, ?> map) throws Exception {
            GetTopicListResponseBodyTopicListTopicVOTags self = new GetTopicListResponseBodyTopicListTopicVOTags();
            return TeaModel.build(map, self);
        }

        public GetTopicListResponseBodyTopicListTopicVOTags setTagVO(java.util.List<GetTopicListResponseBodyTopicListTopicVOTagsTagVO> tagVO) {
            this.tagVO = tagVO;
            return this;
        }
        public java.util.List<GetTopicListResponseBodyTopicListTopicVOTagsTagVO> getTagVO() {
            return this.tagVO;
        }

    }

    public static class GetTopicListResponseBodyTopicListTopicVO extends TeaModel {
        /**
         * <p>Indicates whether the topic was automatically created.</p>
         */
        @NameInMap("AutoCreate")
        public Boolean autoCreate;

        /**
         * <p>The log cleanup policy for the topic. This parameter is returned only if **LocalTopic** is set to **true**. Valid values:</p>
         * <br>
         * <p>*   false: the default log cleanup policy.</p>
         * <p>*   true: the Apache Kafka log compaction policy.</p>
         */
        @NameInMap("CompactTopic")
        public Boolean compactTopic;

        /**
         * <p>The timestamp that indicates when the topic was created. Unit: milliseconds.</p>
         */
        @NameInMap("CreateTime")
        public Long createTime;

        /**
         * <p>The instance ID.</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>The storage type that is used for the topic. Valid values:</p>
         * <br>
         * <p>*   false: cloud storage</p>
         * <p>*   true: local storage</p>
         */
        @NameInMap("LocalTopic")
        public Boolean localTopic;

        /**
         * <p>The number of partitions in the topic.</p>
         */
        @NameInMap("PartitionNum")
        public Integer partitionNum;

        /**
         * <p>The ID of the region where the instance resides.</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        /**
         * <p>The topic description. Valid values:</p>
         * <br>
         * <p>*   The description can contain only letters, digits, hyphens (-), and underscores (_).</p>
         * <p>*   The description must be 3 to 64 characters in length.</p>
         */
        @NameInMap("Remark")
        public String remark;

        /**
         * <p>The topic status. Valid value:</p>
         * <br>
         * <p>**0**: running.</p>
         * <br>
         * <p>If the topic is deleted, this parameter is not returned.</p>
         */
        @NameInMap("Status")
        public Integer status;

        /**
         * <p>The topic status. Valid value:</p>
         * <br>
         * <p>**Running**.</p>
         * <br>
         * <p>If the topic is deleted, this parameter is not returned.</p>
         */
        @NameInMap("StatusName")
        public String statusName;

        /**
         * <p>The tags.</p>
         */
        @NameInMap("Tags")
        public GetTopicListResponseBodyTopicListTopicVOTags tags;

        /**
         * <p>The topic name. Valid values:</p>
         * <br>
         * <p>*   The name can contain only letters, digits, hyphens (-), and underscores (_).</p>
         * <p>*   The name must be 3 to 64 characters in length. If the name contains more than 64 characters, the system automatically truncates the name.</p>
         */
        @NameInMap("Topic")
        public String topic;

        @NameInMap("TopicConfig")
        public String topicConfig;

        public static GetTopicListResponseBodyTopicListTopicVO build(java.util.Map<String, ?> map) throws Exception {
            GetTopicListResponseBodyTopicListTopicVO self = new GetTopicListResponseBodyTopicListTopicVO();
            return TeaModel.build(map, self);
        }

        public GetTopicListResponseBodyTopicListTopicVO setAutoCreate(Boolean autoCreate) {
            this.autoCreate = autoCreate;
            return this;
        }
        public Boolean getAutoCreate() {
            return this.autoCreate;
        }

        public GetTopicListResponseBodyTopicListTopicVO setCompactTopic(Boolean compactTopic) {
            this.compactTopic = compactTopic;
            return this;
        }
        public Boolean getCompactTopic() {
            return this.compactTopic;
        }

        public GetTopicListResponseBodyTopicListTopicVO setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public GetTopicListResponseBodyTopicListTopicVO setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public GetTopicListResponseBodyTopicListTopicVO setLocalTopic(Boolean localTopic) {
            this.localTopic = localTopic;
            return this;
        }
        public Boolean getLocalTopic() {
            return this.localTopic;
        }

        public GetTopicListResponseBodyTopicListTopicVO setPartitionNum(Integer partitionNum) {
            this.partitionNum = partitionNum;
            return this;
        }
        public Integer getPartitionNum() {
            return this.partitionNum;
        }

        public GetTopicListResponseBodyTopicListTopicVO setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public GetTopicListResponseBodyTopicListTopicVO setRemark(String remark) {
            this.remark = remark;
            return this;
        }
        public String getRemark() {
            return this.remark;
        }

        public GetTopicListResponseBodyTopicListTopicVO setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

        public GetTopicListResponseBodyTopicListTopicVO setStatusName(String statusName) {
            this.statusName = statusName;
            return this;
        }
        public String getStatusName() {
            return this.statusName;
        }

        public GetTopicListResponseBodyTopicListTopicVO setTags(GetTopicListResponseBodyTopicListTopicVOTags tags) {
            this.tags = tags;
            return this;
        }
        public GetTopicListResponseBodyTopicListTopicVOTags getTags() {
            return this.tags;
        }

        public GetTopicListResponseBodyTopicListTopicVO setTopic(String topic) {
            this.topic = topic;
            return this;
        }
        public String getTopic() {
            return this.topic;
        }

        public GetTopicListResponseBodyTopicListTopicVO setTopicConfig(String topicConfig) {
            this.topicConfig = topicConfig;
            return this;
        }
        public String getTopicConfig() {
            return this.topicConfig;
        }

    }

    public static class GetTopicListResponseBodyTopicList extends TeaModel {
        @NameInMap("TopicVO")
        public java.util.List<GetTopicListResponseBodyTopicListTopicVO> topicVO;

        public static GetTopicListResponseBodyTopicList build(java.util.Map<String, ?> map) throws Exception {
            GetTopicListResponseBodyTopicList self = new GetTopicListResponseBodyTopicList();
            return TeaModel.build(map, self);
        }

        public GetTopicListResponseBodyTopicList setTopicVO(java.util.List<GetTopicListResponseBodyTopicListTopicVO> topicVO) {
            this.topicVO = topicVO;
            return this;
        }
        public java.util.List<GetTopicListResponseBodyTopicListTopicVO> getTopicVO() {
            return this.topicVO;
        }

    }

}
