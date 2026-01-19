// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class ListResourceServersForUserRequest extends TeaModel {
    @NameInMap("Filter")
    public java.util.List<ListResourceServersForUserRequestFilter> filter;

    /**
     * <p>IDaaS EIAM实例的ID。</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>idaas_ue2jvisn35ea5lmthk267xxxxx</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>查询凭证（Token），取值为上一次API调用返回的NextToken参数值。</p>
     * 
     * <strong>example:</strong>
     * <p>NTxxxxxexample</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>用户ID。</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>user_mkv7rgt4d7i4u7zqtzev2mxxxx</p>
     */
    @NameInMap("UserId")
    public String userId;

    public static ListResourceServersForUserRequest build(java.util.Map<String, ?> map) throws Exception {
        ListResourceServersForUserRequest self = new ListResourceServersForUserRequest();
        return TeaModel.build(map, self);
    }

    public ListResourceServersForUserRequest setFilter(java.util.List<ListResourceServersForUserRequestFilter> filter) {
        this.filter = filter;
        return this;
    }
    public java.util.List<ListResourceServersForUserRequestFilter> getFilter() {
        return this.filter;
    }

    public ListResourceServersForUserRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ListResourceServersForUserRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListResourceServersForUserRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListResourceServersForUserRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

    public static class ListResourceServersForUserRequestFilter extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>ApplicationIds</p>
         */
        @NameInMap("Name")
        public String name;

        @NameInMap("Value")
        public java.util.List<String> value;

        public static ListResourceServersForUserRequestFilter build(java.util.Map<String, ?> map) throws Exception {
            ListResourceServersForUserRequestFilter self = new ListResourceServersForUserRequestFilter();
            return TeaModel.build(map, self);
        }

        public ListResourceServersForUserRequestFilter setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListResourceServersForUserRequestFilter setValue(java.util.List<String> value) {
            this.value = value;
            return this;
        }
        public java.util.List<String> getValue() {
            return this.value;
        }

    }

}
