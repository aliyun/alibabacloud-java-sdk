// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cccxspaceinner20191227.models;

import com.aliyun.tea.*;

public class QueryServicerByPageRequest extends TeaModel {
    // 关键字
    @NameInMap("Keyword")
    public String keyword;

    // 状态列表
    @NameInMap("UserStatusList")
    public java.util.List<Integer> userStatusList;

    // 真实名字
    @NameInMap("RealName")
    public String realName;

    // 技能组id
    @NameInMap("GroupId")
    public Long groupId;

    // 页面大小
    @NameInMap("PageSize")
    public Long pageSize;

    // 页码
    @NameInMap("PageNo")
    public Long pageNo;

    // 租户id
    @NameInMap("BuId")
    public Long buId;

    // 查询人id
    @NameInMap("AdminId")
    public Long adminId;

    // 客服id列表
    @NameInMap("ServicerIds")
    public java.util.List<Long> servicerIds;

    public static QueryServicerByPageRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryServicerByPageRequest self = new QueryServicerByPageRequest();
        return TeaModel.build(map, self);
    }

    public QueryServicerByPageRequest setKeyword(String keyword) {
        this.keyword = keyword;
        return this;
    }
    public String getKeyword() {
        return this.keyword;
    }

    public QueryServicerByPageRequest setUserStatusList(java.util.List<Integer> userStatusList) {
        this.userStatusList = userStatusList;
        return this;
    }
    public java.util.List<Integer> getUserStatusList() {
        return this.userStatusList;
    }

    public QueryServicerByPageRequest setRealName(String realName) {
        this.realName = realName;
        return this;
    }
    public String getRealName() {
        return this.realName;
    }

    public QueryServicerByPageRequest setGroupId(Long groupId) {
        this.groupId = groupId;
        return this;
    }
    public Long getGroupId() {
        return this.groupId;
    }

    public QueryServicerByPageRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public QueryServicerByPageRequest setPageNo(Long pageNo) {
        this.pageNo = pageNo;
        return this;
    }
    public Long getPageNo() {
        return this.pageNo;
    }

    public QueryServicerByPageRequest setBuId(Long buId) {
        this.buId = buId;
        return this;
    }
    public Long getBuId() {
        return this.buId;
    }

    public QueryServicerByPageRequest setAdminId(Long adminId) {
        this.adminId = adminId;
        return this;
    }
    public Long getAdminId() {
        return this.adminId;
    }

    public QueryServicerByPageRequest setServicerIds(java.util.List<Long> servicerIds) {
        this.servicerIds = servicerIds;
        return this;
    }
    public java.util.List<Long> getServicerIds() {
        return this.servicerIds;
    }

}
