// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adp20210720.models;

import com.aliyun.tea.*;

public class GetEnvironmentLicenseRequest extends TeaModel {
    @NameInMap("options")
    public GetEnvironmentLicenseRequestOptions options;

    public static GetEnvironmentLicenseRequest build(java.util.Map<String, ?> map) throws Exception {
        GetEnvironmentLicenseRequest self = new GetEnvironmentLicenseRequest();
        return TeaModel.build(map, self);
    }

    public GetEnvironmentLicenseRequest setOptions(GetEnvironmentLicenseRequestOptions options) {
        this.options = options;
        return this;
    }
    public GetEnvironmentLicenseRequestOptions getOptions() {
        return this.options;
    }

    public static class GetEnvironmentLicenseRequestOptions extends TeaModel {
        @NameInMap("withSecretYAML")
        public Boolean withSecretYAML;

        public static GetEnvironmentLicenseRequestOptions build(java.util.Map<String, ?> map) throws Exception {
            GetEnvironmentLicenseRequestOptions self = new GetEnvironmentLicenseRequestOptions();
            return TeaModel.build(map, self);
        }

        public GetEnvironmentLicenseRequestOptions setWithSecretYAML(Boolean withSecretYAML) {
            this.withSecretYAML = withSecretYAML;
            return this;
        }
        public Boolean getWithSecretYAML() {
            return this.withSecretYAML;
        }

    }

}
