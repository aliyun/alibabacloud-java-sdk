// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eds_aic20230930.models;

import com.aliyun.tea.*;

public class CreateAICloudPhoneResponseBody extends TeaModel {
    /**
     * <p>The response data object.</p>
     */
    @NameInMap("Data")
    public CreateAICloudPhoneResponseBodyData data;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>9A51B1DF-96FF-3BCC-B08C-783161D3****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static CreateAICloudPhoneResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateAICloudPhoneResponseBody self = new CreateAICloudPhoneResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateAICloudPhoneResponseBody setData(CreateAICloudPhoneResponseBodyData data) {
        this.data = data;
        return this;
    }
    public CreateAICloudPhoneResponseBodyData getData() {
        return this.data;
    }

    public CreateAICloudPhoneResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class CreateAICloudPhoneResponseBodyData extends TeaModel {
        /**
         * <p>The order ID.</p>
         * 
         * <strong>example:</strong>
         * <p>20230930123456</p>
         */
        @NameInMap("OrderId")
        public Long orderId;

        /**
         * <p>The list of package IDs. After the payment is successful, instances are created based on these IDs through a callback.</p>
         */
        @NameInMap("PackageIds")
        public java.util.List<String> packageIds;

        public static CreateAICloudPhoneResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            CreateAICloudPhoneResponseBodyData self = new CreateAICloudPhoneResponseBodyData();
            return TeaModel.build(map, self);
        }

        public CreateAICloudPhoneResponseBodyData setOrderId(Long orderId) {
            this.orderId = orderId;
            return this;
        }
        public Long getOrderId() {
            return this.orderId;
        }

        public CreateAICloudPhoneResponseBodyData setPackageIds(java.util.List<String> packageIds) {
            this.packageIds = packageIds;
            return this;
        }
        public java.util.List<String> getPackageIds() {
            return this.packageIds;
        }

    }

}
