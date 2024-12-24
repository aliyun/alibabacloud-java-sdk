// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class QueryConferenceInfoByRoomCodeRequest extends TeaModel {
    @NameInMap("TenantContext")
    public QueryConferenceInfoByRoomCodeRequestTenantContext tenantContext;

    /**
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("maxResults")
    public Integer maxResults;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("nextToken")
    public String nextToken;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>583 480 813</p>
     */
    @NameInMap("roomCode")
    public String roomCode;

    public static QueryConferenceInfoByRoomCodeRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryConferenceInfoByRoomCodeRequest self = new QueryConferenceInfoByRoomCodeRequest();
        return TeaModel.build(map, self);
    }

    public QueryConferenceInfoByRoomCodeRequest setTenantContext(QueryConferenceInfoByRoomCodeRequestTenantContext tenantContext) {
        this.tenantContext = tenantContext;
        return this;
    }
    public QueryConferenceInfoByRoomCodeRequestTenantContext getTenantContext() {
        return this.tenantContext;
    }

    public QueryConferenceInfoByRoomCodeRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public QueryConferenceInfoByRoomCodeRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public QueryConferenceInfoByRoomCodeRequest setRoomCode(String roomCode) {
        this.roomCode = roomCode;
        return this;
    }
    public String getRoomCode() {
        return this.roomCode;
    }

    public static class QueryConferenceInfoByRoomCodeRequestTenantContext extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>xxxxxx</p>
         */
        @NameInMap("tenantId")
        public String tenantId;

        public static QueryConferenceInfoByRoomCodeRequestTenantContext build(java.util.Map<String, ?> map) throws Exception {
            QueryConferenceInfoByRoomCodeRequestTenantContext self = new QueryConferenceInfoByRoomCodeRequestTenantContext();
            return TeaModel.build(map, self);
        }

        public QueryConferenceInfoByRoomCodeRequestTenantContext setTenantId(String tenantId) {
            this.tenantId = tenantId;
            return this;
        }
        public String getTenantId() {
            return this.tenantId;
        }

    }

}
