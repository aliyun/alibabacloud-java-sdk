// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.btripopen20220520.models;

import com.aliyun.tea.*;

public class ApplyListQueryRequest extends TeaModel {
    @NameInMap("all_apply")
    public Boolean allApply;

    @NameInMap("depart_id")
    public String departId;

    @NameInMap("end_time")
    public String endTime;

    @NameInMap("gmt_modified")
    public String gmtModified;

    @NameInMap("only_shang_lv_apply")
    public Boolean onlyShangLvApply;

    @NameInMap("page")
    public Integer page;

    @NameInMap("page_size")
    public Integer pageSize;

    @NameInMap("start_time")
    public String startTime;

    /**
     * <p>子企业Id</p>
     */
    @NameInMap("sub_corp_id")
    public String subCorpId;

    @NameInMap("type")
    public Integer type;

    @NameInMap("union_no")
    public String unionNo;

    @NameInMap("user_id")
    public String userId;

    public static ApplyListQueryRequest build(java.util.Map<String, ?> map) throws Exception {
        ApplyListQueryRequest self = new ApplyListQueryRequest();
        return TeaModel.build(map, self);
    }

    public ApplyListQueryRequest setAllApply(Boolean allApply) {
        this.allApply = allApply;
        return this;
    }
    public Boolean getAllApply() {
        return this.allApply;
    }

    public ApplyListQueryRequest setDepartId(String departId) {
        this.departId = departId;
        return this;
    }
    public String getDepartId() {
        return this.departId;
    }

    public ApplyListQueryRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public ApplyListQueryRequest setGmtModified(String gmtModified) {
        this.gmtModified = gmtModified;
        return this;
    }
    public String getGmtModified() {
        return this.gmtModified;
    }

    public ApplyListQueryRequest setOnlyShangLvApply(Boolean onlyShangLvApply) {
        this.onlyShangLvApply = onlyShangLvApply;
        return this;
    }
    public Boolean getOnlyShangLvApply() {
        return this.onlyShangLvApply;
    }

    public ApplyListQueryRequest setPage(Integer page) {
        this.page = page;
        return this;
    }
    public Integer getPage() {
        return this.page;
    }

    public ApplyListQueryRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ApplyListQueryRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public ApplyListQueryRequest setSubCorpId(String subCorpId) {
        this.subCorpId = subCorpId;
        return this;
    }
    public String getSubCorpId() {
        return this.subCorpId;
    }

    public ApplyListQueryRequest setType(Integer type) {
        this.type = type;
        return this;
    }
    public Integer getType() {
        return this.type;
    }

    public ApplyListQueryRequest setUnionNo(String unionNo) {
        this.unionNo = unionNo;
        return this;
    }
    public String getUnionNo() {
        return this.unionNo;
    }

    public ApplyListQueryRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

}
