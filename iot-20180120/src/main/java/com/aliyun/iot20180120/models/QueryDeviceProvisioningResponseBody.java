// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class QueryDeviceProvisioningResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>iot.system.SystemException</p>
     */
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public QueryDeviceProvisioningResponseBodyData data;

    @NameInMap("ErrorMessage")
    public String errorMessage;

    /**
     * <strong>example:</strong>
     * <p>E55E50B7-40EE-4B6B-8BBE-D3ED55CCF565</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static QueryDeviceProvisioningResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryDeviceProvisioningResponseBody self = new QueryDeviceProvisioningResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryDeviceProvisioningResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryDeviceProvisioningResponseBody setData(QueryDeviceProvisioningResponseBodyData data) {
        this.data = data;
        return this;
    }
    public QueryDeviceProvisioningResponseBodyData getData() {
        return this.data;
    }

    public QueryDeviceProvisioningResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public QueryDeviceProvisioningResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryDeviceProvisioningResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class QueryDeviceProvisioningResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>io****@example.com</p>
         */
        @NameInMap("AliyunUid")
        public String aliyunUid;

        /**
         * <strong>example:</strong>
         * <p>testDevcieBwT3Un</p>
         */
        @NameInMap("DeviceName")
        public String deviceName;

        /**
         * <strong>example:</strong>
         * <p>1676297683000</p>
         */
        @NameInMap("GmtCreate")
        public Long gmtCreate;

        /**
         * <strong>example:</strong>
         * <p>1676297683000</p>
         */
        @NameInMap("GmtModified")
        public Long gmtModified;

        /**
         * <strong>example:</strong>
         * <p>a1ji*****</p>
         */
        @NameInMap("ProductKey")
        public String productKey;

        /**
         * <strong>example:</strong>
         * <p>iot-6ja****</p>
         */
        @NameInMap("SourceIotInstanceId")
        public String sourceIotInstanceId;

        /**
         * <strong>example:</strong>
         * <p>cn-shanghai</p>
         */
        @NameInMap("SourceRegion")
        public String sourceRegion;

        /**
         * <strong>example:</strong>
         * <p>iot-09k****</p>
         */
        @NameInMap("TargetIotInstanceId")
        public String targetIotInstanceId;

        /**
         * <strong>example:</strong>
         * <p>ap-southeast-1</p>
         */
        @NameInMap("TargetRegion")
        public String targetRegion;

        public static QueryDeviceProvisioningResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QueryDeviceProvisioningResponseBodyData self = new QueryDeviceProvisioningResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QueryDeviceProvisioningResponseBodyData setAliyunUid(String aliyunUid) {
            this.aliyunUid = aliyunUid;
            return this;
        }
        public String getAliyunUid() {
            return this.aliyunUid;
        }

        public QueryDeviceProvisioningResponseBodyData setDeviceName(String deviceName) {
            this.deviceName = deviceName;
            return this;
        }
        public String getDeviceName() {
            return this.deviceName;
        }

        public QueryDeviceProvisioningResponseBodyData setGmtCreate(Long gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public Long getGmtCreate() {
            return this.gmtCreate;
        }

        public QueryDeviceProvisioningResponseBodyData setGmtModified(Long gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public Long getGmtModified() {
            return this.gmtModified;
        }

        public QueryDeviceProvisioningResponseBodyData setProductKey(String productKey) {
            this.productKey = productKey;
            return this;
        }
        public String getProductKey() {
            return this.productKey;
        }

        public QueryDeviceProvisioningResponseBodyData setSourceIotInstanceId(String sourceIotInstanceId) {
            this.sourceIotInstanceId = sourceIotInstanceId;
            return this;
        }
        public String getSourceIotInstanceId() {
            return this.sourceIotInstanceId;
        }

        public QueryDeviceProvisioningResponseBodyData setSourceRegion(String sourceRegion) {
            this.sourceRegion = sourceRegion;
            return this;
        }
        public String getSourceRegion() {
            return this.sourceRegion;
        }

        public QueryDeviceProvisioningResponseBodyData setTargetIotInstanceId(String targetIotInstanceId) {
            this.targetIotInstanceId = targetIotInstanceId;
            return this;
        }
        public String getTargetIotInstanceId() {
            return this.targetIotInstanceId;
        }

        public QueryDeviceProvisioningResponseBodyData setTargetRegion(String targetRegion) {
            this.targetRegion = targetRegion;
            return this;
        }
        public String getTargetRegion() {
            return this.targetRegion;
        }

    }

}
