// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bssopenapi20171214.models;

import com.aliyun.tea.*;

public class UpgradeResourcePackageResponseBody extends TeaModel {
    /**
     * <p>The status code returned.</p>
     * 
     * <strong>example:</strong>
     * <p>Success</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The data returned.</p>
     */
    @NameInMap("Data")
    public UpgradeResourcePackageResponseBodyData data;

    /**
     * <p>The message returned.</p>
     * 
     * <strong>example:</strong>
     * <p>Successful!</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The ID of the order.</p>
     * 
     * <strong>example:</strong>
     * <p>73387246238746</p>
     */
    @NameInMap("OrderId")
    public Long orderId;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>6000EE23-274B-4E07-A697-FF2E999520A4</p>
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

    public static UpgradeResourcePackageResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpgradeResourcePackageResponseBody self = new UpgradeResourcePackageResponseBody();
        return TeaModel.build(map, self);
    }

    public UpgradeResourcePackageResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public UpgradeResourcePackageResponseBody setData(UpgradeResourcePackageResponseBodyData data) {
        this.data = data;
        return this;
    }
    public UpgradeResourcePackageResponseBodyData getData() {
        return this.data;
    }

    public UpgradeResourcePackageResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public UpgradeResourcePackageResponseBody setOrderId(Long orderId) {
        this.orderId = orderId;
        return this;
    }
    public Long getOrderId() {
        return this.orderId;
    }

    public UpgradeResourcePackageResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UpgradeResourcePackageResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class UpgradeResourcePackageResponseBodyData extends TeaModel {
        /**
         * <p>The ID of the resource plan.</p>
         * 
         * <strong>example:</strong>
         * <p>OSSBAG-cn-0xl*****002</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>The ID of the order.</p>
         * 
         * <strong>example:</strong>
         * <p>73387246238746</p>
         */
        @NameInMap("OrderId")
        public Long orderId;

        public static UpgradeResourcePackageResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            UpgradeResourcePackageResponseBodyData self = new UpgradeResourcePackageResponseBodyData();
            return TeaModel.build(map, self);
        }

        public UpgradeResourcePackageResponseBodyData setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public UpgradeResourcePackageResponseBodyData setOrderId(Long orderId) {
            this.orderId = orderId;
            return this;
        }
        public Long getOrderId() {
            return this.orderId;
        }

    }

}
