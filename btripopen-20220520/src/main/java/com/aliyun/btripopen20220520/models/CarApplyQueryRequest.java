// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.btripopen20220520.models;

import com.aliyun.tea.*;

public class CarApplyQueryRequest extends TeaModel {
    @NameInMap("created_end_at")
    public String createdEndAt;

    @NameInMap("created_start_at")
    public String createdStartAt;

    @NameInMap("page_number")
    public Integer pageNumber;

    @NameInMap("page_size")
    public Integer pageSize;

    @NameInMap("third_part_apply_id")
    public String thirdPartApplyId;

    @NameInMap("user_id")
    public String userId;

    public static CarApplyQueryRequest build(java.util.Map<String, ?> map) throws Exception {
        CarApplyQueryRequest self = new CarApplyQueryRequest();
        return TeaModel.build(map, self);
    }

    public CarApplyQueryRequest setCreatedEndAt(String createdEndAt) {
        this.createdEndAt = createdEndAt;
        return this;
    }
    public String getCreatedEndAt() {
        return this.createdEndAt;
    }

    public CarApplyQueryRequest setCreatedStartAt(String createdStartAt) {
        this.createdStartAt = createdStartAt;
        return this;
    }
    public String getCreatedStartAt() {
        return this.createdStartAt;
    }

    public CarApplyQueryRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public CarApplyQueryRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public CarApplyQueryRequest setThirdPartApplyId(String thirdPartApplyId) {
        this.thirdPartApplyId = thirdPartApplyId;
        return this;
    }
    public String getThirdPartApplyId() {
        return this.thirdPartApplyId;
    }

    public CarApplyQueryRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

}
