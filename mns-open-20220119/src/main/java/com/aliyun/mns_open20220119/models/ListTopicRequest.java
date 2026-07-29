// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mns_open20220119.models;

import com.aliyun.tea.*;

public class ListTopicRequest extends TeaModel {
    /**
     * <p>The page number of the results to return.
     * Valid values: 1 to 100000000.
     * If you set this parameter to a value less than 1, the system uses 1 by default. If you set this parameter to a value greater than 100000000, the system uses 100000000 by default.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNum")
    public Long pageNum;

    /**
     * <p>The number of results to return on each page.
     * Valid values: 10 to 50.
     * If you set this parameter to a value less than 10, the system uses 10 by default. If you set this parameter to a value greater than 50, the system uses 50 by default.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("PageSize")
    public Long pageSize;

    /**
     * <p>The list of tags.</p>
     */
    @NameInMap("Tag")
    public java.util.List<ListTopicRequestTag> tag;

    /**
     * <p>The name of the topic.</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("TopicName")
    public String topicName;

    /**
     * <p>The type of the topic. Valid values:</p>
     * <ul>
     * <li>normal: normal topic</li>
     * <li>fifo: FIFO topic</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>normal</p>
     */
    @NameInMap("TopicType")
    public String topicType;

    public static ListTopicRequest build(java.util.Map<String, ?> map) throws Exception {
        ListTopicRequest self = new ListTopicRequest();
        return TeaModel.build(map, self);
    }

    public ListTopicRequest setPageNum(Long pageNum) {
        this.pageNum = pageNum;
        return this;
    }
    public Long getPageNum() {
        return this.pageNum;
    }

    public ListTopicRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public ListTopicRequest setTag(java.util.List<ListTopicRequestTag> tag) {
        this.tag = tag;
        return this;
    }
    public java.util.List<ListTopicRequestTag> getTag() {
        return this.tag;
    }

    public ListTopicRequest setTopicName(String topicName) {
        this.topicName = topicName;
        return this;
    }
    public String getTopicName() {
        return this.topicName;
    }

    public ListTopicRequest setTopicType(String topicType) {
        this.topicType = topicType;
        return this;
    }
    public String getTopicType() {
        return this.topicType;
    }

    public static class ListTopicRequestTag extends TeaModel {
        /**
         * <p>The key of the tag.</p>
         * 
         * <strong>example:</strong>
         * <p>tag1</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The value of the tag.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("Value")
        public String value;

        public static ListTopicRequestTag build(java.util.Map<String, ?> map) throws Exception {
            ListTopicRequestTag self = new ListTopicRequestTag();
            return TeaModel.build(map, self);
        }

        public ListTopicRequestTag setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public ListTopicRequestTag setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
