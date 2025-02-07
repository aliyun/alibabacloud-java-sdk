// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mns_open20220119.models;

import com.aliyun.tea.*;

public class ListQueueRequest extends TeaModel {
    /**
     * <p>The page number. Valid values: 1 to 100000000. If you set this parameter to a value smaller than 1, the value of this parameter is 1 by default. If you set this parameter to a value greater than 100000000, the value of this parameter is 100000000 by default.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNum")
    public Long pageNum;

    /**
     * <p>The number of entries per page. Value values: 10 to 50. If you set this parameter to a value smaller than 10, the value of this parameter is 10 by default. If you set this parameter to a value greater than 50, the value of this parameter is 50 by default.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("PageSize")
    public Long pageSize;

    /**
     * <p>The name of the queue.</p>
     * 
     * <strong>example:</strong>
     * <p>demo-queue</p>
     */
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
        /**
         * <strong>example:</strong>
         * <p>tag1</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <strong>example:</strong>
         * <p>test</p>
         */
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
