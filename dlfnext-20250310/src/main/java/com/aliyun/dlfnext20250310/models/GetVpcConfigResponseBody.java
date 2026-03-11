// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dlfnext20250310.models;

import com.aliyun.tea.*;

public class GetVpcConfigResponseBody extends TeaModel {
    @NameInMap("trustedVpcs")
    public java.util.List<GetVpcConfigResponseBodyTrustedVpcs> trustedVpcs;

    public static GetVpcConfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetVpcConfigResponseBody self = new GetVpcConfigResponseBody();
        return TeaModel.build(map, self);
    }

    public GetVpcConfigResponseBody setTrustedVpcs(java.util.List<GetVpcConfigResponseBodyTrustedVpcs> trustedVpcs) {
        this.trustedVpcs = trustedVpcs;
        return this;
    }
    public java.util.List<GetVpcConfigResponseBodyTrustedVpcs> getTrustedVpcs() {
        return this.trustedVpcs;
    }

    public static class GetVpcConfigResponseBodyTrustedVpcs extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>1744970111419</p>
         */
        @NameInMap("createdAt")
        public Long createdAt;

        @NameInMap("extendedOptions")
        public java.util.Map<String, String> extendedOptions;

        /**
         * <p>VPC ID。</p>
         * 
         * <strong>example:</strong>
         * <p>vpc-uf67xxxx</p>
         */
        @NameInMap("vpcId")
        public String vpcId;

        public static GetVpcConfigResponseBodyTrustedVpcs build(java.util.Map<String, ?> map) throws Exception {
            GetVpcConfigResponseBodyTrustedVpcs self = new GetVpcConfigResponseBodyTrustedVpcs();
            return TeaModel.build(map, self);
        }

        public GetVpcConfigResponseBodyTrustedVpcs setCreatedAt(Long createdAt) {
            this.createdAt = createdAt;
            return this;
        }
        public Long getCreatedAt() {
            return this.createdAt;
        }

        public GetVpcConfigResponseBodyTrustedVpcs setExtendedOptions(java.util.Map<String, String> extendedOptions) {
            this.extendedOptions = extendedOptions;
            return this;
        }
        public java.util.Map<String, String> getExtendedOptions() {
            return this.extendedOptions;
        }

        public GetVpcConfigResponseBodyTrustedVpcs setVpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public String getVpcId() {
            return this.vpcId;
        }

    }

}
