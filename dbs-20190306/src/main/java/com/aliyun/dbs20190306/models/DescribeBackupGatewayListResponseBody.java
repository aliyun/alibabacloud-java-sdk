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

    @NameInMap("Items")
    public DescribeBackupGatewayListResponseBodyItems items;

    /**
     * <p>The page number.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNum")
    public Integer pageNum;

    /**
     * <p>The number of records on each page.</p>
     * 
     * <strong>example:</strong>
     * <p>30</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>46361705-8531-492F-807E-A97E482DD4A1</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful.</p>
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
     * <p>The total number of pages.</p>
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
        @NameInMap("BackupGatewayCreateTime")
        public Long backupGatewayCreateTime;

        @NameInMap("BackupGatewayId")
        public String backupGatewayId;

        @NameInMap("BackupGatewayStatus")
        public String backupGatewayStatus;

        @NameInMap("DisplayName")
        public String displayName;

        @NameInMap("Identifier")
        public String identifier;

        @NameInMap("LastHeartbeatTime")
        public Long lastHeartbeatTime;

        @NameInMap("Region")
        public String region;

        @NameInMap("SourceEndpointHostname")
        public String sourceEndpointHostname;

        @NameInMap("SourceEndpointInternetIP")
        public String sourceEndpointInternetIP;

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
