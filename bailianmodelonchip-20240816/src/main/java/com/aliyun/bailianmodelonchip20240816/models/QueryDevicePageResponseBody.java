// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bailianmodelonchip20240816.models;

import com.aliyun.tea.*;

public class QueryDevicePageResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("code")
    public String code;

    @NameInMap("data")
    public QueryDevicePageResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("httpStatusCode")
    public Integer httpStatusCode;

    /**
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>60FD351B-10C4-5C2C-ADA2-524FC39FC174</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("success")
    public String success;

    public static QueryDevicePageResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryDevicePageResponseBody self = new QueryDevicePageResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryDevicePageResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryDevicePageResponseBody setData(QueryDevicePageResponseBodyData data) {
        this.data = data;
        return this;
    }
    public QueryDevicePageResponseBodyData getData() {
        return this.data;
    }

    public QueryDevicePageResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public QueryDevicePageResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public QueryDevicePageResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryDevicePageResponseBody setSuccess(String success) {
        this.success = success;
        return this;
    }
    public String getSuccess() {
        return this.success;
    }

    public static class QueryDevicePageResponseBodyDataData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>2025-03-15 09:44:32</p>
         */
        @NameInMap("activeTime")
        public String activeTime;

        /**
         * <strong>example:</strong>
         * <p>1539704706413278</p>
         */
        @NameInMap("aliyunUid")
        public String aliyunUid;

        /**
         * <strong>example:</strong>
         * <p>202504010001</p>
         */
        @NameInMap("batchNo")
        public String batchNo;

        /**
         * <strong>example:</strong>
         * <p>5b504f84b69b9a73d3a21a2cff05e190</p>
         */
        @NameInMap("deviceName")
        public String deviceName;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("disableStatus")
        public Integer disableStatus;

        /**
         * <strong>example:</strong>
         * <p>2025-04-27 09:10:31</p>
         */
        @NameInMap("gmtCreate")
        public String gmtCreate;

        /**
         * <strong>example:</strong>
         * <p>2025-04-27 09:10:31</p>
         */
        @NameInMap("gmtModify")
        public String gmtModify;

        /**
         * <p>ID。</p>
         * 
         * <strong>example:</strong>
         * <p>201</p>
         */
        @NameInMap("id")
        public Long id;

        /**
         * <strong>example:</strong>
         * <p>nnjNQQv3ZjyYE7H4</p>
         */
        @NameInMap("productKey")
        public String productKey;

        @NameInMap("productName")
        public String productName;

        @NameInMap("remark")
        public String remark;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("status")
        public Integer status;

        /**
         * <strong>example:</strong>
         * <p>493303079000577</p>
         */
        @NameInMap("tenantId")
        public String tenantId;

        public static QueryDevicePageResponseBodyDataData build(java.util.Map<String, ?> map) throws Exception {
            QueryDevicePageResponseBodyDataData self = new QueryDevicePageResponseBodyDataData();
            return TeaModel.build(map, self);
        }

        public QueryDevicePageResponseBodyDataData setActiveTime(String activeTime) {
            this.activeTime = activeTime;
            return this;
        }
        public String getActiveTime() {
            return this.activeTime;
        }

        public QueryDevicePageResponseBodyDataData setAliyunUid(String aliyunUid) {
            this.aliyunUid = aliyunUid;
            return this;
        }
        public String getAliyunUid() {
            return this.aliyunUid;
        }

        public QueryDevicePageResponseBodyDataData setBatchNo(String batchNo) {
            this.batchNo = batchNo;
            return this;
        }
        public String getBatchNo() {
            return this.batchNo;
        }

        public QueryDevicePageResponseBodyDataData setDeviceName(String deviceName) {
            this.deviceName = deviceName;
            return this;
        }
        public String getDeviceName() {
            return this.deviceName;
        }

        public QueryDevicePageResponseBodyDataData setDisableStatus(Integer disableStatus) {
            this.disableStatus = disableStatus;
            return this;
        }
        public Integer getDisableStatus() {
            return this.disableStatus;
        }

        public QueryDevicePageResponseBodyDataData setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public QueryDevicePageResponseBodyDataData setGmtModify(String gmtModify) {
            this.gmtModify = gmtModify;
            return this;
        }
        public String getGmtModify() {
            return this.gmtModify;
        }

        public QueryDevicePageResponseBodyDataData setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public QueryDevicePageResponseBodyDataData setProductKey(String productKey) {
            this.productKey = productKey;
            return this;
        }
        public String getProductKey() {
            return this.productKey;
        }

        public QueryDevicePageResponseBodyDataData setProductName(String productName) {
            this.productName = productName;
            return this;
        }
        public String getProductName() {
            return this.productName;
        }

        public QueryDevicePageResponseBodyDataData setRemark(String remark) {
            this.remark = remark;
            return this;
        }
        public String getRemark() {
            return this.remark;
        }

        public QueryDevicePageResponseBodyDataData setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

        public QueryDevicePageResponseBodyDataData setTenantId(String tenantId) {
            this.tenantId = tenantId;
            return this;
        }
        public String getTenantId() {
            return this.tenantId;
        }

    }

    public static class QueryDevicePageResponseBodyData extends TeaModel {
        @NameInMap("data")
        public java.util.List<QueryDevicePageResponseBodyDataData> data;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("pageIndex")
        public Integer pageIndex;

        /**
         * <strong>example:</strong>
         * <p>20</p>
         */
        @NameInMap("pageSize")
        public Integer pageSize;

        /**
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("total")
        public Long total;

        public static QueryDevicePageResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QueryDevicePageResponseBodyData self = new QueryDevicePageResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QueryDevicePageResponseBodyData setData(java.util.List<QueryDevicePageResponseBodyDataData> data) {
            this.data = data;
            return this;
        }
        public java.util.List<QueryDevicePageResponseBodyDataData> getData() {
            return this.data;
        }

        public QueryDevicePageResponseBodyData setPageIndex(Integer pageIndex) {
            this.pageIndex = pageIndex;
            return this;
        }
        public Integer getPageIndex() {
            return this.pageIndex;
        }

        public QueryDevicePageResponseBodyData setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public QueryDevicePageResponseBodyData setTotal(Long total) {
            this.total = total;
            return this;
        }
        public Long getTotal() {
            return this.total;
        }

    }

}
