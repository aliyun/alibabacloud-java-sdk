// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alb20200616.models;

import com.aliyun.tea.*;

public class ListServerGroupServersRequest extends TeaModel {
    /**
     * <p>The maximum number of entries to return. Valid values: **1** to **100**. If you do not specify a value, the default value **20** is used.</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The pagination token that is used in the next request to retrieve a new page of results. Valid values:</p>
     * <br>
     * <p>*   You do not need to specify this parameter for the first request.</p>
     * <p>*   You must specify the token that is obtained from the previous query as the value of **NextToken**.</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The server group ID.</p>
     */
    @NameInMap("ServerGroupId")
    public String serverGroupId;

    /**
     * <p>The IDs of the servers.</p>
     */
    @NameInMap("ServerIds")
    public java.util.List<String> serverIds;

    /**
     * <p>The tags that are added to the server group. You can specify up to 10 tags in each call.</p>
     */
    @NameInMap("Tag")
    public java.util.List<ListServerGroupServersRequestTag> tag;

    public static ListServerGroupServersRequest build(java.util.Map<String, ?> map) throws Exception {
        ListServerGroupServersRequest self = new ListServerGroupServersRequest();
        return TeaModel.build(map, self);
    }

    public ListServerGroupServersRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListServerGroupServersRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
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
        /**
         * <p>The tag key. You can specify up to 10 tag keys.</p>
         * <br>
         * <p>The tag key can be up to 64 characters in length, and cannot contain `http://` or `https://`. It cannot start with `aliyun` or `acs:`.</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The tag value. You can specify up to 10 tag values.</p>
         * <br>
         * <p>The tag value can be up to 128 characters in length, and cannot contain `http://` or `https://`. It cannot start with `aliyun` or `acs:`.</p>
         */
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
