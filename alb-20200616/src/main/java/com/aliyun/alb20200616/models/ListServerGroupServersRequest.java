// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alb20200616.models;

import com.aliyun.tea.*;

public class ListServerGroupServersRequest extends TeaModel {
    /**
     * <p>The maximum number of entries to return. Valid values: <strong>1</strong> to <strong>100</strong>. If you do not specify a value, the default value <strong>20</strong> is used.</p>
     * 
     * <strong>example:</strong>
     * <p>50</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The pagination token that is used in the next request to retrieve a new page of results. Valid values:</p>
     * <ul>
     * <li>You do not need to specify this parameter for the first request.</li>
     * <li>You must specify the token that is obtained from the previous query as the value of <strong>NextToken</strong>.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>FFmyTO70tTpLG6I3FmYAXG****</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The server group ID.</p>
     * 
     * <strong>example:</strong>
     * <p>rg-atstuj3rtop****</p>
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
         * <p>The tag key can be up to 64 characters in length, and cannot contain <code>http://</code> or <code>https://</code>. It cannot start with <code>aliyun</code> or <code>acs:</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>Test</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The tag value. You can specify up to 10 tag values.</p>
         * <p>The tag value can be up to 128 characters in length, and cannot contain <code>http://</code> or <code>https://</code>. It cannot start with <code>aliyun</code> or <code>acs:</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>Test</p>
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
