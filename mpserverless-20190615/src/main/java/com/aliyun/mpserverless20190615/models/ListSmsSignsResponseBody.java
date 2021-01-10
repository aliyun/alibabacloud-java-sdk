// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpserverless20190615.models;

import com.aliyun.tea.*;

public class ListSmsSignsResponseBody extends TeaModel {
    @NameInMap("TotalCount")
    public Integer totalCount;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("SmsSigns")
    public java.util.List<ListSmsSignsResponseBodySmsSigns> smsSigns;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    public static ListSmsSignsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListSmsSignsResponseBody self = new ListSmsSignsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListSmsSignsResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public ListSmsSignsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListSmsSignsResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListSmsSignsResponseBody setSmsSigns(java.util.List<ListSmsSignsResponseBodySmsSigns> smsSigns) {
        this.smsSigns = smsSigns;
        return this;
    }
    public java.util.List<ListSmsSignsResponseBodySmsSigns> getSmsSigns() {
        return this.smsSigns;
    }

    public ListSmsSignsResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public static class ListSmsSignsResponseBodySmsSigns extends TeaModel {
        @NameInMap("UpdateTime")
        public String updateTime;

        @NameInMap("Remark")
        public String remark;

        @NameInMap("CreateTime")
        public String createTime;

        @NameInMap("SignId")
        public String signId;

        @NameInMap("SignName")
        public String signName;

        public static ListSmsSignsResponseBodySmsSigns build(java.util.Map<String, ?> map) throws Exception {
            ListSmsSignsResponseBodySmsSigns self = new ListSmsSignsResponseBodySmsSigns();
            return TeaModel.build(map, self);
        }

        public ListSmsSignsResponseBodySmsSigns setUpdateTime(String updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public String getUpdateTime() {
            return this.updateTime;
        }

        public ListSmsSignsResponseBodySmsSigns setRemark(String remark) {
            this.remark = remark;
            return this;
        }
        public String getRemark() {
            return this.remark;
        }

        public ListSmsSignsResponseBodySmsSigns setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public ListSmsSignsResponseBodySmsSigns setSignId(String signId) {
            this.signId = signId;
            return this;
        }
        public String getSignId() {
            return this.signId;
        }

        public ListSmsSignsResponseBodySmsSigns setSignName(String signName) {
            this.signName = signName;
            return this;
        }
        public String getSignName() {
            return this.signName;
        }

    }

}
