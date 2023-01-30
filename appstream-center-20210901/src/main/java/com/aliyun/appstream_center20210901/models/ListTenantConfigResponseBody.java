// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.appstream_center20210901.models;

import com.aliyun.tea.*;

public class ListTenantConfigResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

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
