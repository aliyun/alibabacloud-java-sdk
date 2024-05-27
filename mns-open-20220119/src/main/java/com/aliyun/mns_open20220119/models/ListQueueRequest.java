// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mns_open20220119.models;

import com.aliyun.tea.*;

public class ListQueueRequest extends TeaModel {
    @NameInMap("PageNum")
    public Long pageNum;

    @NameInMap("PageSize")
    public Long pageSize;

    @NameInMap("QueueName")
    public String queueName;

    @NameInMap("Tag")
    public java.util.List<ListQueueRequestTag> tag;

    public static ListQueueRequest build(java.util.Map<String, ?> map) throws Exception {
        ListQueueRequest self = new ListQueueRequest();
        return TeaModel.build(map, self);
    }

    public ListQueueRequest setPageNum(Long pageNum) {
        this.pageNum = pageNum;
        return this;
    }
    public Long getPageNum() {
        return this.pageNum;
    }

    public ListQueueRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public ListQueueRequest setQueueName(String queueName) {
        this.queueName = queueName;
        return this;
    }
    public String getQueueName() {
        return this.queueName;
    }

    public ListQueueRequest setTag(java.util.List<ListQueueRequestTag> tag) {
        this.tag = tag;
        return this;
    }
    public java.util.List<ListQueueRequestTag> getTag() {
        return this.tag;
    }

    public static class ListQueueRequestTag extends TeaModel {
        @NameInMap("Key")
        public String key;

        @NameInMap("Value")
        public String value;

        public static ListQueueRequestTag build(java.util.Map<String, ?> map) throws Exception {
            ListQueueRequestTag self = new ListQueueRequestTag();
            return TeaModel.build(map, self);
        }

        public ListQueueRequestTag setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public ListQueueRequestTag setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
