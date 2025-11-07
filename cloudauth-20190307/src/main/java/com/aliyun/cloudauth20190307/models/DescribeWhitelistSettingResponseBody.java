// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth20190307.models;

import com.aliyun.tea.*;

public class DescribeWhitelistSettingResponseBody extends TeaModel {
    /**
     * <p>Pagination parameter: current page number, default value is 1.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("CurrentPage")
    public Integer currentPage;

    /**
     * <p>List of certification details.</p>
     */
    @NameInMap("Items")
    public java.util.List<DescribeWhitelistSettingResponseBodyItems> items;

    /**
     * <p>Number of items per page for pagination.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>ID of this request.</p>
     * 
     * <strong>example:</strong>
     * <p>0B8ACFD2-C5F0-5F9F-8DD4-E44F93E360E8</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Total count.</p>
     * 
     * <strong>example:</strong>
     * <p>4</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

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

    public DescribeWhitelistSettingResponseBody setItems(java.util.List<DescribeWhitelistSettingResponseBodyItems> items) {
        this.items = items;
        return this;
    }
    public java.util.List<DescribeWhitelistSettingResponseBodyItems> getItems() {
        return this.items;
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

    public static class DescribeWhitelistSettingResponseBodyItems extends TeaModel {
        /**
         * <p>Certificate number.</p>
         * 
         * <strong>example:</strong>
         * <p>320321XXXXXXXX701X</p>
         */
        @NameInMap("CertNo")
        public String certNo;

        /**
         * <p>Certificate ID.</p>
         * 
         * <strong>example:</strong>
         * <p>shad861465f2aaeeb805b519e1a93ab2</p>
         */
        @NameInMap("CertifyId")
        public String certifyId;

        /**
         * <p>Creation time.</p>
         * 
         * <strong>example:</strong>
         * <p>2025-10-16 17:28:03</p>
         */
        @NameInMap("GmtCreate")
        public String gmtCreate;

        /**
         * <p>Modification time.</p>
         * 
         * <strong>example:</strong>
         * <p>2025-10-16 17:28:03</p>
         */
        @NameInMap("GmtModified")
        public String gmtModified;

        /**
         * <p>Whitelist ID.</p>
         * 
         * <strong>example:</strong>
         * <p>6372003</p>
         */
        @NameInMap("Id")
        public Long id;

        /**
         * <p>Remark.</p>
         * 
         * <strong>example:</strong>
         * <p>测试白名单</p>
         */
        @NameInMap("Remark")
        public String remark;

        /**
         * <p>Scene ID.</p>
         * 
         * <strong>example:</strong>
         * <p>1000000332</p>
         */
        @NameInMap("SceneId")
        public Long sceneId;

        /**
         * <p>Whitelist status:</p>
         * <ul>
         * <li><strong>VALID</strong>: Valid.</li>
         * <li><strong>INVALID</strong>: Invalid.</li>
         * <li><strong>DELETED</strong>: Deleted.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>VALID</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>Effective end date.</p>
         * 
         * <strong>example:</strong>
         * <p>2025-10-16 17:28:03</p>
         */
        @NameInMap("ValidEndDate")
        public String validEndDate;

        /**
         * <p>Effective start time.</p>
         * 
         * <strong>example:</strong>
         * <p>2025-10-16 17:28:03</p>
         */
        @NameInMap("ValidStartDate")
        public String validStartDate;

        public static DescribeWhitelistSettingResponseBodyItems build(java.util.Map<String, ?> map) throws Exception {
            DescribeWhitelistSettingResponseBodyItems self = new DescribeWhitelistSettingResponseBodyItems();
            return TeaModel.build(map, self);
        }

        public DescribeWhitelistSettingResponseBodyItems setCertNo(String certNo) {
            this.certNo = certNo;
            return this;
        }
        public String getCertNo() {
            return this.certNo;
        }

        public DescribeWhitelistSettingResponseBodyItems setCertifyId(String certifyId) {
            this.certifyId = certifyId;
            return this;
        }
        public String getCertifyId() {
            return this.certifyId;
        }

        public DescribeWhitelistSettingResponseBodyItems setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public DescribeWhitelistSettingResponseBodyItems setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public DescribeWhitelistSettingResponseBodyItems setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public DescribeWhitelistSettingResponseBodyItems setRemark(String remark) {
            this.remark = remark;
            return this;
        }
        public String getRemark() {
            return this.remark;
        }

        public DescribeWhitelistSettingResponseBodyItems setSceneId(Long sceneId) {
            this.sceneId = sceneId;
            return this;
        }
        public Long getSceneId() {
            return this.sceneId;
        }

        public DescribeWhitelistSettingResponseBodyItems setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeWhitelistSettingResponseBodyItems setValidEndDate(String validEndDate) {
            this.validEndDate = validEndDate;
            return this;
        }
        public String getValidEndDate() {
            return this.validEndDate;
        }

        public DescribeWhitelistSettingResponseBodyItems setValidStartDate(String validStartDate) {
            this.validStartDate = validStartDate;
            return this;
        }
        public String getValidStartDate() {
            return this.validStartDate;
        }

    }

}
