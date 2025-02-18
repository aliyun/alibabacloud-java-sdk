// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.appstream_center20210901.models;

import com.aliyun.tea.*;

public class ListTenantConfigResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>1CBAFFAB-B697-4049-A9B1-67E1FC5F****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The user configurations.</p>
     */
    @NameInMap("TenantConfigModel")
    public ListTenantConfigResponseBodyTenantConfigModel tenantConfigModel;

    public static ListTenantConfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListTenantConfigResponseBody self = new ListTenantConfigResponseBody();
        return TeaModel.build(map, self);
    }

    public ListTenantConfigResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListTenantConfigResponseBody setTenantConfigModel(ListTenantConfigResponseBodyTenantConfigModel tenantConfigModel) {
        this.tenantConfigModel = tenantConfigModel;
        return this;
    }
    public ListTenantConfigResponseBodyTenantConfigModel getTenantConfigModel() {
        return this.tenantConfigModel;
    }

    public static class ListTenantConfigResponseBodyTenantConfigModel extends TeaModel {
        /**
         * <p>Indicates whether the resource expiration reminder feature is enabled.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li>true</li>
         * <li>false</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("AppInstanceGroupExpireRemind")
        public Boolean appInstanceGroupExpireRemind;

        public static ListTenantConfigResponseBodyTenantConfigModel build(java.util.Map<String, ?> map) throws Exception {
            ListTenantConfigResponseBodyTenantConfigModel self = new ListTenantConfigResponseBodyTenantConfigModel();
            return TeaModel.build(map, self);
        }

        public ListTenantConfigResponseBodyTenantConfigModel setAppInstanceGroupExpireRemind(Boolean appInstanceGroupExpireRemind) {
            this.appInstanceGroupExpireRemind = appInstanceGroupExpireRemind;
            return this;
        }
        public Boolean getAppInstanceGroupExpireRemind() {
            return this.appInstanceGroupExpireRemind;
        }

    }

}
