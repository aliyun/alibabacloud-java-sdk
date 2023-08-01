// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.edas20170801.models;

import com.aliyun.tea.*;

public class BindSlbResponseBody extends TeaModel {
    /**
     * <p>The HTTP status code that is returned.</p>
     */
    @NameInMap("Code")
    public Integer code;

    /**
     * <p>The data that is returned.</p>
     */
    @NameInMap("Data")
    public BindSlbResponseBodyData data;

    /**
     * <p>The additional information that is returned.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static BindSlbResponseBody build(java.util.Map<String, ?> map) throws Exception {
        BindSlbResponseBody self = new BindSlbResponseBody();
        return TeaModel.build(map, self);
    }

    public BindSlbResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public BindSlbResponseBody setData(BindSlbResponseBodyData data) {
        this.data = data;
        return this;
    }
    public BindSlbResponseBodyData getData() {
        return this.data;
    }

    public BindSlbResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public BindSlbResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class BindSlbResponseBodyData extends TeaModel {
        /**
         * <p>The ID of the Internet-facing SLB instance.</p>
         */
        @NameInMap("ExtSlbId")
        public String extSlbId;

        /**
         * <p>The IP address of the Internet-facing SLB instance.</p>
         */
        @NameInMap("ExtSlbIp")
        public String extSlbIp;

        /**
         * <p>The name of the Internet-facing SLB instance.</p>
         */
        @NameInMap("ExtSlbName")
        public String extSlbName;

        /**
         * <p>The ID of the vServer group for the Internet-facing SLB instance.</p>
         */
        @NameInMap("ExtVServerGroupId")
        public String extVServerGroupId;

        /**
         * <p>The ID of the internal-facing SLB instance.</p>
         */
        @NameInMap("SlbId")
        public String slbId;

        /**
         * <p>The IP address of the internal-facing SLB instance.</p>
         */
        @NameInMap("SlbIp")
        public String slbIp;

        /**
         * <p>The name of the internal-facing SLB instance.</p>
         */
        @NameInMap("SlbName")
        public String slbName;

        /**
         * <p>The listener port for the SLB instance.</p>
         */
        @NameInMap("SlbPort")
        public Integer slbPort;

        /**
         * <p>The ID of the vServer group for the internal-facing SLB instance.</p>
         */
        @NameInMap("VServerGroupId")
        public String VServerGroupId;

        public static BindSlbResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            BindSlbResponseBodyData self = new BindSlbResponseBodyData();
            return TeaModel.build(map, self);
        }

        public BindSlbResponseBodyData setExtSlbId(String extSlbId) {
            this.extSlbId = extSlbId;
            return this;
        }
        public String getExtSlbId() {
            return this.extSlbId;
        }

        public BindSlbResponseBodyData setExtSlbIp(String extSlbIp) {
            this.extSlbIp = extSlbIp;
            return this;
        }
        public String getExtSlbIp() {
            return this.extSlbIp;
        }

        public BindSlbResponseBodyData setExtSlbName(String extSlbName) {
            this.extSlbName = extSlbName;
            return this;
        }
        public String getExtSlbName() {
            return this.extSlbName;
        }

        public BindSlbResponseBodyData setExtVServerGroupId(String extVServerGroupId) {
            this.extVServerGroupId = extVServerGroupId;
            return this;
        }
        public String getExtVServerGroupId() {
            return this.extVServerGroupId;
        }

        public BindSlbResponseBodyData setSlbId(String slbId) {
            this.slbId = slbId;
            return this;
        }
        public String getSlbId() {
            return this.slbId;
        }

        public BindSlbResponseBodyData setSlbIp(String slbIp) {
            this.slbIp = slbIp;
            return this;
        }
        public String getSlbIp() {
            return this.slbIp;
        }

        public BindSlbResponseBodyData setSlbName(String slbName) {
            this.slbName = slbName;
            return this;
        }
        public String getSlbName() {
            return this.slbName;
        }

        public BindSlbResponseBodyData setSlbPort(Integer slbPort) {
            this.slbPort = slbPort;
            return this;
        }
        public Integer getSlbPort() {
            return this.slbPort;
        }

        public BindSlbResponseBodyData setVServerGroupId(String VServerGroupId) {
            this.VServerGroupId = VServerGroupId;
            return this;
        }
        public String getVServerGroupId() {
            return this.VServerGroupId;
        }

    }

}
