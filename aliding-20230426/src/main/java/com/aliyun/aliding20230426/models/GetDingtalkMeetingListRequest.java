// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class GetDingtalkMeetingListRequest extends TeaModel {
    @NameInMap("TenantContext")
    public GetDingtalkMeetingListRequestTenantContext tenantContext;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("currentPage")
    public Integer currentPage;

    /**
     * <strong>example:</strong>
     * <p>1732953600000</p>
     */
    @NameInMap("endTime")
    public Long endTime;

    /**
     * <strong>example:</strong>
     * <p>21001</p>
     */
    @NameInMap("orgId")
    public String orgId;

    /**
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("pageSize")
    public Integer pageSize;

    /**
     * <strong>example:</strong>
     * <p>123456789</p>
     */
    @NameInMap("roomCode")
    public String roomCode;

    /**
     * <strong>example:</strong>
     * <p>会议室A</p>
     */
    @NameInMap("roomName")
    public String roomName;

    /**
     * <strong>example:</strong>
     * <p>1732867200000</p>
     */
    @NameInMap("startTime")
    public Long startTime;

    /**
     * <strong>example:</strong>
     * <p>34343</p>
     */
    @NameInMap("workNo")
    public String workNo;

    public static GetDingtalkMeetingListRequest build(java.util.Map<String, ?> map) throws Exception {
        GetDingtalkMeetingListRequest self = new GetDingtalkMeetingListRequest();
        return TeaModel.build(map, self);
    }

    public GetDingtalkMeetingListRequest setTenantContext(GetDingtalkMeetingListRequestTenantContext tenantContext) {
        this.tenantContext = tenantContext;
        return this;
    }
    public GetDingtalkMeetingListRequestTenantContext getTenantContext() {
        return this.tenantContext;
    }

    public GetDingtalkMeetingListRequest setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public GetDingtalkMeetingListRequest setEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }
    public Long getEndTime() {
        return this.endTime;
    }

    public GetDingtalkMeetingListRequest setOrgId(String orgId) {
        this.orgId = orgId;
        return this;
    }
    public String getOrgId() {
        return this.orgId;
    }

    public GetDingtalkMeetingListRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public GetDingtalkMeetingListRequest setRoomCode(String roomCode) {
        this.roomCode = roomCode;
        return this;
    }
    public String getRoomCode() {
        return this.roomCode;
    }

    public GetDingtalkMeetingListRequest setRoomName(String roomName) {
        this.roomName = roomName;
        return this;
    }
    public String getRoomName() {
        return this.roomName;
    }

    public GetDingtalkMeetingListRequest setStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }
    public Long getStartTime() {
        return this.startTime;
    }

    public GetDingtalkMeetingListRequest setWorkNo(String workNo) {
        this.workNo = workNo;
        return this;
    }
    public String getWorkNo() {
        return this.workNo;
    }

    public static class GetDingtalkMeetingListRequestTenantContext extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>xxxxxx</p>
         */
        @NameInMap("tenantId")
        public String tenantId;

        public static GetDingtalkMeetingListRequestTenantContext build(java.util.Map<String, ?> map) throws Exception {
            GetDingtalkMeetingListRequestTenantContext self = new GetDingtalkMeetingListRequestTenantContext();
            return TeaModel.build(map, self);
        }

        public GetDingtalkMeetingListRequestTenantContext setTenantId(String tenantId) {
            this.tenantId = tenantId;
            return this;
        }
        public String getTenantId() {
            return this.tenantId;
        }

    }

}
