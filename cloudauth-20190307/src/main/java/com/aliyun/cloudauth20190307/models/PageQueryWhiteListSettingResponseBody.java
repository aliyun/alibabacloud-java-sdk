// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth20190307.models;

import com.aliyun.tea.*;

public class PageQueryWhiteListSettingResponseBody extends TeaModel {
    /**
     * <p>Return code, <strong>200</strong> indicates a successful API response.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>Current page number.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("CurrentPage")
    public Integer currentPage;

    /**
     * <p>Return message.</p>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>Number of items per page.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>ID of the request</p>
     * 
     * <strong>example:</strong>
     * <p>5A6229C0-E156-48E4-B6EC-0F528BDF60D2</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Request result</p>
     */
    @NameInMap("ResultObject")
    public java.util.List<PageQueryWhiteListSettingResponseBodyResultObject> resultObject;

    /**
     * <p>Whether the response was successful.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    /**
     * <p>Total number of items.</p>
     * 
     * <strong>example:</strong>
     * <p>28</p>
     */
    @NameInMap("TotalItem")
    public Integer totalItem;

    /**
     * <p>Total number of pages.</p>
     * 
     * <strong>example:</strong>
     * <p>3</p>
     */
    @NameInMap("TotalPage")
    public Integer totalPage;

    public static PageQueryWhiteListSettingResponseBody build(java.util.Map<String, ?> map) throws Exception {
        PageQueryWhiteListSettingResponseBody self = new PageQueryWhiteListSettingResponseBody();
        return TeaModel.build(map, self);
    }

    public PageQueryWhiteListSettingResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public PageQueryWhiteListSettingResponseBody setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public PageQueryWhiteListSettingResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public PageQueryWhiteListSettingResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public PageQueryWhiteListSettingResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public PageQueryWhiteListSettingResponseBody setResultObject(java.util.List<PageQueryWhiteListSettingResponseBodyResultObject> resultObject) {
        this.resultObject = resultObject;
        return this;
    }
    public java.util.List<PageQueryWhiteListSettingResponseBodyResultObject> getResultObject() {
        return this.resultObject;
    }

    public PageQueryWhiteListSettingResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public PageQueryWhiteListSettingResponseBody setTotalItem(Integer totalItem) {
        this.totalItem = totalItem;
        return this;
    }
    public Integer getTotalItem() {
        return this.totalItem;
    }

    public PageQueryWhiteListSettingResponseBody setTotalPage(Integer totalPage) {
        this.totalPage = totalPage;
        return this;
    }
    public Integer getTotalPage() {
        return this.totalPage;
    }

    public static class PageQueryWhiteListSettingResponseBodyResultObject extends TeaModel {
        /**
         * <p>ID number.</p>
         * 
         * <strong>example:</strong>
         * <p>330103xxxxxxxxxxxx</p>
         */
        @NameInMap("CertNo")
        public String certNo;

        /**
         * <p>Unique identifier for real person authentication.</p>
         * 
         * <strong>example:</strong>
         * <p>sha43d9cabd52d370d9f4cca9468f71e</p>
         */
        @NameInMap("CertifyId")
        public String certifyId;

        /**
         * <p>Creation time.</p>
         * 
         * <strong>example:</strong>
         * <p>2024-08-30 14:00:00</p>
         */
        @NameInMap("GmtCreate")
        public String gmtCreate;

        /**
         * <p>Modification time.</p>
         * 
         * <strong>example:</strong>
         * <p>2024-08-30 14:00:00</p>
         */
        @NameInMap("GmtModified")
        public String gmtModified;

        /**
         * <p>Whitelist ID.</p>
         * 
         * <strong>example:</strong>
         * <p>234822</p>
         */
        @NameInMap("Id")
        public Long id;

        /**
         * <p>Remark information.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("Remark")
        public String remark;

        /**
         * <p>Authentication scene ID.</p>
         * 
         * <strong>example:</strong>
         * <p>1000000332</p>
         */
        @NameInMap("SceneId")
        public Long sceneId;

        /**
         * <p>ServiceCode of the real person cloud product</p>
         * 
         * <strong>example:</strong>
         * <p>antcloudauth</p>
         */
        @NameInMap("ServiceCode")
        public String serviceCode;

        /**
         * <p>Status:</p>
         * <ul>
         * <li>DELETE: Deleted</li>
         * <li>VALID: Not deleted and within the validity period, valid</li>
         * <li>INVALID: Not deleted but outside the validity period, invalid</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>VALID</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>End date of validity</p>
         * 
         * <strong>example:</strong>
         * <p>2024-09-02 13:57:51</p>
         */
        @NameInMap("ValidEndDate")
        public String validEndDate;

        /**
         * <p>Start date of validity</p>
         * 
         * <strong>example:</strong>
         * <p>2024-08-30 13:57:51</p>
         */
        @NameInMap("ValidStartDate")
        public String validStartDate;

        public static PageQueryWhiteListSettingResponseBodyResultObject build(java.util.Map<String, ?> map) throws Exception {
            PageQueryWhiteListSettingResponseBodyResultObject self = new PageQueryWhiteListSettingResponseBodyResultObject();
            return TeaModel.build(map, self);
        }

        public PageQueryWhiteListSettingResponseBodyResultObject setCertNo(String certNo) {
            this.certNo = certNo;
            return this;
        }
        public String getCertNo() {
            return this.certNo;
        }

        public PageQueryWhiteListSettingResponseBodyResultObject setCertifyId(String certifyId) {
            this.certifyId = certifyId;
            return this;
        }
        public String getCertifyId() {
            return this.certifyId;
        }

        public PageQueryWhiteListSettingResponseBodyResultObject setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public PageQueryWhiteListSettingResponseBodyResultObject setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public PageQueryWhiteListSettingResponseBodyResultObject setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public PageQueryWhiteListSettingResponseBodyResultObject setRemark(String remark) {
            this.remark = remark;
            return this;
        }
        public String getRemark() {
            return this.remark;
        }

        public PageQueryWhiteListSettingResponseBodyResultObject setSceneId(Long sceneId) {
            this.sceneId = sceneId;
            return this;
        }
        public Long getSceneId() {
            return this.sceneId;
        }

        public PageQueryWhiteListSettingResponseBodyResultObject setServiceCode(String serviceCode) {
            this.serviceCode = serviceCode;
            return this;
        }
        public String getServiceCode() {
            return this.serviceCode;
        }

        public PageQueryWhiteListSettingResponseBodyResultObject setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public PageQueryWhiteListSettingResponseBodyResultObject setValidEndDate(String validEndDate) {
            this.validEndDate = validEndDate;
            return this;
        }
        public String getValidEndDate() {
            return this.validEndDate;
        }

        public PageQueryWhiteListSettingResponseBodyResultObject setValidStartDate(String validStartDate) {
            this.validStartDate = validStartDate;
            return this;
        }
        public String getValidStartDate() {
            return this.validStartDate;
        }

    }

}
