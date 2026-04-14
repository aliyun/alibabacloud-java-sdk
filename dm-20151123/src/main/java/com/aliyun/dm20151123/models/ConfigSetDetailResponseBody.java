// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dm20151123.models;

import com.aliyun.tea.*;

public class ConfigSetDetailResponseBody extends TeaModel {
    @NameInMap("Detail")
    public ConfigSetDetailResponseBodyDetail detail;

    /**
     * <strong>example:</strong>
     * <p>xxx</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ConfigSetDetailResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ConfigSetDetailResponseBody self = new ConfigSetDetailResponseBody();
        return TeaModel.build(map, self);
    }

    public ConfigSetDetailResponseBody setDetail(ConfigSetDetailResponseBodyDetail detail) {
        this.detail = detail;
        return this;
    }
    public ConfigSetDetailResponseBodyDetail getDetail() {
        return this.detail;
    }

    public ConfigSetDetailResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ConfigSetDetailResponseBodyDetailIpPool extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>xxx</p>
         */
        @NameInMap("IpPoolId")
        public String ipPoolId;

        /**
         * <strong>example:</strong>
         * <p>xxx</p>
         */
        @NameInMap("IpPoolName")
        public String ipPoolName;

        public static ConfigSetDetailResponseBodyDetailIpPool build(java.util.Map<String, ?> map) throws Exception {
            ConfigSetDetailResponseBodyDetailIpPool self = new ConfigSetDetailResponseBodyDetailIpPool();
            return TeaModel.build(map, self);
        }

        public ConfigSetDetailResponseBodyDetailIpPool setIpPoolId(String ipPoolId) {
            this.ipPoolId = ipPoolId;
            return this;
        }
        public String getIpPoolId() {
            return this.ipPoolId;
        }

        public ConfigSetDetailResponseBodyDetailIpPool setIpPoolName(String ipPoolName) {
            this.ipPoolName = ipPoolName;
            return this;
        }
        public String getIpPoolName() {
            return this.ipPoolName;
        }

    }

    public static class ConfigSetDetailResponseBodyDetail extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>xxx</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <strong>example:</strong>
         * <p>xxx</p>
         */
        @NameInMap("Id")
        public String id;

        @NameInMap("IpPool")
        public ConfigSetDetailResponseBodyDetailIpPool ipPool;

        /**
         * <strong>example:</strong>
         * <p>xxx</p>
         */
        @NameInMap("Name")
        public String name;

        public static ConfigSetDetailResponseBodyDetail build(java.util.Map<String, ?> map) throws Exception {
            ConfigSetDetailResponseBodyDetail self = new ConfigSetDetailResponseBodyDetail();
            return TeaModel.build(map, self);
        }

        public ConfigSetDetailResponseBodyDetail setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ConfigSetDetailResponseBodyDetail setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public ConfigSetDetailResponseBodyDetail setIpPool(ConfigSetDetailResponseBodyDetailIpPool ipPool) {
            this.ipPool = ipPool;
            return this;
        }
        public ConfigSetDetailResponseBodyDetailIpPool getIpPool() {
            return this.ipPool;
        }

        public ConfigSetDetailResponseBodyDetail setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

}
