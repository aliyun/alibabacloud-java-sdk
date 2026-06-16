// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class ListApplicationSupportedProvisionProtocolTypesResponseBody extends TeaModel {
    /**
     * <p>The supported synchronization protocols for the application.</p>
     */
    @NameInMap("ApplicationSupportedProvisionProtocolType")
    public ListApplicationSupportedProvisionProtocolTypesResponseBodyApplicationSupportedProvisionProtocolType applicationSupportedProvisionProtocolType;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>0441BD79-92F3-53AA-8657-F8CE4A2B912A</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ListApplicationSupportedProvisionProtocolTypesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListApplicationSupportedProvisionProtocolTypesResponseBody self = new ListApplicationSupportedProvisionProtocolTypesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListApplicationSupportedProvisionProtocolTypesResponseBody setApplicationSupportedProvisionProtocolType(ListApplicationSupportedProvisionProtocolTypesResponseBodyApplicationSupportedProvisionProtocolType applicationSupportedProvisionProtocolType) {
        this.applicationSupportedProvisionProtocolType = applicationSupportedProvisionProtocolType;
        return this;
    }
    public ListApplicationSupportedProvisionProtocolTypesResponseBodyApplicationSupportedProvisionProtocolType getApplicationSupportedProvisionProtocolType() {
        return this.applicationSupportedProvisionProtocolType;
    }

    public ListApplicationSupportedProvisionProtocolTypesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListApplicationSupportedProvisionProtocolTypesResponseBodyApplicationSupportedProvisionProtocolType extends TeaModel {
        /**
         * <p>The account synchronization protocols that the application supports. Valid values:</p>
         * <ul>
         * <li><p>idaas_callback: event callback.</p>
         * </li>
         * <li><p>scim2: System for Cross-domain Identity Management (SCIM) protocol.</p>
         * </li>
         * </ul>
         */
        @NameInMap("ProvisionProtocolType")
        public java.util.List<String> provisionProtocolType;

        public static ListApplicationSupportedProvisionProtocolTypesResponseBodyApplicationSupportedProvisionProtocolType build(java.util.Map<String, ?> map) throws Exception {
            ListApplicationSupportedProvisionProtocolTypesResponseBodyApplicationSupportedProvisionProtocolType self = new ListApplicationSupportedProvisionProtocolTypesResponseBodyApplicationSupportedProvisionProtocolType();
            return TeaModel.build(map, self);
        }

        public ListApplicationSupportedProvisionProtocolTypesResponseBodyApplicationSupportedProvisionProtocolType setProvisionProtocolType(java.util.List<String> provisionProtocolType) {
            this.provisionProtocolType = provisionProtocolType;
            return this;
        }
        public java.util.List<String> getProvisionProtocolType() {
            return this.provisionProtocolType;
        }

    }

}
