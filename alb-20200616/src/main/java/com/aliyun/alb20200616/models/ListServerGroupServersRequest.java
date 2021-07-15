// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alb20200616.models;

import com.aliyun.tea.*;

public class ListServerGroupServersRequest extends TeaModel {
    // 分页查询标识
    @NameInMap("NextToken")
    public String nextToken;

    // 查询数量
    @NameInMap("MaxResults")
    public Integer maxResults;

    // 服务器组id
    @NameInMap("ServerGroupId")
    public String serverGroupId;

    @NameInMap("ServerIds")
    public java.util.List<String> serverIds;

    @NameInMap("Tag")
    public java.util.List<ListServerGroupServersRequestTag> tag;

    public static ListServerGroupServersRequest build(java.util.Map<String, ?> map) throws Exception {
        ListServerGroupServersRequest self = new ListServerGroupServersRequest();
        return TeaModel.build(map, self);
    }

    public ListServerGroupServersRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListServerGroupServersRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListServerGroupServersRequest setServerGroupId(String serverGroupId) {
        this.serverGroupId = serverGroupId;
        return this;
    }
    public String getServerGroupId() {
        return this.serverGroupId;
    }

    public ListServerGroupServersRequest setServerIds(java.util.List<String> serverIds) {
        this.serverIds = serverIds;
        return this;
    }
    public java.util.List<String> getServerIds() {
        return this.serverIds;
    }

    public ListServerGroupServersRequest setTag(java.util.List<ListServerGroupServersRequestTag> tag) {
        this.tag = tag;
        return this;
    }
    public java.util.List<ListServerGroupServersRequestTag> getTag() {
        return this.tag;
    }

    public static class ListServerGroupServersRequestTag extends TeaModel {
        // 标签键
        @NameInMap("Key")
        public String key;

        // 标签值
        @NameInMap("Value")
        public String value;

        public static ListServerGroupServersRequestTag build(java.util.Map<String, ?> map) throws Exception {
            ListServerGroupServersRequestTag self = new ListServerGroupServersRequestTag();
            return TeaModel.build(map, self);
        }

        public ListServerGroupServersRequestTag setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public ListServerGroupServersRequestTag setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
