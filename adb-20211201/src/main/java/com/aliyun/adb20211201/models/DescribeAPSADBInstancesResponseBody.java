// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class DescribeAPSADBInstancesResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <strong>example:</strong>
     * <ul>
     * <li></li>
     * </ul>
     */
    @NameInMap("Items")
    public java.util.List<DescribeAPSADBInstancesResponseBodyItems> items;

    /**
     * <strong>example:</strong>
     * <p>Success</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public String pageNumber;

    /**
     * <strong>example:</strong>
     * <p>30</p>
     */
    @NameInMap("PageSize")
    public String pageSize;

    /**
     * <strong>example:</strong>
     * <hr>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    /**
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("TotalCount")
    public String totalCount;

    public static DescribeAPSADBInstancesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeAPSADBInstancesResponseBody self = new DescribeAPSADBInstancesResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeAPSADBInstancesResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DescribeAPSADBInstancesResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public DescribeAPSADBInstancesResponseBody setItems(java.util.List<DescribeAPSADBInstancesResponseBodyItems> items) {
        this.items = items;
        return this;
    }
    public java.util.List<DescribeAPSADBInstancesResponseBodyItems> getItems() {
        return this.items;
    }

    public DescribeAPSADBInstancesResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribeAPSADBInstancesResponseBody setPageNumber(String pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public String getPageNumber() {
        return this.pageNumber;
    }

    public DescribeAPSADBInstancesResponseBody setPageSize(String pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public String getPageSize() {
        return this.pageSize;
    }

    public DescribeAPSADBInstancesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeAPSADBInstancesResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public DescribeAPSADBInstancesResponseBody setTotalCount(String totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public String getTotalCount() {
        return this.totalCount;
    }

    public static class DescribeAPSADBInstancesResponseBodyItems extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>16ACU</p>
         */
        @NameInMap("ComputeResource")
        public String computeResource;

        /**
         * <strong>example:</strong>
         * <p>adb_test</p>
         */
        @NameInMap("DBClusterDescription")
        public String DBClusterDescription;

        /**
         * <strong>example:</strong>
         * <p>am-bp1********</p>
         */
        @NameInMap("DBClusterId")
        public String DBClusterId;

        /**
         * <strong>example:</strong>
         * <p>Running</p>
         */
        @NameInMap("DBClusterStatus")
        public String DBClusterStatus;

        /**
         * <strong>example:</strong>
         * <p>24ACU</p>
         */
        @NameInMap("ReservedACU")
        public String reservedACU;

        /**
         * <strong>example:</strong>
         * <p>24ACU</p>
         */
        @NameInMap("StorageResource")
        public Long storageResource;

        /**
         * <strong>example:</strong>
         * <p>cn-hangzhou-h</p>
         */
        @NameInMap("ZoneId")
        public String zoneId;

        public static DescribeAPSADBInstancesResponseBodyItems build(java.util.Map<String, ?> map) throws Exception {
            DescribeAPSADBInstancesResponseBodyItems self = new DescribeAPSADBInstancesResponseBodyItems();
            return TeaModel.build(map, self);
        }

        public DescribeAPSADBInstancesResponseBodyItems setComputeResource(String computeResource) {
            this.computeResource = computeResource;
            return this;
        }
        public String getComputeResource() {
            return this.computeResource;
        }

        public DescribeAPSADBInstancesResponseBodyItems setDBClusterDescription(String DBClusterDescription) {
            this.DBClusterDescription = DBClusterDescription;
            return this;
        }
        public String getDBClusterDescription() {
            return this.DBClusterDescription;
        }

        public DescribeAPSADBInstancesResponseBodyItems setDBClusterId(String DBClusterId) {
            this.DBClusterId = DBClusterId;
            return this;
        }
        public String getDBClusterId() {
            return this.DBClusterId;
        }

        public DescribeAPSADBInstancesResponseBodyItems setDBClusterStatus(String DBClusterStatus) {
            this.DBClusterStatus = DBClusterStatus;
            return this;
        }
        public String getDBClusterStatus() {
            return this.DBClusterStatus;
        }

        public DescribeAPSADBInstancesResponseBodyItems setReservedACU(String reservedACU) {
            this.reservedACU = reservedACU;
            return this;
        }
        public String getReservedACU() {
            return this.reservedACU;
        }

        public DescribeAPSADBInstancesResponseBodyItems setStorageResource(Long storageResource) {
            this.storageResource = storageResource;
            return this;
        }
        public Long getStorageResource() {
            return this.storageResource;
        }

        public DescribeAPSADBInstancesResponseBodyItems setZoneId(String zoneId) {
            this.zoneId = zoneId;
            return this;
        }
        public String getZoneId() {
            return this.zoneId;
        }

    }

}
