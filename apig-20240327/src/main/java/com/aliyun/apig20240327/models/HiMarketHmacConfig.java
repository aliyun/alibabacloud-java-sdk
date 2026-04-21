// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class HiMarketHmacConfig extends TeaModel {
    @NameInMap("credentials")
    public java.util.List<HiMarketHmacConfigCredentials> credentials;

    public static HiMarketHmacConfig build(java.util.Map<String, ?> map) throws Exception {
        HiMarketHmacConfig self = new HiMarketHmacConfig();
        return TeaModel.build(map, self);
    }

    public HiMarketHmacConfig setCredentials(java.util.List<HiMarketHmacConfigCredentials> credentials) {
        this.credentials = credentials;
        return this;
    }
    public java.util.List<HiMarketHmacConfigCredentials> getCredentials() {
        return this.credentials;
    }

    public static class HiMarketHmacConfigCredentials extends TeaModel {
        @NameInMap("ak")
        public String ak;

        @NameInMap("mode")
        public String mode;

        @NameInMap("sk")
        public String sk;

        public static HiMarketHmacConfigCredentials build(java.util.Map<String, ?> map) throws Exception {
            HiMarketHmacConfigCredentials self = new HiMarketHmacConfigCredentials();
            return TeaModel.build(map, self);
        }

        public HiMarketHmacConfigCredentials setAk(String ak) {
            this.ak = ak;
            return this;
        }
        public String getAk() {
            return this.ak;
        }

        public HiMarketHmacConfigCredentials setMode(String mode) {
            this.mode = mode;
            return this;
        }
        public String getMode() {
            return this.mode;
        }

        public HiMarketHmacConfigCredentials setSk(String sk) {
            this.sk = sk;
            return this;
        }
        public String getSk() {
            return this.sk;
        }

    }

}
