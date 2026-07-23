// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eventbridge20200401.models;

import com.aliyun.tea.*;

public class ListEventStreamingsRequest extends TeaModel {
    /**
     * <p>The maximum number of entries returned per request. You can use this parameter together with NextToken to implement paging.</p>
     * <blockquote>
     * <p>Notice: The maximum number of entries returned per request cannot exceed 100.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("Limit")
    public Integer limit;

    /**
     * <p>The name prefix of the event stream.</p>
     * 
     * <strong>example:</strong>
     * <p>name</p>
     */
    @NameInMap("NamePrefix")
    public String namePrefix;

    /**
     * <p>If the number of entries exceeds the value of Limit, a NextToken is returned.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The ARN of the event target.</p>
     * 
     * <strong>example:</strong>
     * <p>acs:fc:cn-hangzhou:118609547428****:services/fw1.LATEST/functions/log1</p>
     */
    @NameInMap("SinkArn")
    public String sinkArn;

    /**
     * <p>The ARN of the event source.</p>
     */
    @NameInMap("SourceArn")
    public String sourceArn;

    /**
     * <p>The tags used for filtering.</p>
     */
    @NameInMap("Tags")
    public java.util.List<ListEventStreamingsRequestTags> tags;

    public static ListEventStreamingsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListEventStreamingsRequest self = new ListEventStreamingsRequest();
        return TeaModel.build(map, self);
    }

    public ListEventStreamingsRequest setLimit(Integer limit) {
        this.limit = limit;
        return this;
    }
    public Integer getLimit() {
        return this.limit;
    }

    public ListEventStreamingsRequest setNamePrefix(String namePrefix) {
        this.namePrefix = namePrefix;
        return this;
    }
    public String getNamePrefix() {
        return this.namePrefix;
    }

    public ListEventStreamingsRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListEventStreamingsRequest setSinkArn(String sinkArn) {
        this.sinkArn = sinkArn;
        return this;
    }
    public String getSinkArn() {
        return this.sinkArn;
    }

    public ListEventStreamingsRequest setSourceArn(String sourceArn) {
        this.sourceArn = sourceArn;
        return this;
    }
    public String getSourceArn() {
        return this.sourceArn;
    }

    public ListEventStreamingsRequest setTags(java.util.List<ListEventStreamingsRequestTags> tags) {
        this.tags = tags;
        return this;
    }
    public java.util.List<ListEventStreamingsRequestTags> getTags() {
        return this.tags;
    }

    public static class ListEventStreamingsRequestTags extends TeaModel {
        /**
         * <p>The tag key.</p>
         * 
         * <strong>example:</strong>
         * <p>mns</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The tag value.</p>
         * 
         * <strong>example:</strong>
         * <p>mnstest</p>
         */
        @NameInMap("Value")
        public String value;

        public static ListEventStreamingsRequestTags build(java.util.Map<String, ?> map) throws Exception {
            ListEventStreamingsRequestTags self = new ListEventStreamingsRequestTags();
            return TeaModel.build(map, self);
        }

        public ListEventStreamingsRequestTags setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public ListEventStreamingsRequestTags setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
