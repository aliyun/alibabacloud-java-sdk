// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth20190307.models;

import com.aliyun.tea.*;

public class DescribeWhitelistSettingResponse extends TeaModel {
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
    public java.util.List<DescribeWhitelistSettingResponseItems> items;

    public static DescribeWhitelistSettingResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeWhitelistSettingResponse self = new DescribeWhitelistSettingResponse();
        return TeaModel.build(map, self);
    }

    public DescribeWhitelistSettingResponse setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public DescribeWhitelistSettingResponse setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeWhitelistSettingResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeWhitelistSettingResponse setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public DescribeWhitelistSettingResponse setItems(java.util.List<DescribeWhitelistSettingResponseItems> items) {
        this.items = items;
        return this;
    }
    public java.util.List<DescribeWhitelistSettingResponseItems> getItems() {
        return this.items;
    }

    public static class DescribeWhitelistSettingResponseItems extends TeaModel {
        @NameInMap("CertNo")
        @Validation(required = true)
        public String certNo;

        @NameInMap("CertifyId")
        @Validation(required = true)
        public String certifyId;

        @NameInMap("GmtCreate")
        @Validation(required = true)
        public String gmtCreate;

        @NameInMap("GmtModified")
        @Validation(required = true)
        public String gmtModified;

        @NameInMap("Id")
        @Validation(required = true)
        public Long id;

        @NameInMap("SceneId")
        @Validation(required = true)
        public Long sceneId;

        @NameInMap("Status")
        @Validation(required = true)
        public String status;

        @NameInMap("ValidEndDate")
        @Validation(required = true)
        public String validEndDate;

        @NameInMap("ValidStartDate")
        @Validation(required = true)
        public String validStartDate;

        public static DescribeWhitelistSettingResponseItems build(java.util.Map<String, ?> map) throws Exception {
            DescribeWhitelistSettingResponseItems self = new DescribeWhitelistSettingResponseItems();
            return TeaModel.build(map, self);
        }

        public DescribeWhitelistSettingResponseItems setCertNo(String certNo) {
            this.certNo = certNo;
            return this;
        }
        public String getCertNo() {
            return this.certNo;
        }

        public DescribeWhitelistSettingResponseItems setCertifyId(String certifyId) {
            this.certifyId = certifyId;
            return this;
        }
        public String getCertifyId() {
            return this.certifyId;
        }

        public DescribeWhitelistSettingResponseItems setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public DescribeWhitelistSettingResponseItems setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public DescribeWhitelistSettingResponseItems setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public DescribeWhitelistSettingResponseItems setSceneId(Long sceneId) {
            this.sceneId = sceneId;
            return this;
        }
        public Long getSceneId() {
            return this.sceneId;
        }

        public DescribeWhitelistSettingResponseItems setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeWhitelistSettingResponseItems setValidEndDate(String validEndDate) {
            this.validEndDate = validEndDate;
            return this;
        }
        public String getValidEndDate() {
            return this.validEndDate;
        }

        public DescribeWhitelistSettingResponseItems setValidStartDate(String validStartDate) {
            this.validStartDate = validStartDate;
            return this;
        }
        public String getValidStartDate() {
            return this.validStartDate;
        }

    }

}
