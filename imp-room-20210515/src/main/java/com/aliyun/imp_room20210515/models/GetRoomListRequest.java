// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imp_room20210515.models;

import com.aliyun.tea.*;

public class GetRoomListRequest extends TeaModel {
    @NameInMap("Request")
    public GetRoomListRequestRequest request;

    public static GetRoomListRequest build(java.util.Map<String, ?> map) throws Exception {
        GetRoomListRequest self = new GetRoomListRequest();
        return TeaModel.build(map, self);
    }

    public GetRoomListRequest setRequest(GetRoomListRequestRequest request) {
        this.request = request;
        return this;
    }
    public GetRoomListRequestRequest getRequest() {
        return this.request;
    }

    public static class GetRoomListRequestRequest extends TeaModel {
        // 租户名
        @NameInMap("Domain")
        public String domain;

        // 业务类型
        @NameInMap("BizType")
        public String bizType;

        // 查询第几页的房间列表
        @NameInMap("PageNum")
        public Long pageNum;

        // 该页面房间数量(最大支持50)
        @NameInMap("PageSize")
        public Long pageSize;

        public static GetRoomListRequestRequest build(java.util.Map<String, ?> map) throws Exception {
            GetRoomListRequestRequest self = new GetRoomListRequestRequest();
            return TeaModel.build(map, self);
        }

        public GetRoomListRequestRequest setDomain(String domain) {
            this.domain = domain;
            return this;
        }
        public String getDomain() {
            return this.domain;
        }

        public GetRoomListRequestRequest setBizType(String bizType) {
            this.bizType = bizType;
            return this;
        }
        public String getBizType() {
            return this.bizType;
        }

        public GetRoomListRequestRequest setPageNum(Long pageNum) {
            this.pageNum = pageNum;
            return this;
        }
        public Long getPageNum() {
            return this.pageNum;
        }

        public GetRoomListRequestRequest setPageSize(Long pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Long getPageSize() {
            return this.pageSize;
        }

    }

}
