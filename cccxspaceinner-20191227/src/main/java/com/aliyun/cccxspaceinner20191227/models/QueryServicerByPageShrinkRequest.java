// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cccxspaceinner20191227.models;

import com.aliyun.tea.*;

public class QueryServicerByPageShrinkRequest extends TeaModel {
    // 关键字
    @NameInMap("Keyword")
    public String keyword;

    // 状态列表
    @NameInMap("UserStatusList")
    public String userStatusListShrink;

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
    public String servicerIdsShrink;

    public static QueryServicerByPageShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryServicerByPageShrinkRequest self = new QueryServicerByPageShrinkRequest();
        return TeaModel.build(map, self);
    }

    public QueryServicerByPageShrinkRequest setKeyword(String keyword) {
        this.keyword = keyword;
        return this;
    }
    public String getKeyword() {
        return this.keyword;
    }

    public QueryServicerByPageShrinkRequest setUserStatusListShrink(String userStatusListShrink) {
        this.userStatusListShrink = userStatusListShrink;
        return this;
    }
    public String getUserStatusListShrink() {
        return this.userStatusListShrink;
    }

    public QueryServicerByPageShrinkRequest setRealName(String realName) {
        this.realName = realName;
        return this;
    }
    public String getRealName() {
        return this.realName;
    }

    public QueryServicerByPageShrinkRequest setGroupId(Long groupId) {
        this.groupId = groupId;
        return this;
    }
    public Long getGroupId() {
        return this.groupId;
    }

    public QueryServicerByPageShrinkRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public QueryServicerByPageShrinkRequest setPageNo(Long pageNo) {
        this.pageNo = pageNo;
        return this;
    }
    public Long getPageNo() {
        return this.pageNo;
    }

    public QueryServicerByPageShrinkRequest setBuId(Long buId) {
        this.buId = buId;
        return this;
    }
    public Long getBuId() {
        return this.buId;
    }

    public QueryServicerByPageShrinkRequest setAdminId(Long adminId) {
        this.adminId = adminId;
        return this;
    }
    public Long getAdminId() {
        return this.adminId;
    }

    public QueryServicerByPageShrinkRequest setServicerIdsShrink(String servicerIdsShrink) {
        this.servicerIdsShrink = servicerIdsShrink;
        return this;
    }
    public String getServicerIdsShrink() {
        return this.servicerIdsShrink;
    }

}
