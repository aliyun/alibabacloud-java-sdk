// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.airec20201126.models;

import com.aliyun.tea.*;

public class DescribeInstanceResponseBody extends TeaModel {
    /**
     * <p>The error code.</p>
     * 
     * <strong>example:</strong>
     * <p>InternalServerError</p>
     */
    @NameInMap("code")
    public String code;

    /**
     * <p>The error message.</p>
     * 
     * <strong>example:</strong>
     * <p>An internal server error occurred</p>
     */
    @NameInMap("message")
    public String message;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>8F81A922-6C81-46D6-B78C-CC35E16B1691</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>The returned results.</p>
     */
    @NameInMap("result")
    public DescribeInstanceResponseBodyResult result;

    public static DescribeInstanceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeInstanceResponseBody self = new DescribeInstanceResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeInstanceResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DescribeInstanceResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribeInstanceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeInstanceResponseBody setResult(DescribeInstanceResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public DescribeInstanceResponseBodyResult getResult() {
        return this.result;
    }

    public static class DescribeInstanceResponseBodyResult extends TeaModel {
        /**
         * <p>The billing method. Valid values: PrePaid and PostPaid. Only the PrePaid billing method is supported.</p>
         * 
         * <strong>example:</strong>
         * <p>PrePaid</p>
         */
        @NameInMap("chargeType")
        public String chargeType;

        /**
         * <p>The commodity code of the recommended item.</p>
         * 
         * <strong>example:</strong>
         * <p>airecpre</p>
         */
        @NameInMap("commodityCode")
        public String commodityCode;

        /**
         * <p>The version of the dataset that provides online services.</p>
         * 
         * <strong>example:</strong>
         * <p>20181206170353</p>
         */
        @NameInMap("dataSetVersion")
        public String dataSetVersion;

        /**
         * <p>The time when the instance expires. The time follows the ISO 8601 standard in the yyyy-MM-ddThh:mm:ssZ format. The time is displayed in UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>2019-01-06T16:00:00.000Z</p>
         */
        @NameInMap("expiredTime")
        public String expiredTime;

        /**
         * <p>The time when the instance was created. The time follows the ISO 8601 standard in the yyyy-MM-ddThh:mm:ssZ format. The time is displayed in UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>2018-12-06T06:14:01.000Z</p>
         */
        @NameInMap("gmtCreate")
        public String gmtCreate;

        /**
         * <p>The time when the instance was last modified. The time follows the ISO 8601 standard in the yyyy-MM-ddThh:mm:ssZ format. The time is displayed in UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>2018-12-06T11:17:49.000Z</p>
         */
        @NameInMap("gmtModified")
        public String gmtModified;

        /**
         * <p>The type of the industry. Valid values: content, item, news, video, and sns.</p>
         * 
         * <strong>example:</strong>
         * <p>news</p>
         */
        @NameInMap("industry")
        public String industry;

        /**
         * <p>The instance ID.</p>
         * 
         * <strong>example:</strong>
         * <p>airec-cn-o400whm78004</p>
         */
        @NameInMap("instanceId")
        public String instanceId;

        /**
         * <p>The lock mode of the instance. Valid values: Unlock, ManualLock, and LockByExpiration.</p>
         * 
         * <strong>example:</strong>
         * <p>Unlock</p>
         */
        @NameInMap("lockMode")
        public String lockMode;

        /**
         * <p>The name of the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>Test instance</p>
         */
        @NameInMap("name")
        public String name;

        /**
         * <p>The ID of the region where the instance resides.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-beijing</p>
         */
        @NameInMap("regionId")
        public String regionId;

        /**
         * <p>The name of the scene. Valid values: gul, rr, hot, and focus.</p>
         * 
         * <strong>example:</strong>
         * <p>gul</p>
         */
        @NameInMap("scene")
        public String scene;

        /**
         * <p>The state of the instance. Valid values: Initializing, Ready, and Running.</p>
         * 
         * <strong>example:</strong>
         * <p>Running</p>
         */
        @NameInMap("status")
        public String status;

        /**
         * <p>The type of the instance. Only the Standard edition is supported.</p>
         * 
         * <strong>example:</strong>
         * <p>Standard</p>
         */
        @NameInMap("type")
        public String type;

        public static DescribeInstanceResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            DescribeInstanceResponseBodyResult self = new DescribeInstanceResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public DescribeInstanceResponseBodyResult setChargeType(String chargeType) {
            this.chargeType = chargeType;
            return this;
        }
        public String getChargeType() {
            return this.chargeType;
        }

        public DescribeInstanceResponseBodyResult setCommodityCode(String commodityCode) {
            this.commodityCode = commodityCode;
            return this;
        }
        public String getCommodityCode() {
            return this.commodityCode;
        }

        public DescribeInstanceResponseBodyResult setDataSetVersion(String dataSetVersion) {
            this.dataSetVersion = dataSetVersion;
            return this;
        }
        public String getDataSetVersion() {
            return this.dataSetVersion;
        }

        public DescribeInstanceResponseBodyResult setExpiredTime(String expiredTime) {
            this.expiredTime = expiredTime;
            return this;
        }
        public String getExpiredTime() {
            return this.expiredTime;
        }

        public DescribeInstanceResponseBodyResult setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public DescribeInstanceResponseBodyResult setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public DescribeInstanceResponseBodyResult setIndustry(String industry) {
            this.industry = industry;
            return this;
        }
        public String getIndustry() {
            return this.industry;
        }

        public DescribeInstanceResponseBodyResult setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public DescribeInstanceResponseBodyResult setLockMode(String lockMode) {
            this.lockMode = lockMode;
            return this;
        }
        public String getLockMode() {
            return this.lockMode;
        }

        public DescribeInstanceResponseBodyResult setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeInstanceResponseBodyResult setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public DescribeInstanceResponseBodyResult setScene(String scene) {
            this.scene = scene;
            return this;
        }
        public String getScene() {
            return this.scene;
        }

        public DescribeInstanceResponseBodyResult setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeInstanceResponseBodyResult setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

}
