// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth20190307.models;

import com.aliyun.tea.*;

public class DescribeWhitelistResponse extends TeaModel {
    @NameInMap("CurrentPage")
    @Validation(required = true)
    public Integer currentPage;

    @NameInMap("PageSize")
    @Validation(required = true)
    public Integer pageSize;

    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("TotalCount")
    @Validation(required = true)
    public Integer totalCount;

    @NameInMap("Items")
    @Validation(required = true)
    public java.util.List<DescribeWhitelistResponseItems> items;

    public static DescribeWhitelistResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeWhitelistResponse self = new DescribeWhitelistResponse();
        return TeaModel.build(map, self);
    }

    public DescribeWhitelistResponse setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public DescribeWhitelistResponse setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeWhitelistResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeWhitelistResponse setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public DescribeWhitelistResponse setItems(java.util.List<DescribeWhitelistResponseItems> items) {
        this.items = items;
        return this;
    }
    public java.util.List<DescribeWhitelistResponseItems> getItems() {
        return this.items;
    }

    public static class DescribeWhitelistResponseItems extends TeaModel {
        @NameInMap("BizId")
        @Validation(required = true)
        public String bizId;

        @NameInMap("BizType")
        @Validation(required = true)
        public String bizType;

        @NameInMap("EndDate")
        @Validation(required = true)
        public Long endDate;

        @NameInMap("GmtCreate")
        @Validation(required = true)
        public Long gmtCreate;

        @NameInMap("GmtModified")
        @Validation(required = true)
        public Long gmtModified;

        @NameInMap("Id")
        @Validation(required = true)
        public Long id;

        @NameInMap("IdCardNum")
        @Validation(required = true)
        public String idCardNum;

        @NameInMap("StartDate")
        @Validation(required = true)
        public Long startDate;

        @NameInMap("Uid")
        @Validation(required = true)
        public Long uid;

        @NameInMap("Valid")
        @Validation(required = true)
        public Integer valid;

        public static DescribeWhitelistResponseItems build(java.util.Map<String, ?> map) throws Exception {
            DescribeWhitelistResponseItems self = new DescribeWhitelistResponseItems();
            return TeaModel.build(map, self);
        }

        public DescribeWhitelistResponseItems setBizId(String bizId) {
            this.bizId = bizId;
            return this;
        }
        public String getBizId() {
            return this.bizId;
        }

        public DescribeWhitelistResponseItems setBizType(String bizType) {
            this.bizType = bizType;
            return this;
        }
        public String getBizType() {
            return this.bizType;
        }

        public DescribeWhitelistResponseItems setEndDate(Long endDate) {
            this.endDate = endDate;
            return this;
        }
        public Long getEndDate() {
            return this.endDate;
        }

        public DescribeWhitelistResponseItems setGmtCreate(Long gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public Long getGmtCreate() {
            return this.gmtCreate;
        }

        public DescribeWhitelistResponseItems setGmtModified(Long gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public Long getGmtModified() {
            return this.gmtModified;
        }

        public DescribeWhitelistResponseItems setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public DescribeWhitelistResponseItems setIdCardNum(String idCardNum) {
            this.idCardNum = idCardNum;
            return this;
        }
        public String getIdCardNum() {
            return this.idCardNum;
        }

        public DescribeWhitelistResponseItems setStartDate(Long startDate) {
            this.startDate = startDate;
            return this;
        }
        public Long getStartDate() {
            return this.startDate;
        }

        public DescribeWhitelistResponseItems setUid(Long uid) {
            this.uid = uid;
            return this;
        }
        public Long getUid() {
            return this.uid;
        }

        public DescribeWhitelistResponseItems setValid(Integer valid) {
            this.valid = valid;
            return this;
        }
        public Integer getValid() {
            return this.valid;
        }

    }

}
