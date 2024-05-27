// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mns_open20220119.models;

import com.aliyun.tea.*;

public class ListTopicRequest extends TeaModel {
    @NameInMap("PageNum")
    public Long pageNum;

    @NameInMap("PageSize")
    public Long pageSize;

    @NameInMap("Tag")
    public java.util.List<ListTopicRequestTag> tag;

    @NameInMap("TopicName")
    public String topicName;

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

    public static class ListTopicRequestTag extends TeaModel {
        @NameInMap("Key")
        public String key;

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
