// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth20190307.models;

import com.aliyun.tea.*;

public class DescribeWhitelistSettingResponseBody extends TeaModel {
    @NameInMap("CurrentPage")
    public Integer currentPage;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TotalCount")
    public Integer totalCount;

    @NameInMap("Items")
    public java.util.List<DescribeWhitelistSettingResponseBodyItems> items;

    public static DescribeWhitelistSettingResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeWhitelistSettingResponseBody self = new DescribeWhitelistSettingResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeWhitelistSettingResponseBody setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public DescribeWhitelistSettingResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeWhitelistSettingResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeWhitelistSettingResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public DescribeWhitelistSettingResponseBody setItems(java.util.List<DescribeWhitelistSettingResponseBodyItems> items) {
        this.items = items;
        return this;
    }
    public java.util.List<DescribeWhitelistSettingResponseBodyItems> getItems() {
        return this.items;
    }

    public static class DescribeWhitelistSettingResponseBodyItems extends TeaModel {
        @NameInMap("Status")
        public String status;

        @NameInMap("GmtCreate")
        public String gmtCreate;

        @NameInMap("CertifyId")
        public String certifyId;

        @NameInMap("CertNo")
        public String certNo;

        @NameInMap("ValidStartDate")
        public String validStartDate;

        @NameInMap("SceneId")
        public Long sceneId;

        @NameInMap("GmtModified")
        public String gmtModified;

        @NameInMap("ValidEndDate")
        public String validEndDate;

        @NameInMap("Id")
        public Long id;

        public static DescribeWhitelistSettingResponseBodyItems build(java.util.Map<String, ?> map) throws Exception {
            DescribeWhitelistSettingResponseBodyItems self = new DescribeWhitelistSettingResponseBodyItems();
            return TeaModel.build(map, self);
        }

        public DescribeWhitelistSettingResponseBodyItems setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeWhitelistSettingResponseBodyItems setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public DescribeWhitelistSettingResponseBodyItems setCertifyId(String certifyId) {
            this.certifyId = certifyId;
            return this;
        }
        public String getCertifyId() {
            return this.certifyId;
        }

        public DescribeWhitelistSettingResponseBodyItems setCertNo(String certNo) {
            this.certNo = certNo;
            return this;
        }
        public String getCertNo() {
            return this.certNo;
        }

        public DescribeWhitelistSettingResponseBodyItems setValidStartDate(String validStartDate) {
            this.validStartDate = validStartDate;
            return this;
        }
        public String getValidStartDate() {
            return this.validStartDate;
        }

        public DescribeWhitelistSettingResponseBodyItems setSceneId(Long sceneId) {
            this.sceneId = sceneId;
            return this;
        }
        public Long getSceneId() {
            return this.sceneId;
        }

        public DescribeWhitelistSettingResponseBodyItems setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public DescribeWhitelistSettingResponseBodyItems setValidEndDate(String validEndDate) {
            this.validEndDate = validEndDate;
            return this;
        }
        public String getValidEndDate() {
            return this.validEndDate;
        }

        public DescribeWhitelistSettingResponseBodyItems setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

    }

}
