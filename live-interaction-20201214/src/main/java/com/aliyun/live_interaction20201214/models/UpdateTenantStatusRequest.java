// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live_interaction20201214.models;

import com.aliyun.tea.*;

public class UpdateTenantStatusRequest extends TeaModel {
    @NameInMap("Request")
    public UpdateTenantStatusRequestRequest request;

    public static UpdateTenantStatusRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateTenantStatusRequest self = new UpdateTenantStatusRequest();
        return TeaModel.build(map, self);
    }

    public UpdateTenantStatusRequest setRequest(UpdateTenantStatusRequestRequest request) {
        this.request = request;
        return this;
    }
    public UpdateTenantStatusRequestRequest getRequest() {
        return this.request;
    }

    public static class UpdateTenantStatusRequestRequest extends TeaModel {
        @NameInMap("domain")
        public String domain;

        @NameInMap("status")
        public Long status;

        public static UpdateTenantStatusRequestRequest build(java.util.Map<String, ?> map) throws Exception {
            UpdateTenantStatusRequestRequest self = new UpdateTenantStatusRequestRequest();
            return TeaModel.build(map, self);
        }

        public UpdateTenantStatusRequestRequest setDomain(String domain) {
            this.domain = domain;
            return this;
        }
        public String getDomain() {
            return this.domain;
        }

        public UpdateTenantStatusRequestRequest setStatus(Long status) {
            this.status = status;
            return this;
        }
        public Long getStatus() {
            return this.status;
        }

    }

}
