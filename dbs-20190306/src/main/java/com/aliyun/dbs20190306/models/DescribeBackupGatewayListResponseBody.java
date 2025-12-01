// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dbs20190306.models;

import com.aliyun.tea.*;

public class DescribeBackupGatewayListResponseBody extends TeaModel {
    /**
     * <p>The error code.</p>
     * 
     * <strong>example:</strong>
     * <p>Param.NotFound</p>
     */
    @NameInMap("ErrCode")
    public String errCode;

    /**
     * <p>The error message.</p>
     * 
     * <strong>example:</strong>
     * <p>The specified parameter %s value is not valid.</p>
     */
    @NameInMap("ErrMessage")
    public String errMessage;

    /**
     * <p>The HTTP status code.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <p>The details of backup gateways.</p>
     */
    @NameInMap("Items")
    public DescribeBackupGatewayListResponseBodyItems items;

    /**
     * <p>The page number of the returned page.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNum")
    public Integer pageNum;

    /**
     * <p>The number of entries returned on each page.</p>
     * 
     * <strong>example:</strong>
     * <p>30</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>46361705-8531-492F-807E-A97E482DD4A1</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request is successful.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    /**
     * <p>The total number of backup gateways.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("TotalElements")
    public Integer totalElements;

    /**
     * <p>The total number of returned pages.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("TotalPages")
    public Integer totalPages;

    public static DescribeBackupGatewayListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeBackupGatewayListResponseBody self = new DescribeBackupGatewayListResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeBackupGatewayListResponseBody setErrCode(String errCode) {
        this.errCode = errCode;
        return this;
    }
    public String getErrCode() {
        return this.errCode;
    }

    public DescribeBackupGatewayListResponseBody setErrMessage(String errMessage) {
        this.errMessage = errMessage;
        return this;
    }
    public String getErrMessage() {
        return this.errMessage;
    }

    public DescribeBackupGatewayListResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public DescribeBackupGatewayListResponseBody setItems(DescribeBackupGatewayListResponseBodyItems items) {
        this.items = items;
        return this;
    }
    public DescribeBackupGatewayListResponseBodyItems getItems() {
        return this.items;
    }

    public DescribeBackupGatewayListResponseBody setPageNum(Integer pageNum) {
        this.pageNum = pageNum;
        return this;
    }
    public Integer getPageNum() {
        return this.pageNum;
    }

    public DescribeBackupGatewayListResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeBackupGatewayListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeBackupGatewayListResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public DescribeBackupGatewayListResponseBody setTotalElements(Integer totalElements) {
        this.totalElements = totalElements;
        return this;
    }
    public Integer getTotalElements() {
        return this.totalElements;
    }

    public DescribeBackupGatewayListResponseBody setTotalPages(Integer totalPages) {
        this.totalPages = totalPages;
        return this;
    }
    public Integer getTotalPages() {
        return this.totalPages;
    }

    public static class DescribeBackupGatewayListResponseBodyItemsBackupGateway extends TeaModel {
        /**
         * <p>The time when the backup gateway was created, such as 1554560477000.</p>
         * 
         * <strong>example:</strong>
         * <p>1554560477000</p>
         */
        @NameInMap("BackupGatewayCreateTime")
        public Long backupGatewayCreateTime;

        /**
         * <p>The ID of the backup gateway.</p>
         * 
         * <strong>example:</strong>
         * <p>2321313123</p>
         */
        @NameInMap("BackupGatewayId")
        public String backupGatewayId;

        /**
         * <p>The status of the backup gateway. Valid values:</p>
         * <ul>
         * <li>ONLINE: The backup gateway is online.</li>
         * <li>OFFLINE: The backup gateway is offline.</li>
         * <li>STOPPED: The backup gateway is stopped.</li>
         * <li>UPGRADING: The backup gateway is being upgraded.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>ONLINE</p>
         */
        @NameInMap("BackupGatewayStatus")
        public String backupGatewayStatus;

        /**
         * <p>The display name of the backup gateway.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("DisplayName")
        public String displayName;

        /**
         * <p>The unique identifier of the backup gateway.</p>
         * 
         * <strong>example:</strong>
         * <p>sgdsajhdgu</p>
         */
        @NameInMap("Identifier")
        public String identifier;

        /**
         * <p>The last time when a heartbeat message was sent, such as 1554560477000.</p>
         * 
         * <strong>example:</strong>
         * <p>1554560477000</p>
         */
        @NameInMap("LastHeartbeatTime")
        public Long lastHeartbeatTime;

        /**
         * <p>The ID of the region.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        @NameInMap("Region")
        public String region;

        /**
         * <p>The name of the host on which the backup gateway is installed.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("SourceEndpointHostname")
        public String sourceEndpointHostname;

        /**
         * <p>The public IP address of the host on which the backup gateway is installed.</p>
         * 
         * <strong>example:</strong>
         * <p>XX.XX.XX.XX</p>
         */
        @NameInMap("SourceEndpointInternetIP")
        public String sourceEndpointInternetIP;

        /**
         * <p>The private IP address of the host on which the backup gateway is installed.</p>
         * 
         * <strong>example:</strong>
         * <p>XX.XX.XX.XX</p>
         */
        @NameInMap("SourceEndpointIntranetIP")
        public String sourceEndpointIntranetIP;

        public static DescribeBackupGatewayListResponseBodyItemsBackupGateway build(java.util.Map<String, ?> map) throws Exception {
            DescribeBackupGatewayListResponseBodyItemsBackupGateway self = new DescribeBackupGatewayListResponseBodyItemsBackupGateway();
            return TeaModel.build(map, self);
        }

        public DescribeBackupGatewayListResponseBodyItemsBackupGateway setBackupGatewayCreateTime(Long backupGatewayCreateTime) {
            this.backupGatewayCreateTime = backupGatewayCreateTime;
            return this;
        }
        public Long getBackupGatewayCreateTime() {
            return this.backupGatewayCreateTime;
        }

        public DescribeBackupGatewayListResponseBodyItemsBackupGateway setBackupGatewayId(String backupGatewayId) {
            this.backupGatewayId = backupGatewayId;
            return this;
        }
        public String getBackupGatewayId() {
            return this.backupGatewayId;
        }

        public DescribeBackupGatewayListResponseBodyItemsBackupGateway setBackupGatewayStatus(String backupGatewayStatus) {
            this.backupGatewayStatus = backupGatewayStatus;
            return this;
        }
        public String getBackupGatewayStatus() {
            return this.backupGatewayStatus;
        }

        public DescribeBackupGatewayListResponseBodyItemsBackupGateway setDisplayName(String displayName) {
            this.displayName = displayName;
            return this;
        }
        public String getDisplayName() {
            return this.displayName;
        }

        public DescribeBackupGatewayListResponseBodyItemsBackupGateway setIdentifier(String identifier) {
            this.identifier = identifier;
            return this;
        }
        public String getIdentifier() {
            return this.identifier;
        }

        public DescribeBackupGatewayListResponseBodyItemsBackupGateway setLastHeartbeatTime(Long lastHeartbeatTime) {
            this.lastHeartbeatTime = lastHeartbeatTime;
            return this;
        }
        public Long getLastHeartbeatTime() {
            return this.lastHeartbeatTime;
        }

        public DescribeBackupGatewayListResponseBodyItemsBackupGateway setRegion(String region) {
            this.region = region;
            return this;
        }
        public String getRegion() {
            return this.region;
        }

        public DescribeBackupGatewayListResponseBodyItemsBackupGateway setSourceEndpointHostname(String sourceEndpointHostname) {
            this.sourceEndpointHostname = sourceEndpointHostname;
            return this;
        }
        public String getSourceEndpointHostname() {
            return this.sourceEndpointHostname;
        }

        public DescribeBackupGatewayListResponseBodyItemsBackupGateway setSourceEndpointInternetIP(String sourceEndpointInternetIP) {
            this.sourceEndpointInternetIP = sourceEndpointInternetIP;
            return this;
        }
        public String getSourceEndpointInternetIP() {
            return this.sourceEndpointInternetIP;
        }

        public DescribeBackupGatewayListResponseBodyItemsBackupGateway setSourceEndpointIntranetIP(String sourceEndpointIntranetIP) {
            this.sourceEndpointIntranetIP = sourceEndpointIntranetIP;
            return this;
        }
        public String getSourceEndpointIntranetIP() {
            return this.sourceEndpointIntranetIP;
        }

    }

    public static class DescribeBackupGatewayListResponseBodyItems extends TeaModel {
        @NameInMap("BackupGateway")
        public java.util.List<DescribeBackupGatewayListResponseBodyItemsBackupGateway> backupGateway;

        public static DescribeBackupGatewayListResponseBodyItems build(java.util.Map<String, ?> map) throws Exception {
            DescribeBackupGatewayListResponseBodyItems self = new DescribeBackupGatewayListResponseBodyItems();
            return TeaModel.build(map, self);
        }

        public DescribeBackupGatewayListResponseBodyItems setBackupGateway(java.util.List<DescribeBackupGatewayListResponseBodyItemsBackupGateway> backupGateway) {
            this.backupGateway = backupGateway;
            return this;
        }
        public java.util.List<DescribeBackupGatewayListResponseBodyItemsBackupGateway> getBackupGateway() {
            return this.backupGateway;
        }

    }

}
